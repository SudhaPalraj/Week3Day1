package week3.day1;

public class Assignment6a {

	public static void main(String[] args) {
	
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
		
		//whenever we use a new operator a new memory location will be created .
		 
		 // == will check for the memory reference 
		 
		 //Hence in this case the memory reference is different for str3 and str4 hence it shows different text 
		
		

	}

}
