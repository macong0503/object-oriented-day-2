package HomeWork.Practice12;

import java.util.HashSet;
import java.util.Random;

/*
* 十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
* 红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。
* （要求同色号码不重复）
* */
public class Demo12 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        Random random = new Random();
        for (int i = 1; i <= 6; i++) {
            int red = random.nextInt(33)+1;
            list.add(red);
            if (i == 6){
                if (list.size()<6){
                    --i;
                }
            }
        }
        System.out.print("红球数字为：");
        for (Integer i : list) {
            System.out.print(i+"  ");
        }
        System.out.println();
        int blue = random.nextInt(16)+1;
        System.out.print("蓝球数字为："+blue);
    }
}
