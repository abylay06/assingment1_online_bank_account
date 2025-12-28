import java.util.*;
public class Customer extends Person {

    private List<BankAccount> accounts = new ArrayList<>();

    public Customer(int id, String name, int age, BankAccount account) {
        super(id, name, age);
        this.accounts.add(account);
    }

    public void getAccounts() {for (BankAccount b : accounts) {System.out.println(b.toString());}}

    public void addAccount(BankAccount b) {accounts.add(b);}

    public void removeAccounts(BankAccount b) {accounts.remove(b);}


    @Override
    public String toString() {return("My name is: " + this.getName() + "and I have " + accounts.size() + "bank accounts.");}
}
