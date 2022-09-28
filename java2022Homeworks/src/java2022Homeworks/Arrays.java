package java2022Homeworks;

public class Arrays {

	public static void main(String[] args) {
		String student1 = "Engin";
		String student2 = "Derin";
		String student3 = "Salih";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		// This system is not dynamic.
		System.out.println("--------------------");

		String[] students = new String[4];
		students[0] = "Engin";
		students[1] = "Derin";
		students[2] = "Salih";
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);

		}

		// This system is dynamic.

		System.out.println("--------------------");

		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				continue;
			} else {
				System.out.println(students[i]);
			}
		}

		System.out.println("--------------------");

		students[3] = "Hatice";
		// students[4] = "Fatma"; ( java.lang.ArrayIndexOutOfBoundsException: Index 4
		// out of bounds for length 4)

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);

		}

		System.out.println("--------------------");

		for (String student : students) {
			System.out.println(student);

		}

	}

}
