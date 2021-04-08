package main;

// import inheritance.Person;
import inheritance.Person2;
import inheritance.Student;

public class MainInheritance {
  public static void main(String[] args) {
    // Person person = new Person();
    Person2 person = new Person2("Andi", "Muhammad");
    // person.setFname("Budi");
    // person.setLname("Harmoko");
    System.out.println(person.getFullname());

    Student student = new Student("Andi", "Nurfitri");
    // Student student1 = new Person2("A", "B");
    // Person2 p = new Student("A", "B", 10);
    student.hitungSks("Matematika Dasar");
    student.hitungSks("Matematika Lanjutan");
    student.hitungSks("Aljabar Linear");
    student.hitungSks("Aljabar Linear");
    System.out.println(student.getFullname());
    student.getStudentData();
  }
}