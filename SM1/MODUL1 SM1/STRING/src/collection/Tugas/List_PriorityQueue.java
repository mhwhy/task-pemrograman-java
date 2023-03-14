
package collection.Tugas;

import java.util.*;
public class List_PriorityQueue {

  
    public static void main(String[] args) {
        
        Queue<String> buah = new PriorityQueue<String>();
        buah.add("Melon");
        buah.add("Durian");
        buah.add("Semangka");
        buah.add("Jambu");
        buah.add("Nanas");
        
        System.out.println("Nama buah   : "+buah);
        System.out.println("Jumlah Buah : "+buah.size());
    }
    
}
