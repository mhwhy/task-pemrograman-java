
public class posisiKarakter {

   
    public static void main(String[] args) {
        String stringku = "Perkenalkan nama saya wahyu dari dongko";
        System.out.println(stringku.indexOf("perkenalkan"));
        System.out.println(stringku.indexOf("nama",10));
        System.out.println(stringku.indexOf("saya",10));
        System.out.println(stringku.lastIndexOf("wahyu",10));
        System.out.println(stringku.lastIndexOf("wahyu",20));
        
    }
    
}
