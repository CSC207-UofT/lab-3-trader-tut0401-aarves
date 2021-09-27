class Elephant implements Tradable, Drivable {

    int maxSpeed;

    public Elephant(){
        this.maxSpeed = 12;
    }
    public int getPrice(){
        return 90;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 5;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 5;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
