package LatihanException;
public class DemoFinnaly {

    public static void main(String[] args) {
        int x = 1;
        int[] arry = {7,8,9};
        try{
            System.out.println(arry[x]);
            System.out.println("Tidak terjadi exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("terjadi exception");
            System.out.println(arry[x-4]);
        }finally{
            System.out.println("program selesai:|");
        }
    }
    
}
