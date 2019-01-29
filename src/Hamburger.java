import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;

abstract class Hamburger {

    private String name;
    private double basePrice;
    private double addsPrice;
    private String meat;
    private String breadType;
    ArrayList<Addition> additions;

    public Hamburger(String name, double price, String meat, String breadType){
        this.name = name;
        this.basePrice = price;
        this.addsPrice = 0;
        this.meat = meat;
        this.breadType = breadType;
        additions = new ArrayList<>();
    }

    public void totalHamburgerPrice(){

        System.out.println("----------------------------");
        System.out.println("Hamburger: " + name);
        System.out.println("Base Price: " + basePrice);

        if (additions.size() != 0){

            for (Addition addition : additions) {
                addsPrice += addition.getPrice();
                System.out.println("Addition " + addition.getName() + ", price: " +addition.getPrice());
            }

            System.out.println("Adds Price: " + new DecimalFormat("#0.00").format(addsPrice));
        }

        System.out.println("Total Hamburger Price: " + new DecimalFormat("#0.00").format(basePrice+addsPrice));
        System.out.println("----------------------------");
    }


    public abstract void addAdditional(Addition addition);

}
