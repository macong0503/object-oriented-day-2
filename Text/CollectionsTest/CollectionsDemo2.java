package Text.CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 {
    public static void main(String[] args) {


    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(9);
    list.add(7);
    list.add(8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","g","b","e");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        ArrayList<person> list2 = new ArrayList<>();
        list2.add(new person("小红",18));
        list2.add(new person("小名",19));
        list2.add(new person("小王",5));
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
