package ex.energy;

import org.springframework.stereotype.Component;

import ex.Base;

@Component
public class EnergyTank extends Base{

  private float level;
  private float initialQuantity;

  public EnergyTank(float initialQuantity) {
    this.initialQuantity = initialQuantity;
    this.level = initialQuantity;
    
    System.out.println(" --> Initialization with "
    		+ " initialQuantity="+this.initialQuantity
    		+", level="+this.level);
  }

  
}
