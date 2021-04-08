package javaCollectionAndDate;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public void mapTesting(){
        Map<String, Integer>  nilai = new HashMap<>();
        nilai.put("Anisa", 90);
        nilai.put("Budi", 92);
        nilai.put("Cynthia", 60);
        nilai.put("Dani", 70);
        nilai.put("Elsa", 90);

        System.out.println("Map: " + nilai);
        System.out.println();

        System.out.println("Print dengan Foreach: ");
        for(String element : nilai.keySet()){
            System.out.println("key: " + element + ", value: " + nilai.get(element));
        }
    }

    public static void main(String[] args) {
        MapTest map = new MapTest();
        map.mapTesting();
    }
}
