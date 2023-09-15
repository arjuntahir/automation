package assignments;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows = 3;
for  (int i = 1; i <= rows; i++) {
	 // print spaces
	for  (int j = 1; j <= rows - i; j++) {
	System.out.print(" ");
}
    // print asterisks
for  (int k = 1; k <= i; k++) {
	System.out.print("*");
}
    // Move to the next line
System.out.println();
	}
}
}

