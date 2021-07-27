package HomeWork.Practice9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//ArrayList集合中有如下内容： {33,11,77,55}，
// 使用Collections.sort()对ArrayList集合中的数据进行排序，并打印出排序后的结果。
public class Demo9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        System.out.println("排序前："+list);
        Collections.sort(list);
        System.out.println("排序后："+list);
    }
}
