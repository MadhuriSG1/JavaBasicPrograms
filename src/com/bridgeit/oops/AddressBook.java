package com.bridgeit.oops;


	import java.util.ArrayList;

	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Iterator;


import com.bridgeit.utility.Utility1;

	public class AddressBook implements AddressBookInterface{
	
		ArrayList<Person> list = new ArrayList<Person>();
		

		public void operation(ArrayList<Person> arrayRead) {
			
			list = arrayRead;
			boolean status = true;
			do {
				System.out.println("Choose Operation you want to do");
				System.out
						.println("1.Add   2.Edit   3.SortByLastName   4.SortByZip   5.Show   6.Delete  7Back");
				switch (Utility1.ipnumber()) {
				case 1:
					add();
					break;
				case 2:
					edit();
					break;
				case 3:
					sortByLastname();
					break;
				case 4:
					sortByZip();
					break;
				case 5:
					print();
					break;
				case 6:
					delete();
					break;
				case 7:
					status = false;
					break;
				}
			} while (status);
		}

		public void add() {
			Person person = new Person();
			Address address = new Address();
			System.out.println("Enter the First name:");
			String fname = Utility1.ipstring();
			person.setFname(fname);

			System.out.println("Enter the Last name:");
			String lname = Utility1.ipstring();
			person.setLname(lname);

			System.out.println("Enter the Phone Number:");
			Long phone = Utility1.iplongnumber();
			person.setPhonenumber(phone);

			System.out.println("Enter the City:");
			String city = Utility1.ipstring();
			address.setCity(city);

			System.out.println("Enter the Zip:");
			long zip = Utility1.iplongnumber();
			address.setZip(zip);

			System.out.println("Enter the State:");
			String state = Utility1.ipstring();
			address.setState(state);
			person.setAddress(address);//using has relationship
			list.add(person);//Person info added in list 

		}
//edit person info by according to name
		public void edit() {
			System.out.println("Enter your First name:");
			String fname = Utility1.ipstring();

			Iterator<Person> iterator = list.listIterator();//iterate list of persons

			while (iterator.hasNext()) {
				Person person = iterator.next();

				if (fname.equals(person.getFname())) {
					Address address = person.getAddress();
					System.out.println("Choose field you want to add:");
					System.out
							.println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");
					switch (Utility1.ipnumber()) {
					case 1:
						System.out.println("Re-Correct your lastname");
						person.setLname(Utility1.ipstring());
						break;
					case 2:
						System.out.println("Re-Correct your Phone Number");
						person.setPhonenumber(Utility1.iplongnumber());
						break;
					case 3:
						System.out.println("Re-Correct your City");
						address.setCity(Utility1.ipstring());
						break;
					case 4:
						System.out.println("Re-Correct your Zip");
						address.setZip(Utility1.iplongnumber());
						break;
					case 5:
						System.out.println("Re-Correct your State");
						address.setState(Utility1.ipstring());
						break;
					}

				}
			}

		}
		
        		//Sort by last name

		public void sortByLastname() {
			Collections.sort(list, Sort.compareLastName);//sorts the specified list according to order induced by comparator
		}

		//Sort by zip 
		public void sortByZip() {
			Collections.sort(list, Sort.compareZip);
		}

		//Return persons ArrayList
		public ArrayList<Person> list() {
			return list;
		}

		//Print list
		public void print() {
			System.out.println(list);
			Iterator<Person> it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} 

		 //Delete person
		public void delete() {
			System.out.println("Enter your First name:");
			String fnamedelete = Utility1.ipstring();

			Iterator<Person> iteratord = list.iterator();
			while (iteratord.hasNext()) {
				Person person = iteratord.next();

				if (fnamedelete.equals(person.getFname())) 
				{
					list.remove(person);
					break;
				}
				
				
			}
		}

		//compare last name
		public static class Sort {
			static Comparator<Person> compareLastName = new Comparator<Person>() {
				public int compare(Person one, Person two) {
					return one.getLname().compareTo(two.getLname());
				}
			};

			//compare zip
			static Comparator<Person> compareZip = new Comparator<Person>() {
				public int compare(Person s1, Person s2) {
					Address address1 = s1.getAddress();
					Address address2 = s2.getAddress();
					int zip1 = (int) address1.getZip();
					int zip2 = (int) address2.getZip();
					return zip1 - zip2;//positive and negative integer number
				}
			};
		}

	
}
