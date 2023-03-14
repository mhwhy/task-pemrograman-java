package Latihan_Thread;
public class Latihan_thread4 {   
    public static void main(String[] args) {
        Baju baju1 = new Baju("Baju 1");
        Baju baju2 = new Baju("Baju 2");
        baju1.start();
        baju2.start();
    }  
}
    class Baju extends Thread{
        //konstruktor
        public Baju (String id){
            super(id);
        }
        //mendefinisikan sendiri rum()
    @Override
    public void run(){
        String nama = getName();
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
