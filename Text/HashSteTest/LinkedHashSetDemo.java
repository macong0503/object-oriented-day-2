package Text.HashSteTest;

import java.util.LinkedHashSet;

/*LinkedHashSet:
特点:
*底层是哈希表（数组+链表+红黑树）+链表T
LinkedHashSet:特点:
底层是哈希表（数组+链表+红黑树）+链表T
多了加的链表用来记录元素的存储顺序的，保证元素有序元素值不能重复

* */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("www");
        set.add("abc");
        set.add("cde");
        set.add("www");
        System.out.println(set);
    }
}
