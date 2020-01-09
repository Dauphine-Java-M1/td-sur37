package fr.dauphine.ja.saniaurrehman.generics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeTandWildCard {
	
	public static <T extends List<T>>  ArrayList<Integer>  listLength(List<? extends CharSequence> list) {
		ArrayList length=new ArrayList();
		for(int i=0;i<list.size();i++) {
			CharSequence seq=(CharSequence)list.get(i);
			length.add(seq.length());
			}
		return length;
	}

	public static void main(String[] args) {
		List l =Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}

}
