package adwanced.three;

public class CreamDecorator extends Beverage{

    private Beverage beverage;
    
    public CreamDecorator(Beverage beverage) {
        super(beverage.getName() + " sa šlagom");
        this.beverage = beverage;
    }

    @Override
    public double cost() {
      return beverage.cost() + 1.0;
    }

  
    
}
