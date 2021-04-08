package tugasPertama;

//import java.time.Year;
import java.util.Calendar;

public class Person {
	private String fName, lName, domisili;
	private int bYear;
//	private Year nowYear = Year.now();
	private int nowYear = Calendar.getInstance().get(Calendar.YEAR);
	
	public Person() {}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDomisili() {
		return domisili;
	}

	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}

	public int getbYear() {
		return bYear;
	}

	public void setbYear(int bYear) {
		this.bYear = bYear;
	}
	
	private int hitungUsia() {
		return (nowYear - bYear);
	}
	
	public void showPerson() {
		System.out.println(">>> Data Pribadi: ");
		System.out.println("Nama Lengkap\t: " + fName + " " + lName);
		System.out.println("Usia\t\t: " + hitungUsia());
		System.out.println("Domisili\t: " + domisili);
	}
}
