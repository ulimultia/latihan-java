package latihanAbstraction;

public class Lingkaran implements BangunDatar{

    @Override
    public void drawPattern() {
        
        System.out.println("\n\n=====================================================================");
        System.out.println("LINGKARAN\n");
        // source : https://introcs.cs.princeton.edu/java/13flow/Circle.java.html
        // int n = Integer.parseInt(args[0]);
        int n = 3;
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i + j*j <= n*n) 
                    System.out.print(" # ");
                else                 
                    System.out.print(" . ");
            }
            System.out.println();
        }
    }

    @Override
    public void charactersPattern() {
        
        System.out.println("\n>>> Karakteristik: ");
        System.out.println("1. Memiliki diameter (d) dan jari-jari/radius (r)");
        System.out.println("2. Rumus Luas: phi x r x r");
        System.out.println("3. Rumus Keliling: 2 x phi x r atau phi x d");
        System.out.println("=====================================================================");
    }
}
