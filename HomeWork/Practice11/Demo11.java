package HomeWork.Practice11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

//十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
// 例如输入：aaaabbbcccddd，打印结果为：abcd。
public class Demo11 {
    public static void main(String[] args) {
        LinkedHashSet<Character> list = new LinkedHashSet<>();
        System.out.println("请输入字符串：");
        String s = new Scanner(System.in).next();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            Collections.addAll(list,c);
        }
        ArrayList<Character> list1 = new ArrayList<>();
        for (Character cha : list) {
            list1.add(cha);
        }
        Collections.sort(list1);
        System.out.println(list1);


    }
}
