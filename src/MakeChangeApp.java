import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		double returnAmount = HowMuchIsTheBill();
		PaperChange(returnAmount);
		CoinChange(returnAmount);

	}

	public static double HowMuchIsTheBill() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("What is the price of the first item? $ ");
		double totalBill = scanner.nextDouble();
		System.out.print("Is there another item? (Y / N )");
		String additionalItem = scanner.next();

		while (additionalItem.equalsIgnoreCase("Y")) {
			System.out.print("What is the price of this item? $ ");
			totalBill += scanner.nextDouble();
			System.out.print("Is there another item? (Y / N )");
			additionalItem = scanner.next();
		}

		System.out.print("How much was tendered? $ ");
		double tenderedAmount = scanner.nextDouble();
		scanner.close();

		double returnAmount = tenderedAmount - totalBill;
		if (returnAmount >= 0) {
			System.out.printf("The total price is: $%6.2f\n", totalBill);
			if (returnAmount == 0) {
				System.out.println("The amount tendered equals the amount due. There is no change needed. ");
			} else
				System.out.printf("Total change amount due: $%6.2f\n", returnAmount);
			return returnAmount;

		} else {
			System.err.println("Insufficient amount tendered");
			System.err.printf("Amount short of total: $%6.2f\n", (totalBill - tenderedAmount));
			return 0;

		}

	}

	public static void PaperChange(double totalBill) {

		int remainder, benjamins, jacksons, hamiltons, lincolns, washingtons;

		benjamins = ((int) totalBill / 100);
		remainder = ((int) totalBill % 100);

		jacksons = (remainder / 20);
		remainder = (remainder % 20);

		hamiltons = (remainder / 10);
		remainder = (remainder % 10);

		lincolns = (remainder / 5);
		remainder = (remainder % 5);

		washingtons = (remainder);

		if (benjamins != 0) {
			System.out.println(benjamins + " hundred dollar bills ");
		}
		if (jacksons != 0) {
			System.out.println(jacksons + " tweny dollar bills  ");
		}
		if (hamiltons != 0) {
			System.out.println(hamiltons + " ten dollar bills  ");
		}
		if (lincolns != 0) {
			System.out.println(lincolns + " five dollar bills  ");
		}
		if (washingtons != 0) {
			System.out.println(washingtons + " dollar bills  ");
		}

	}

	public static void CoinChange(double billTotal) {

		int remainder, quarters, dimes, nickels, pennies;
		double changeAmount = ((((billTotal + .005)) - (int) (billTotal)) * (100));

		quarters = ((int) changeAmount / 25);
		remainder = ((int) changeAmount % 25);

		dimes = (remainder / 10);
		remainder = (remainder % 10);

		nickels = (remainder / 5);
		remainder = (remainder % 5);

		pennies = (remainder);

		if (quarters != 0) {
			System.out.println(quarters + " quarters ");
		}
		if (dimes != 0) {
			System.out.println(dimes + " dimes  ");
		}
		if (nickels != 0) {
			System.out.println(nickels + " nickels ");
		}
		if (pennies != 0) {
			System.out.println(pennies + " pennies ");
		}

	}

}