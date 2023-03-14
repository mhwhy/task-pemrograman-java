package LatihanInputOutput;
import java.io.*;
public class DemoStream4 {
    public static void main(String[] args) {
        byte data;
        String namaFile = "test.txt";
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(namaFile, true);
            //true artinya menambahkan kedalam file, tidak menimpa
            System.out.print("Ketik : ");
            data = (byte)System.in.read();
            while (data!=(byte)'\r') {
            fout.write(data);
            data = (byte)System.in.read();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File "+namaFile+" tidak dapat dicreate");
        }
        catch (IOException e) {
            System.out.println("Terjadi Exception");
        }
        finally {
            if (fout!=null) {
            try {
            fout.close();
        }
        catch (IOException e) {
            System.out.println("Terjadi Exception");
        }
        }
        }
    }
}