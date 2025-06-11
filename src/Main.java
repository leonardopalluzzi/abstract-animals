public class Main {

    public static void makeFly(IFlying animal) {
        animal.flying();
    }

    public static void makeSwim(ISwimming animal) {
        animal.swimming();
    }

    public static void main(String[] args) {

        IFlying americanEagle = new Eagle("American Eagle", "Aquila Rapax", 23, 2.6f, 180);
        ISwimming bottogianoDolphin = new Dolphin("Bottogiano Dolphin", 40, 90.5f, "Bottogiano");

        makeFly(americanEagle);
        makeSwim(bottogianoDolphin);
    }

}
