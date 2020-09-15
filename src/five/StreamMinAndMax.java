package five;

import java.util.stream.Stream;

//min: 取第一个值
//max: 取最后一个值
public class StreamMinAndMax {

    public static void main(String[] args) {
        //获取最小值
        Stream<Integer> stream = Stream.of(2, 1, 4, 5, 3);
//        Integer minResult = stream.min((o1, o2) -> {
//            return o1 - o2;
//        }).get();
        Integer minResult = stream.min((o1, o2) -> o1 - o2).get();
        System.out.println("minResult:" + minResult);

        //获取最大值
        Stream<Integer> stream1 = Stream.of(2, 1, 4, 5, 3);
//        Integer maxResult = stream1.max((o1, o2) -> {
//            return o1 - o2;
//        }).get();
        Integer maxResult = stream1.max((o1, o2) -> o1 - o2).get();
        System.out.println("maxResult:" + maxResult);
    }
}
