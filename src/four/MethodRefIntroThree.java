package four;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

//类名::实例方法
//注意：实际上会将第一个参数作为方法的调用者（参考："hello"即为length()这个方法的调用者）
public class MethodRefIntroThree {
    public static void main(String[] args) {
//        Function<String, Integer> fun = (String str) -> {
//            return str.length();
//        };
        Function<String, Integer> fun = String::length;
        Integer length = fun.apply("hello");
        System.out.println("字符串长度：" + length);

//        BiFunction<String, Integer, String> bFun = (String str, Integer index) -> {
//            return str.substring(index);
//        };
        BiFunction<String, Integer, String> bFun = String::substring;
        String newStr = bFun.apply("HelloWorld", 3);
        System.out.println("截取后的字符串：" + newStr);

//        Predicate<String> predicate = (String s) -> {
//            return s.isEmpty();
//        };
        Predicate<String> predicate = String::isEmpty;
        boolean asd = predicate.test("asd");
        System.out.println(asd);
    }
}
