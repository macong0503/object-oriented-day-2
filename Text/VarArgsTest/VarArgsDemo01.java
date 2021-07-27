package Text.VarArgsTest;
/*
* 在JDK1.5之后，如果我们定义一个方法需要接受多个参数，
并且多个参数类型一致，我们可以对其简化成如下格 式：
修饰符 返回值类型 方法名(参数类型... 形参名){ }

可变参数底层是一个数组
注意事项：
1)可变参数在参数列表中只能有一个
2)如果参数列表有多个参数的时候，可变参数必须放在参数列表的末尾
* */
public class VarArgsDemo01 {
    //可变参
    public static int add(int...arr){
        System.out.println(arr.length);
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public static int add1(double a,int...arr){
        int sum = 0;
        sum = (int) (a+sum);
        for (int i : arr) {
            sum+=i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = add(10,20,50);
        System.out.println(sum);
        System.out.println(add1(2.0, 1, 2, 3, 4, 5, 6));
    }
}
