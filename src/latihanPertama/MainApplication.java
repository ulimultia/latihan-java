package latihanPertama;

import java.util.Scanner;

import latihanModifier.Segitiga;
import tugasPertama.Pendidikan;
import tugasPertama.Person;

public class MainApplication {
	static Scanner userInput = new Scanner(System.in);
    
	public static void main(String[] args) {
		HelloWord obj = new HelloWord();
		HelloWord obj2 = new HelloWord();
		Soal1 soal1 = new Soal1();
		Soal6 soal6 = new Soal6();
		Segitiga segitiga1 = new Segitiga();
		Person person = new Person();
		Pendidikan pendidikan = new Pendidikan();
		String tempInput;
		int menu, alas, tinggi;
		
		do {
			System.out.println("\n------------------ MENU ----------------");
			System.out.println("1. Pengenalan");
			System.out.println("2. Soal 1");
			System.out.println("3. Soal 6");
			System.out.println("4. Luas Segitiga");
			System.out.println("5. Input Data Diri");
			System.out.println("6. Data Pribadi");
			System.out.println("7. Data Pendidikan");
			System.out.println("0. Keluar");
			System.out.println("----------------------------------------");
			System.out.print("Pilih menu: "); tempInput = userInput.nextLine();
			menu = Integer.parseInt(tempInput);
			switch(menu) {
				case 1: 
						obj.name = "ULI";
						obj.setName(obj.name);
						obj.setUsia(-12);
						obj2.name = "Multia";
						obj2.setName(obj2.name);
						obj2.setUsia(23);
		//				System.out.println();
						break;
				case 2: 
		//				Soal 1
						System.out.println("=============== SOAL 1 ================");
						System.out.print("Jumlah n: ");
						tempInput = userInput.nextLine();
						System.out.println("Hasil: ");
						soal1.input = Integer.parseInt(tempInput);
						soal1.setInput(soal1.input);
		//				System.out.println(soal1.input);
						soal1.makePattern();
						System.out.println("=======================================\n");
						break;
				case 3: 
//						Soal 6
						System.out.println("\n =============== SOAL 6 ================");
						System.out.print("Jumlah n: ");
						tempInput = userInput.nextLine();
						System.out.println("Hasil: ");
						soal6.input = Integer.parseInt(tempInput);
						soal6.setInput(soal6.input);
						soal6.makePattern();
						System.out.println("\n =======================================");
						break;
				case 4:
						System.out.println("========== LUAS SEGITIGA =========");
						System.out.print("Alas: "); tempInput = userInput.nextLine();
						segitiga1.alas = Integer.parseInt(tempInput);
						alas = Integer.parseInt(tempInput);
						System.out.print("Tinggi: "); tempInput = userInput.nextLine();
						segitiga1.tinggi = Integer.parseInt(tempInput);
						tinggi = Integer.parseInt(tempInput);
						segitiga1.luas = segitiga1.hitungLuas();
						Segitiga segitiga2 = new Segitiga(alas, tinggi);
						System.out.println(">>> Hasil versi 1: " + segitiga1.luas);
						System.out.println(">>> Hasil versi 2: " + segitiga2.hitungLuas());
						
						break;
				case 5: System.out.println(">>> Inputkan Data Diri Anda");
						System.out.print("Nama Depan\t: ");tempInput = userInput.nextLine();
						person.setfName(tempInput);
						System.out.print("Nama Belakang\t: ");tempInput = userInput.nextLine();
						person.setlName(tempInput);
						System.out.print("Domisili\t: ");tempInput = userInput.nextLine();
						person.setDomisili(tempInput);
						System.out.print("Tahun Lahir\t: ");tempInput = userInput.nextLine();
						person.setbYear(Integer.parseInt(tempInput));
						System.out.print("Nama SD\t: ");tempInput = userInput.nextLine();
						pendidikan.setSd(tempInput);
						System.out.print("Tahun Lulus SD\t\t: ");tempInput = userInput.nextLine();
						pendidikan.setySD(Integer.parseInt(tempInput));
						System.out.print("Nama SMP\t: ");tempInput = userInput.nextLine();
						pendidikan.setSmp(tempInput);
						System.out.print("Tahun Lulus SMP\t: ");tempInput = userInput.nextLine();
						pendidikan.setySMP(Integer.parseInt(tempInput));
						System.out.print("Nama SMA\t: ");tempInput = userInput.nextLine();
						pendidikan.setSma(tempInput);
						System.out.print("Tahun Lulus SMA\t: ");tempInput = userInput.nextLine();
						pendidikan.setySMA(Integer.parseInt(tempInput));
						System.out.print("Nama Univ. S1\t: ");tempInput = userInput.nextLine();
						pendidikan.setS1(tempInput);
						System.out.print("Tahun Lulus S1\t: ");tempInput = userInput.nextLine();
						pendidikan.setyS1(Integer.parseInt(tempInput));
//						System.out.print("Nama Univ. S2\t: ");tempInput = userInput.nextLine();
//						pendidikan.setS2(tempInput);
//						System.out.print("Tahun Lulus S2\t: ");tempInput = userInput.nextLine();
//						pendidikan.setyS2(Integer.parseInt(tempInput));
//						System.out.print("Nama Univ. S3\t: ");tempInput = userInput.nextLine();
//						pendidikan.setS3(tempInput);
//						System.out.print("Tahun Lulus S3\t: ");tempInput = userInput.nextLine();
//						pendidikan.setyS3(Integer.parseInt(tempInput));
						break;
				case 6: person.showPerson();
						break;
				case 7: pendidikan.showPendidikan();
						break;
				case 0: System.exit(0); break;
				default: System.out.println("Tidak tersedia ....");
			}
		}while(menu!=0);	
	}
}
