package five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//stream中的filter方法
public class StreamFilter {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张三丰", "张无忌");
//        list.stream().filter((String s)->{
//            return s.length() == 3;
//        }).forEach((String s)->{
//            System.out.println(s);
//        });
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
