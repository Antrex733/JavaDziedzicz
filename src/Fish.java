import java.time.format.SignStyle;

public class Fish extends Animal{
    protected String feed;

    protected Fish()
    {

    }
    protected Fish(String feed, int age)
    {
        setAge(age);
        setFeed(feed);
    }
    protected Fish(String name, int age, double weight, String feed)
    {
        super(name, age, weight);
        setFeed(feed);
    }


    public void WaterType(){}

    protected void getFeed() {this.feed = feed;}
    protected void setFeed(String feed) {System.out.print(feed);}
}
