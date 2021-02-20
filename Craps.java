import java.util.Scanner;
import java.util.Random;

public class Craps {
	public static void main(String[] args) {
		int point, sum;

		Random randomNumbers = new Random();

		System.out.println("Throw number 1");

		sum = roleDice(randomNumbers);
		System.out.println("= " + sum);
		System.out.println("Your point is " + sum);

		switch (sum) {

		case 7:
		case 11:
			System.out.println("Congrats you won !!");
			break;

		case 2:
		case 3:
		case 12:
			System.out.println("Maybe next time :(");
			break;

		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
			point = sum;
			do {
				sum = roleDice(randomNumbers);
				System.out.println("= " + sum);

			} while (sum != 7 && sum != point);

			if (sum == point)
				System.out.println("Congrats you won !!");
			else
				System.out.println("Maybe next time :(");

		}
	}

	public static int roleDice(Random randomNumbers) {
		int dice1, dice2;

		dice1 = randomNumbers.nextInt(7);
		dice2 = randomNumbers.nextInt(7);

		if (dice1 == 0) {
			dice1 = 1;
		}
		if (dice2 == 0) {
			dice2 = 1;
		}

		System.out.println(dice1 + "+" + dice2);

		return dice1 + dice2;
	}

}