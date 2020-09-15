package five;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//对流中数据进行分组
public class StreamToGroup {

    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("张三", 18, 90),
                new Student("李四", 22, 90),
                new Student("王五", 21, 80),
                new Student("刘七", 19, 80)
        );
        //根据分数分组
        //返回的值作为key
//        Map<Integer, List<Student>> map = studentStream.collect(Collectors.groupingBy((Student s) -> {
//            return s.getScore();
//        }));
//        Map<Integer, List<Student>> map = studentStream.collect(Collectors.groupingBy(Student::getScore));
//        map.forEach((key, value) -> {
//            System.out.println("key: " + key + ", value: " + value);
//        });
        //将年龄大于20的分为一组
        Map<String, List<Student>> map = studentStream.collect(Collectors.groupingBy((Student s) -> {
            if (s.getAge() > 20) {
                return "大年轻";
            } else {
                return "小年轻";
            }
        }));
        map.forEach((key, value) -> {
            System.out.println("key: " + key + ", value: " + value);
        });
    }
}
