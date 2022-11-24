public class Kadra extends Osoba implements IWynagrodzenie {

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

   public void wynagrodzenieDoWyplacenia(int lgodzin, int stawka)
    {
        System.out.println("Wynagrodzenie do wypłacenie: " + lgodzin*stawka);
    }

    @Override
    public void wynagrodzenieZaNadgodziny(int lgodzin, int stawka)
    {
        System.out.println("Wynagrodzenie za nadgodziny: " + lgodzin*(stawka*2));
    }
}
