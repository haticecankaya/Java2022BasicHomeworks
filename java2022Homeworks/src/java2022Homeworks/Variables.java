package java2022Homeworks;

public class Variables {
    
	public static void main(String[] args) {
		//case sensitive
		//camelCase
		//
		System.out.println("Student ID :104");
		System.out.println("Student ID :104");
		System.out.println("Student ID :104");
		System.out.println("Student ID :104");
		
		//This system is not dynamic. No relationship between data.
		System.out.println("---------------------");
		
		int sayi = 104;
		System.out.println("Student ID :" + sayi);
		System.out.println("Student ID :" + sayi);
		System.out.println("Student ID :" + sayi);
		System.out.println("Student ID :" + sayi);
		
		//This system is dynamic. There is a relationship between the data.
		//Reusability 
		//The outputs are the same on both systems. 
		//But coding isn't just about output. The usability and readability of the code is also so important.
		
		System.out.println("---------------------");
		
		String textOne = "Student ID :";
		System.out.println(textOne + sayi);
		System.out.println(textOne + sayi);
		System.out.println(textOne + sayi);
		System.out.println(textOne + sayi);
			
}
}