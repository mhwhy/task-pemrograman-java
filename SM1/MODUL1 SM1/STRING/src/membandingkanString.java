
public class membandingkanString {

   
    public static void main(String[] args) {
        String myString1 = "Saya";
        String myString2 = "Wahyu";
        String myString3 = "SayaWahyu";
        
        System.out.println("STRING 1 " + myString1 );
        System.out.println("STRING 2 " + myString2 );
        System.out.println("STRING 3 " + myString3 );
        
        System.out.println("STRING 1 + STRING 3 ==> " +myString1.equals(myString3));
        System.out.println("STRING 2 + STRING 3 ==> " +myString1.equals(myString3));
        System.out.println("STRING 1dan2 + STRING 3 ==> " +(myString1+myString2).equals(myString3));
        
        System.out.println("equalsIgnoreCase=====================================================");
        String myString4 = "WAHYU ADALAH MANUSIA BUKAN ALIEN";
        String myString5 = "Wahyu adalah manusia bukan alien";
        
        System.out.println("STRING 4 => " + myString4 );
        System.out.println("STRING 5 => " + myString5 );
        System.out.println("perbandingan  ini mengabaikan  huruf upper dan lower==================");
        System.out.println("STRING 4 + 5 => "+myString4.equalsIgnoreCase(myString5));
        
        System.out.println("STRING 4 & 5 + 5 + 4 => "+(myString4+myString5).equalsIgnoreCase(myString5+myString4));
        
        
        System.out.println("PERBANDINGAN '==' ");
        String myString6 = "RPL";
        String myString7 = new String (myString6);
        String myString8 = "rpl";
        String myString9 = "RPL";
        
        System.out.println("STRING 6 + 8 => "+(myString6==myString8));
        System.out.println("STRING 7 + 8 => "+(myString7==myString8));
        System.out.println("STRING 6 + 9 => "+(myString6==myString9));
   
    }
    
}
