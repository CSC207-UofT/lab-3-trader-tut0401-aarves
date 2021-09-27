public class Turtle implements Drivable, Domesticatable, Tradable {

    private int maxSpeed = 100;

    @Override
    public String sound() {
        return "Meow! :)";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 3;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 31415;
    }

    @Override
    public String toString(){
        return "This is a turtle!";
    }
}
