package javaCollectionAndDate;

// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public void listTesting() {
        // String[] arr = {"Es Batu", "Air Putih"};
        List<String> listMakanan = new ArrayList<>();
        // membuat list sekaligus mengisi listnya dengan konstruktor bernama asList()
        List<String> listMinuman = new ArrayList<>(Arrays.asList("Es Teh", "Es Jeruk", "Air Putih", "Es Nutrisari", "jus Jambu"));
        // List<String> listMinumanTest = new ArrayList<>(Arrays.asList(arr));

        // menambahkan data satu persatu ke dalam list
        listMakanan.add("Mie Ayam");
        listMakanan.add("Bakso");
        listMakanan.add("Mie Ayam Bakso");
        listMakanan.add(listMinuman.get(0)); // menambahkan data dari suatu array pada indeks tertentu

        // untuk menampilkan data dalam bentuk arraynya
        System.out.println("Makanan: " + listMakanan);
        System.out.println("Minuman: " + listMinuman);
        System.out.println();
        
        // untuk menampilkan data dalam array satu persatu
        System.out.println("Daftar Makanan:");
        for(String element : listMakanan){
            System.out.println(element);
        }
        System.out.println();

        // menambahkan data pada indeks tertentu
        listMakanan.add(0, "Soto");
        listMakanan.add(2, "Mie Goreng");
        System.out.println("Makanan ditambahkan menu: " + listMakanan);
        System.out.println();
        
        // menghapus data dari array berdasarkan indeksnya
        listMakanan.remove(3); // menghapus data di indeks ke - 3
        System.out.println("Makanan bakso dihapus: " + listMakanan);
        System.out.println();

        // menambahkan data array minuman ke array makanan
        listMakanan.addAll(listMinuman);
        System.out.println("Makanan + Minuman: " + listMakanan);
        System.out.println();

        //menghapus minuman dari list makanan
        listMakanan.remove(listMinuman.get(1)); // menghapus es jeruk
        System.out.println("Makanan hapus es jeruk: " + listMakanan);
        System.out.println();
        // System.out.println(listMinumanTest.get(1));
        
        // hapus semua minuman yang ada dimakanan
        listMakanan.removeAll(listMinuman);
        System.out.println("Makanan hapus semua minuman: " + listMakanan);

        // index value of => mencari indeks dari suatu value
        System.out.println("Posisi indeks Mie Ayam: " + listMakanan.indexOf("Mie Ayam"));
        System.out.println();

        // Sorting data pada array
        Collections.sort(listMakanan);
        System.out.println("Daftar Makanan Berurutan:");
        for(String element : listMakanan){
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListTest list = new ListTest();
        list.listTesting();
    }
}
