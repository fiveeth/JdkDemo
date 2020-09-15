package five.并行的Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//并行流的线程安全问题
public class ParallelDemo2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        IntStream.rangeClosed(1, 1000)
//                .parallel()
//                .forEach((int i) -> {
//                    list.add(i);
//                });
//        System.out.println("集合大小：" + list.size());
        //解决方案一：使用同步代码块
//        Object obj = new Object();
//        IntStream.rangeClosed(1, 1000)
//                .parallel()
//                .forEach((int i) -> {
//                    synchronized (obj){
//                        list.add(i);
//                    }
//                });
//        System.out.println("集合大小：" + list.size());
        //解决方案二：使用线程安全的集合
//        Vector<Integer> v = new Vector();
//        IntStream.rangeClosed(1, 1000)
//                .parallel()
//                .forEach((int i) -> {
//                    v.add(i);
//                });
//        System.out.println("集合大小：" + v.size());

//        List<Integer> synchronizedList = Collections.synchronizedList(list);
//        IntStream.rangeClosed(1, 1000)
//                .parallel()
//                .forEach((int i) -> {
//                    synchronizedList.add(i);
//                });
//        System.out.println("集合大小：" + synchronizedList.size());
        //解决方案三：使用stream的collect/toArray    细节：boxed方法将IntStream转成Stream<Integer>,方便操作
        List<Integer> collect = IntStream.rangeClosed(1, 1000).boxed().parallel().collect(Collectors.toList());
        System.out.println("集合大小：" + collect.size());
    }
}
