public class Employee extends Person {

    private String role;

    public Employee (int id, String name, int age, String role) {
        super(id, name, age);
        this.role = role;
    }

    public String getRole() {return role;}
    public void setRole(String role) {this.role = role;}

    @Override
    public void myIntro() {System.out.println("My name is " + this.getName() + "and my role is " + role);}
}
