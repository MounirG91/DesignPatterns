package Decorator;

public class Coffee extends Beverage {

    public Coffee(String description) {
        super(description);
    }

    public double cost() {
        return 1.5;
    }
}
