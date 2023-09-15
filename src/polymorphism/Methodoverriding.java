package polymorphism;

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arjun A = new college();
		A.subject();
		
		Arjun B = new Arjun();
		B.subject();
	}
}

	class Arjun{
		void subject() {
			System.out.println("EEE");
		}
	}
	 //method overriding
	class college extends Arjun{
		void subject() {
			System.out.println("Bachelor of Technology");
		
		

	}

}
