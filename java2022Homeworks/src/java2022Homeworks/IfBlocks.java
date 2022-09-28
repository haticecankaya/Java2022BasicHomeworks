package java2022Homeworks;

public class IfBlocks {

	public static void main(String[] args) {
		//conditionals
		int number = 25 ; 
		//Change the value of the variable. And check the outputs.
		
		if(number < 20) {
			System.out.println("number is less than 20");
		}else {
			System.out.println("number is not less than 20");
		}
		
		if(number < 15) {
			System.out.println("number is less than 15");
			}

		if(number < 25) { 
			// If the type of data entered by the user is correct, This is defensive programming.
			// If there is "else" in the block, it gives output for every value. (correct data type)
			System.out.println("number is less than 25");
		}else if (number > 25){
			System.out.println("number is greater than 25");
		}else {
			System.out.println("number is not greater than 25. number is not less than 25.");
			//So number is equal to 25 
			System.out.println("So number is equal to 25 ");
			}
		
		if(number == 25) {
			// with = , we assign the value to the variable
			// == is a operator 
			System.out.println("number is equal to 25 ");
			
		}

	}

}
