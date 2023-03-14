package LatihanException;
public class coba_Throw {
    
    public static void methodLain() {
        try{
            throw new ArrayIndexOutOfBoundsException(1);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Penanganan exception dalam method => methodLain()");
        }
    }
    public static void main(String[] args) {
       try{
           methodLain();
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("penanganan exception pada method main()");
       }
    }
    
}
