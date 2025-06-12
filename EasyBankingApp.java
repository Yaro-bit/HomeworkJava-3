// Create a console application called EasyBanking.
// The program should:
// - Ask the user to enter a PIN (1234).
// - If the PIN is correct, display a menu:
//     1 — Send money
//     2 — Receive money
//     3 — Exit

import java.util.Scanner;

public class EasyBankingApp {
	public static void main(String[] args) {
		System.out.print("Welcome to NOMONEY Corp. Bank !");
		System.out.println("");
		System.out.println("****************************");
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("Please enter your pin: ");
		int pin = 1234;
		String userInput = scan.nextLine();
		System.out.println("");
		
		if(Integer.valueOf(userInput)==pin){
			int account = 0;
			
			System.out.println("****************************");
			System.out.println("Money on account: "+account);
			System.out.println("1. Send money");
			System.out.println("2. Recieve money");
			System.out.println("3. Exit");
			System.out.println("****************************");
			System.out.print("User input: ");
			userInput = scan.nextLine();
			
			
			
			while (Integer.valueOf(userInput)!=3){
				System.out.println("Money on account: "+account);
				int value = 0;
				
				if(Integer.valueOf(userInput)==2){
					System.out.print("Enter your money to recieve: ");
					userInput = scan.nextLine();
					value = Integer.valueOf(userInput);
					account = account + value;
					System.out.println(value +" Eur recieved !");
				}else{
					System.out.print("Enter your money to send: ");
					userInput = scan.nextLine();
					value = Integer.valueOf(userInput);
					
					if(value<=account){
						System.out.println(value +" Eur sent !");
						account = account - value;
					}else{
						System.out.println("****************************");
						System.out.println("Sorry not enough money on account !");
						System.out.println("Balance: "+account);
						System.out.println("****************************");
						break;
					}
				}
				System.out.println("****************************");
				System.out.println("Money on account: "+account);
				System.out.println("1. Send money");
				System.out.println("2. Recieve money");
				System.out.println("3. Exit");
				System.out.println("****************************");
				System.out.print("User input: ");
				userInput = scan.nextLine();
			}
			
		}
	}
}
