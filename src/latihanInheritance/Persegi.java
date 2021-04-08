package latihanInheritance;

class Persegi {
    private float sisi;

    protected Persegi(float sisi){
        this.sisi = sisi;
    }
     
    protected float getSisi() {
        return sisi;
    }

    protected void setSisi(float sisi) {
        this.sisi = sisi;
    }

    protected float hitungLuas(){
        return sisi * sisi;
    }

    protected float hitungKeliling(){
        return sisi * 4;
    }
}
