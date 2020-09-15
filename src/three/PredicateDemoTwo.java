package three;

import java.util.function.Predicate;

public class PredicateDemoTwo {

    public static void main(String[] args) {
        doTest((String s1) -> {
            return s1.contains("H");
        }, (String s2) -> {
            return s2.contains("W");
        });
    }

    public static void doTest(Predicate<String> p1, Predicate<String> p2) {
        String str = "Hello World";
        //使用lambda表达式判断一个字符串既包含H也包含W
//        boolean r1 = p1.test(str);
//        boolean r2 = p2.test(str);
//        if (r1 && r2) {
//            System.out.println("字符串包含H也包含W");
//        }
        boolean r3 = p1.and(p2).test(str);
        if (r3) {
            System.out.println("字符串包含H也包含W");
        }
        //使用lambda表达式判断一个字符串包含H或包含W
        boolean r4 = p1.or(p2).test(str);
        if (r4) {
            System.out.println("字符串包含H或包含W");
        }
        //使用lambda表达式判断一个字符串不包含W
        boolean r5 = p2.negate().test("Hello");
        if(r5){
            System.out.println("字符串不包含W");
        }
    }
}
