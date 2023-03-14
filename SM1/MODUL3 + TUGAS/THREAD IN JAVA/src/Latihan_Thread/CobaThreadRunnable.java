package Latihan_Thread;
import static java.lang.Thread.sleep;
public class CobaThreadRunnable {
     
    public static void main(String[] args) {
        Thread celana1 = new Thread(new Celana("Celana 1"));
        Thread celana2 = new Thread(new Celana("Celana 2"));
        celana1.start();
        celana2.start();
    } 
}
    class Celana implements Runnable{       
        String nama;
        //konstruktor
        public Celana (String id){
            nama =id;
        }
        //mendefinisikan sendiri rum()
    @Override
    public void run(){
            for (int i =0; i<5; i++){
                try{
                    sleep(1000);//tunggu satu detik
                }catch(InterruptedException ie){
                    System.out.println("Terinterupsi");
                }
                System.out.println("Thread " + nama +":Posisi" + 1);
            }
        }
    }
