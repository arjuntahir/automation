package operators1;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
		int b = 50;
		
		// Assigning value of variable num2 to the variable num1
		a = b;
		System.out.println("Output of a = b is "+ a);
		
		// a = a+b
		a+= b;
		System.out.println("Output of a = a+b is "+a);

		// a = a-b
		a -= b;
		System.out.println("Output ofa = a-b is "+ a);
		
		// na = a*b
		a *= b;
		System.out.println("Output of a = a*b is "+ a);
		
		// a = a/b
		a /= b;
		System.out.println("Output of a = a/b is "+ a);
		
		// a = a%b
		a %= b;
		System.out.println("Output of a = a%b is "+ a);
	}

}
