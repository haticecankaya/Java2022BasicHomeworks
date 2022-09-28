package java2022Homeworks;

public class SwitchBlocks {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("excellent");
			break;
		case 'B':
			System.out.println("great");
			break;
		case 'C':
		case 'D':
			System.out.println("good");
			break;
		case 'F':
			System.out.println("bad");
			break;
		default:
			System.out.println("You entered an invalid grade");

		}

	}

}
