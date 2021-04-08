package latihanPertama;

public class Soal6 {
	public int input;
		
	public int getInput() {
		return input;
	}
	
	public void setInput(int input) {
		this.input = input;
	}
	
	public void makePattern() {
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				if(j<=i) {
					System.out.print(" * ");
				}
				else {
//					System.out.print("   ");
					break;
				}
			}
			System.out.println("");
		}
	}
	
}
