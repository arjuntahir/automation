package assignments;

public class Reversetheletter {

	
		// TODO Auto-generated method stub
		class Arjun {
			public static void main(String[] args) {
		       
		        String str= "hello people", nstr="";
		        char ch;
		       
		      System.out.print("Original word: ");
		      System.out.println("hello people");                    //Example word
		       
		      for (int i=0; i<str.length(); i++)
		      {
		        ch= str.charAt(i);                             //extracts each character
		        nstr= ch+nstr;                                //adds each character in front of the existing string
		      }
		      System.out.println("Reversed word: "+ nstr);
		    }
		}
	}

