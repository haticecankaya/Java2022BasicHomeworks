package java2022BasicHomeworks;

public class StringsDemo2 {

	public static void main(String[] args) {
		/*
		 * Change ; multiple; lines
		 * 
		 * ; to ; comment ; lines;
		 */

		String message = "My name is Hatice.";

		message = message.replace(' ', '-');

		System.out.println(message);
		System.out.println(message.substring(5));
		System.out.println(message.substring(5, 9));

		for (String word : message.split("-")) {
			System.out.println(word);

		}

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message);

		message = "    " + message + "     ";
		System.out.println(message);

		message = message.trim();
		System.out.println(message + "trim control");
		System.out.println(message);
	}

}
