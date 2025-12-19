public class BankAccount {
    private int id;
    private int cash;

    public BankAccount(int id, int cash) {
        this.id = id;
        this.cash = cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public int getId() {
        return id;
    }

    public void millionaire() {
        if (cash > 1000000)
        {
            System.out.println("You are a millionaire because you have " + cash + " dollars.");
        }
        else
        {
            System.out.println("Not millionaire because has " + cash + " dollars.");
        }
    }
}
