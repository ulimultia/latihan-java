package latihanModifier;

public class Segitiga {
	public int alas, tinggi;
	public float luas, keliling;
	
//	Konstruktor
	public Segitiga() {}
	
	public Segitiga(int alas, int tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	
//	Method
	public float hitungKeliling() {
		return keliling;
	}
	
	public float hitungLuas() {
		luas = alas * tinggi / 2;
		return luas;
	}
	
	
}
