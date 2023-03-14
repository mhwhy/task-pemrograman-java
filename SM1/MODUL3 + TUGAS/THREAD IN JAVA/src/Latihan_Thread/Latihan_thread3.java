
package Latihan_Thread;

import static java.lang.Thread.sleep;

public class Latihan_thread3 implements Runnable {
    int jumlah = 10;
    
    public static void main(String[] args) {
      Latihan_thread3 test = new Latihan_thread3();
      test.run();
    }
    
    @Override
    public void run() {
        try{
            for(int w =1; w<=jumlah; w++){
                System.out.println("ID: " + w);
                sleep(1000);//waktu pending
                    }
         }catch(InterruptedException ex){
                ex.printStackTrace();
        }
    }
    
}
