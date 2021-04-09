package tugas45.tugas4;

public class Person {
    private String fname, lname, domisili;

    // konstruktor default
    public Person(){}
    // konstruktor berparameter untuk kelas Person
    public Person(String firstname, String lastname, String domisili){
        this.fname = firstname;
        this.lname = lastname;
        this.domisili = domisili;
    }

    // setter dan getter untuk kelas Person dengan obyek dari konstruktor kosong
    protected String getFname() {
        return fname;
    }

    protected void setFname(String fname) {
        this.fname = fname;
    }

    protected String getLname() {
        return lname;
    }

    protected void setLname(String lname) {
        this.lname = lname;
    }

    protected String getDomisili() {
        return domisili;
    }

    protected void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    // method untuk kelas Person
    protected String concatName(){
        /*
            methode yang digunakan untuk menyambungkan nama depan dan nama belakang
            dibuat protected supaya hanya bisa diakses oleh keturunannya
            atau di package yang sama
        */
        return this.fname + " " + this.lname;
    }
    
}
