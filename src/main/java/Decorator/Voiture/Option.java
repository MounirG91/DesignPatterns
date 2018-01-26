package Decorator.Voiture;

public abstract class Option extends Voiture {
    public Option(String description, double prix) {
        super(description, prix);
    }

    public abstract String getDescription();

    public abstract double getPrix();
}
