package ex.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ex.energy.EnergyTank;

@Configuration
@ComponentScan("ex")
public class MainConfig {

	@Bean
	public EnergyTank energyTank(@Value("${initial.quantity:1000}") float initialQuantity) {
		return new EnergyTank(initialQuantity);
	}
	
}
