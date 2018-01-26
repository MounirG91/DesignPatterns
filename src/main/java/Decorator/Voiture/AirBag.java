package Decorator.Voiture;

public class AirBag extends Option {

    Voiture voiture;

    public AirBag(Voiture voiture) {
        super(voiture.getDescription(), voiture.getPrix());
        this.voiture = voiture;
    }

    public String getDescription() {
        return voiture.getDescription()+" AirBag";
    }

    public double getPrix() {
        return voiture.getPrix()+300;
    }
}
