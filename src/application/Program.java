package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("enter the date account holder");
		System.out.print("number: ");
		int enterNumberHolderAccount = sc.nextInt();
		System.out.print("holder: ");
		sc.nextLine();
		String enterHolderAccount = sc.nextLine();
		System.out.print("balance initial: ");
		Double enterBalanceInitial = sc.nextDouble();
		System.out.print("limit of balance: ");
		Double enterLimitBalance = sc.nextDouble();

		Account account = new Account(enterNumberHolderAccount, enterHolderAccount, enterBalanceInitial,
				enterLimitBalance);
		
		System.out.println();
		System.out.print("infome the amount to widraw: ");
		Double enterQuantityWithdraw = sc.nextDouble();

		if (enterQuantityWithdraw > account.getWithdrawLimit()) {
			System.out.println("Error of withdraw: quantity exced the limit of balance ");
		} 
		else if (enterQuantityWithdraw > account.getBalance()) {
			System.out.println("Error of withdraw: balance insufficient");
		} 
		else {
			account.withdraw(enterLimitBalance);
			System.out.printf("New Balance: %.2f", account.getBalance());
		}

		sc.close();

	}

}
