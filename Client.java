import java.util.Scanner;

public class Client {

	static int a = 0;
	static int max = 3;

	public static void main(String[] args) {

		String clientlist[][] = new String[10][4];
		String Column[] = new String[4];
		Column[0] = "Code";
		Column[1] = "Last Name";
		Column[2] = "Name"; 
		Column[3] = "Date";
		String Verify;

		int selection = 0, Start = 1, Delete = 0, looopa = 1,
				loopb = 1; 

		Scanner inputa = new Scanner(System.in);
		Scanner inputb = new Scanner(System.in);
		Scanner inputc = new Scanner(System.in);

		while (Start == 1) {
			looopa = 1;
			loopb = 1;
			System.out.println("1-Add a client");
			System.out.println("2-Delete a client");
			System.out.println("3-Show client list"); 
			System.out.println("4-Quit");
			selection = inputa.nextInt();

			switch (selection) {

			case 1:
				while (looopa == 1) {
					String code, lastname, name, date, verify = null;
					date = " ";
					String jjmmaaaa;

					if (a <= max) {
						if (clientlist[a][0] == (null)) {
							System.out.println("Add a 3 number code:");
							int Code = inputa.nextInt();
							code = String.valueOf(Code);
							boolean dupliquer = false;

							if (code.length() == 3) 
							{
								for (int i = 0; i <= 3; i++) {
									verify = clientlist[i][0];
									if (code.equals(verify)) {
										dupliquer = true;
										break;
									}
								}

								if (dupliquer == true) {
									System.out.println("This code is already taken");
								} else {

									System.out.println("Last name:"); 
									lastname = inputb.nextLine();
									System.out.println("Name:");
									name = inputb.nextLine();
									System.out.println("Date of birth (jj/mm/aa): ");
									jjmmaaaa = inputc.nextLine();
									date = date.replace(" ", jjmmaaaa);

									clientlist[a][0] = code;
									clientlist[a][1] = lastname;
									clientlist[a][2] = name;
									clientlist[a][3] = date;
									a++;
									looopa = 0;
								}
							} else {
								System.out.println("3 number code :");
							}
						} else {
							a++;
						}
					} else {
						System.out.println("You have reached the maximum number of clients"); 
						System.out.println();
						looopa = 0;
					}
				}
				break;
			case 2:
				while (loopb == 1) {

					String verifie, temp1 = null, temp2 = null, temp3 = null, temp4 = null;

					System.out.println("Which client would you like to delete");
					Verify = inputc.nextLine();

					boolean match = false;

					for (int i = 0; i <= 3; i++) {
						verifie = clientlist[i][0];

						if (Verify.equals(verifie)) {
							match = true;
							Delete = i;
						}
					}
					if (match == true) {
						clientlist[Delete][0] = null;
						clientlist[Delete][1] = null; 
						clientlist[Delete][2] = null;
						clientlist[Delete][3] = null;
						a--;
						temp1 = clientlist[a][0];
						temp2 = clientlist[a][1];
						temp3 = clientlist[a][2];
						temp4 = clientlist[a][3];
						clientlist[a][0] = null;
						clientlist[a][1] = null;
						clientlist[a][2] = null;
						clientlist[a][3] = null;
						clientlist[Delete][0] = temp1;
						clientlist[Delete][1] = temp2;
						clientlist[Delete][2] = temp3;
						clientlist[Delete][3] = temp4;
						System.out.println("Client " + Verify + " is deleted");
						loopb = 0;
					} else {
						System.out.println("This client does not exist");
					}
				}
				break;
			case 3:
				System.out.printf("%-15s%-15s%-15s%-15s%n", Column[0], Column[1], Column[2], Column[3]);
				System.out.printf("%-15s%-15s%-15s%-15s%n", clientlist[0]); 
				System.out.printf("%-15s%-15s%-15s%-15s%n", clientlist[1]);
				System.out.printf("%-15s%-15s%-15s%-15s%n", clientlist[2]);
				System.out.printf("%-15s%-15s%-15s%-15s%n", clientlist[3]);
				break;
			case 4:
				System.out.println("You have quit the program");
				Start = 0; 
				break;
			}
		}
	}
}