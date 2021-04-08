package latihanInheritance;

class Lingkaran {
    private float jariJari;
    private static float PHI = (float) 22/7;

    protected Lingkaran(float r){
        this.jariJari = r;
    }

    protected float getJariJari() {
        return jariJari;
    }

    protected void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    protected float hitungLuas(){
        return PHI * jariJari * jariJari; 
    }

    protected float hitungKeliling(){
        return 2 * PHI * jariJari;
    }
}
