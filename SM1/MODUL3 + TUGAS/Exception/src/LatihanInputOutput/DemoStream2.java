package LatihanInputOutput;

import  java.io.*;
public class DemoStream2 {

    public static void main(String[] args) {
        byte[] data = new byte[10];
        int panjang = 0;
        System.out.print("Masukkan data : ");
        try{
            panjang=System.in.read();
            System.out.print("Yg anda ketik : ");
            System.out.write(data);
            System.out.println("Panjang Karakter : "+panjang);
            System.out.print("index ke-1 sebanyak 3 : ");
            System.out.write(data,1,3);
        }catch(IOException e){
            System.out.print("Terjadi Exception");
        }       

    }
    
}
