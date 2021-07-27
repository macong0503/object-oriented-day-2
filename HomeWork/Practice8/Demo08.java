package HomeWork.Practice8;

import java.util.Iterator;
import java.util.LinkedHashSet;

//使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
// 使用迭代器和增强for循环遍历LinkedHashSet。
public class Demo08 {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("王昭君");
        list.add("王昭君");
        list.add("西施");
        list.add("杨玉环");
        list.add("貂蝉");

        //迭代器
        System.out.println("迭代器遍历");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s + "  ");
        }
        System.out.println();
        //增强for循环遍历
        System.out.println("增强for循环遍历");
        for (String s : list) {
            System.out.print(s+"  ");
        }
    }
}
