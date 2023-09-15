package javaproject1;


public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Auto f1=new Auto();
	        f1.arjun();
	        Auto f2=new Auto(10,20);
	        
	        
		}

	}
	class Auto{
		Auto()
		{
			System.out.println("This is Constructor");
		}
		Auto(int a, int b){
			System.out.println("The addition of"+a+" and "+b+" is:"+(a+b));
		}
		public void arjun() {
			System.out.println("Arjun");
	}

}
