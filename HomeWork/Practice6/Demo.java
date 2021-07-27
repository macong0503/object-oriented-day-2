package HomeWork.Practice6;

import java.util.HashSet;

//六、定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，
// 姓名和年龄相同的人看做同一人不存储。
public class Demo {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("小红",18));
        hashSet.add(new Person("小王",18));
        hashSet.add(new Person("小胡",18));
        hashSet.add(new Person("小红",18));

        for (Person p : hashSet) {
            System.out.println(p);
        }
    }
}
