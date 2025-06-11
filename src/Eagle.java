public class Eagle extends AbstractAnimal {

    protected int wingsOpening;

    public Eagle(String name, String race, int age, float weight, int wingsOpening) {
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
            System.out.println("CRAHHHHH!");
        } else {
            System.out.println("crah");
        }
    }

    @Override
    void eat() {
        System.out.println("Eating a small rabbit");

    }

}
