package Decorator;

public class Main {
    public static void main(String[] args) {
        Napitok napitok = new Espresso();
        System.out.println(napitok.getDescription() + " " + napitok.cost());

        Napitok napitok1 = new Espresso();
        napitok1 = new Mocha(napitok1);

        System.out.println(napitok1.cost());

        napitok1 = new Whip(napitok1);

        System.out.println(napitok1.cost());

    }

}
