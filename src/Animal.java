import javax.sql.rowset.serial.SerialStruct;

public class Animal {

    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight)
    {
        setName(name);
        setAge(age);
        setWeight(weight);
    }
    protected Animal(String name, int age)
    {
        setName(name);
        setAge(age);
    }
    protected Animal()
    {

    }

    protected void eat() {}
    protected void getVoice() {}


    protected void getName(String name) {System.out.print(name);}
    protected void getAge() {System.out.print(age);}
    protected void getWeight() {System.out.print(weight);}

    protected void  setName(String name) {this.name = name;}
    protected void setAge(int age) {this.age = age;}
    protected void setWeight(double weight) {this.weight = weight;}




}
