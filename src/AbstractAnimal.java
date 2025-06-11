public abstract class AbstractAnimal {

    String name;
    String race;
    int age;
    float weight;

    public AbstractAnimal(String name, int age, float weight, String race) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.race = race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    void sleep() {
        System.out.println("Zzz");
    }

    abstract void sound();

    abstract void eat();

    @Override
    public String toString() {
        return String.format("Animal: '%s', \nAge: %d, \nRace: %s, \nWeight: %.2f kg", this.getName(), this.getAge(),
                this.getRace(), this.getWeight());
    }
}
