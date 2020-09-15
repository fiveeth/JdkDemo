package five;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//对流中数据进行拼接
public class StreamJoining {

    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("张三", 18, 90),
                new Student("李四", 22, 90),
                new Student("王五", 21, 80),
                new Student("刘七", 19, 80)
        );
        //直接拼接
//        String names = studentStream.map((Student::getName)).collect(Collectors.joining());
        //一个字符串拼接
//        String names = studentStream.map((Student::getName)).collect(Collectors.joining("__"));
        //三个字符串拼接
        String names = studentStream.map((Student::getName)).collect(Collectors.joining("__", ">_<", "*_*"));
        System.out.println(names);
    }
}
