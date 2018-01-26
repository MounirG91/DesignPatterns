package Decorator.Voiture;

public class Test {
    public static void main(String[] args){
        Voiture camionnette=new Camionnette("Camionnette",5000);
        Voiture berline=new Berline("Berline",10000);

        Option abs=new ABS(camionnette);
        Option airBag=new AirBag(abs);

        System.out.println(airBag.getDescription()+" Prix="+airBag.getPrix());





    }
}
