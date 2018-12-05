package creationaldesignPattern.factorydesignpattern;
/*Super class in factory design pattern can be an interface, abstract class or a normal java class.*/
public abstract class ComputerSuperClass {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}

}
