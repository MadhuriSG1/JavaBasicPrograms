package structuraldesignpattern.proxy;

//ProxyInternetAccess protect the RealInternetAccess class from outside word
//advantages of Proxy pattern is security.avoids duplication of objects 

    public class ProxyInternetAccess implements OfficeInternetAccess {  
        private String employeeName;  
        private RealInternetAccess  realaccess;  
        
        public ProxyInternetAccess(String employeeName) {  
         this.employeeName = employeeName;  
     }  
     @Override  
     public void grantInternetAccess()   
     {  
         if (getRole(employeeName) > 4)   
         {  
             realaccess = new RealInternetAccess(employeeName);  
             realaccess.grantInternetAccess();  
         }   
         else   
         {  
             System.out.println("No Internet access granted. " +employeeName+ " job level is below 5");  
         }  
     }  
     public int getRole(String emplName) {  
         // Check role from the database based on Name and designation  
         // return job level or job designation.  
         return 3;  
         //if return less than 5 then No internet access granted
     }  
}  

