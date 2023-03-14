package Latihan_Thread;
public class ThreadVsRunnable {   
    public static void main(String[] args) {
        //akan jalan ketika method start() dipanggil
        Thread buah = new Thread(new Buah());
        
        buah.start();
        
        Sayur sayur = new Sayur();
        
        sayur.start();
    }
    
}

class Buah implements Runnable{
    public void run(){
        for(int i = 0; i<3; i++){
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Terinterupsi");
                }
            System.out.println("Buah ke : " + i);
        }
    }
}

class Sayur extends Thread{
    public void run(){
        for(int i = 0; i<3; i++){
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Terinterupsi");
                }
            System.out.println("Sayur ke : " + i);
        }
    }
}
