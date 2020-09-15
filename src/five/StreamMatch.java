package five;

import java.util.stream.Stream;

//stream中的match方法(判断数据是否匹配指定的条件)
public class StreamMatch {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        //allMatch: 所有元素都满足才返回true
//        boolean result = stream.allMatch((Integer arg) -> {
//            return arg > 1;
//        });
//        boolean result = stream.allMatch(arg -> arg > 0);
        //anyMatch: 其中有一个元素满足就返回true
//        boolean result = stream.anyMatch(arg -> arg > 3);
        //noneMatch: 所有元素都不满足时返回true
        boolean result = stream.noneMatch(arg -> arg > 5);
        System.out.println(result);
    }
}
