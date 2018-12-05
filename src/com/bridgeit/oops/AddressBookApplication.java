package com.bridgeit.oops;

import com.bridgeit.utility.Utility1;

	public class AddressBookApplication {
		
		public static void main(String[] args) {
			
			AddressManagerInterface manager = new AddressManager( );
			
			System.out.println("Welcome to AddressBook");
			
			do {
				System.out.println("Make a choice from below");
			
				System.out.println("1.Create");
				System.out.println("2.Open");
				System.out.println("3.Save ");
				System.out.println("4.SAve As");
				System.out.println("5.Quit");
				int result=Utility1.ipnumber();	
				switch (result) {
				case 1:
					manager.create();
					break;
				
				case 2:
					manager.open();
					break;
				
				case 3:
					manager.save();
					break;
				
				case 4:
					manager.saveAs();
					break;
				
				case 5:
					manager.quit();
					break;
				}
			} while (true);

		}

	}

