package tugas45.tugas4;

public class Course {
    private String namaMatkul, namaDosen;
    private int sks;
    
    // konstruktor
    public Course () {}

    public Course(String mataKuliah, String dosen, int sks){
        this.namaDosen = dosen;
        this.namaMatkul = mataKuliah;
        this.sks = sks;
    }

    // setter dan getter
    public String getNamaMatkul() {
        return namaMatkul;
    }
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    public String getNamaDosen() {
        return namaDosen;
    }
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    public int getSks() {
        return sks;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }
    
}
