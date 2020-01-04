package fr.dauphine.ja.saniaurrehman.threads.threads;

import java.util.ArrayList;
import java.util.Random;

public class MySafeList extends ArrayList<Double>{

    private Object monitor = new Object();

    public void add(double d) {
        synchronized (this.monitor) {
            super.add(d);
        }
    }
    
    public Double get(int i) {
        return super.get(i);
    }

    public int size() {
        return super.size();
    }

    public static boolean stressTest(int n, final int m) throws InterruptedException {
        final MySafeList mySafeList = new MySafeList();
        Thread[] threads = new Thread[n];
        for (int i=0; i<n; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j=0; j<m; j++) {
                        mySafeList.add(1.0);
                     }
                }
            });
        }
        for (int i = 0; i < n; i++) {
            threads[i].start();
        }
        for (int i = 0; i < n; i++) {
            threads[i].join();
        }    
        return mySafeList.size()==n*m;
    }

    public static double scalar(MySafeList v1, MySafeList v2, int begin, int end) {
        double res = 0.0;
        for (int i = begin; i < end; i++) {
            res += (v1.get(i) * v2.get(i));
        }
        return res;
    }

    public static MySafeList randomList(int n) {
        Random rand = new Random();
        MySafeList finalList = new MySafeList();
        for (int i = 0; i < n; i++) {
            finalList.add(rand.nextDouble());
        }
        return finalList;
    }

    public static double parallelScalar(MySafeList v1, MySafeList v2, int n) {
        ScalarThread[] threads = new ScalarThread[n];
        int taillePartie = v1.size() / n;
        double resultat = 0;
        for (int i=0; i<n-1; i++) {
            threads[i] = new ScalarThread(v1, v2, i*taillePartie, (i+1)*taillePartie);
            threads[i].start();
        }
        threads[n-1] = new ScalarThread(v1, v2, (n-1)*taillePartie, v1.size());
        threads[n-1].start();

        try {
            for (int i = 0; i < n; i++) {
                threads[i].join();
                resultat += threads[i].getResult();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return resultat;
    }
    
    
    public static void main(String [] args) throws InterruptedException {
        int nbThreads = 5;
        int nbElements = 20;
        System.out.println(stressTest(nbThreads, nbElements));

        MySafeList v1 = randomList(10);
        MySafeList v2 = randomList(10);
        int n = 5;
        System.out.println(parallelScalar(v1, v2, n));
    }

}