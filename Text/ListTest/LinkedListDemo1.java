package Text.ListTest;

import java.util.LinkedList;

/*
* LinkedList集合：
特点：
1.链表结构，查询慢，增删快
2.API中包含了很多操作首尾元素的方法

特有的方法：
public void addFirst(E e)在该列表开头插入指定的元素。
public void addLast(E e)将指定的元素追加到此列表的末尾。
public E getFirst()返回此列表中的第一个元素。
public E getLast()返回此列表中的最后一个元素。
public E removeFirst()从此列表中删除并返回第一个元素。
public E removeLast()从此列表中删除并返回最后一个元素。
public void push(E e)将元素推送到由此列表表示的堆栈上。 换句话说，在该列表的前面插入元素。
此方法相当于addFirst(E) 。
public E pop()从此列表表示的堆栈中弹出一个元素。 换句话说，删除并返回此列表的第一个元素。
此方法相当于removeFirst() 。
* */
public class LinkedListDemo1 {
    public static void show1(){
        //public void addFirst(E e)在该列表开头插入指定的元素。
        //public void addLast(E e)将指定的元素追加到此列表的末尾。
        //public void push(E e)将元素推送到由此列表表示的堆栈上。 换句话说，在该列表的前面插入元素。
        //此方法相当于addFirst(E) 。
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.addFirst("wwww");
        list.push("123");
        list.addLast("com");
        System.out.println(list);
    }
    public static void show2(){
        //public E getFirst()返回此列表中的第一个元素。
        //public E getLast()返回此列表中的最后一个元素。

        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
    public static void show3(){
        //public E removeFirst()从此列表中删除并返回第一个元素。
        //public E removeLast()从此列表中删除并返回最后一个元素。
        //public E pop()从此列表表示的堆栈中弹出一个元素。 换句话说，删除并返回此列表的第一个元素。
        //此方法相当于removeFirst() 。
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.pop());
        System.out.println(list);
    }
    public static void main(String[] args) {
        //show1();
        //show2();
        show3();
    }
}
