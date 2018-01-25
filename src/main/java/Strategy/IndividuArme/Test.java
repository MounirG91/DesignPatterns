package Strategy.IndividuArme;

public class Test {

    public static void main(String[] args){
        ComportementArme comportementCouteau= new ComportementCouteau();
        ComportementArme comportementArcAndFleche=new ComportementArcAndFleche();
        ComportementArme comportementEpee=new ComportementEpee();

        Reine reine=new Reine();
        Chevalier chevalier=new Chevalier();
        Archer archer=new Archer();

        reine.setComportementArme(comportementCouteau);
        chevalier.setComportementArme(comportementEpee);
        archer.setComportementArme(comportementArcAndFleche);

        reine.display();
        chevalier.display();
        archer.display();
    }
}
