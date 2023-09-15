package assignments;

public class Largestoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 10;
     int b = 20;
     int c = 30;
     
     int x = (a>b&&a>c)? a:((b>c&&b>a)? b:c);
	  System.out.println(x);

}
}
