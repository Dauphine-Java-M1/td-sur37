package fr.dauphine.ja.urrehmansania.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection {
	
	private ArrayList <Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList <Integer>();
	}
	
	public void initRandom(int n,int m) {
		Random random = new Random();
		for (int i = 0; i < n ; i++) {
			numbers.add(random.nextInt(m) );
		}	
	}
	
	boolean isPrime(int p) {	
		for(int i = 2;i<= Math.sqrt(p) ;i++) { 
			if (p%i==0) 
				return false;
		}
		return true;	
	}
	
	public void printPrimes() {
		for (int i = 0; i < numbers.size() ; i++) {
			if (isPrime(numbers.get(i)))
				System.out.println(numbers.get(i));
		}	
		
	}
	
	
    public static void main( String[] args ){
    	PrimeCollection pc = new PrimeCollection();
    	pc.initRandom(100, 1000);
    	pc.printPrimes();
    }
}
