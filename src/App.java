public class App {
    public static void main(String[] args) throws Exception {

        AbstractAnimal americanEagle = new Eagle("American Eagle", "Aquila Rapax", 23, 2.6f, 180);
        AbstractAnimal bottogianoDolphin = new Dolphin("Bottogiano Dolphin", 40, 90.5f, "Bottogiano");

        System.out.println("The Dolphin is:");
        bottogianoDolphin.sleep();
        System.out.println("---------------");
        System.out.println("The Eagle is:");
        americanEagle.eat();

    }
}
