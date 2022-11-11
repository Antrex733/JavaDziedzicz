public class Dog extends Mammal{
    private String breed;

    public Dog()
    {

    }
    public Dog(int liczbakonczyn, int age)
    {
        setLiczbakonczyn(liczbakonczyn);
        setAge(age);
    }
    public Dog(String name, int age, double weight, String breed, int liczbakonczyn)
    {
        super(name, age, weight, liczbakonczyn);
        setBreed(breed);
    }

    public void getBreed(){System.out.print(breed);}
    public void setBreed(String breed){this.breed = breed;}

    public void Jump(){System.out.print("Jumped");}

    @Override
    public void areYouDangerous() {
        System.out.print("When I'm hungry");
    }

    @Override
    public void eat() {
        System.out.print("I eat dog food");
    }

    @Override
    public void getVoice() {
        System.out.print("Wof, wof!");
    }

    @Override
    public String toString(){
        return "Dog{\nbreed: " + breed + "\n}";
    }
}
