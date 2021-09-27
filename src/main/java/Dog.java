public class Dog implements Tradable, Domesticatable {

    private int i1;
    private String s1;

    public Dog(String breed) {
        this.s1 = breed;

        if (breed.equals("Chihuahua")) {
            this.i1 = 5;
        } else if (breed.equals("Labrador")) {
            this.i1 = 10;
        } else if (breed.equals("Golden Retriever")) {
            this.i1 = 15;
        } else if (breed.equals("German Shepherd")) {
            this.i1 = 20;
        }
    }

    @Override
    public String sound() {
        return "Woof!";
    }

    @Override
    public int getPrice() {
        return this.i1;
    }

    public String getBreed() {
        return this.s1;
    }
}
