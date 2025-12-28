import java.util.*;
abstract public class Bank {
    private String name;
    private boolean isActive;
    private List<Customer> customers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Bank(String name, boolean isActive, Employee employee)
    {
        this.employees.add(employee);
        this.name = name;
        this.isActive = isActive;
    }

    public void addEmployees(Employee e) {this.employees.add(e);}

    public void removeEmployees(Employee e) {this.employees.remove(e);}

    public void addCustomers(Customer c) {this.customers.add(c);}

    public void removCustomers(Customer c) {this.customers.remove(c);}

    public void getEmployees() {
        for (Employee e : employees) {System.out.println(e.toString());}
    }

    public void getCustomers() {
        for (Customer c : customers) {System.out.println(c.toString());}
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

    @Override
    public String toString() {return ",name: " + name + ",isActive: " + isActive;}

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person p)) return false;
        return name.equals(p.getName());
    }

}
