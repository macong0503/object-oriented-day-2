package Text.ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* List接口：
特点：
1.有序，可重复
2.有索引，普通遍历

特有的方法：
void add(int index,E element)将指定的元素插入此列表中的指定位置（可选操作）。
E get(int index)返回此列表中指定位置的元素。
E set(int index,E element)用指定的元素（可选操作）替换此列表中指定位置的元素。
* */
public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);

        list.add(3,"abc");
        list.set(2,"cccc");
        System.out.println(list);

        //普通遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"  ");

        }
        System.out.println();
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s+"  ");
        }
        System.out.println();
        //foreach
        for (String s : list) {
            System.out.print(s+"  ");
        }
        }
    }

