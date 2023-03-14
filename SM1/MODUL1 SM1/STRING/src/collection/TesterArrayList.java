
package collection;
import java.util.*;

public class TesterArrayList {


    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("PEMROGRAMAN BERORIENTASI OBJEK");
        list.add("PEMROGRAMAN DASAR");
        list.add("SISTEM KOMPUTER");
        list.add("JARINGAN DASAR");
        list.add("ANDROID STUDIO");
        list.add(1, "PEMROGRAMAN WEB");
        list.add("PEMROGRAMAN WEB");
        
        //meghapus data berdasarkan index
        list.remove(0);
        
        System.out.println(list);
        
    }
    
}
