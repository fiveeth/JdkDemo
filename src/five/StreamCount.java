package five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//stream中的count方法
public class StreamCount {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张三丰", "张无忌");
        long count = list.stream().count();
        System.out.println(count);
    }
}
