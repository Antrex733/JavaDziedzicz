import java.util.Scanner;

public class Osoba {

    Scanner scan = new Scanner(System.in);
    private String nazwisko;
    private String imie;
    private String ulica;
    private String kod;
    private String miasto;

    public void inicjuj()
    {
        System.out.println("Podaj imie: ");
        imie = scan.nextLine();
        System.out.println("Podaj nazwisko: ");
        nazwisko = scan.nextLine();
        System.out.println("Podaj ulice: ");
        ulica = scan.nextLine();
        System.out.println("Podaj kod: ");
        kod = scan.nextLine();
        System.out.println("Podaj miasto: ");
        miasto = scan.nextLine();
    }
    public void drukuj()
    {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Ulica: " + ulica);
        System.out.println("Kod: " + kod);
        System.out.println("Miasto: " + miasto);
    }
}
