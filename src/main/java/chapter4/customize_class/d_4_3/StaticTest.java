package chapter4.customize_class.d_4_3;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom",1111);
        staff[1] = new Employee("Dick",2222);
        staff[2] = new Employee("Harry",3333);
        for(Employee e : staff){
            e.setId();
            System.out.println("name = " + e.getName() + ",id = " + e.getId() + ",salary = " + e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("next available id = " + n);
    }
}
class Employee{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public static int getNextId() {
        return nextId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId++;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Harry",50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
