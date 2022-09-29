package java2022Homeworks;

public class StringsDemo1 {

	public static void main(String[] args) {
		String message = "My name is Hatice.";

		System.out.println(message);

		System.out.println("Total count of characters in the text: " + message.length());

		for (int i = 0; i < message.length(); i++) {
			System.out.println(i + " " + message.charAt(i));

		}

		System.out.println(message.concat("What is your name"));
		System.out.println(message);
		message = message.concat("What is your name?");
		System.out.println(message);

		System.out.println(message.startsWith("W"));
		System.out.println(message.startsWith("m")); // case sensitive
		System.out.println(message.startsWith("MY"));
		System.out.println(message.startsWith("My"));
		System.out.println(message.startsWith("M"));

		System.out.println("------------------------");

		System.out.println(message.endsWith("."));
		System.out.println(message.endsWith("??"));
		System.out.println(message.endsWith("name?"));
		System.out.println(message.endsWith("me?"));
		System.out.println(message.endsWith("?"));

		System.out.println(message.length());
		char[] messageArray = new char[message.length()];
		System.out.println(messageArray.length);

		message.getChars(0, message.length(), messageArray, 0);

		for (char c : messageArray) {
			System.out.println(c);
		}

		System.out.println("----------------");

		char[] messageArray2 = new char[2];
		message.getChars(0, messageArray2.length, messageArray2, 0);
		System.out.println(messageArray2);

		System.out.println(message);
		System.out.println(message.indexOf("i"));
		System.out.println(message.indexOf('i'));
		System.out.println(message.indexOf("M"));
		System.out.println(message.indexOf("s"));
		System.out.println(message.indexOf("is"));
		System.out.println(message.indexOf("What is your name?"));
		System.out.println(message.indexOf("My name is Hatice."));

		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("a"));

	}

}
