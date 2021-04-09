package tugas45.tugas4;

public interface StudentInterface{
    /*
        Interface Student digunakan untuk menyimpan method-method kosong yang harus diimplementasikan
        di kelas Student.
    */
    public void studentRegistrasion(String firstName, String lastName, String domisili, String npm);
    public void learningPlan();
    public void addCourse(String courseName, String namaDosen, int sks);
    public void showDetailStudent();
}