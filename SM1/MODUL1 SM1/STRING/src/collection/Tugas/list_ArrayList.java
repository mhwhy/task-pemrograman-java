
package collection.Tugas;

import java.util.*;

public class list_ArrayList {


    public static void main(String[] args) {
        List<String> provinsi = new ArrayList<String>();
        provinsi.add("1.Jawa");        //method add untuk menambah objek ke list
        provinsi.add("2.Sumatera");
        provinsi.add("3.Papua");
        provinsi.add(1,"5.Lampung");
        provinsi.add("4.Kalimantan");
        provinsi.add("5.Lampung"); //dapat menambah data duplikat
        
        
        System.out.println(provinsi);
        
        System.out.println("\n====remove====\n");
        
        provinsi.remove(2); //mengeluarkan objek dari list
        
        System.out.println(provinsi);
    }
    
}
