package Latihan_Thread;

import static java.lang.Thread.sleep;


public class latihan_thread2 {

    public static void main(String[] args) {
        int jumlah = 10;
        Thread thread = new Thread(){
            public void run(){
                try{
                    for(int w =1; w<=jumlah; w++){
                        System.out.println("NOMOR : " + w);
                        sleep(1000);//waktu pending
                    }
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
       
    }
    
}
