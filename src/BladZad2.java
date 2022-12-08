public class BladZad2 {
    public static void main(String[] args) {
        //zad2

        int[] tab = new int[]{1, 2};

        try
        {
            //blad3.metoda(12);
            blad3.metoda(tab, tab.length);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Nie dziel przez zero!!!");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Taki indeks nie istnieje!!!");
        }
        finally
        {
            System.out.println("Juz po wszystkim");
        }
    }
}
