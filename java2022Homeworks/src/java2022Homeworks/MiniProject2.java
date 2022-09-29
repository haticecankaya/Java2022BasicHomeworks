package java2022Homeworks;

public class MiniProject2 {

	public static void main(String[] args) {
		// This project contains local information about Turkish. This project is not
		// universal.
		// Kalın ünlüler: a, ı, o, u
		// İnce ünlüler: e, i, ö, ü

		char[] inceUnlu = { 'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü' };
		char[] kalinUnlu = { 'a', 'ı', 'o', 'u', 'A', 'I', 'O', 'U' };

		// String deneme = "'a',\"ı\",\"o\",\"u\",\"A\",\"I\",\"O\",\"U\"";
		// System.out.println(deneme.replace("\"","'" ));

		char harf = 'Ö';

		for (int i = 0; i < kalinUnlu.length; i++) {
			if (harf == kalinUnlu[i]) {
				System.out.println(harf + " kalın ünlüdür.");
				return;
			}

		}

		for (int i = 0; i < inceUnlu.length; i++) {
			if (harf == inceUnlu[i]) {
				System.out.println(harf + " ince ünlüdür.");
				return;
			}

		}

		System.out.println(harf + " ünlü harf değildir.");

	}

}
