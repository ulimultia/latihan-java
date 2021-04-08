package latihanAbstraction;

public class Persegi implements BangunDatar{

    @Override
    public void drawPattern() {
        // TODO Auto-generated method stub
        System.out.println("\n\n=====================================================================");
        System.out.println("PERSEGI\n");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(" * ");               
            }
            System.out.println();
        }        
    }

    @Override
    public void charactersPattern() {
        // TODO Auto-generated method stub
        System.out.println("\n>>> Karakteristik: ");
        System.out.println("1. Memiliki 4 buah sisi yang panjangnya sejajar");
        System.out.println("2. Rumus Luas: Sisi x Sisi");
        System.out.println("3. Rumus Keliling: 4 * Sisi");
        System.out.println("=====================================================================");
    }
    
    public void cetak(){
        System.out.println("Haloo");
    }
}
