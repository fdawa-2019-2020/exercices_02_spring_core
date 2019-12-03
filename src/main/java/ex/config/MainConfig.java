package ex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ex.energy.EnergyTank;
import ex.energy.EnergyTankStaticFactory;

@Configuration
@ComponentScan("ex")
public class MainConfig {

	@Bean
	public EnergyTank energyTank() {
		return EnergyTankStaticFactory.getDefaultTank();
	}
	
}
