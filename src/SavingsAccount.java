public class SavingsAccount extends BankAccount {
    private final double interest = 1.05;

    SavingsAccount(int id, int cash) {
        super(id, cash);
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public void setInterestReturn() {
       this.setCash(this.getCash() * interest);

    }

    @Override
    public String toString() {return("id: " + this.getId() + ", cash: " + this.getCash());}
}
