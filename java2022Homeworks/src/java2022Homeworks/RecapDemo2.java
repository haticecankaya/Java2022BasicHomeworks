package java2022Homeworks;

public class RecapDemo2 {

	public static void main(String[] args) {
		double[] mylist1 = new double[4];
		double[] mylist2 = { 0.2, 3, 12.5, 6.7 };

		for (double number : mylist1) {
			System.out.println(number);
			// default value
		}

		// System.out.println(number); (Error = number cannot be resolved to a variable)
		System.out.println("-----------------");

		for (double number : mylist2) {
			System.out.println(number);
		}

		System.out.println("-----------------");
		double total = 0;

		for (double number : mylist2) {
			total = total + number;
		}
		System.out.println(total);

		System.out.println("-----------------");
		double max = 0;

		for (double number : mylist2) {
			if (max < number) {
				max = number;
			}
		}
		System.out.println(max);

	}

}
