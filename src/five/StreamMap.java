package five;

import java.util.stream.Stream;

//stream中的map方法（map可以将一种类型的流转换成另一种类型的流）
public class StreamMap {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("11", "22", "33");
        //可以看到类型已经变更为Integer
//        Stream<Integer> stream1 = stream.map((String s) -> {
//            return Integer.parseInt(s);
//        });
//        stream1.forEach(System.out::println);
        stream.map(Integer::parseInt).forEach(System.out::println);
    }
}
