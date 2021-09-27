/* Class representing a Doggo.
 */

public class Doggo implements Tradable, Domesticatable{
    private int price;
    private int happiness;

    public Doggo() {
        this.price = 5;
        this.happiness = 10;
    }

    /**
     * Returns the sound the Doggo makes.
     *
     * @return A String representing the Doggo's sound.
     */
    @Override
    public String sound() { return "Woof!"; }

    /**
     * Returns the Doggo's price.
     *
     * @return An int representing the Doggo's price in dollars.
     */
    @Override
    public int getPrice() { return this.price; }

    /**
     * Gives a good Doggo a treat.
     *
     * @param count An int representing the amount of treats to give.
     */
    public void feedTreat(int count) {
        this.happiness = Math.min(this.happiness + 5 * count, 100);
        this.price += this.price + count;
    }

    /**
     * Punishes the bad Doggo.
     *
     * @param harshness An int representing the degree of harshness for punishment.
     */
    public void punishment(int harshness) {
        this.happiness = Math.max(this.happiness - harshness, 0);
        this.price = Math.max(Math.round(this.price - harshness / 10.0f), 5);
    }

    /**
     * Return's the Doggo's happiness rating from 0-100.
     *
     * @return An int representing the Doggo's happiness rating.
     */
    public int getHappiness() {
        return this.happiness;
    }

    /**
     * Returns a String representing the Doggo.
     *
     * @return A String representing Doggo.
     */
    @Override
    public String toString(){
        return super.toString() + " (Doggo has happiness rating of " + this.happiness + "!) ";
    }
}
