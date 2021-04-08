package inheritance;

public class Student extends Person2 {
  private int sks;
  private String mataKuliah;

  public Student(String fname, String lname) {
    super(fname, lname);
    // TODO Auto-generated constructor stub
  }

  public int getSks() {
    
    return this.sks;
  }

  public int getSks(String a, int b) {
    return this.sks;
  }

  public int getSks(int b, String a) {
    return this.sks;
  }

  public void setMataKuliah(String mataKuliah) {
    this.mataKuliah = mataKuliah;
  }

  public String getMataKuliah() {
    return this.mataKuliah;
  }

  // METHODS
  public int hitungSks(String mataKuliah) {
    return this.sks++;
  }

  public void getStudentData() {
    System.out.println("Jumlah SKS: " + getSks());
    // System.out.println("Matakuliah: " + getMataKuliah());
  }

  @Override
  public String getFullname() {
    if (this.sks>3) {
      return "Prof " + super.getFullname();
    } else {
      return super.getFullname();
    }
  }

}
