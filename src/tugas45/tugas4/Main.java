package tugas45.tugas4;

import java.util.Scanner;
import static java.util.Objects.isNull;

import java.util.Map;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        StudentInterface student = new Student();
        int menu;

        do{
            // System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("\n\n=======================================================");
            System.out.println("|                         MENU                        |");
            System.out.println("=======================================================");
            System.out.println("| 1. Registrasi Student                               |");
            System.out.println("| 2. Input Rencana Studi                              |");
            System.out.println("| 3. Tampil Detail Studen                             |");
            System.out.println("| 0. Keluar                                           |");
            System.out.println("=======================================================");
            System.out.print("Pilih menu: "); menu = Integer.parseInt(scanner.nextLine());
            switch(menu){
                case 1: inputStudent(student); break;
                case 2: CourseIntreface courseIntreface = new Student();
                        Map<Integer, Course> courseMap = courseIntreface.createCourseMap();
                        inputSKS(student, courseIntreface, courseMap);
                        break;
                case 3: student.showDetailStudent(); break;
                case 0: break;
                default: System.out.println("*** Tidak Tersedia ... ***"); break;
            }
        }while(menu!=0);
    }

    // method untuk menginputkan data Student sekaligus meregister atau mengeset ke dalam objek Person dan Student
    private static void inputStudent(StudentInterface student){
        System.out.print("\n\nNama Depan\t: "); String fname = scanner.nextLine();
        System.out.print("Nama Belakang\t: "); String lname = scanner.nextLine();
        System.out.print("NPM\t\t: "); String npm = scanner.nextLine();
        System.out.print("Domisili\t: "); String domisili = scanner.nextLine();

        student.studentRegistrasion(fname, lname, domisili, npm);

        if(!isNull(student)) {
            System.out.println("\n *** BERHASIL DISIMPAN ... !!! ***");
        }
        else{
            System.out.println("\n *** GAGAL DISIMPAN ... !!! ***");
            inputStudent(student);
        }
    }

    // method yang digunakan untuk memasukkan rancangan studi
    private static void inputSKS(StudentInterface student, CourseIntreface courseIntreface, Map<Integer, Course> courseMap){
        String stopInput;
        Course tempCourse = new Course();
        courseIntreface.showCourseList(courseMap);
        do{
            // courseIntreface.showCourseList(courseMap);
            System.out.print("Pilih Mata Kuliah: "); int pilihMatkul = Integer.parseInt(scanner.nextLine());
            tempCourse = getObjectMataKuliah(pilihMatkul, courseMap);
            student.addCourse(tempCourse.getNamaMatkul(), tempCourse.getNamaDosen(), tempCourse.getSks());
            System.out.print(">>> Ingin menambah mata kuliah? [Y/N]"); stopInput = scanner.nextLine();
        }while(stopInput.toLowerCase().compareTo("n") != 0);
    }

    // method untuk mencari key dari menu pilihan mata kuliah. inputan user merupakan indeks, indeks dimulai dari 1
    private static Course getObjectMataKuliah(int index, Map<Integer, Course> courseMap){
        Course temp = new Course();
        for(Integer element : courseMap.keySet()){
           if(element == index){
               temp = courseMap.get(element);
               break;
           }
        }
        return temp;
    }
}
