
public class stringArray {

    public static void main(String[] args) {
        char[] arraystr={'I','L','M','U',' ','W','E','B'};
        
        System.out.println("Array char");
        
        for (int i=0; i<arraystr.length ; i++){
            System.out.println(arraystr[i]);
        }
        System.out.println("String Baru : ");
        
        String str=String.copyValueOf(arraystr);
            System.out.println(str);
    }    
}
