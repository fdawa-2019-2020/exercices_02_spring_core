package ex;
/**
 * Robot class
 */
public class Robot extends Base {
	
	private RadioTransmitter transmitter;
	private EnergySupplier energySupplier;
	private CommandUnit commandUnit;
		
	/**
	 * 
	 * @param commandUnit
	 * @param transmitter
	 * @param energySupplier
	 */
	public Robot(CommandUnit commandUnit, RadioTransmitter transmitter, EnergySupplier energySupplier) {
		this.commandUnit = commandUnit;
		this.transmitter = transmitter;
		this.energySupplier = energySupplier;
	}

	/**
	 * Run the robot
	 */
	public void run() {
    System.out.println("Look Mom, I run !");
  }
}
