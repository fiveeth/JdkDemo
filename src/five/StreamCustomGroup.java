package five;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//对流中数据进行多级分组
public class StreamCustomGroup {

    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("张三", 18, 90),
                new Student("李四", 22, 90),
                new Student("王五", 21, 80),
                new Student("刘七", 19, 80),
                new Student("朱八", 18, 90)
        );

        //先根据年龄分组再根据分数分组
        //返回的值作为key
        Map<Integer, Map<String, List<Student>>> map = studentStream.collect(Collectors.groupingBy((Student::getAge), Collectors.groupingBy((Student s) -> {
            if (s.getScore() >= 90) {
                return "优秀";
            } else if (s.getScore() >= 80) {
                return "良好";
            } else {
                return "及格";
            }
        })));
        map.forEach((k, v) -> {
            System.out.println(k + "==" + v);
//            v.forEach((k2, v2) -> {
//                System.out.println("\t" + k2 + "==" + v2);
//            });
        });
    }
}
