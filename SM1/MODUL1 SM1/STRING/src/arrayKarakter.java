
public class arrayKarakter {


    public static void main(String[] args) {
        String str="Ilmu komputer UNP";
        char[] arraystr=str.toCharArray();
        System.out.println("String : " + str);
        System.out.println("String baru [toCharArray]: ");
        
        for (int i=0; i<arraystr.length ; i++){
            System.out.println(arraystr[i]);
        }
        System.out.println("String baru [getChars]: ");
        char[] getstr= new char[10];
        str.getChars(5,13,getstr,0);
            for (int  i=0; i<getstr.length ; i++){
            System.out.println(getstr[i]);
    }
    }
    
}
