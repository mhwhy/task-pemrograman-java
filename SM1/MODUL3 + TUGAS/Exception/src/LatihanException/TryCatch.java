package LatihanException;


public class TryCatch {


    public static void main(String[] args) {
        
        try{
            int[] array = new int[1];
            System.out.println(array[1]);
            System.out.println("Baris ini tidak akan dieksekusi karena kode diatas terjadi sebuah exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi exception karena indeks dipanggil diluar kapasitas array");
        }
        System.out.println("Setelah block trycatch");
    }
    
}
