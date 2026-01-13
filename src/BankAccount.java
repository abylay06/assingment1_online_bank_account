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
    abstract public double getInterest();


    @Override
    public String toString() {return "id: " + id  + ",cash: " + cash;}

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person p)) return false;
        return id == p.getId();
    }

    @Override
    public int hashCode() {
        return id + 7;
    }
}
