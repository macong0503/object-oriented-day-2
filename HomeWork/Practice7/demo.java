package HomeWork.Practice7;

import java.util.ArrayList;
import java.util.List;

//向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。
public class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        System.out.println("替换前："+list);
        list.set(3,"王小丫");
        System.out.println("替换后"+list);
    }
}
