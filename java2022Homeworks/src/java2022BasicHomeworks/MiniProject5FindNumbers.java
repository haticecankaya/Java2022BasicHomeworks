package java2022BasicHomeworks;

public class MiniProject5FindNumbers {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int inputnumber = 2;
		// Change the value of the variable. And check the outputs.

		for (int i : numbers) {
			if (i == inputnumber) {
				System.out.println(inputnumber + " found in list");
				return;
			}
		}
		System.out.println(inputnumber + " was not found in the list");

	}

}
