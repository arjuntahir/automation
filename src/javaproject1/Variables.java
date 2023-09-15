package javaproject1;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing.engineer();
		String str=Testing.name;
		System.out.println(str);         //Local variable
		
		Testing123 obj = new Testing123();
		System.out.println(obj.name);
		obj.engineer();
	}
}
class Testing {                         //This is "Static Method"
	static String name="arjun";
	public static void engineer() {
		System.out.println("Static method will be displayed");
		
	}
}
class Testing123 {                     //This is "Non Static Method
	String name="chowdary";
	public void engineer() {
		System.out.println("Non Static method will be displyed ");
		
	}
}
