package java2022BasicHomeworks;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] citys = new String[3][3];

		citys[0][0] = "İstanbul";
		citys[0][1] = "Bursa";
		citys[0][2] = "Bilecik";
		citys[1][0] = "Ankara";
		citys[1][1] = "Konya";
		citys[1][2] = "Kayseri";
		citys[2][0] = "Antalya";
		citys[2][1] = "Adana";
		citys[2][2] = "Muğla";

		for (int i = 0; i < citys.length; i++) {
			System.out.println("----------------------");
			for (int j = 0; j < citys.length; j++) {
				System.out.println(citys[i][j]);
			}

		}

		int[][][] randomNumbers = new int[2][2][2];

		randomNumbers[0][0][0] = 2;
		randomNumbers[0][0][1] = 24;
		randomNumbers[0][1][0] = 28;
		randomNumbers[0][1][1] = 34;
		randomNumbers[1][0][0] = 56;
		randomNumbers[1][0][1] = 61;
		randomNumbers[1][1][0] = 81;
		randomNumbers[1][1][1] = 99;

		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println("----------------------");
			for (int j = 0; j < randomNumbers.length; j++) {
				System.out.println("***************************");
				for (int y = 0; y < randomNumbers.length; y++) {
					System.out.println(randomNumbers[i][j][y]);
				}
			}

		}
	}

}
