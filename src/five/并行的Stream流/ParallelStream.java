package five.并行的Stream流;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

//获取并行stream流的两种方式
//方式一:直接获取并行的stream流
//方式二:将串行流转成并行流
public class ParallelStream {

    public static void main(String[] args) {
        //这是串行stream流的获取方式Stream.of(..)/集合的stream()
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
//        stream.filter((Integer num) -> {
//            System.out.println(num + "::" + Thread.currentThread());
//            return num > 3;
//        }).count();

        //获取并行stream流的两种方式
        List<String> list = new ArrayList<>();
        //方式一:直接获取并行的stream流
        Stream<String> parallel1 = list.parallelStream();
        //方式二:将串行流转成并行流
        Stream<String> parallel2 = list.stream().parallel();

        Collections.addAll(list, "aabb", "aacc", "bbcc");
        parallel2.filter((String s) -> {
            System.out.println(s + "::" + Thread.currentThread());
            return s.contains("aa");
        }).count();
    }
}

