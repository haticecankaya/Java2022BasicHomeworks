package java2022BasicHomeworks;

public class MiniProject4AmicableNumbers {

	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		// Change the value of the variable. And check the outputs.

		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}
		}

		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 = total2 + i;
			}
		}

		// System.out.println(total1); //(control line)
		// System.out.println(total2); //(control line)

		if (total1 == number2) {
			if (total2 == number1) {
				System.out.println(number1 + " and " + number2 + " are amicable numbers");
			} else {
				System.out.println(number1 + " and " + number2 + " are not amicable numbers");
			}

		} else {
			System.out.println(number1 + " and " + number2 + " are not amicable numbers");
		}

		if (total1 == number2 && total2 == number1) {
			System.out.println(number1 + " and " + number2 + " are amicable numbers");
		} else {
			System.out.println(number1 + " and " + number2 + " are not amicable numbers");
		}
	}

}
