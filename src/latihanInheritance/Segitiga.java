package latihanInheritance;

class Segitiga {
    private float alas, tinggi;

    protected Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected float getAlas() {
        return alas;
    }

    protected void setAlas(float alas) {
        this.alas = alas;
    }

    protected float getTinggi() {
        return tinggi;
    }

    protected void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    protected float hitungLuas(){
        return (alas * tinggi) / 2;
    }

    protected float hitungKeliling(){
        //cari sisi miring dengan pitagoras c2 = a2 + b2
        float sisiMiring = (float) Math.sqrt( Math.pow((alas/2),2) + Math.pow(tinggi,2) );
        // hitung keliling sisi miring + sisi miring + alas;
        return (sisiMiring * 2) + alas;
    }
}
