/* Sample Comment
 */
public class Dog implements Tradable, Domesticatable{
    private int price;
    private int happiness;

    public Dog() {
        this.price = 5;
        this.happiness = 10;
    }

    @Override
    public String sound() { return "Woof!"; }

    @Override
    public int getPrice() { return this.price; }

    public void feedTreat(int count) {
        this.happiness = Math.min(this.happiness + 5 * count, 100);
        this.price += this.price + count;
    }

    public void punishment(int harshness) {
        this.happiness = Math.max(this.happiness - harshness, 0);
        this.price = Math.max(Math.round(this.price - harshness / 10.0f), 5);
    }

    public int getHappiness() {
        return this.happiness;
    }

    @Override
    public String toString(){
        return super.toString() + " (Doggy has happiness rating of " + this.happiness + "!) ";
    }
}
