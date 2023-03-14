package collection;
import java.util.*;
public class LinkedListPriorityQueue {


    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("PEMROGRAMAN BERORIENTASI OBJEK");
        queue.add("PEMROGRAMAN DASAR");
        queue.add("SISTEM KOMPUTER");
        queue.add("JARINGAN DASAR");
        queue.add("ANDROID STUDIO");
        queue.add("PEMROGRAMAN WEB");
        
        System.out.println(queue);
    }
    
}
