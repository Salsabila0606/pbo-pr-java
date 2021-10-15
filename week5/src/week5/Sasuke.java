package week5;

public class Sasuke extends Itachi { //extends -> ke kelas yang lebih tinggi/abstract (superclass)
	//mewarisi method  yang bersifat public
	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
		super.printDojutsu();
		System.out.println(this.Dojutsu);
	}
}