package latihanAbstraction;

public class Main {
    public static void main(String[] args) {     
        // Segitiga
        BangunDatar segitiga = new Segitiga();
        segitiga.drawPattern();
        segitiga.charactersPattern();

        // Persegi
        BangunDatar persegi = new Persegi();
        persegi.drawPattern();
        persegi.charactersPattern();

        // Lingkaran
        BangunDatar lingkaran = new Lingkaran();
        lingkaran.drawPattern();
        lingkaran.charactersPattern();
    }
}
