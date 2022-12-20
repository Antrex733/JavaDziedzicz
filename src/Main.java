public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        int[] liczba = new int[]{1, 2, 3, 4, 5};

        liczba[2] = 5;

        animals[0] = new Blowfish("Rybka", 3, 0.5, "glony");
        animals[1] = new Dog("Piorun", 7, 12.4, "Husky", 4);
        animals[2] = new Pingeon("Remek", 6, 15.7, 1.2, "white");
        animals[3] = new Bird("Wrona", 1, 0.2, "yellow");
        animals[4] = new Dog("Pies", 12, 28.2, "Owczarek", 4);

        IanimalBehavior[] sleepyAnimals =
        {
            new Blowfish(53, 2),
            new Dog("Piorun", 7, 12.4, "Husky", 4),
            new Pingeon(1.2, 4)
        };

        for(IanimalBehavior a : sleepyAnimals)
            a.sleep();

        for(Animal a : animals)
            a.move();

        for(Animal a : animals)
        {
            System.out.print("\n");
            IAnimalName.name(a.name);
        }


    }
}