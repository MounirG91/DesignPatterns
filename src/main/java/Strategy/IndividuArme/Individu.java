package Strategy.IndividuArme;

public abstract class Individu {

    ComportementArme comportementArme;

    public void setComportementArme(ComportementArme comportementArme) {
        this.comportementArme = comportementArme;
    }

    public String combattre(){
        return this.comportementArme.UtiliserArme();
    }

    public abstract void display();
}
