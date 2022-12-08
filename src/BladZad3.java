public class BladZad3 {
    public static void main(String[] args) {
        Account konto = new Account("Roman", "123456789", 100);

        int kwotaPrzelewu=200;

        try
        {
            konto.Przelew(kwotaPrzelewu);
        }
        catch (ExceptionAccount e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("Wyjatek: ");
            e.printStackTrace();
        }
        finally
        {
            System.out.print("Aktualny stan konta: ");
            System.out.println(konto.GetBalance());
        }
    }
}
