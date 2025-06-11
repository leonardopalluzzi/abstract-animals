public class Sparrow extends AbstractAnimal {

    protected int wingsOpening;

    public Sparrow(String name, String race, int age, float weight, int wingsOpening) {
        super(name, age, weight, race);
    }

    public void setWingsOpening(int wingsOpening) {
        this.wingsOpening = wingsOpening;
    }

    public int getWingsOpening() {
        return wingsOpening;
    }

    @Override
    void sleep() {

        super.sleep();
    }

    @Override
    void sound() {
        if (this.weight > 12) {
            System.out.println("PIOPIOPIO!");
        } else {
            System.out.println("pio");
        }
    }

    @Override
    void eat() {
        System.out.println("Eating cereals");

    }

}
