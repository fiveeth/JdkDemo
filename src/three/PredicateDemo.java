package three;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        //判断一个字符串长度是否>3
        doTest((String name) -> {
            return name.length() > 3;
        });
    }

    public static void doTest(Predicate<String> predicate) {
        boolean isLong = predicate.test("郭亿华弟中弟");
        System.out.println("长度是否大于三: " + isLong);
    }
}
