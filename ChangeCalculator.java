import java.util.Scanner;

public class ChangeCalculator {
	
	
	public static void getChange(int changeGive) {
		
		System.out.println("Coins tendered: ");
		
		int quarters;										// initialize coin we're working with 
		quarters = changeGive / 25; 						// coin amount is equal to the amount the change divided by coins value.
		changeGive -= quarters * 25;						// update the original change given 
		if(quarters > 0) {									// if the number of coins is greater than zero
			System.out.println("Quarters: " + quarters);	// display the coins needed
		}
		
		
		int dimes;
		dimes = changeGive / 10; 
		changeGive -= dimes * 10; 
		if(dimes > 0) {
			System.out.println("Dimes: " + dimes);
		}
		
		
		int nickels; 
		nickels = changeGive / 5;
		changeGive -= nickels *5; 
		if(nickels > 0) {
			System.out.println("Nickels: " + nickels);
		}
		
		
		int pennies;
		pennies = changeGive / 1; 
		changeGive -= pennies * 1;
		if(pennies > 0) {
		System.out.println("Pennies: " + pennies);
		}
				
	}
	
	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter coin change amount (max 99): ");
		
		int changeGive = in.nextInt();
		
		getChange(changeGive);
		
		System.out.println(" ");
		
		main(args);
		

	}
	
}
