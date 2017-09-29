package BankSystem;

import java.util.Scanner;
import java.lang.String;


public class Main {
	
	static Scanner inp;
	
	public static void main(String[] args) {			
			
			Customers cust = new Customers();
			Accounts account = new Accounts();
			
			System.out.println("Welcome To" + cust.logo);
			System.out.println("YOU ARE FIRST VISITOR!");
			
			// scanner
			inp = new Scanner(System.in);

				cust.Create();
				account.Create();
			
			// closing my program and scanner
			inp.close();
		}
		
		// Scanner input double
		public static double InputDouble()
		{
			double doub = -1;
			
			while(true){
				// System.out.print("Input: ");
				try
				{
					doub = inp.nextDouble();
					break;
				} 
				catch(Exception e) 
				{
					System.out.println("Incorrect input!");
					inp.nextLine();
				}
			}

			return doub;
		}
		
		// Scanner input Integer
		public static int InputInt()
		{
			int num = -1;
			
			while(true){
				// System.out.print("Input: ");
				try
				{
					num = inp.nextInt();
					break;
				} 
				catch(Exception e) 
				{
					System.out.println("Incorrect input!");
					inp.nextLine();
				}
			}

			return num;
		}

		
		public static String InputString()
		{
			String text;
			text = inp.next();		
			return text;
		}
		
	    public static char InputChar() {  
			char a;
			a = inp.next().charAt(0);		
			return a;
        }
	}

