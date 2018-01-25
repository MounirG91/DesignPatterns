package Strategy.SimUDuck;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void performQuack();

    public abstract void swim();

    public abstract void display();

    public abstract void performFly();

}
