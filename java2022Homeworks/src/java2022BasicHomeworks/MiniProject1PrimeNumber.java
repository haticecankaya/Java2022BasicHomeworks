package java2022BasicHomeworks;

public class MiniProject1PrimeNumber {

	public static void main(String[] args) {
		int number = -5;
		int counter = 0;

		//My first algorithm
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				counter = counter + 1;
				break;
			}
		}

		// || or operator
		if (number < 0) {
			System.out.println(number + " is invalid number ");
		} else if (counter > 0 || number == 1 || number == 0) {
			System.out.println(number + " is not prime number ");
		} else {
			System.out.println(number + " is prime number ");
		}

		//My second algorithm
		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (number == 0) {
			System.out.println(number + " is not prime number ");
			return;
		}

		// && and operator

		if (number < 0) {
			System.out.println(number + " is invalid number ");
		} else if (isPrime && number != 1) {
			System.out.println(number + " is prime number ");
		} else {
			System.out.println(number + " is not prime number ");
		}

	}

}
