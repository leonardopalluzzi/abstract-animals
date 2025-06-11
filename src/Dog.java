public class Dog extends AbstractAnimal {

    public Dog(String race, float weight, String name, int age) {
        super(name, age, weight, race);
    }

    @Override
    void sleep() {

        super.sleep();
    }

    @Override
    void sound() {
        if (this.weight > 12) {
            System.out.println("BAAAAARKKKKK!");
        } else {
            System.out.println("bark");
        }
    }

    @Override
    void eat() {
        System.out.println("Eating meet");

    }
}
