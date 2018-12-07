package creationaldesignPattern.prototype;

public class DogName implements Cloneable{
	private String dname;

	
	   public String getDname() {
	      return dname;
	   }

	   public void setDname(String dname) {
	      this.dname = dname;
	   }

	   // Overriding clone() method of Object class
	   public Object clone()throws CloneNotSupportedException{  
	      return (DogName)super.clone();  
	   }
		
	   public static void main(String[] args) {
	      DogName obj1 = new DogName();
	      try {
		obj1.setDname("Dog1");
		//Cloning obj1 into obj2
		DogName obj2 = (DogName) obj1.clone();
				
		//Displaying both the objects content
		System.out.println("Original Object: "+obj1.getDname());
		System.out.println("Cloned Object: "+obj2.getDname());
			
		/* we change the content of original object after cloning, the changes does not reflect in the clone object*/
		//Setting up name in obj2
		System.out.println("After changing original object after cloning");
		obj1.setDname("Dog2");
				
		//Displaying both the objects content
		System.out.println("Original Object: "+obj1.getDname());
		System.out.println("Cloned Object: "+obj2.getDname());
	      } catch (CloneNotSupportedException e) {
		   e.printStackTrace();
		}
	   }
	}
	

