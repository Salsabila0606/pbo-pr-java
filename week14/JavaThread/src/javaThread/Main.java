package javaThread;

public class Main {

	public static void main(String[] args) {
		
        Tiket tiket = new Tiket();
        TiketThread t1 = new TiketThread(tiket,"Salsa",5);
        TiketThread t2 = new TiketThread(tiket,"Putri",7);
        TiketThread t3 = new TiketThread(tiket,"Prameswari",3);
        TiketThread t4 = new TiketThread(tiket,"Anin",2);
        TiketThread t5 = new TiketThread(tiket,"Charlie",3);
        TiketThread t6 = new TiketThread(tiket,"Adam",3);
                
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        
        
    }
}