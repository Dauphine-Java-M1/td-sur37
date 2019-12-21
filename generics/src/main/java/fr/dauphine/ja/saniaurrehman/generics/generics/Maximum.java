package fr.dauphine.ja.saniaurrehman.generics.generics;


public class Maximum {
	
	public static<T extends Comparable<T>> T myMax(T o, T ... objets) {
		T max = o;
		for(T objet : objets) {
			if(max.compareTo(objet)<0)
				max = objet;
		}
		return max;
	}
	
    public static void main( String[] args ){
    	System.out.println(myMax(42,1664)); //1664
    	System.out.println(myMax(2014,86,13)); //2014
    	System.out.println(myMax(8.6,16.64));//16.64
    	System.out.println(myMax("baa", "aba")); //aba
    }   
}
