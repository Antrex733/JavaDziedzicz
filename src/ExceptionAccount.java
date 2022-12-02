public class ExceptionAccount extends Exception{
    static final String komunikat = "Za male saldo";
    public ExceptionAccount()
    {
        super(komunikat);
    }
}
