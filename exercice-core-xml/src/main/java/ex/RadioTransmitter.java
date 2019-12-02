package ex;

public class RadioTransmitter extends Base {
	
	private RadioDriver driver;
	
	public void setDriver(RadioDriver driver) {
		this.driver = driver;
		System.out.println(" Wiring  "+this+" setDriver("+driver+")");
	}
}
