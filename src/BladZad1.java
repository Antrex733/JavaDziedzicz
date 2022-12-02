public class BladZad1
{
    public static void main(String[] args)
    {
        //zad1
        try
        {
            Exception1.metoda();
        }
        catch (NullPointerException e)
        {
            System.out.println("Blad");
            e.printStackTrace();
            e.toString();
        }
    }
}
