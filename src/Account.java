public class Account
{

    String owner, accountNumber;
    int balance;

    Account(String owner, String accountNumber, int balance)
    {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    String getOwner() { return owner;}
    String getAccountNumber() {return accountNumber;}
    int GetBalance() {return balance;}

    void getOwner(String owner) { this.owner = owner;;}
    void getAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
    void GetBalance(int balance) {this.balance = balance;}

    public void Przelew(int kwota) throws ExceptionAccount {
        if(kwota > balance)
            throw new ExceptionAccount();
        if(kwota < 0)
            throw new ArithmeticException();
        balance-=kwota;
    }
}
