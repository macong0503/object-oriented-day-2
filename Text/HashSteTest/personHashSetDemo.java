package Text.HashSteTest;

import java.util.HashSet;

public class personHashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女", 8);
        Person p2 = new Person("小美女", 18);
        Person p3 = new Person("小美女", 8);
        set.add(p1);
        set.add(p2);
        set.add(p3);

        for (Person p : set) {
            System.out.println(p.getName()+"-"+p.getAge());
        }
    }

}
