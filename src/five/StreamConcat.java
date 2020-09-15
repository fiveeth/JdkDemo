package five;

import java.util.stream.Stream;

//stream流的静态方法concat：将两个流合并成一个流
public class StreamConcat {

    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("张三");
        Stream<String> streamB = Stream.of("李四");
        Stream<String> stream = Stream.concat(streamA, streamB);
        //流合并之后，不能再操作之前的流
        //streamA.forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
