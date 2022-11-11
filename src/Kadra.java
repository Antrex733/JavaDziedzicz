public class Kadra extends Osoba {

    private String stanowisko;
    private String wyksztalcenie;

    public void inicjuj1()
    {
        inicjuj();
        System.out.println("Podaj stanowisko: ");
        stanowisko = scan.nextLine();
        System.out.println("Podaj wyksztalcenie: ");
        wyksztalcenie = scan.nextLine();
    }
    public void drukuj1()
    {
        drukuj();
        System.out.println("Stanowisko: " + stanowisko);
        System.out.println("Wyksztalcenie: " + wyksztalcenie);

    }
}
