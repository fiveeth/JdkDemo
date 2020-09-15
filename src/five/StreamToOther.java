package five;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//对流中数据进行聚合计算
public class StreamToOther {

    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("张三", 18, 90),
                new Student("李四", 22, 80),
                new Student("王五", 21, 95),
                new Student("刘七", 19, 85)
        );
        //取成绩最大值
//        Optional<Student> max = studentStream.max((Student o1, Student o2) -> {
//            return o1.getScore() - o2.getScore();
//        });
//        Optional<Student> max = studentStream.collect(Collectors.maxBy(((o1, o2) -> o1.getScore() - o2.getScore())));
//        System.out.println("成绩最大值: " + max.get());
        //取成绩最小值
//        Optional<Student> min = studentStream.min((Student o1, Student o2) -> {
//            return o1.getScore() - o2.getScore();
//        });
//        Optional<Student> min = studentStream.collect(Collectors.minBy(((o1, o2) -> o1.getScore() - o2.getScore())));
//        System.out.println("成绩最小值: " + min.get());
        //取成绩总和
//        Integer sum = studentStream.map((Student::getScore)).reduce(0, (x, y) -> {
//            return x + y;
//        });
//        long sum = studentStream.collect(Collectors.summarizingInt((Student s) -> {
//            return s.getScore();
//        })).getSum();
        long sum = studentStream.collect(Collectors.summarizingInt(Student::getScore)).getSum();
        System.out.println("成绩总和: " + sum);
        //取年龄平均值
//        Double avg = studentStream.collect(Collectors.averagingInt((Student s) -> {
//            return s.getAge();
//        }));
//        Double avg = studentStream.collect(Collectors.averagingInt(Student::getAge));
//        System.out.println("年龄平均值: " + avg);
        //取总数
//        long count = studentStream.count();
//        Long count = studentStream.collect(Collectors.counting());
//        System.out.println("总数: " + count);
    }
}
