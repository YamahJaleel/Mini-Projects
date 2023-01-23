import java.util.Scanner;

public class Numerals {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String numRoman, roman, c;

		roman = "IVXLCDM";

		int num = 0;

		int nb1 = 0, nb2 = 0;

		char c1, c2;

		System.out.println("Enter a roman numeral");
		numRoman = input.nextLine();

		numRoman = numRoman.toUpperCase();
		c = numRoman;

		boolean isRomanNum = true;

		for (int i = 0; i < numRoman.length(); i++) {
			String s = "";
			s = s + numRoman.charAt(i);
			if (roman.contains(s) == false) {
				isRomanNum = false;
				break;
			}
		}

		if (isRomanNum == false) {
			System.out.print("The number entered is not roman");
		} else

		{

			while (numRoman.length() > 1) {
				c1 = numRoman.charAt(0);
				c2 = numRoman.charAt(1);

				switch (c1) {

				case 'I':
					nb1 = 1;
					break;
				case 'V':
					nb1 = 5;
					break;
				case 'X':
					nb1 = 10;
					break;
				case 'L':
					nb1 = 50;
					break;
				case 'C':
					nb1 = 100;
					break;
				case 'D':
					nb1 = 500;
					break;
				case 'M':
					nb1 = 1000;
					break;
				}

				switch (c2) {

				case 'I':
					nb2 = 1;
					break;
				case 'V':
					nb2 = 5;
					break;
				case 'X':
					nb2 = 10;
					break;
				case 'L':
					nb2 = 50;
					break;
				case 'C':
					nb2 = 100;
					break;
				case 'D':
					nb2 = 500;
					break;
				case 'M':
					nb2 = 1000;
					break;
				}

				if (nb1 >= nb2) {

					num += nb1;
				} else
					num -= nb1;

				numRoman = numRoman.substring(1);

			}
			c1 = numRoman.charAt(0);
			switch (c1) {

			case 'I':
				nb1 = 1;
				break;
			case 'V':
				nb1 = 5;
				break;
			case 'X':
				nb1 = 10;
				break;
			case 'L':
				nb1 = 50;
				break;
			case 'C':
				nb1 = 100;
				break;
			case 'D':
				nb1 = 500;
				break;
			case 'M':
				nb1 = 1000;
				break;
			}

			num += nb1;

			System.out.println("The value of " + c + " is " + num);

		}

	}
} 
