package StaticTest;

/**
 * This program demonstrates static methods
 * @version 1.01 2017-11-19
 * @author Emma
 * */

public class StaticTest {
    public static void main(String args[]) {
        Employee [] staff = new Employee[3];

        staff[0] = new Employee("Tom", 4000);
        staff[1] = new Employee("Emma", 3000);
        staff[2] = new Employee("Tony", 6000);

        for(Employee e : staff) {
            e.setId(1);
            System.out.println("name=" + e.getName() + "; id=" + e.getId() + "; salary=" + e.getSalary());

        }

        int n = Employee.getNextId(); // static method can only be used by class it is abstract, not real
        System.out.println("Next available id="+ n);  // 4

    }
}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    // setters and getters funs
    public void setId(int id) {
        this.id = nextId;
        nextId ++;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String args[]) {
        Employee e = new Employee("Harry", 5000);
        System.out.println(e.getSalary());
    }
}
