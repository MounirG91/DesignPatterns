package Singleton;

public class Singleton {
    private volatile static Singleton uniqueInstance; //volatle afin que les threads gèrent la variable uniqueInstance correctement au moment de son initialisation

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { // On synchronise qu'à la première fois
                if (uniqueInstance == null) uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    } //autre méthodes utiles

}