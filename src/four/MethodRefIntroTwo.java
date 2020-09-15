package four;

import java.util.function.Supplier;

//类名::静态方法
public class MethodRefIntroTwo {

    public static void main(String[] args) {
//        Supplier<Long> sup = () -> {
//            return System.currentTimeMillis();
//        };
        Supplier<Long> sup = System::currentTimeMillis;
        Long now = sup.get();
        System.out.println("系统当前时间：" + now);
    }
}
