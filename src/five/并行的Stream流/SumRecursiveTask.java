package five.并行的Stream流;

import java.util.concurrent.RecursiveTask;

//例子：1-10000 数量大于3000个就拆分（参考案例图）
//ForkJoinTask与一般的任务的主要区别在于它需要实现compute方法，在这个方法里，首先需要判断任务是否足够小，
//如果足够小就直接执行任务。如果不足够小，就必须分割成两个子任务，每个子任务在调用fork方法时，又会进入compute方法，
//看看当前子任务是否需要继续分割成孙任务，如果不需要继续分割，则执行当前子任务并返回结果。使用join方法会等待子任务执行完并得到其结果。
public class SumRecursiveTask extends RecursiveTask<Long> {
    //是否要拆分的临界值(阈值)
    private static final long THRESHOLD = 3000L;
    //起始值
    private final long start;
    //结束值
    private final long end;

    public SumRecursiveTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;
        if (length < THRESHOLD) {
            //计算
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            //如果任务大于阀值，就分裂成两个子任务计算
            long middle = (start + end) / 2;
            SumRecursiveTask left = new SumRecursiveTask(start, middle);
            SumRecursiveTask right = new SumRecursiveTask(middle + 1, end);
            //执行子任务
            left.fork();
            right.fork();
            //合并子任务
            return left.join() + right.join();
        }
    }
}
