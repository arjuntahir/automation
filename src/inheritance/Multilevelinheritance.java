package inheritance;

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Cricket Players");
         Strong Bat = new Strong(); 
         Bat.sachin();
         Bat.virat();
         Bat.rohith();
	}
}
class Happy {
	void sachin() {
		System.out.println("No 1 Famous cricket player");
	}
}
class Fun extends Happy {
	void virat() {
		System.out.println("No 2 Famous cricket player");
	}
}
class Strong extends Fun {
	void rohith() {
		System.out.println("No 3 Famous cricket player");
        
	}

}
