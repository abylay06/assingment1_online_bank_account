public class RetailBank extends Bank {
    private final String speciality;

    public RetailBank(String name, boolean isActive, String speciality, Employee employee) {
        super(name, isActive, employee);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() + ", speciality: " + speciality);
    }
}
