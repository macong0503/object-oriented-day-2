package HomeWork.Practice10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*
* 已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs =
* {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
* 将list中所有元素分别用迭代器和增强for循环打印出来。
* */
public class Demo10 {
    public static void main(String[] args) {
       String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list,strs);
        System.out.println("删除重复元素前："+list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(list.get(j));
                    --i;
                }

            }
        }
        System.out.println("删除重复元素后："+list);
        //迭代器
        System.out.println("迭代器:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s+" ");
        }
        System.out.println();
        //foreach
        System.out.println("增强for循环：");
        for (String s : list) {
            System.out.print(s+"  ");
        }
    }
}
