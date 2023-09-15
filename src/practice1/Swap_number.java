package practice1;

public class Swap_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 10;
int y = 20;
System.out.println("before swap");
System.out.println("x = " +x);
System.out.println("y = " +y);
x = x+y;
y = x-y;

x = x-y;
System.out.println("after swap");
System.out.println("x = " + x);
System.out.println("y = " + y);


	}

}
