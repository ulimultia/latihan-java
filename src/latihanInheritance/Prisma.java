package latihanInheritance;

public class Prisma extends Segitiga{
    private float tinggiPrisma;

    public Prisma(float alas, float tinggiSegitiga, float tinggiPrisma){
        super(alas, tinggiSegitiga);
        this.tinggiPrisma = tinggiPrisma;
    }

    public float getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(float tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    private float hitungVolume(){
        return super.hitungLuas() * tinggiPrisma;
    }

    @Override
    protected float hitungLuas(){
        //menghitung luas permukaan prima segitiga dengan rumus berikut:
        // L = (2 x luas alas) + (keliling alas x tinggi prisma)
        return (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggiPrisma);
    }

    public void showResult(){
        System.out.println("\n============================ HASIL ==================================");
        System.out.println(">>> Segitiga");
        System.out.println("Luas Segitiga\t\t: " + super.hitungLuas());
        System.out.println("Keliling Segitiga\t: " + super.hitungKeliling());
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println(">>> Prisma Segitiga");
        System.out.println("Luas Permukaan Prisma Segitiga\t: " + hitungLuas());
        System.out.println("Volume Prisma Segitiga\t\t: " + hitungVolume());
        System.out.println("\n=====================================================================\n\n");
    }
}
