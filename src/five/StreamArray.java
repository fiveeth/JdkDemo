package five;

import java.util.stream.Stream;

//stream中的toArray方法（收集流中数据到数组中）
public class StreamArray {

    public static void main(String[] args) {
        Stream<String> a = Stream.of("a", "b", "c");
        //toArray() -> Object操作起来不方便
//        Object[] objects = a.toArray();
//        for (Object object : objects) {
//            System.out.println(object);
//        }
        //toArray(IntFunction<A[]> generator) -> 指定类型，操作数据较方便
//        String[] strings = a.toArray((int arg)->{
//            return new String[arg];
//        });
        String[] strings = a.toArray(String[]::new);
        for (String string : strings) {
            System.out.println(string.length());
        }

    }
}
