package five;

import four.Person;

import java.util.stream.Stream;

//stream中的distinct方法
public class StreamDistinct {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "a", "c", "b");
        stream.distinct().forEach(System.out::println);

        //自定义的去重(重写HashCode跟equals)
        Stream<Person> personStream = Stream.of(
                new Person("张三", 20),
                new Person("张三", 20),
                new Person("李四", 20),
                new Person("李四", 20),
                new Person("王五", 20),
                new Person("王五", 20)
        );
        personStream.distinct().forEach(System.out::println);
    }
}
