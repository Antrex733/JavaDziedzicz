public class Pingeon extends Bird implements IanimalBehavior, IAnimalMove{
    private double height;

    public Pingeon()
    {

    }
    public Pingeon(double height, int age)
    {
        setHeight(height);
        setAge(age);
    }
    public Pingeon(String name, int age, double weight, double height, String featherColo)
    {
        super(name, age, weight, featherColo);
        setHeight(height);
    }

    public void getHeight(){System.out.print(height);}
    public void setHeight(double height){this.height = height;}
    public void GoHunting(){System.out.print("Jumps to water");}


    @Override
    public void CanFly() {
        System.out.print("I wish I could");
    }

    @Override
    public void eat() {
        System.out.print("I eat fishes");
    }
    @Override
    public void getVoice() {
        System.out.print("penguin sound!");
    }
    @Override
    public String toString(){
        return "Blowfish{\nheight: " + height + "\n}" ;
    }
    public void sleep()
    {
        System.out.print("\nZzz...");
    }
    @Override
    public void move()
    {
        System.out.print("\nThe pingeon is walking");
    }
}
