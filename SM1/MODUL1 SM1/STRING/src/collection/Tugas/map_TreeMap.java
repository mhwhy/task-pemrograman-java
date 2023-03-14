
package collection.Tugas;

import java.util.*;
public class map_TreeMap {

 
    public static void main(String[] args) {
        Map<String , String> PendudukMars = new TreeMap<String , String>();
        PendudukMars.put("0001", "Raffa");
        PendudukMars.put("0321", "Manshur");
        PendudukMars.put("0456", "Petruk");
        PendudukMars.put("00131", "Ajib");
        PendudukMars.put("00211", "Wahyu");
        
        System.out.println(PendudukMars);
        
        System.out.println("===sesudah diremove===");
        
        PendudukMars.remove("0001");
        System.out.println(PendudukMars);
        System.out.println("===Ambil Data===");
        System.out.println(PendudukMars.get("00211"));
        
    }
    
}
