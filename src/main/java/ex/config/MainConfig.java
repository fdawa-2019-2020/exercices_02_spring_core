package ex.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ex.energy.EnergyTank;
import ex.energy.NuclearEnergyTank;

@Configuration
@ComponentScan("ex")
@PropertySource({ 
	  "classpath:energy-${energy.mode:classic}.properties"
	})
public class MainConfig {

	
	@Bean
	public EnergyTank energyTank(@Value("${initial.quantity:1000}") float initialQuantity, @Value("${energy.kind}") String mode) {
		if ( "classic".equals(mode)) {
			return new EnergyTank(initialQuantity);
		} else if ( "nuclear".equals(mode)) {
			return new NuclearEnergyTank(initialQuantity);
		}
		throw new IllegalArgumentException("Mode "+mode+" is not available");
	}	
	
}
