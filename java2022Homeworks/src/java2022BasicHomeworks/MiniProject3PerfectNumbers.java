package java2022BasicHomeworks;

public class MiniProject3PerfectNumbers {

	public static void main(String[] args) {
		// 6 --> 1+2+3=6
		//28 --> 1+2+4+7+14=28
		
		int number = 80;
		//Change the value of the variable. And check the outputs.
		
		int total = 0;
		
		if (number < 1) {
			System.out.println(number+ " is a invalid number");
			return;
		}
		
		for (int i = 1; i < number; i++) {
			if (number%i ==0) {
				total =total+i;
			}
		}
		
		if (total==number) {
			//System.out.println(total); //(control line)
			System.out.println(number+" is a perfect number.");
		}else {
			//System.out.println(total); //(control line)
			System.out.println(number+" is not a perfect number.");
		}

	}

}
