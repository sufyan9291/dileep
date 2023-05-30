package collection;

import java.util.*;

public class EqualHashcodeDemo {
    public static void main(String[] args) {
        Map<Student, String> sMap = new HashMap<>();
        Student s1 = new Student(1, "Dileep");
        Student s2 = new Student(1, "Dileep");
        sMap.put(s1, "Pass");
        sMap.put(s2, "Fail");

        sMap.forEach((s, v) -> System.out.println(s.getName() + "\t" + v));

        Set<Student> sSet = new HashSet<>();

        sSet.add(s1);
        sSet.add(s2);

        sSet.forEach(s -> System.out.println(s.getName()));


    }
}

class Student {
    int rollNum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNum() == student.getRollNum() &&
                getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNum(), getName());
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Student(int rollNumber, String Name) {
        this.rollNum = rollNumber;
        this.name = Name;
    }
}
