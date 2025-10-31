/**
 * Represents a Cafe, which is a type of Building that manages an amount of coffee,
 * sugar, cream, and cups. Provides methods to sell coffee and restock ingredients.
 */
public class Cafe extends Building {

    private int nCoffeeOunces;
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups; 

    /**
     * Constructs a new Cafe with the speicified name, address, and number of floors.
     * Initializes the stock of coffee, sugar, cream, and cups to default values.
     * 
     * @param name the name of the cafe
     * @param address the address of the cafe
     * @param nFloors the number of floors in the cafe
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        this.nCups = 100;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Restocks the cafe's ingredients with the specified amounts of coffee, sugar, cream, and cups.
     * @param nCoffeeOunces the new number of ounces of coffee
     * @param nSugarPackets the new number of sugar packets
     * @param nCreams the new number of "splashes" of cream
     * @param nCups the new number of cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    } 

    /**
     * Sells a coffee of the specified size with the given amount of sugar and cream.
     * Automatically restocks the cafe if there are insufficient ingredients.
     * After selling, updates the stock by subtracting the used ingredients and one cup.
     *
     * @param size the size of the coffee in ounces
     * @param nSugarPackets the number of sugar packets wanted
     * @param nCreams the number of "splashes" of cream wanted
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces < size || this.nSugarPackets < nSugarPackets || this.nCreams < nCreams || this.nCups < 1) {
            this.restock(100, 100, 100, 100);
        }

        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }

    public static void main(String[] args) {
        Cafe myCafe = new Cafe("The Cafe", "1234 st", 1);
        myCafe.sellCoffee(16, 5, 5);
        System.out.println(myCafe);
    }
    
}
