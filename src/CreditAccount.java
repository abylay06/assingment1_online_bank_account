
public class CreditAccount extends BankAccount {
    private final double interest = 1.01;

    CreditAccount(int id, double cash) {
        super(id, cash);
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public void setInterestReturn() {this.setCash(this.getCash() * interest); }

    @Override
    public String toString() {return("id: " + this.getId() + ", cash: " + this.getCash());}
}
