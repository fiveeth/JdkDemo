package five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//stream中的skip方法(跳过X个元素，截取后面的元素)
public class StreamSkip {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张三丰", "张无忌");
//        list.stream().skip(2).forEach((String s)->{
//            System.out.println(s);
//        });
        list.stream().skip(2).forEach(System.out::println);
    }
}
