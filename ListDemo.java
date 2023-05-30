package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo {

    public static void main(String args[]) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Dileep", 150000));
        empList.add(new Employee(1, "Dileep", 120000));
        empList.add(new Employee(2, "Dhri", 100000));
        empList.add(new Employee(3, "Test", 10000));
        empList.add(new Employee(4, "John", 50000));
        empList.add(new Employee(5, "Jenny", 120000));

        empList.forEach(e -> System.out.println(e.getId() + "\t" + e.getName()));

        empList.removeIf(e -> e.getSalary() < 100000);

        System.out.println("------------------------------------------------");

        empList.forEach(e -> System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary()));

        empList.sort((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1);

        System.out.println("Ascending------------------------------------------------");

        empList.forEach(e -> System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary()));

        empList.sort((e1, e2) -> e1.getSalary() < e2.getSalary() ? 1 : -1);

        System.out.println("Decending------------------------------------------------");

        empList.forEach(e -> System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary()));


        empList.sort(Comparator.comparing(Employee::getName).thenComparingInt(Employee::getSalary));
        System.out.println("Alphabetical order name and ID wise ------------------------------------------------");
        empList.forEach(e -> System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary()));

        empList.sort((e2, e1) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Reverse Alphabetical------------------------------------------------");
        empList.forEach(e -> System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary()));

        empList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        empList.forEach(e -> System.out.println(e.getName()));


    }


}


class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}