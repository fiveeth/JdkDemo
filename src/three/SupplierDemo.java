package three;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        getMax(() -> {
            int[] arr = {11, 22, 55, 33, 44};
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });
    }

    //获取数组的最大值
    public static void getMax(Supplier<Integer> supplier) {
        Integer max = supplier.get();
        System.out.println("数组最大值为：" + max);
    }
}
