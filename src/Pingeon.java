public class Pingeon extends Bird{
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
}
