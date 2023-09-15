package inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Cricket & Football");
        Cricket C = new Cricket();
        C.display();
        C.display1();
	}
}
	class Football{
		public void display() {
			System.out.println(" Cristiano ronaldo");
		}
		
	}
	class Cricket extends Football {
		public void display1() {
			System.out.println("Virat Kohli");
		}
        
	}


