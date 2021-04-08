package tugas45.tugas5;

public class Paket {
    private String namaMakanan, namaMinuman, namaPaket;
    private double harga;

    public Paket(){}

    public Paket(String paket, String makanan, String minuman, double harga){
        // konstruktor ini digunakan untuk mengenerate nama paket pada kelas Menu void createListPaket
        this.harga = harga;
        this.namaMakanan = makanan;
        this.namaMinuman = minuman;
        this.namaPaket = paket;
    }

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

    //setter dan getter
    
}
