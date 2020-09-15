package five;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

//综合案例
public class Demo {

    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        Collections.addAll(one, "张三丰", "李四同", "王五", "赵六", "郭七七", "朱八权");

        List<String> two = new ArrayList<>();
        Collections.addAll(two, "张嘉怡", "迪丽热巴", "古力娜扎", "佟丽娅", "张俪", "张宇春");
        //第一个队伍只要名字为三个字的成员姓名
        //第一个队伍筛选之后只要前三个人
//        Stream<String> oneStream = one.stream().filter((String x) -> {
//            return x.length() == 3;
//        }).limit(3);
        Stream<String> oneStream = one.stream()
                .filter(x -> x.length() == 3)
                .limit(3);
        //第二个队伍只要姓张的成员姓名
        //第二个队伍筛选之后不要前两个人
//        Stream<String> twoStream = two.stream().filter((String x) -> {
//            return x.startsWith("张");
//        }).skip(2);
        Stream<String> twoStream = two.stream()
                .filter(x -> x.startsWith("张"))
                .skip(2);
        //将两个队伍合并为一个队伍
        Stream<String> stream = Stream.concat(oneStream, twoStream);
        //根据姓名创建person对象
//        Stream<Person> personStream = stream.map((String s) -> {
//            return new Person(s);
//        });
        Stream<Person> personStream = stream.map(Person::new);
        //打印整个队伍的person对象信息
        personStream.forEach(System.out::println);
    }
}
