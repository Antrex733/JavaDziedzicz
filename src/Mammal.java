public class Mammal extends Animal {
    protected int liczbakonczyn;

    protected Mammal()
    {

    }
    protected Mammal(String name, int liczbakonczyn)
    {
        setLiczbakonczyn(liczbakonczyn);
        setName(name);
    }
    protected Mammal(String name, int age, double weight, int liczbakonczyn)
    {
        super(name, age, weight);
        setLiczbakonczyn(liczbakonczyn);
    }

    protected void areYouDangerous() {}


    protected void getLiczbakonczyn() {System.out.print(liczbakonczyn);}
    protected void setLiczbakonczyn(int liczbakonczyn) {this.liczbakonczyn = liczbakonczyn;}
}
