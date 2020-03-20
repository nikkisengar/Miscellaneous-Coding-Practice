package com.java.atm_project;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionList extends AccountDetails {

	int selection;

	Scanner listInput = new Scanner(System.in);

	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> loginDetails = new HashMap<Integer, Integer>();

	// Validate login information Customer number and pin number
	public void getLogin() throws IOException {
		int x = 1;

		do {
			try {

				loginDetails.put(9876543, 9876);
				loginDetails.put(89898989, 1890);

				System.out.println("Welcome to the ATM Project: ");

				System.out.println("Enter your customer number: ");
				// taking input from the user
				setCustomerNumber(listInput.nextInt());

				System.out.println("Enter your Pin number: ");
				// taking input from the user
				setPinNumber(listInput.nextInt());

			} catch (Exception e) {
				System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
				x = 2;
			}

			for (Entry<Integer, Integer> entry : loginDetails.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Invalid Customer Number or Pin Number." + "\n");
		} while (x == 1);
	}

	/* Display Account Type Menu with selection */

	public void getAccountType() {
		System.out.println("Select the account you want to access: ");
		System.out.println("Type 1: Checking Account");
		System.out.println("Type 2: Saving Account");
		System.out.println("Type 3: Exit");
		System.out.println("Choice: ");

		selection = listInput.nextInt();

		switch (selection) {
		case 1:
			getChecking();
			break;

		case 2:
			getSaving();
			break;

		case 3:
			System.out.println("Thank you for using this ATM, bye...");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}

	}

	private void getSaving() {

		System.out.println("Saving Account: ");
		System.out.println("Type 1: View Balance.");
		System.out.println("Type 2: Withdraw Fund.");
		System.out.println("Type 3: Deposit Funds.");
		System.out.println("Type 4: Exit");
		System.out.println("Choice: ");

		selection = listInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;

		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank you for using this ATM, bye...");
			break;

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getSaving();
		}

	}

	private void getChecking() {

		System.out.println("Checking Account: ");
		System.out.println("Type 1: View Balance.");
		System.out.println("Type 2: Withdraw Fund.");
		System.out.println("Type 3: Deposit Funds.");
		System.out.println("Type 4: Exit");
		System.out.println("Choice: ");

		selection = listInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;

		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank you for using this ATM, bye...");
			break;

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			getChecking();
		}

	}
}
