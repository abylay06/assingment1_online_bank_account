import java.util.*;
public class Main {
    public static void main(String[] args) {

        Customer c = new Customer(1, "Amir", 18, 5);
        List<BankAccount> accounts = new ArrayList<>(List.of(
                new SavingsAccount (1, 10000000),
                new CreditAccount(2, 10000000),
                new SavingsAccount(1, 1000000),
                new CreditAccount(2, 1000000),
                new SavingsAccount(1, 10000)
        ));

        List<BankAccount> richAccounts = new ArrayList<>();

        System.out.println("Displaying the rich accounts: ");
        for (BankAccount b : accounts) {
            if (b.getCash() >= 1000000) {richAccounts.add(b); b.displayInfo(); b.setInterestReturn();}
        }

        System.out.println("finding account of the customer");
        BankAccount find = null;
        for (BankAccount b : richAccounts) {
            if (b.getId() == c.getId()) {find = b; b.displayInfo();}
        }


        for (int i = 0; i < richAccounts.size() - 2; i += 1) {
            boolean swap = false;
            for (int j = 0; j < richAccounts.size() - 2 - i; j+=1) {
                if (richAccounts.get(j).getCash() > richAccounts.get(j+1).getCash()) {
                    BankAccount temp = richAccounts.get(j);
                    richAccounts.set(j, richAccounts.get(j+1));
                    richAccounts.set(j+1, temp);
                    swap = true;
                }
            }
            if (swap == false) break;
        }
        System.out.println("Sorted rich list:");
        for (BankAccount b : richAccounts) {b.displayInfo(); ;}






    }
}
