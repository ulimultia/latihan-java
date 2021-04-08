package tugasPertama;

public class Pendidikan {
	private String sd, smp, sma, s1;
//	s2, s3;
	private int ySD, ySMP, ySMA, yS1;
//	yS2, yS3;
	
	public Pendidikan() {}
	
	public void setSd(String sd) {
		this.sd = sd;
	}
	public void setSmp(String smp) {
		this.smp = smp;
	}
	public void setSma(String sma) {
		this.sma = sma;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
//	public void setS2(String s2) {
//		this.s2 = s2;
//	}
//	public void setS3(String s3) {
//		this.s3 = s3;
//	}
	public void setySD(int ySD) {
		this.ySD = ySD;
	}
	public void setySMP(int ySMP) {
		this.ySMP = ySMP;
	}
	public void setySMA(int ySMA) {
		this.ySMA = ySMA;
	}
	public void setyS1(int yS1) {
		this.yS1 = yS1;
	}
//	public void setyS2(int yS2) {
//		this.yS2 = yS2;
//	}
//	public void setyS3(int yS3) {
//		this.yS3 = yS3;
//	}
	
	public void showPendidikan() {
		System.out.println(">>> Riwayat Pendidikan:");
		System.out.println("\t 1) " + sd + " (" + ySD + ")");
		System.out.println("\t 2) " + smp + " (" + ySMP + ")");
		System.out.println("\t 3) " + sma + " (" + ySMA + ")");
		System.out.println("\t 4) " + s1 + " (" + yS1 + ")");
//		System.out.println("\t 5) " + s2 + " (" + yS2 + ")");
//		System.out.println("\t 6) " + s3 + " (" + yS3 + ")");
	}
}