package fr.dauphine.ja.urrehmansania.iterables;

import java.awt.List;
import java.util.AbstractList;
import java.util.Iterator;

public class Panel{

	
	public static void main( String[] args ){
		
		System.out.println("Panel 1");
		
		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();)
			System.out.println(it.next());
		
		System.out.println("Panel 2");
		
		for(int i:panel2(1,5))
			System.out.println(i); 
		
		
		List<Integer> l = panel(3,6);
		for(int i:l) {
			System.out.println(i);
		}
		System.out.println(l.get(1)); 
		
	}

	private static Iterator<Integer> panel1(final int i,final int j) {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {
			
			int position = i;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return position<=j;
			}

			@Override
			public Integer next() {
				//TODO Auto-generated method stub
				return position++;
			}	
		};
	}
		
		
	private static Iterable<Integer> panel2(final int i,final int j) {
		// TODO Auto-generated method stub
		return new Iterable <Integer>() {
			
			public Iterator<Integer> iterator(){
				
				return new Iterator<Integer>() {
					
					int position = i;
					
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return position<=j;
					}

					@Override
					public Integer next() {
						//TODO Auto-generated method stub
						return position++;
					}
				};
			}
		};
			
	}
	
	private static List panel(final int i, final int j){
		List<Integer> list = new AbstractList<>;
		for (int a=i; a<j; a++) {
			list.add(a);
		}
		return new list;
	}


}
