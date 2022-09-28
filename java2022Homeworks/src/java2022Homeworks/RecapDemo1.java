package java2022Homeworks;

public class RecapDemo1 {

	public static void main(String[] args) {
		int number1 = 9;
		int number2 ;
		number2 = 16;
		int number3 = 10;
		//Change the value of the variable. And check the outputs.
		int greatestNumber;
		
		//My first algorithm
		
		greatestNumber = number1 ;
		if(number2 > greatestNumber ) {
			greatestNumber = number2 ;
		} 
		
		if (number3 > greatestNumber) {
			greatestNumber = number3 ;
		}
		
		System.out.println(greatestNumber);
		
		//My second algorithm
		
		if(number1 > number2 ) {
			greatestNumber = number1 ;
			if(number3 > greatestNumber) {
				greatestNumber = number3 ;
			}
		}else {
			greatestNumber = number2 ;
			if(number3 > greatestNumber) {
				greatestNumber = number3 ;
			}
		}
		
		System.out.println(greatestNumber);
		

	}

}
