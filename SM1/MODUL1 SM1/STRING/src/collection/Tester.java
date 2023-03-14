
package collection;

import java.util.*;

public class Tester {
    
      //set => struktur data yg menyimpan elemen unik(tidak sama)
      //berguna menyimpan data yg tidak mungkin sama misal => ktp,nomor telepon,email
      //implementasi set menggunakan Hashset -> tidak memperhatikan posisi data

    public static void main(String[] args) {
        
        System.out.println("\n========HashSet========\n");
        
      Set<String> set = new HashSet<String>();
        set.add("08111");
        set.add("08222");
        set.add("08333");
        set.add("08444");
        set.add("08555");
        set.add("08666");
        
        System.out.println(set);
        
        System.out.println("\n========LinkedHashSet========\n");
        
        Set<String> set2 = new LinkedHashSet<String>();
        set2.add("08111");
        set2.add("08222");
        set2.add("08333");
        set2.add("08444");
        set2.add("08555");
        set2.add("08666");
        
        System.out.println(set2);
        
        System.out.println("\n========TreeSet========\n");
        
        Set<String> set3 = new TreeSet<String>();
        set3.add("08111");
        set3.add("08222");
        set3.add("08333");
        set3.add("08666");
        set3.add("08444");
        set3.add("08555");
        
        System.out.println(set3);

    }
    
}
