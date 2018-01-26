package Decorator.Beverage;

public class Test {
    public static void main(String[] args) {
        Beverage coffee = new Coffee("Coffee");
        Beverage tea = new Tea("Tea");

        Milk milk = new Milk(coffee);
        Mint mint = new Mint(tea);
        Pine pine=new Pine(mint);


        System.out.println(milk.getDescription() + " Cost= " + milk.cost());
        System.out.println(mint.getDescription() + " Cost= " + mint.cost());
        System.out.println(pine.getDescription()+ " Cost= " + pine.cost());


    }
}
