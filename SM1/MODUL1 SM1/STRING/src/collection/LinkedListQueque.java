
package collection;
import java.util.*;
public class LinkedListQueque {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("PEMROGRAMAN BERORIENTASI OBJEK");
        queue.add("PEMROGRAMAN DASAR");
        queue.add("SISTEM KOMPUTER");
        queue.add("JARINGAN DASAR");
        queue.add("ANDROID STUDIO");
        queue.add("PEMROGRAMAN WEB");
        
        System.out.println(queue + "\n");
        
        queue.remove("ANDROID STUDIO");
        
        System.out.println(queue + "\n");
        
        System.out.println(queue.element());
        
    }
    
}
