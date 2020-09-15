package five;

import java.util.stream.Stream;

//reduce: 可以用来求和操作，也可以取最大值
public class StreamReduce {

    public static void main(String[] args) {
        //求和
        Stream<Integer> stream = Stream.of(1, 5, 3, 4, 6, 2);
        //以这个为例：T reduce(T identity, BinaryOperator<T> accumulator)
        //T identity：默认值
        //BinaryOperator<T> accumulator：对数据进行处理的方式
        //reduce的执行顺序：
        //第一次，将默认值赋值给x，取出集合的第一个元素赋值给y
        //第二次，将上一次返回的结果赋值给x，取出集合的第二个元素赋值给y
        //第三次，将上一次返回的结果赋值给x，取出集合的第三个元素赋值给y
        //第四次，将上一次返回的结果赋值给x，取出集合的第四个元素赋值给y
        //第五次，将上一次返回的结果赋值给x，取出集合的第五个元素赋值给y
        //第六次，将上一次返回的结果赋值给x，取出集合的第六个元素赋值给y
        int reduce = stream.reduce(0, (x, y) -> {
            System.out.println("x：" + x + ",y：" + y);
            return x + y;
        });
        System.out.println("reduce: " + reduce);

        //取最大值
        Stream<Integer> stream1 = Stream.of(1, 5, 3, 4, 6, 2);
        Integer max = stream1.reduce(0, (x, y) -> x > y ? x : y);
        System.out.println("max：" + max);
    }
}
