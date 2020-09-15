package four;

import java.util.function.Consumer;

//双冒号::写法被称为方法引用
//如果lambda表达式所要实现的方案，已经有其他方法存在相同的方案，那么可以直接使用方法引用
public class MethodRefIntroDemo {

    public static void main(String[] args) {
        doTest((int[] arr) -> {
            //方法一
//            int sum = 0;
//            for (int i : arr) {
//                sum += i;
//            }
//            System.out.println(sum);
            //方法二
//            getSum(arr);
        });
        //方法三
        doTest(MethodRefIntroDemo::getSum);
    }

    public static void doTest(Consumer<int[]> consumer) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        consumer.accept(arr);
    }

    public static void getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
