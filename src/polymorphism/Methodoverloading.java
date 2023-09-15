package polymorphism;

public class Methodoverloading {
	
	
	void info(String Fullname,String Email, int age, int Mobilenumber) {
		System.out.println("Fullname :"+Fullname+"\n"+"Email :"+Email+"\n"+"age :"+age+"\n"+"Mobilenumber:"+Mobilenumber);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading A = new Methodoverloading();
		A.info("arjun", "arjun@gmail", 10, 987654321);

	
	
}

}
