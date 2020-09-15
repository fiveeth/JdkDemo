package five;

import four.Person;

import java.util.stream.Stream;

//stream流的map和reduce组合使用
public class StreamMapAndReduce {

    public static void main(String[] args) {

        //求出所有年龄的总和
        //1得到所有的年龄
        //2所有年龄相加
        Stream<Person> stream = Stream.of(new Person("张三", 20), new Person("李四", 30), new Person("王五", 10));
//        Integer totalAge = stream.map((Person p) -> {
//            return p.getAge();
//        }).reduce(0, (Integer x, Integer y) -> {
//            return Integer.sum(x, y);
//        });
        Integer totalAge = stream.map(Person::getAge).reduce(0, Integer::sum);
        System.out.println("totalAge: " + totalAge);

        //找出最大年龄
        //1得到所有的年龄
        //2找出最大的年龄
        Stream<Person> stream1 = Stream.of(new Person("张三", 20), new Person("李四", 30), new Person("王五", 10));
//        Integer max = stream1.map((Person p) -> {
//            return p.getAge();
//        }).reduce(0, (Integer x, Integer y) -> {
//            return Integer.max(x, y);
//        });
        Integer max = stream1.map(Person::getAge).reduce(0, Integer::max);
        System.out.println("max: " + max);

        //统计a出现的次数
        Stream<String> stream2 = Stream.of("a", "b", "c", "d", "a", "e", "a");
        //使用filter
//        long count = stream2.filter((String str) -> {
//            return str == "a";
//        }).count();
        //使用map+reduce
        Integer count = stream2.map((String s) -> {
            if ("a" == s) {
                return 1;
            } else {
                return 0;
            }
        }).reduce(0, Integer::sum);
        System.out.println("count: " + count);
    }
}
