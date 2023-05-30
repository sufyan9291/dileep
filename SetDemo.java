package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<Girl> set = new HashSet();
        Girl g = new Girl("Ema", 24);
        set.add(g);
        set.add(g);

        System.out.println(set.size());

    }

}

class Girl {
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
