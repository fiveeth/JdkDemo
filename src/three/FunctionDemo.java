package three;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        //将一个字符串转成数字
        doTest((String str) -> {
            return Integer.parseInt(str);
        });
    }

    public static void doTest(Function<String, Integer> function) {
        Integer num = function.apply("5");
        System.out.println(num);
    }
}
