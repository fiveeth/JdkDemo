package five;

import java.util.Optional;
import java.util.stream.Stream;

//stream中的find方法(查找元素)
//findFirst和findAny都是返回第一个元素
//findAny是为了更高效的性能。如果是数据较少，串行地情况下，一般会返回第一个结果，如果是并行的情况，那就不能确保是第一个
public class StreamFind {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
//        Optional<Integer> first = stream.findFirst();
//        System.out.println("first: "+first.get());
        Optional<Integer> any = stream.findAny();
        System.out.println("any: "+any.get());
    }
}
