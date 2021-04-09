package tugas45.tugas4;

public class Course {
    /*
        Kelas Course ini digunakan sebagai model publik untuk membuat obyek course.
        Kelas ini juga dibuat karena student hanya bisa mewarisi satu kelas saja,
        dan sudah mewarisi kelas Person.
        Selain itu, obyek dari kelas Course ini akan dibuat dalam java collection
        sehingga java collection akan menyimpan suatu obyek.
    */
    private String namaMatkul, namaDosen;
    private int sks;
    
    // konstruktor kosong
    public Course () {}

    // konstruktor berparameter untuk membuat obyek baru dengan suatu masukkan dan menge-set valuenya
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
