public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];

        animals[0] = new Blowfish(53, 2);
        animals[1] = new Dog("Piorun", 7, 12.4, "Husky", 4);
        animals[2] = new Fish("smaller fishes", 2);
        animals[3] = new Pingeon(1.2, 4);
        animals[4] = new Bird("Sikor", 1, 0.2, "yellow");
        animals[5] = new Dog(4, 6);

        for (Animal a:animals)
            a.getAge();

        /*
        animals[0].getAge();
        Blowfish a = new Blowfish();
        a.getBigger();
        */
    }
}