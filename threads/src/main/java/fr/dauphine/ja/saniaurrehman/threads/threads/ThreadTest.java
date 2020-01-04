package fr.dauphine.ja.saniaurrehman.threads.threads;

public class ThreadTest{	
	private static final Object monitor = new Object();
	private static int n;
	
	public static Runnable method(final int id) {
		return new Runnable() {	
			public void run() {
				while(n<10000) {
					synchronized(monitor) {
						n++;
						if(n<=10000) {
							System.out.println("Je suis le thread " + id + " et j'effectue l'itération " + n);
						}
					}
				}
				
			}
		};
	}
	
    public static void main( String[] args ){
		Thread th1= new Thread(method(1));
		Thread th2= new Thread(method(2));
		th1.start();
		th2.start();
    }
}
