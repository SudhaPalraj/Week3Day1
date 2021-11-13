package week3.day1;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1="I am Learning Java" ;
		String text2 ="I am learning java?";
		
		if (text1==text2) {
			
			System.out.println("Strings are matching ");
		}
		
		else if (text1.equals(text2)) {
			
			System.out.println("Strings are matching using Equals ");
			
		}
		
		else if (text1.equalsIgnoreCase(text2)) {
			
			System.out.println("Strings are matching using equalsIgnoreCase ");
			
		}
		
		else {
			
			
			System.out.println("Strings are NOT matching  ");
		}
	}

}
