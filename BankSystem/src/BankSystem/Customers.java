package BankSystem;

import java.lang.String;
import java.time.LocalDate;


public class Customers extends Bank {

	public String account, identity, city, address;
	public int phone, age;
	

	@Override
	public void Create() {	
		
		date = LocalDate.now();
		boolean go = true;
		char answer;

		
		System.out.println("\nDate: " + date);
		System.out.println("Bank: " + logo);

		while(go){
			System.out.println("Do you want to create an account?\n Please enter Y or N");
			
			answer = Main.InputChar();
			
			switch(answer){
			case 'Y':
			case 'y':	
				System.out.println("Follow instructions to create a new account");
				System.out.print("\nName: ");
				name = Main.InputString();
				System.out.print("Age: ");
				age = Main.InputInt();
				System.out.print("Pesonal Number: ");
				identity = Main.InputString();			
				System.out.print("City: ");
				identity = Main.InputString();			
				System.out.print("Address: ");
				address = Main.InputString();
				System.out.print("Phone: ");
				phone = Main.InputInt();

					System.out.println("1. Send");
					System.out.println("2. Start Over");
					System.out.println("3. Cancel");
					
					int choice;
					choice = Main.InputInt();
					switch(choice){
					case 1:
						System.out.println("\nCongratulation! \nRegistration was successful!");
						go = false;
						break;
					case 2:
						go = true;
						break;
					case 3:
						System.out.println("Thanks for visited our BANK!\nHave a nice Day!");
						go = false;
						end = true;
						break;
					default:
						System.out.println("Please enter right comando!");
						break;				
					}	
				break;
			case 'N':
			case 'n':
				go = false;
				end = true;
				System.out.println("Thanks for visited our BANK!\nHave a nice Day!");
				break;
			default:
				System.out.println("Please enter right comando!");
				break;
			}
		
		}	

	}

}
