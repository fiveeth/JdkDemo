package five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//stream中的limit方法（截取前几个元素）
public class StreamLimit {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张三丰", "张无忌");
//        list.stream().limit(2).forEach((String s) -> {
//            System.out.println(s);
//        });
        list.stream().limit(2).forEach(System.out::println);
    }
}
