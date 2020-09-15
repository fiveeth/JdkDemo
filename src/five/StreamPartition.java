package five;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//对流中数据进行分区(true/false)
public class StreamPartition {

    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("张三", 18, 90),
                new Student("李四", 22, 90),
                new Student("王五", 21, 80),
                new Student("刘七", 19, 80)
        );

        Map<Boolean, List<Student>> map = studentStream.collect(Collectors.partitioningBy((Student s) -> {
            return s.getScore() >= 90;
        }));
        map.forEach((k, v) -> {
            System.out.println(k + "==" + v);
        });
    }
}
