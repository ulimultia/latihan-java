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

    // setter dan getter untuk kelas Person
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
        return this.fname + " " + this.lname;
    }
    
}
