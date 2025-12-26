public class Customer extends Person {

    private int accounts;

    public Customer(int id, String name, int age, int accounts) {
        super(id, name, age);
        this.accounts = accounts;
    }

    public int getAccounts() {return accounts;}
    public void setAccounts(int accounts) {this.accounts = accounts;}

    @Override
    public void myIntro() {System.out.println("My anme is: " + this.getName() + "and I have " + accounts + "bank accounts.");}
}
