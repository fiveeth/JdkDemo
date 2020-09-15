package five;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//stream中的mapToInt方法: 将Stream<Integer>中的Integer数据类型转成int类型
//Integer占用的内存比int多，在Stream流操作中会自动装箱和拆箱
public class StreamMapToInt {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 3, 4, 2, 5);
        //IntStream: 内部操作的是int类型的数据，就可以节省内存，减少自动装箱和拆箱
//        IntStream intStream = stream.mapToInt((Integer x) -> {
//            return x.intValue();
//        });
        IntStream intStream = stream.mapToInt(Integer::intValue);
        intStream.filter(n -> n > 3).forEach(System.out::println);
    }
}
