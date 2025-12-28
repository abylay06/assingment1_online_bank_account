abstract public class Person {
    private String name;
    private int age;
    private final int id;

    protected Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getAge() {return age;}
    public String getName() {return name;}
    public int getId() {return id;}
    public void setAge(int age) {this.age = age;}
    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {return "id: " + id + ",name: " + name + ",age: " + age;}

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person p)) return false;
        return id == p.getId();
    }

    @Override
    public int hashCode() {
        return id + 7;
    }

}

