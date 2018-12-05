package creationaldesignPattern.factorydesignpattern;

public class TestFactory {
	
	public static void main(String[] args) {
		ComputerSuperClass Pc = ComputerFactory.getComputer("Pc","2 GB","500 GB","2.4 GHz");
		ComputerSuperClass Server = ComputerFactory.getComputer("Server","16 GB","1 TB","3.0 GHz");
		System.out.println("Factory PC Config::"+Pc);
		System.out.println("Factory Server Config::"+Server);
	}


}
/*Factory pattern provides abstraction between implementation and client classes through inheritance.
 * Factory pattern removes the instantiation of actual implementation classes from client code.
 *  Factory pattern makes our code more robust, and easy to extend. */
 