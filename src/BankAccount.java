abstract public class BankAccount {
    private int id;
    private double cash;

    public BankAccount(int id, double cash) {
        this.id = id;
        this.cash = cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public int getId() {
        return id;
    }

    abstract public void setInterestReturn();

    abstract public void displayInfo();
}
