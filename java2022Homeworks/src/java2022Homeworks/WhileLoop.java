package java2022Homeworks;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("The while loop finished");

		i = 1;

		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

	}

}
