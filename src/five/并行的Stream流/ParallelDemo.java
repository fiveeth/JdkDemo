package five.并行的Stream流;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.LongStream;

//并行和串行流的效率对比
public class ParallelDemo {
    long times = 500000000;
    long start;

    @Before
    public void init() {
        start = System.currentTimeMillis();
    }

    @After
    public void destory() {
        long end = System.currentTimeMillis();
        System.out.println("耗费时长(ms)：" + (end - start));
    }

    //使用for循环：耗费时长(ms)：272
    @Test
    public void testFor() {
        int sum = 0;
        for (int i = 0; i < times; i++) {
            sum += i;
        }
    }

    //串行的stream：耗费时长(ms)：235
    @Test
    public void testStream() {
//        LongStream.rangeClosed(0, times).reduce(0, (a,  b) -> {
//            return Long.sum(a, b);
//        });
        LongStream.rangeClosed(0, times).reduce(0, Long::sum);
    }

    //并行的stream：耗费时长(ms)：109
    @Test
    public void testParallel() {
        LongStream.rangeClosed(0, times).parallel().reduce(0, Long::sum);
    }
}
