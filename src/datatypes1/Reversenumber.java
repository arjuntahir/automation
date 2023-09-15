package datatypes1;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 2538, rev = 0;
		 while(a !=0)
		 {
			 int remainder = a % 10;
			 rev = rev * 10 + remainder;
			 a = a/10;
		 }
		 System.out.println("The reverse of the given number is: " + rev);
			 
		 }
		 
		 
		
	  }
	