package Decorator.Beverage;

public class Tea extends Beverage {

    public Tea(String description) {
        super(description);
    }

    public double cost() {
        return 1.1;
    }
}
