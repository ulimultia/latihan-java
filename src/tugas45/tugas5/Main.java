package tugas45.tugas5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    // obyek yang menampilkan menu default
    private static Menu daftarMenu = new Menu();
    // obyek yang menyimpan data pesanan
    private static Menu daftarPesanan = new Menu();
    // atribut penampung dari tiap-tiap jenis daftar pesanan yang diinputkan user
    private static Map<String, Double> pesananMakanan = new HashMap<>();
    private static  Map<String, Double> pesananMinuman = new HashMap<>();
    private static  Map<Integer, Paket> pesananPaket = new HashMap<>();
    
    public static void main(String[] args) {
        int pilihan, tempPilihan, temp;
        String tempKey = "";
        double tempValue = 0;
        Paket tempPaket = new Paket();
        // inisialisasi awal isi data tiap-tiap daftar menu
        daftarMenu.createListMakanan();
        daftarMenu.createListMinuman();
        daftarMenu.createListPaket();
        // inisialisasi awal isi dari tiap-tiap daftar pesanan
        daftarPesanan.setListMakanan(pesananMakanan);
        daftarPesanan.setListMinuman(pesananMinuman);
        daftarPesanan.setListPaket(pesananPaket);
        
        do{
            System.out.println("\n\n============ MENU UTAMA ============");
            System.out.println("1. Admin");
            System.out.println("2. Kasir");
            System.out.println("0. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih Menu: "); pilihan = Integer.parseInt(scanner.nextLine());
            switch(pilihan){
                case 1: do {
                            System.out.println("\n\n============ MENU ADMIN ============");
                            System.out.println("1. Daftar Menu");
                            System.out.println("2. Tambah Makanan");
                            System.out.println("3. Tambah Minuman");
                            System.out.println("4. Tambah Paket");
                            System.out.println("0. Keluar");
                            System.out.println("====================================");
                            System.out.print("Pilih Menu: "); tempPilihan = Integer.parseInt(scanner.nextLine());
                            switch(tempPilihan){
                                case 1: daftarMenu.tampilSemuaMenu(); break;
                                case 2: System.out.print("Nama Makanan\t: "); tempKey = scanner.nextLine();
                                        System.out.print("Harga Makanan\t: Rp ");tempValue = Double.parseDouble(scanner.nextLine());
                                        daftarMenu.tambahListMakanan(tempKey, tempValue);
                                        break;
                                case 3: System.out.print("Nama Minuman\t: "); tempKey = scanner.nextLine();
                                        System.out.print("Harga Minuman\t: Rp ");tempValue = Double.parseDouble(scanner.nextLine());
                                        daftarMenu.tambahListMinuman(tempKey, tempValue);
                                        break;
                                case 4: System.out.print("Nama Paket\t: "); String namaPaket = scanner.nextLine();
                                        System.out.print("Nama Makanan\t: "); String namaMakanan  = scanner.nextLine();
                                        System.out.print("Nama Minuman\t: "); String namaMinuman = scanner.nextLine();
                                        System.out.print("Harga Paket\t: Rp "); double hargaPaket = Double.parseDouble(scanner.nextLine());
                                        daftarMenu.tambahListPaket(new Paket(namaPaket, namaMakanan, namaMinuman, hargaPaket));
                                        break;
                                default: System.out.println("Pilihan tidak tersedia ..."); break;
                            }
                        }while(tempPilihan != 0);
                        break;
                case 2: do {
                            System.out.println("\n\n============ MENU KASIR ============");
                            System.out.println("1. Daftar Menu");
                            System.out.println("2. Pilih Makanan");
                            System.out.println("3. Pilih Minuman");
                            System.out.println("4. Pilih Paket");
                            System.out.println("5. Pembayaran");
                            System.out.println("0. Keluar");
                            System.out.println("====================================");
                            System.out.print("Pilih Menu: "); tempPilihan = Integer.parseInt(scanner.nextLine());
                            switch(tempPilihan){
                                case 1: daftarMenu.tampilSemuaMenu(); break;
                                case 2: daftarMenu.tampilListMakanan();
                                        System.out.print("Pilih Makanan: "); temp = Integer.parseInt(scanner.nextLine());
                                        // mengambil key dan value dari daftar menu
                                        tempKey = getKeyName(daftarMenu.getListMakanan(), temp);
                                        tempValue = getValueName(daftarMenu.getListMakanan(), temp);
                                        // menambahkan makanan ke dalam list pesanan makanan
                                        daftarPesanan.tambahListMakanan(tempKey, tempValue);
                                        break;
                                case 3: daftarMenu.tampilListMinuman();
                                        System.out.print("Pilih Makanan: "); temp = Integer.parseInt(scanner.nextLine());
                                        // mengambil key dan value dari daftar menu
                                        tempKey = getKeyName(daftarMenu.getListMinuman(), temp);
                                        tempValue = getValueName(daftarMenu.getListMinuman(), temp);
                                        // menambahkan minuman ke dalam list pesanan minuman
                                        daftarPesanan.tambahListMinuman(tempKey, tempValue);
                                        break;
                                case 4: daftarMenu.tampilListPaket();
                                        System.out.print("Pilih Makanan: "); temp = Integer.parseInt(scanner.nextLine());
                                        // mengambil obyek dan isi paket dari daftar menu
                                        tempPaket = getIsiPaket(daftarMenu.getListPaket(), temp);
                                        // memasukkan obyek yang telah diambil dari daftar menu ke daftar pesanan
                                        daftarPesanan.tambahListPaket(tempPaket);
                                        break;
                                case 5: daftarPesanan.tampilNota(); break;
                                default: System.out.println("Pilihan tidak tersedia ..."); break;
                            }
                        }while(tempPilihan != 0);
                        break;
                case 0: break;
                default: System.out.println("Pilihan tidak tersedia ..."); break;
            }
        }while(pilihan!=0);
    }
    
    private static String getKeyName(Map<String, Double> menu, int pilihan){
        // method yang digunakan untuk mengambil key dari Map<>
        String key="";
        int counter = 1;
        for(String element : menu.keySet()){
            if(counter == pilihan){
                key = element;
                break;
            }
            counter++;
        }
        return key;
    }

    private static double getValueName(Map<String, Double> menu, int pilihan){
        // method yang digunakan untuk mengambil value dari Map<>
        double value=0;
        int counter = 1;
        for(String element : menu.keySet()){
            if(counter == pilihan){
                value = menu.get(element);
                break;
            }
            counter++;
        }
        return value;
    }

    private static Paket getIsiPaket(Map<Integer, Paket> menu, int pilihan){
        // method yang digunakan untuk mengambil value dari Map<> berupa obyek paket
        Paket temp = new Paket();
        for(Integer element : menu.keySet()){
            if(element == pilihan){
                temp = menu.get(element);
                break;
            }
        }
        return temp;
    }
}
