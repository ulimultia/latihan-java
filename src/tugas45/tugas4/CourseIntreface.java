package tugas45.tugas4;

import java.util.HashMap;
import java.util.Map;

public interface CourseIntreface {
  // method opsional yang dapat diturunkan ke kelas yang mengimplementasikannya
  default Map<Integer, Course> createCourseMap() {
    Map<Integer, Course> coursrList = new HashMap<>();
    coursrList.put(1, new Course("Algoritma dan Struktur Data", "Irya, S.T., M.T.", 10));
    coursrList.put(2, new Course("Analisis Algoritma", "Martinus, S.T., M.T.", 10));
    coursrList.put(3, new Course("Pemrograman Berbasis Objek", "Yulius, S.T., M.T.", 10));
    coursrList.put(4, new Course("Pemrograman Aplikasi Web", "Sigit, S.T., M.T.", 10));
    coursrList.put(5, new Course("Pemrograman Aplikasi Mobile", "Eric, S.T., M.T", 20));
    coursrList.put(6, new Course("Projek Pengembangan Perangkat Lunak", "Stephani, S.T., M.T" , 50));
    coursrList.put(7, new Course("Tugas Akhir", "Prof. Suyoto, S.T., M.T.",  60));
    return coursrList;
  }

  default void showCourseList(Map<Integer, Course> courseList){
    System.out.println("Daftar Mata Kuliah Tersedia: ");
    for(Integer element : courseList.keySet()){
        System.out.println(element + ". " + courseList.get(element).getNamaMatkul() + " (" + courseList.get(element).getSks() + " SKS) "+"\n   Dosen: " + courseList.get(element).getNamaDosen());
    }
  }

}
