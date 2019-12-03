package ex.energy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EnergyTankStaticFactory {
	
	@Bean
	public static EnergyTank getDefaultTank() {
		System.out.println(" #-> EnergyTankStaticFactory->getDefaultTank()");
		return new EnergyTank(1000);
	}

}
