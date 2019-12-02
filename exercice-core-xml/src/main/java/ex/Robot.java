package ex;

public class Robot extends Base {
	
	private RadioTransmitter transmitter;
	private EnergySupplier energySupplier;
		
	public Robot(RadioTransmitter transmitter, EnergySupplier energySupplier) {
		super();
		this.transmitter = transmitter;
		this.energySupplier = energySupplier;
	}

	public void run() {
    System.out.println("Look Mom, I run !");
  }
}
