package latihanAbstraction;

public class Segitiga implements BangunDatar{

    public Segitiga(){}

    @Override
    public void drawPattern() {
        
        System.out.println("\n\n=====================================================================");
        System.out.println("SEGITIGA\n");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");               
            }
            System.out.println();
        }
    }

    @Override
    public void charactersPattern() {
        
        System.out.println("\n>>> Karakteristik: ");
        System.out.println("1. Memiliki 3 buah sisi, setidaknya 1 buah sisi merupakan sisi miring");
        System.err.println("2. Memiliki alas dan tinggi");
        System.out.println("3. Setiap sisi dapat dihitung panjangnya dengan pitagoras\n   Rumus: C^2 = a^2 + b^2");
        System.out.println("4. Rumus Luas: 1/2 x Alas x Tinggi");
        System.out.println("5. Rumus Keliling: Alas + Tinggi + Sisi Miring");
        System.out.println("=====================================================================");
    }
    
}
