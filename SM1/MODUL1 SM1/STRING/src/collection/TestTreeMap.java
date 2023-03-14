
package collection;

import java.util.*;
public class TestTreeMap {


    public static void main(String[] args) {
         Map<String, String> map = new TreeMap<String , String>();
        map.put("0011", "Wahyu");
        map.put("1222", "Laba laba");
        map.put("0132", "Hakim");
        map.put("0124", "Dhani");
        map.put("0022", "paijan");
        
        //menghapus data dengan key nya
        map.remove("0011");
        
        System.out.println(map);
        
        System.out.println(map.get("1222"));
    }
    
}
