public class DeluxeBurger extends Hamburger {


    public DeluxeBurger(double price, String meat, String breadType) {
        super("Deluxe Burger", price, meat, breadType);
        additions.add(new Addition("Chips", 1));
        additions.add(new Addition("Drink", 1.2));
    }

    @Override
    public void addAdditional(Addition addition) {
            System.out.println("No se pueden agregar mas adicionales.");
    }
}
