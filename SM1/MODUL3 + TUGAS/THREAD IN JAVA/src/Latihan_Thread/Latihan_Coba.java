package Latihan_Thread;

public class Latihan_Coba {


    public static void main(String[] args) {
        int i ;
        int a ;
        
        Thread kopasus = new Thread();
        kopasus.start();
        while(true){
            
            for(i=1; i<=3; i++){
                System.out.println("Pasukan kopasus Berhasil menyelamatkan ibu hamil ke : " + i);
                
                try{
                    kopasus.sleep(1000);
                }catch(Exception e){
                    e.getStackTrace();
                }
                if(i==5){
                    System.out.println("Pasukan marinir datang ke TKP ");
                }
            }
            Thread marinir = new Thread();
            marinir.start();
            
                for(a=1; a<=5; a++){
                    System.out.println("Pasukan marinir berhasil membunuh teroris ke : " + a);
                    if(a<=15){
                        System.out.println("Pasukan marinir berhasil menyelamatkan warga manusia ke : " + a);
                }
                    try{
                        marinir.sleep(1000);
                    }catch(Exception e){
                        e.getStackTrace();
                    }
                    if(a==5){
                        System.out.println("Pasukan infanteri datang ke TKP ");
                    }
        }
                break;
    }
    
}
}


