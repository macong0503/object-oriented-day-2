package HomeWork.Practice13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo13 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("wangwu", 20, 99.0f));
        list.add(new Student("liusan", 20, 90.0f));
        list.add(new Student("suliu", 22, 100.0f));
        list.add(new Student("ails", 22, 90.0f));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = (int) (o1.getFraction() - o2.getFraction());
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        for (Student student : list) {
            System.out.println(student);
        }


    }
}
