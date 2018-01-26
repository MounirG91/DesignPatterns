package Decorator.Voiture;

public class ABS extends Option {

    Voiture voiture;

    public ABS(Voiture voiture) {
        super(voiture.getDescription(), voiture.getPrix());
        this.voiture = voiture;
    }

    public String getDescription() {
        return voiture.getDescription() + " ABS";
    }

    public double getPrix() {
        return voiture.getPrix() + 500;
    }
}
