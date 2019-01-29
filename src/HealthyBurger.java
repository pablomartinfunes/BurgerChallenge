public class HealthyBurger extends Hamburger {

    private final int NUMBER_OF_ADDITIONALS = 6;

    public HealthyBurger(float price, String meat) {
        super("Healthy Burger", price, meat, "brown rye bread roll");
    }

    @Override
    public void addAdditional(Addition addition) {

        if (additions.size() < NUMBER_OF_ADDITIONALS)
            additions.add(addition);
        else
            System.out.println("No se pueden agregar mas adicionales.");
    }


}
