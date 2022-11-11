public class Blowfish extends Fish {
    private int numberOfSpikes;

    public Blowfish()
    {

    }
    public Blowfish(int numberOfSpikes, int age)
    {
        setNumberOfSpikes(numberOfSpikes);
        setAge(age);
    }
    public Blowfish(String name, int age, double weight, String feed)
    {
        super(name, age, weight, feed);
        setNumberOfSpikes(numberOfSpikes);
    }

    public void getNumberOfSpikes(){System.out.print(numberOfSpikes);}
    public void setNumberOfSpikes(int numberOfSpikes){this.numberOfSpikes = numberOfSpikes;}

    public void getBigger(){System.out.print("Grows");}


    @Override
    public void WaterType() {
        System.out.print("saltwater");
    }

    @Override
    public void eat() {
        System.out.print("I eat algae");
    }
    @Override
    public void getVoice() {
        System.out.print("Blub, blub!");
    }
    @Override
    public String toString(){
        return "Blowfish{\nnumberOfSpikes: " + numberOfSpikes + "\n}";
    }
}
