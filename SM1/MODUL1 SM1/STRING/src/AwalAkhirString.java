
public class AwalAkhirString {

  
    public static void main(String[] args) {
        String myString = "Wahyu adalah manusia biasa";
        
        System.out.println("STARTSWITH===============");
        
        System.out.println(myString.startsWith("Wahyu"));
        System.out.println(myString.startsWith("wahyu"));
        System.out.println(myString.startsWith("Wah",1));
        System.out.println(myString.startsWith("Wa",2));
        System.out.println(myString.startsWith("W",3));
        
        System.out.println("ENDSWITH=================");
        System.out.println(myString.endsWith("bia"));
        System.out.println(myString.endsWith("manusia"));
        System.out.println(myString.endsWith("bias"));
        System.out.println(myString.endsWith("biasa"));
        
    }
    
}
