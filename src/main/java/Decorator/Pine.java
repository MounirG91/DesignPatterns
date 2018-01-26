package Decorator;

public class Pine extends CondimentDecorator {

    Beverage beverage;

    public Pine(Beverage beverage) {
        super(beverage.getDescription());
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+" Pine";
    }

    public double cost() {
        return beverage.cost() + 0.6;
    }
}
