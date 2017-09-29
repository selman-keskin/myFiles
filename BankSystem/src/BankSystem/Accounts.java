package BankSystem;

import java.time.LocalDate;


public class Accounts extends Bank {

	public String account;
	public int balance = 0;
	public String[] accounts = new String[] {
			"Private Account",
			"Savings Account",
			"Company Account"
			};
	
	
	@Override
	public void Create() {	
		date = LocalDate.now();
		boolean cancel = false;
		if(end != true){
			char input;
			System.out.println("\nDo you want to look your account?\n Please enter Y or N");			
			input = Main.InputChar();
			if(input == 'Y' || input == 'y'){			
				System.out.println("\nDate: " + date);
				System.out.println("Bank: " + logo);
				
				System.out.println("\nOveview " + name + "'s " + accounts[0]);
				
				while(!cancel){
					System.out.println("\n1. Pay and Transfer \n2. Create Additional Account \n3. Transaction history \n4. Cancel");	
					int num = 0;
					num = Main.InputInt();
					
					switch(num){
					case 1:
					case 2:
					case 3:
						Menu(num);
						break;
					case 4:
						cancel = true;
						break;
					default:
						System.out.println("Choose an correct number ...");	
						break;
					}
				}
				System.out.println("Thanks for visited our BANK!\nHave a nice Day!");			
							
			}
		}
	}
	
	public void Menu(int n){
		int number = 0;
		if(n == 1){
			System.out.println("Your balance " + balance + " sek");
		} else if (n == 2){
			System.out.println("Choose one account:");
			for(String account : accounts) {
				number++;
				System.out.println(number + ". " + account);
			}
			n = 0;
				n = Main.InputInt();	
				if(n == 1){
					account = accounts[0];
				}
				else if(n == 2){
					account = accounts[1];
				}
				else if(n == 3){
					account = accounts[2];
				}else {
					
				}
			
			System.out.println("\nCongratulation! \nAccount successfully created!");
		} else if (n == 3){
			System.out.println("Your Transaktion History is empty");
		} 
	}

}
