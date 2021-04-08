package inheritance;

// WITH CONSTRUCTOR
public class Person2 {
  private String fname;
  private String lname;
  // Version diambil class Person

  // CONSTRUCTORS
  public Person2(String fname, String lname) {
    this.fname = fname;
    this.lname = lname;
  }

  // METHODS
  public void getVersion() {
    System.out.println(Person.VERSION);
  }

  public String getFullname() {
    return this.fname + " " + this.lname + ", ST";
  }

  public static void main(String[] args) {
    Person.testStaticMethod();
  }
}
