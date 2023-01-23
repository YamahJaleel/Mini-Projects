import java.util.Scanner;
import java.util.Random;

public class Mathcontest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Random generateur = new Random();
		int level, score, answer, rightanswer, replay = 1;
		char operation;
		do {
			System.out.println("Please choose an operation");
			System.out.println("+ Addition");
			System.out.println("- Substraction");
			System.out.println("x Multiplication");
			operation = input2.nextLine().charAt(0);
			System.out.println("Please choose a difficulty");
			System.out.println("1- Single digit");
			System.out.println("2- Double digits");
			level = input.nextInt();
			score = 0;
			for (int i = 1; i <= 10; i++) {
				int nombre1 = generateurNombre(level);
				int nombre2 = generateurNombre(level);
				rightanswer = calcul(nombre1, nombre2, operation);
				for (int j = 1; j <= 3; j++) {
					System.out.println("What is " + nombre1 + " " + operation + " " + nombre2 + " ?");
					answer = input.nextInt();
					if (answer == rightanswer) {
						phraseEncouragement();
						score += 1;
						break;

					} 
					else {
						if (j != 3) {
							phraseAvertissement();
						} else {
							System.out.println("Wrong answer. move onto the next");
							break;
						}
					}
				} 
			} 
			if ((score * 10) < 75) {
				System.out.println("You got " + (score * 10) + " % in this test");
				System.out.println("Plz ask for your teacher's help");
			} else
				System.out.println("You got " + (score * 10) + " % in this test");
			System.out.println("Please enter 1 to restart");
			replay = input.nextInt();
			if (replay != 1)
				System.exit(0);
		} while (replay == 1);
	} 

	static int generateurNombre(int n) { 
		Random generateur = new Random();
		if (n == 1) {
			n = generateur.nextInt(9);
			return n;
		} else
			n = generateur.nextInt(99);
		return n;
	}


	static int calcul(int n1, int n2, char op) {
		if (op == '+') {
			return n1 + n2;
		}
		if (op == '-') {
			return n1 - n2;
		} else
			return n1 * n2;
	} 

	static void phraseEncouragement() {
		Random generateur = new Random();
		int n = generateur.nextInt(4) + 1;
		switch (n) {
		case 1:
			System.out.println("Great job ! ");
			break;
		case 2:
			System.out.println("Excellent ! ");
			break;
		case 3:
			System.out.println("You're doing good work !");
			break;
		case 4:
			System.out.println("Good answer, continue !");
			break;
		}
	} 

	static void phraseAvertissement() {
		Random generateur = new Random();
		int n = generateur.nextInt(3) + 1;
		switch (n) {
		case 1:
			System.out.println("Sorry, try again ");
			break;
		case 2:
			System.out.println("Wrong answer, try again ");
			break;
		case 3:
			System.out.println("Nope sorry, try again ");
			break;
		}
	} 
} 
