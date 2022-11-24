public class Bird extends Animal implements IAnimalMove {
    protected String featherColor;

    protected Bird()
    {

    }
    protected Bird(String name, String featherColor)
    {
        setFeatherColor(featherColor);
        setName(name);
    }
    protected Bird(String name, int age, double weight, String featherColor)
    {
        super(name, age, weight);
        setFeatherColor(featherColor);
    }


    protected void CanFly(){}

    protected void getFeatherColor() {System.out.print(featherColor);}
    protected void setFeatherColor(String featherColor) {this.featherColor = featherColor;}
}
