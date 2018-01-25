package Strategy.SimUDuck;

public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak");
        System.out.println("Rubber");
    }
}
