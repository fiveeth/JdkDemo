package five;

import java.util.*;
import java.util.stream.Stream;

//获取流的两种方式
//1.根据Collection获取流
//2.Stream的静态方法of(..)
public class StreamTwo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap<>();
        Stream<String> stream3 = map.keySet().stream();
        Stream<String> stream4 = map.values().stream();
        Stream<Map.Entry<String, String>> stream5 = map.entrySet().stream();

        Stream<String> stream6 = Stream.of("a", "b", "c");

        String[] str = {"a", "b", "c"};
        Stream<String> stream7 = Stream.of(str);
        stream7.forEach((String s) -> {
            System.out.println(s);
        });

        //基本数据类型的数组行不行？(虽然不会报错，但是是不行的，会将整个数组看做一个元素,可以跟上面的String类型的数组对比:Stream<String>  Stream<int[]>)
        int[] arr = {1, 2, 3};
        Stream<int[]> stream8 = Stream.of(arr);
        stream8.forEach((int[] s) -> {
            System.out.println(s);
        });

//        Map<String,String> testMap = new HashMap<>();
//        testMap.put("1","1");
//        testMap.put("2","2");
//        testMap.put("3","3");
//        Set<Map.Entry<String, String>> entrySet= testMap.entrySet();
//        for (Map.Entry<String, String> stringStringEntry : entrySet) {
//            System.out.println(stringStringEntry);
//        }
    }
}
