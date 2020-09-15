package three;

import java.util.function.Consumer;

public class ConsumerDemoTwo {
    //使用lambda表达式将一个字符串先转成小写再转成大写
    public static void main(String[] args) {
        printHello((String str) -> {
            System.out.println(str.toLowerCase());
        }, (String str) -> {
            System.out.println(str.toUpperCase());
        });
    }

    public static void printHello(Consumer<String> c1, Consumer<String> c2) {
        String str = "Hello Gyh";
//        c1.accept(str);
//        c2.accept(str);
        c1.andThen(c2).accept(str);
    }
}
