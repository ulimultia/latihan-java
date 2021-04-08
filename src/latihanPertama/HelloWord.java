package latihanPertama;

public class HelloWord {
	public String name;
	private Integer usia;
	
	public String getName() {
		return name;
	}
	
	public Integer getUsia() {
		return usia;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println(this.name);
	}
	
	public void setUsia(Integer usia) {
		String result;
		if(usia > 0) {			
			this.usia = usia;
			result = "Usia sesuai";
		}
		else {
			this.usia = 0;	
			result = "Usia tidak sesuai";
		}
		System.out.println(this.usia);
		System.out.println(result);
	}
//	public static void main(String[] args) {
//		System.out.println("Hello word");
//	}
}
