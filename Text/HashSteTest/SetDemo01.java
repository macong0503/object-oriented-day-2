package Text.HashSteTest;

import java.util.HashSet;
import java.util.Set;

/*
* set接口的特点：
1.元素不重复
2.没有索引，普通for循环不能使用

HashSet特点：
1.不允许存储重复的元素
2.没有索引，也没有带索引的方法，也不能使用普通for循环
3.是一个无序的集合，存储和取出元素顺序有可能不同
4.底层是一个哈希表（查询速度极高）
* */
public class SetDemo01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);//1 2 3
        for (Integer i : set) {
            System.out.print(i+" ");
        }

        HashSet<String> hashSet = new HashSet<>();
        String s1 = "abc";
        String s2 = "abc";

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add("重地");
        hashSet.add("通话");
        hashSet.add("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
        System.out.println("abc".hashCode());//96354

        System.out.println(hashSet);//[重地, 通话, abc]
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
