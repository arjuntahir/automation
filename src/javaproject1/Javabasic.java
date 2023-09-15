package javaproject1;


public class Javabasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Arjun");
		M obj = new  M(); //creating object
		
	    obj.tahir();
		obj.imran();
	    
		N data = new N(); //creating object
		
		data.kohli();
		data.virat();
      }
}
     class M{
     
    	 public void tahir() {
    		 System.out.println("This is Tahir");
    	 }
    	 public void imran() {
    		 System.out.println("This is Imran");
    	 }
     }
    class N{
    	public void kohli() {
    		System.out.println("This is kohli");
    	}
    	public void virat() {
    		System.out.println("This is virat");
	}

}
