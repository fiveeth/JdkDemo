package three;

import java.util.function.Function;

public class FunctionDemoTwo {

    public static void main(String[] args) {
        //将一个字符串装成数字，并且将数字乘以5
        doTest((String str)->{
            return Integer.parseInt(str);
        },(Integer i)->{
            return i*5;
        });
    }

    public static void doTest(Function<String, Integer> f1, Function<Integer, Integer> f2) {
//        Integer n1 = f1.apply("5");
//        Integer n2 = f2.apply(n1);
        Integer n2 = f1.andThen(f2).apply("5");
        System.out.println(n2);
    }
}
