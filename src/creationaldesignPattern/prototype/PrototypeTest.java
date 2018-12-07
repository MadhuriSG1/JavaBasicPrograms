package creationaldesignPattern.prototype;

import java.util.List;

public class PrototypeTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
			Employees emps = new Employees();
			emps.loadData();
			
			//Use the clone method to get the cloned Employee object
			Employees empsNew = (Employees) emps.clone();
			Employees empsNew1 = (Employees) emps.clone();
			List<String> list = empsNew.getEmpList();
			list.add("John");
			List<String> list1 = empsNew1.getEmpList();
			list1.remove("Pankaj");
			
			System.out.println("emps List: "+emps.getEmpList());
			System.out.println("empsNew List: "+list);
			System.out.println("empsNew1 List: "+list1);
		}

	}

/*Note:If the object cloning was not provided, we will have to make database call to fetch the employee list every time. */
