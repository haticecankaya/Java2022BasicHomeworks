package java2022BasicHomeworks;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("The for loop finished");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("The for loop finished");

		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("The for loop finished");

		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}

		System.out.println("The for loop finished");

		for (int i = 3; i <= 10; i += 3) {
			System.out.println(i);
		}

	}

}
