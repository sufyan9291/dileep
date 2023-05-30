import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SwapNumber {

    public static void main(String args[]) {

        Employee emp = new Employee();
        int x = 3;
        int y = 6;

        swap(x, y);

        System.out.println("Swaped Number " + x + " " + y);

        emp.setName("Dileep");
        emp.setId(11);

        m1(emp);

        //System.out.println("Id :" + emp.getId() + " name :" + emp.getName());

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.setId(2);
        emp2.setId(2);
        emp1.setName("Dileep");
        emp2.setName("Dileep");

        Set<Employee> empSet = new HashSet<>();
        empSet.add(emp1);
        empSet.add(emp2);


        empSet.forEach(e -> System.out.println(e.getId() + "\t" + e.getName()));


        System.out.println(empSet.size());


        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        emp3.setId(2);
        emp3.setAge(10);
        emp3.setName("Dileep");
        System.out.println("first hashcode ..." + emp3.hashCode());

        emp3.setId(10);
        emp3.setAge(2);
        emp3.setName("Dileep");
        System.out.println("second hashcode ..." + emp3.hashCode());
    }

    static void m1(Employee e1) {
        // Employee e1 = new Employee();

        e1.setId(12);
        e1.setName("Dhuri");

    }

    static void swap(int x, int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("Swaped Number " + x + " " + y);
    }

}

class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                age == employee.age &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }


}
