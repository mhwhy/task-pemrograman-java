
package collection.Tugas;

import java.util.*;
public class list_LinkedList {

  
    public static void main(String[] args) {
        
        //intansiasi objek dari linkedlist
        LinkedList<String> buah = new LinkedList<String>();
        buah.add("Melon");
        buah.add("Durian");
        buah.add("Semangka");
        buah.add("Jambu");
        buah.add("Nanas");
        
        System.out.println("Nama buah   : "+buah);
        System.out.println("Jumlah Buah : "+buah.size());
    }
    
}
