package five;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//stream中的collect方法（收集流中数据到集合中）
public class StreamCollect {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c", "b");
        //收集流中数据到集合中
//        List<String> list = stream.collect(Collectors.toList());
//        System.out.println("list: " + list);
//        Set<String> set = stream.collect(Collectors.toSet());
//        System.out.println("set: " + set);
        //收集到指定的集合中，例如ArrayList
//        ArrayList<String> collect = stream.collect(Collectors.toCollection(ArrayList::new));
//        System.out.println("ArrayList: " + collect);
        //收集到指定的集合中，例如HashSet
        HashSet<String> collect = stream.collect(Collectors.toCollection(HashSet::new));
        System.out.println("ArrayList: " + collect);
    }
}
