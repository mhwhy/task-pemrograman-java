
package collection.Tugas;

import java.util.*;
public class map_LinkedHashMap {


    public static void main(String[] args) {
        Map<String , String> PendudukMars = new LinkedHashMap<String , String>();
        PendudukMars.put("Raf", "Raffa");
        PendudukMars.put("Man", "Manshur");
        PendudukMars.put("Pet", "Petruk");
        PendudukMars.put("Aj", "Ajib");
        PendudukMars.put("Wah", "Wahyu");
        
        System.out.println("===LinkedHashMap===");
        System.out.println(PendudukMars);
    }
    
}
