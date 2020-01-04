package fr.dauphine.ja.saniaurrehman.threads.threads;

public class ScalarThread extends Thread {

    private MySafeList v1;
    private MySafeList v2;
    private int begin;
    private int end;
    private double result;

    public ScalarThread(MySafeList v1, MySafeList v2, int begin, int end) {
        this.begin = begin;
        this.end = end;
        this.v1 = v1;
        this.v2 = v2;
    }

    public double getResult() {
        return this.result;
    }

    @Override
    public void run() {
        this.result = MySafeList.scalar(this.v1, this.v2, this.begin, this.end);
    }
}