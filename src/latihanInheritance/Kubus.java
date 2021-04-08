package latihanInheritance;

public class Kubus extends Persegi {
    public Kubus (float sisi){
        super(sisi);
    }

    private float hitungVolume(){
        //  V = sisi ^ 3
        return super.hitungLuas() * super.getSisi();
    }

    @Override
    protected float hitungLuas(){
        return 6 * super.hitungLuas();
    }

    public void showResult(){
        System.out.println("\n============================ HASIL ==================================");
        System.out.println(">>> Persegi");
        System.out.println("Luas Persegi\t\t: " + super.hitungLuas());
        System.out.println("Keliling Persegi\t: " + super.hitungKeliling());
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println(">>> Kubus");
        System.out.println("Luas Permukaan Kubus\t: " + hitungLuas());
        System.out.println("Volume Kubus\t\t: " + hitungVolume());
        System.out.println("\n=====================================================================\n\n");
    }
}
