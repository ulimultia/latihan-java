package tugas45.tugas4;

public interface StudentInterface{
    public void studentRegistrasion(String firstName, String lastName, String domisili, String npm);
    public void learningPlan();
    public void addCourse(String courseName, String namaDosen, int sks);
    public void showDetailStudent();
}