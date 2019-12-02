package ex;

/**
 * Component in charge of communication par radio
 */
public class RadioTransmitter extends Base {
	
	private RadioDriver driver;
	
	public void setDriver(RadioDriver driver) {
		this.driver = driver;
		System.out.println(" Wiring  "+this+" -> setDriver("+driver+")");
	}
}
