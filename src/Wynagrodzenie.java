import java.util.Date;
import java.text.SimpleDateFormat;

interface IWynagrodzenie {

    void wynagrodzenieDoWyplacenia(int l1, int l2);
    default void wynagrodzenieZaNadgodziny(int lgodzin, int stawka)
    {
        System.out.println("Wynagrodzenie do wypłacenie: " + lgodzin*stawka);
    }
    static void czyPremia(int lataDoswiadczenia)
    {
        if(lataDoswiadczenia > 5)
            System.out.println("Tak");
        else
            System.out.println("Tak");
    }
}
