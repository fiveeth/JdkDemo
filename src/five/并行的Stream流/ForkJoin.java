package five.并行的Stream流;

import java.util.concurrent.ForkJoinPool;

//parallelStream背后的技术(Fork/Join技术)
//Fork/Join主要包含：1线程池：ForkJoinPool 2任务对象：ForkJoinTask 3执行任务的线程：ForkJoinWorkerThread
//原理：1 分治法：Fork阶段会将大任务拆分成小任务，Join阶段会将小任务结果合并成大任务结果
//原理：2 工作窃取算法：某个线程从其他线程窃取任务来执行（窃取的任务是未被执行的任务，从后窃取）
public class ForkJoin {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        SumRecursiveTask task = new SumRecursiveTask(1, 99999999L);
        Long sum = pool.invoke(task);
        long end = System.currentTimeMillis();
        System.out.println("和：" + sum);
        System.out.println("耗费时间：" + (end - start));
    }
}
