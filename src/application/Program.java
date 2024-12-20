package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;
import model.exceptions.BusinessException;

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

		try {
			account.withdraw(enterQuantityWithdraw);
			System.out.printf("New Balance: %.2f", account.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(account.toString());
		
		sc.close();

	}

}
