package Decorator.Voiture;

public abstract class Voiture {

    private String description;
    private double prix;

    public Voiture(String description, double prix) {
        this.description = description;
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }
}