package four;

import java.util.Date;
import java.util.function.Supplier;

//对象名::实例方法
//注意： 方法引用注意事项：1 被引用的方法，参数要和接口中抽象方法的参数一样（看下方例子：Date的getTime()跟Supplier的get()方法参数一样）
//                    2 当接口抽象方法有返回值时，被引用的方法也必须有返回值（看下方例子：Date的getTime()跟Supplier的get()返回值一样）
public class MethodRefIntroOne {
    public static void main(String[] args) {
        Date now = new Date();
//        Supplier<Long> sup = () -> {
//            return now.getTime();
//        };

        Supplier<Long> sup = now::getTime;
        Long dtfTime = sup.get();
        System.out.println("当前时间：" + dtfTime);
    }
}
