package tugas45.tugas5;

public class Paket {
    /**
     * Kelas Paket digunakan sebagai model parent untuk kelas keturunannya.
     * Kelas ini menyimpan objek-objek dari Paket menu yang tersedia 
     * Data yang disimpan dalam obyek ini yaitu, nama paket, makanan, minuman, dan harganya
     */
    private String namaMakanan, namaMinuman, namaPaket;
    private double harga;

    // konstruktor kosong
    public Paket(){}

    // konstruktor berparapmeter
    public Paket(String paket, String makanan, String minuman, double harga){
        // konstruktor ini digunakan untuk mengenerate nama paket pada kelas Menu void createListPaket
        this.harga = harga;
        this.namaMakanan = makanan;
        this.namaMinuman = minuman;
        this.namaPaket = paket;
    }

    // setter dan getter
    public String getNamaMakanan() {
        return namaMakanan;
    }
    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }
    public String getNamaMinuman() {
        return namaMinuman;
    }
    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }
    public String getNamaPaket() {
        return namaPaket;
    }
    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
}
