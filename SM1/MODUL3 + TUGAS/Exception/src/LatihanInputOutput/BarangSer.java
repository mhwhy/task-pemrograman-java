package LatihanInputOutput;

import java.io.*;
public class BarangSer implements Serializable{
    private String nama;
    private int jumlah;
    public BarangSer (String nm, int jml){
    nama=nm;
    jumlah=jml;
    }
    
    public void tampil(){
        System.out.println("nama barang: "+nama);
        System.out.println("jumlah barang: "+jumlah);
    }
    public void simpanObject(BarangSer ob){
        try{
            FileOutputStream fos= new FileOutputStream("dtBrg.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ob);
            oos.flush();
        }catch(IOException ioe){
            System.err.println("error"+ioe);
    }
    }
    public void bacaObject(BarangSer obb){
        try{
            FileInputStream fis= new FileInputStream("dtBrg.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while( (obb=(BarangSer)ois.readObject())!=null)
            obb.tampil();
        }catch(IOException ioe){
            System.exit(1);
        }catch(Exception e){
            System.exit(1);
        }
    }
public static void main(String[] args){
    BarangSer a1 = new BarangSer("ROG",5);
    a1.simpanObject(a1);
    a1.bacaObject(a1);
    }
}