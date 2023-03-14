package LatihanException;
public class TryCatch2 {
    
    public static void main(String[] args) {
        try{
            int x = args.length; //banyak argumen 
            int y = 100 / x;
            int[] arry = {10 , 11};
            y = arry[x];
            System.out.println("Tidak terjadi exception");
        }catch (ArithmeticException e){
            System.out.println("Terjadi exception karena pembagian dengan nol");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi exception karena indeks dipanggil diluar kapasitas array");
        }
        
        System.out.println("Setelah deklarasi blok try catch");
    }
    
}
