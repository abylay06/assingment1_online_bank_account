public class Customer {
    private int age;
    private String name;
    private int id;

    public Customer(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", age: " + age + " id: " + id);
    }
}
