package five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

//stream中的sorted方法
//1.sorted():根据元素的自然顺序排序
//2.sorted(Comparator<? super T> comparator):根据比较器指定的规则排序
public class StreamSorted {

    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1, 2, 4, 3, 0);
//        stream.sorted();
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 4, 3, 0);
        list.stream().sorted().forEach(System.out::println);
        System.out.println("------------------------------------------");
//        list.stream().sorted((Integer o1, Integer o2) -> {
//            return o2 - o1;
//        }).forEach(System.out::println);
       list.stream().sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
    }
}
