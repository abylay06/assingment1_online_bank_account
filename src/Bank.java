abstract public class Bank {
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

    abstract public void displayInfo();


}
