package tugas45.tugas4;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person implements StudentInterface, CourseIntreface{
    /*
        Setiap obyek Student memiliki sifat person, npm, dan daftar mata kuliah
        yang diambil. Untuk itu, terdapat dua variable yang di deklarasikan 
        pada Kelas Student ini.
        Kelas Student ini juga mewarisi sifat Kelas Person dan mengimplementasikan
        method-method dari kelas interface Student dan inteface Course
    */
    private String npm;
    private Map<Integer, Course> daftarMataKuliah = new HashMap<>();

    // konstruktor kosong
    public Student(){
        super();
    }

    //setter dan getter kelas Student
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public Map<Integer, Course> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public void setDaftarMataKuliah(Map<Integer, Course> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    } 

    // method override dari kelas interface
    @Override //StudentInterface
    public void studentRegistrasion(String firstName, String lastName, String domisili, String npm) {
        /* 
            Method ini digunakan untuk membuat sebuat objek baru dari Kelas Student.
            Method ini mirip fungsinya dengan konstruktor tetapi berpentuk method
            yang mengambil method setter dari kelas induknya dan mengeset nilai untuk npm
        */
        super.setFname(firstName);
        super.setLname(lastName);
        super.setDomisili(domisili);
        this.npm = npm;
        
    }

    @Override //StudentInterface
    public void learningPlan() {
        /*
            Method ini digunakan untuk mencetak data daru mata kuliah yang di ambil oleh obyek Student.
            Data daftar diperoleh dari variable atau atribut Map yang dideklarasikan di kelas ini.
        */
        for(Integer element : this.daftarMataKuliah.keySet()){
            System.out.println(element + ". " + daftarMataKuliah.get(element).getNamaMatkul() + " (" + daftarMataKuliah.get(element).getSks() + " SKS) "+"\n   Dosen: " + daftarMataKuliah.get(element).getNamaDosen());
        }        
    }

    @Override //StuidentInterface
    public void showDetailStudent() { 
        /* 
            Method ini digunakan untuk mencetak detail dari data Student yang telah diinputkan
            seperti data diri dan daftar mata kuliah yang diambil.
        */
        System.out.println("\n\nDETAIL STUDENT");
        System.out.println("-------------------------------------------------------");
        /*
            Pengecekan ini digunakan untuk memberikan gelar pada atribut nama dari obyek Student.
            Jika total sks yang diambil lebih dari 144 maka akan memperoleh gelas S.Kom.
            Jika tidak maka akan mencetak nama saja.
            Total sks didaptkan dari pemanggilan method sksCounter() yang bersifat private pada
            kelas ini.
        */
        if(this.sksCounter() > 144 ){
            System.out.println("Nama Lengkap\t: " + super.concatName() + ", S.Kom");
        }
        else{
            System.out.println("Nama Lengkap\t: " + super.concatName());
        }
        System.out.println("NPM\t\t: " + this.getNpm());
        System.out.println("Domisili\t: " + super.getDomisili());
        System.out.println("Total SKS\t: " + this.sksCounter());
        System.out.println("-------------------------------------------------------");
        System.out.println(">>> Rancangan studi");
        this.learningPlan();
    }

    @Override //StudentInterface
    public void addCourse(String courseName, String namaDosen, int sks) {
        // membuat key baru dari hasil jumlah daftar mata kuliah ditambah satu 
        // atau auto incremet setiap menambahkan data mata kuliah ke dalam daftar
        int index = daftarMataKuliah.size() + 1;
        daftarMataKuliah.put(index, new Course(courseName, namaDosen, sks));
    }

    @Override //CourseInterface
    public Map<Integer, Course> createCourseMap() {
        // implementasi dari kelas interface yang menghasilkan nilai balikan Map<>
        // hasil generate daftar mata kuliah
        return CourseIntreface.super.createCourseMap();
    }

    @Override //CourseIbterface
    public void showCourseList(Map<Integer, Course> courseList) {
        // method implemtasi dari kelas interface yang digunakan untuk menampilkan
        // data daftar mata kuliah yang telah di-generate
        CourseIntreface.super.showCourseList(courseList);
    }

    
    //  method khusus untuk kelas Student
    private int sksCounter(){ 
        // method yang digunakan untuk menghitung jumlah sks yang telah diinputkan dengan perulangan
        int counter = 0;
        for(Integer element : this.daftarMataKuliah.keySet()){
            counter = counter + this.daftarMataKuliah.get(element).getSks();
        }
        return counter;
    }
}
