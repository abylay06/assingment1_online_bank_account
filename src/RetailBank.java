public class RetailBank extends Bank {
    private final String speciality;

    public RetailBank(String name, boolean isActive, String speciality) {
        super(name, isActive);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + this.getName() + ", speciality: " + speciality);
    }
}
