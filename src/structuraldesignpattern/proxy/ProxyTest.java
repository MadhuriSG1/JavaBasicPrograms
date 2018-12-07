package structuraldesignpattern.proxy;

public class ProxyTest {
	
	public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("Madhuri Gaikwad");  
        access.grantInternetAccess();  
    }  

}
