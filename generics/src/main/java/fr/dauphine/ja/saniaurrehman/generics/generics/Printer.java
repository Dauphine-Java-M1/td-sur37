package fr.dauphine.ja.saniaurrehman.generics.generics;

import java.util.Arrays;
import java.util.List;

public class Printer {

	private static <T> void print(List<T> list) {
		for(Object o:list)
			System.out.println(o);
	}
	
	private static <T extends CharSequence> void printCharSequence(List<T> list) {
		for(T e : list) {
			System.out.println(e + " : " + e.length());
		}
	}
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		print(list);
		List<Double> list2=Arrays.asList(1.1, 2.2, 3.3);
		print(list2);
		List<String> list3=Arrays.asList("foota", "toto","kakalal");
		printCharSequence(list3);
	}

}
