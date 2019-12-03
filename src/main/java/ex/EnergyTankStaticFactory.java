package ex;

public class EnergyTankStaticFactory {
	
	public static EnergyTank getDefaultTank() {
		System.out.println(" #-> EnergyTankStaticFactory->getDefaultTank()");
		return new EnergyTank(1000);
	}

}
