package structuraldesignpattern;
/*The client sees only the target interface and not the adapter.*/
public class AdapterTest {

	public static void main(String[] args) {
		
			  CreditCard targetInterface=new BankCustomer();  
			  targetInterface.giveBankDetails();  
			  System.out.print(targetInterface.getCreditCard());  
			

	}

}
