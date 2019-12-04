package ex.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ex.energy.EnergyTank;

@Configuration
@ComponentScan("ex")
@PropertySource({ 
	  "classpath:energy-${energy.mode:classic}.properties"
	})
public class MainConfig {

	@Bean
	public EnergyTank energyTank(@Value("${initial.quantity:1000}") float initialQuantity) {
		return new EnergyTank(initialQuantity);
	}
	
}
