package latihanInheritance;

public class Bola extends Lingkaran{
    
    public Bola(float jariJari){
        super(jariJari);
    }

    private float hitungVolume(){
        // V = 4/3 * phi * r^3
        return 4/3 * super.hitungLuas() * super.getJariJari();
    }

    @Override
    protected float hitungLuas(){
        return 4 * super.hitungLuas();
    }

    public void showResult(){
        System.out.println("\n============================ HASIL ==================================");
        System.out.println(">>> Lingkaran");
        System.out.println("Luas Lingkaran\t\t: " + super.hitungLuas());
        System.out.println("Keliling Lingkaran\t: " + super.hitungKeliling());
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println(">>> Bola");
        System.out.println("Luas Permukaan Bola\t: " + hitungLuas());
        System.out.println("Volume Bola\t\t: " + hitungVolume());
        System.out.println("\n=====================================================================\n\n");
    }
}
