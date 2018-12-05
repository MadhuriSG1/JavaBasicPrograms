package creationaldesignPattern.factorydesignpattern;

public class ComputerFactory {
	
	
	/*We can keep Factory class Singleton we can keep getComputer method static.*/
	public static ComputerSuperClass getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PcSubClass(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new ServerSubClass(ram, hdd, cpu);
		
		return null;
	}

	}


