public class Bank {
    private String name;
    private boolean isActive;

    public Bank(String name, boolean isActive)
    {
        this.name = name;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void cusAccountMatch(Customer c, BankAccount b) {
        if (c.getId() == b.getId() && isActive)
        {
            System.out.println("Customer " +c.getName() + " and account match. Cash: " + b.getCash() + " dollars.");
        }
        else {
            System.out.println("Customer and account do not match or bank is not active.");
        }
    }


}
