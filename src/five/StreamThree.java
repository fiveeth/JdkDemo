package five;

import java.util.stream.Stream;

//Stream注意事项：
//1.Stream只能操作一次
//2.Stream方法返回的是新的流
//3.Stream不调用终结方法，中间的操作不会执行(终结方法：forEach/count)
public class StreamThree {

    public static void main(String[] args) {
        //1.Stream只能操作一次
        Stream<String> stream1 = Stream.of("a", "b", "c");
        long c1 = stream1.count();
        //long c2 = stream1.count(); //执行报错，stream has already been operated upon or closed

        //2.Stream方法返回的是新的流
        Stream<String> stream2 = Stream.of("a", "b", "c");
        Stream<String> stream3 = stream2.limit(1);
        System.out.println(stream2);
        System.out.println(stream3);
        System.out.println(stream2 == stream3);

        //3.Stream不调用终结方法，中间的操作不会执行
        //当没有调用终结方法时，不会执行打印操作
        Stream<String> stream4 = Stream.of("a", "b", "c");
        stream4.filter((String s) -> {
            System.out.println(s);
            return true;
        });
        //当有调用终结方法时，会执行打印操作
        Stream<String> stream5 = Stream.of("a", "b", "c");
        stream5.filter((String s) -> {
            System.out.println(s);
            return true;
        }).count();
    }
}
