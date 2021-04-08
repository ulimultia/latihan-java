package javaCollectionAndDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTes {
    public void setTesting(){
        Set<String> setNames = new HashSet<>();

        setNames.add("Andi");
        setNames.add("Budi");
        setNames.add("Ayu");
        setNames.add("Kartika");
        setNames.add("Sari");
        setNames.add("Andi");

        // menampilkan data unordered asli dari setNames
        System.out.println("Daftar Nama Unordered: ");
        for(String string : setNames){
            System.out.println(string);
        }
        System.out.println();

        // sorting data setnames
        List<String> list = new ArrayList<>(setNames);
        Collections.sort(list);
        // menampilkan data unordered asli dari setNames
        System.out.println("Daftar Nama Sudah Disorting: ");
        for(String string : list){
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        SetTes set = new SetTes();
        set.setTesting();
    }
}
