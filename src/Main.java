import java.sql.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {

       Customer c = new Customer(1, "Amir", 18, new SavingsAccount(1, 500000));
        List<BankAccount> accounts = new ArrayList<>(List.of(
                new SavingsAccount (1, 10000000),
                new CreditAccount(2, 10000000),
                new SavingsAccount(1, 1000000),
                new CreditAccount(2, 1000000),
                new SavingsAccount(1, 10000)
        ));

        try {
            InvestmentBank.number = InvestmentBank.number / 0;
        }
        catch (ArithmeticException e) {e.printStackTrace();}
        finally {System.out.println("Division by zero caught successfully\n");}

        List<BankAccount> richAccounts = new ArrayList<>();

        System.out.println("Displaying the rich accounts:\n ");
        for (BankAccount b : accounts) {
            if (b.getCash() >= 1000000) {richAccounts.add(b); System.out.println(b.toString()); b.setInterestReturn();}
        }


        System.out.println("\nfinding accounts of the customer\n");
        BankAccount find = null;
        for (BankAccount b : richAccounts) {
            if (b.getId() == c.getId()) {find = b; System.out.println(b.toString());}
        }


        for (int i = 0; i < richAccounts.size() - 1; i += 1) {
            boolean swap = false;
            for (int j = 0; j < richAccounts.size() - 1 - i; j+=1) {
                if (richAccounts.get(j).getCash() > richAccounts.get(j+1).getCash()) {
                    BankAccount temp = richAccounts.get(j);
                    richAccounts.set(j, richAccounts.get(j+1));
                    richAccounts.set(j+1, temp);
                    swap = true;
                }
            }
            if (swap == false) break;
        }
        System.out.println("\nSorted rich list:\n");
        for (BankAccount b : richAccounts) {System.out.println(b.toString()); ;}

       System.out.println("\nDatabase code starts here:\n");

        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {System.out.println("Attempting to find posgtres driver\n");}


        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/oop3", "postgres", "0913");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO credit_accounts (id, cash) VALUES (1, 1000000), (2, 15000), (3, 2500000);" +
                    " INSERT INTO savings_accounts (id, cash) VALUES (1, 100000), (2, 1300000), (3, 19999);"
            );

            System.out.println("List of millionaires: \n");
            ResultSet rs = stmt.executeQuery("SELECT * FROM credit_accounts WHERE cash >= 1000000");
            while (rs.next()) {System.out.println(rs.getInt("id") + " " + rs.getInt("cash"));}
            rs = stmt.executeQuery("SELECT * FROM savings_accounts WHERE cash >= 1000000");
            while (rs.next()) {System.out.println(rs.getInt("id") + " " + rs.getString("cash"));}

            stmt.executeUpdate("UPDATE credit_accounts SET cash = cash + 1000000 WHERE cash < 1000000");
            stmt.executeUpdate(" UPDATE savings_accounts SET cash = cash + 1000000 WHERE cash < 1000000");
            System.out.println("\nList of millionaires after update: \n");
            rs = stmt.executeQuery("SELECT * FROM credit_accounts WHERE cash >= 1000000");
            while (rs.next()) {System.out.println(rs.getInt("id") + " " + rs.getString("cash"));}
            rs = stmt.executeQuery("SELECT * FROM savings_accounts WHERE cash >= 1000000");
            while (rs.next()) {System.out.println(rs.getInt("id") + " " + rs.getString("cash"));}

            stmt.executeUpdate("TRUNCATE TABLE savings_accounts, credit_accounts");
            rs.close();
            stmt.close();
            con.close();

        }
        catch (SQLException e) {

            e.printStackTrace();
        }




    }
}
