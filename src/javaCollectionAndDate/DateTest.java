package javaCollectionAndDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public DateTest(){
        // mencari waktu sekarang
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        // mencari tanggal besok
        LocalDate tomorrow = date.plusDays(1);
        // mencari tanggal sebelumnya
        LocalDate fiveDaysAgo = LocalDate.now().minusDays(5);

        // membuat format date baru
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd MMM yyyy");
        String formatted = date.format(formatter); //menampung data tanggal yang diubah ke string dengan format yang telah dibuat

        //mengubah tanggal bertipe string ke tanggal bertipe date
        String dateString = "23-Jul-2021";
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); //pattern dari tanggal string
        LocalDate convertFromString = LocalDate.parse(dateString, newFormatter);

        //cara menghitung interval hari
        Integer hari = date.getDayOfMonth(); // ngambil dd saat ini
        Integer hari2 = fiveDaysAgo.getDayOfMonth(); // ngambil dd lima hari yang lalu
        Integer interval = hari - hari2;

        // date default format: yyyy-mm-dd
        // time default format: hh:mm:ss
        // date time default format: yyyy-mm-ddThh:mm:ss
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(tomorrow);
        System.out.println(fiveDaysAgo);
        System.out.println(formatted);
        System.out.println(convertFromString);
        System.out.println(hari + ", " + hari2 + ", " + interval);
    }

    public static void main(String[] args) {
        new DateTest();
    }
}
