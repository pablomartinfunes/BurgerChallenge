import java.util.ArrayList;

public class Simulation {

    public static void main(String[] args) {

        ArrayList<Hamburger> hamburgers = new ArrayList<>();

        Hamburger h1 = new HealthyBurger(4, "cow");
        h1.addAdditional(new Addition("lettuce", 1.1));
        h1.addAdditional(new Addition("Tommatoe", 0.8));
        h1.addAdditional(new Addition("Tommatoe", 0.1));
        h1.addAdditional(new Addition("Tommatoe", 0.1));
        h1.addAdditional(new Addition("Tommatoe", 0.1));
        h1.addAdditional(new Addition("Tommatoe", 0.1));
        h1.addAdditional(new Addition("Tommatoe", 0.1));

        hamburgers.add(h1);

        Hamburger h2 = new DeluxeBurger(5.4, "chicken", "common");
        h2.addAdditional(new Addition("lettuce", 1.0));

        hamburgers.add(h2);

        for (Hamburger hamburger : hamburgers)
            hamburger.totalHamburgerPrice();

    }
}
