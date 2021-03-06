package creationaldesignPattern.factorydesignpattern;

public class PcSubClass extends ComputerSuperClass {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PcSubClass(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
	@Override
	public String getCPU() {
		return this.cpu;
	}

}
