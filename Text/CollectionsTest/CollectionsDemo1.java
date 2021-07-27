package Text.CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------");
        Collections.shuffle(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
