package behavioraldesignbyobserver.Mediator;

//Mediator design pattern is used to provide a centralized communication medium
//between different objects 
public class MediatorTest {  
    
    public static void main(String args[])  
    {  
          
          ApnaChatRoom chat = new ApnaChatRoomImpl();  
      
          User1 u1=new User1(chat);  
          u1.setname("Madhuri");  
          u1.sendMsg("Hi Madhuri! how was your day?");  
        
                
          User2 u2=new User2(chat);  
          u2.setname("Priti");  
          u2.sendMsg(" ! You tell?");  
    }  
  
}