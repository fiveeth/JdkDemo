package five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//stream中的forEach方法
public class StreamForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "老子", "荀子", "庄子", "孟子");
        list.stream().forEach((String s) -> {
            System.out.println(s);
        });

        //lambda表达式可以省略（当参数只有一个时，可以省略括号跟参数类型；当大括号只有一句代码时可以省略大括号）
        list.stream().forEach(s -> System.out.println(s));

        //因大括号只是调用已存在的方法且只有一句代码时，故lambda可以转为方法引用
        list.stream().forEach(System.out::println);
    }
}
