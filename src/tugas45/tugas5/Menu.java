package tugas45.tugas5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Menu extends Paket{
    /**
     * Kelas Menu digunakan untuk menyimpan seluruh obyek menu
     * seperti daftar paketr, daftar makanan, dan daftar minuman.
     * Daftar-daftar tersebut disimpan dalam Map<>
     */
    private Map<String, Double> listMakanan = new HashMap<>();
    private Map<String, Double> listMinuman = new HashMap<>();
    private Map<Integer, Paket> listPaket = new HashMap<>();
    
    // setter dan getter
    public void setListMakanan(Map<String, Double> listMakanan) {
        this.listMakanan = listMakanan;
    }

    public void setListMinuman(Map<String, Double> listMinuman) {
        this.listMinuman = listMinuman;
    }

    public void setListPaket(Map<Integer, Paket> listPaket) {
        this.listPaket = listPaket;
    }

    public Map<String, Double> getListMakanan() {
        return listMakanan;
    }

    public Map<String, Double> getListMinuman() {
        return listMinuman;
    }

    public Map<Integer, Paket> getListPaket() {
        return listPaket;
    }

    // method yang dibutuhan di kelas Menu
    public void createListMakanan(){
        // method untuk mengenerate data daftar makanan
        listMakanan.put("Ayam Bakar", (double) 11500);
        listMakanan.put("Ayam Goreng", (double) 11000);
        listMakanan.put("Nila Bakar", (double) 13500);
        listMakanan.put("Nila Goreng", (double) 13000);
        listMakanan.put("Lele Bakar", (double) 10500);
        listMakanan.put("Lele Goreng", (double) 10000);
    }

    public void createListMinuman(){
        // method untuk mengenerate data daftar minuman
        listMinuman.put("Air Putih", (double) 1000);
        listMinuman.put("Teh Panas", (double) 2500);
        listMinuman.put("Es Teh", (double) 3000);
        listMinuman.put("Jeruk Panas", (double) 3000);
        listMinuman.put("Es Jeruk", (double) 3500);
        listMinuman.put("Kopi Tubruk", (double) 4000);
    }

    public void createListPaket(){
        /**
         *  method untuk mengenerate data daftar paket dengan membuat obyek baru dari
         *  kelas Paket dengan kontruktor berparameter
         */ 
        listPaket.put(1, new Paket("Paket Bebakaran A", "Ayam Bakar", "Es Teh", 14000));
        listPaket.put(2, new Paket("Paket Bebakaran B", "Lele Bakar", "Es Teh", 13000));
        listPaket.put(3, new Paket("Paket Bebakaran C", "Nila Bakar", "Es Teh", 16000));
        listPaket.put(4, new Paket("Paket Goreng A", "Ayam Goreng", "Es Teh", 13500));
        listPaket.put(5, new Paket("Paket Goreng B", "Lele Goreng", "Es Teh", 12500));
        listPaket.put(6, new Paket("Paket Goreng C", "Nila Goreng", "Es Teh", 15500));
    }

    public void tampilSemuaMenu(){
        // method untuk menampilkan semua menu yang tersedia
        System.out.println("\n\n===================== DAFTAR MENU =======================");
        tampilListMakanan();
        System.out.println();
        tampilListMinuman();
        System.out.println();
        tampilListPaket();
        System.out.println("=========================================================");
    }

    public void tampilListMakanan(){
        // method yang digunakan untuk menampilkan daftar makanan saja
        int counter = 1;
        System.out.println(">>> Daftar Makanan");
        for(String element : listMakanan.keySet()){
            System.out.println(counter + ". " + element + "\t\tRp " + listMakanan.get(element));
            counter++;
        }
    }

    public void tampilListMinuman(){
        // method yang digunakan untuk menampilkan daftar minuman saja
        int counter = 1;
        System.out.println(">>> Daftar Minuman");
        for(String element : listMinuman.keySet()){
            System.out.println(counter + ". " + element + "\t\tRp " + listMinuman.get(element));
            counter++;
        }
    }

    public void tampilListPaket(){
        // method yang digunakan untuk menampilkan paket yang tersedia saja
        System.out.println(">>> Daftar Paket");
        for(Integer element : listPaket.keySet()){
            System.out.println(element + ". " + listPaket.get(element).getNamaPaket() + "\t\tRp " + listPaket.get(element).getHarga());
            System.out.println("   >>> Isi: " + listPaket.get(element).getNamaMakanan() + " dan " + listPaket.get(element).getNamaMinuman());
        }
    }


    public void tambahListMakanan(String namaMakanan, double harga){
        // method yang digunakan untuk menambah data makanan ke map makanan
        listMakanan.put(namaMakanan, harga);
    }

    public void tambahListMinuman(String namaMinuman, double harga){
        // method yang digunakan untuk menambha data makanan ke map minuman
        listMinuman.put(namaMinuman, harga);
    }

    public void tambahListPaket(Paket paket){
        // mencari jumlah list sebelum ditambahkan untuk dijadikan key pada map
        // kemudian diincrement agar nilainya bertambah satu
        int index = listPaket.size() + 1;
        listPaket.put(index, paket);
    }

    private double hitungTotalBayar(){
        double counter = 0;
        // menghitung total bayar makanan
        for(String element : listMakanan.keySet()){
            counter = counter + listMakanan.get(element);
        }
        // menghitung total bayar minuman
        for(String element : listMinuman.keySet()){
            counter = counter + listMinuman.get(element);
        }
        // menghitung total bayar paket
        for(Integer element : listPaket.keySet()){
            counter = counter + listPaket.get(element).getHarga();
        }
        return counter;
    }

    private double hitungPPN(double total){
        // ppn 10 % = 0.1
        return total * 0.1;
    }

    public void tampilNota(){
        // method yang digunakan untuk menampilkan nota pemesanan
        System.out.println("================= NOTA ===================");
        System.out.println("Tgl: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("E, dd MMM yyyy - hh:mm")));
        tampilListMakanan();
        tampilListMinuman();
        tampilListPaket();
        System.out.println("===========================================");
        System.out.println("Total Harga: Rp " + hitungTotalBayar());
        System.out.println("PPN        : Rp " + hitungPPN(hitungTotalBayar()));
        System.out.println("Total Bayar: Rp " + hitungTotalBayar()+ hitungPPN(hitungTotalBayar()));
        System.out.println("===========================================");
    }
}
