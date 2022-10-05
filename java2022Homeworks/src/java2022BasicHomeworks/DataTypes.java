package java2022BasicHomeworks;

public class DataTypes {

	public static void main(String[] args) {
		int sayi = 12 ;
		//sayi = "string data"; (Error = Type mismatch)
		sayi = 13 ;
		// No Error. Because data type matched.
		//Primitive Types 
		//sayi = 13111111111 ; ("Error = The literal 13111111111 of type int is out of range")
		//sayi =13.5 ; ("Error = Type mismatch: cannot convert from double to int")
		double sayi2 = 13.5 ;
		
		//byte, short, int, long => integer value
		//float, double => float value
		
		//char character = "A" ; ("Error = Type mismatch: cannot convert from String to char ")
		char character = 'A' ; //ASCII code
		
		boolean trueOrFalse = false ;
		
		if(trueOrFalse == false) {
			System.out.println("false");
		}
		
		if(5 == 5) {
			System.out.println("5 is equal to 5");
		}
		
		if(4 == 5) {
			System.out.println("4 is equal to 5");
			//The code doesn't work. 
		}else {
			System.out.println("4 is not equal to 5");
			//The code work. 
		}
		
	}

}
