
package collection.Tugas;

import java.util.*;
public class List_Queue_List {

    public static void main(String[] args) {
        Queue<String> pelajar = new LinkedList<String>();
        pelajar.add("Zawa");
        pelajar.add("Ajib");
        pelajar.add("Rafa");
        pelajar.add("Wahyu");
        pelajar.add("Fikri");
        pelajar.add("Dary");
        
        System.out.println(pelajar+"\n================");
        
        pelajar.remove("Dary");
        
        System.out.println(pelajar+"\n==After remove==");
        
        System.out.println("--------");
        
        System.out.println(pelajar.element());
     
    }
    
}
