public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(1, 13, "Amir");
        c.displayInfo();
        c.setAge(18);
        c.displayInfo();

        BankAccount ba = new BankAccount(1, 100 );
        ba.millionaire();
        ba.setCash(1000001);
        ba.millionaire();

        Bank b = new Bank("Kaspi", false);
        b.cusAccountMatch(c, ba);
        b.setActive(true);
        b.cusAccountMatch(c, ba);


    }
}
