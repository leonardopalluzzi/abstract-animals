public class Dolphin extends AbstractAnimal {

    public Dolphin(String name, int age, float weight, String race) {
        super(name, age, weight, race);
    }

    @Override
    void sleep() {

        super.sleep();
    }

    @Override
    void sound() {
        if (this.weight > 12) {
            System.out.println("AHAHAHHAHA!");
        } else {
            System.out.println("ahahah");
        }
    }

    @Override
    void eat() {
        System.out.println("Eating fishes");

    }

}
