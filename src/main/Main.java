package main;

import java.util.Scanner;

import latihanInheritance.Bola;
import latihanInheritance.Kubus;
import latihanInheritance.Prisma;

public class Main {
	// private String fname, lname;
	private static Scanner scanner = new Scanner(System.in);
	private static String input;
	
	public static void main(String[] args) {
		int menu;
		
		do{
			System.out.println("============== MENU =============");
			System.out.println("1. Prisma Segitiga");
			System.out.println("2. Bola");
			System.out.println("3. Kubus");
			System.out.println("=================================");
			System.out.print("Pilih Menu: "); input = scanner.nextLine();
			menu = Integer.parseInt(input);
			switch(menu){
				case 1: PrismaSegitiga(); break;
				case 2: Bola(); break;
				case 3: Kubus(); break;
				case 0: System.exit(0); break;
				default: System.out.println("Menu tidak tersedia...\n"); break;
			}
		}while(menu!=0);
	}

	private static void PrismaSegitiga() {
		
		System.out.print("Alas segitiga\t: "); float alas = Float.parseFloat(scanner.nextLine());
		System.out.print("Tinggi segitiga\t: "); float tinggiSegitiga = Float.parseFloat(scanner.nextLine());
		System.out.print("Tinggi prisma\t: "); float tinggiPrisma = Float.parseFloat(scanner.nextLine());

		Prisma prisma = new Prisma(alas, tinggiSegitiga, tinggiPrisma);
		prisma.showResult();
	}

	private static void Bola() {
		
		System.out.print("Jari-jari\t: "); float jariJari = Float.parseFloat(scanner.nextLine());

		Bola bola = new Bola(jariJari);
		bola.showResult();
	}

	private static void Kubus() {
		
		System.out.print("Rusuk\t: "); float sisi = Float.parseFloat(scanner.nextLine());

		Kubus kubus = new Kubus(sisi);
		kubus.showResult();
	}
}


