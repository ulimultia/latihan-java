package tugas45.tugas4;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person implements StudentInterface, CourseIntreface{
    private String npm;
    private Map<Integer, Course> daftarMataKuliah = new HashMap<>();

    // konstruktor
    public Student(){
        super();
    }

    // public Student(String firstName, String lastName, String domisili, String npm){
    //     super(firstName, lastName, domisili);
    //     this.npm = npm;
    // }

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
    @Override
    public void studentRegistrasion(String firstName, String lastName, String domisili, String npm) {
        super.setFname(firstName);
        super.setLname(lastName);
        super.setDomisili(domisili);
        this.npm = npm;
        
    }

    @Override
    public void learningPlan() {
        for(Integer element : this.daftarMataKuliah.keySet()){
            System.out.println(element + ". " + daftarMataKuliah.get(element).getNamaMatkul() + " (" + daftarMataKuliah.get(element).getSks() + " SKS) "+"\n   Dosen: " + daftarMataKuliah.get(element).getNamaDosen());
        }        
    }

    @Override
    public void showDetailStudent() { // method yang digunakan untuk menampilkan detail dari data student yang dimasukkan
        System.out.println("\n\nDETAIL STUDENT");
        System.out.println("-------------------------------------------------------");
        // kondisi untuk memberikan gelar jika total sks lebih dari 144
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

    @Override
    public Map<Integer, Course> createCourseMap() {
        return CourseIntreface.super.createCourseMap();
    }

    @Override
    public void showCourseList(Map<Integer, Course> courseList) {
        CourseIntreface.super.showCourseList(courseList);
    }

    @Override
    public void addCourse(String courseName, String namaDosen, int sks) {
        // mengambil indeks terakhir dari map yang ditambahkan 1
        int index = daftarMataKuliah.size() + 1;
        daftarMataKuliah.put(index, new Course(courseName, namaDosen, sks));
        // daftarMataKuliah.put("key", 1);
    }

    
    //  method khusus untuk kelas Student
    private int sksCounter(){ // method yang digunakan untuk menghitung jumlah sks yang telah diinputkan
        int counter = 0;
        for(Integer element : this.daftarMataKuliah.keySet()){
            counter = counter + this.daftarMataKuliah.get(element).getSks();
        }
        return counter;
    }
}
