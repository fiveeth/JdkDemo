package seven;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        //1.创建Optional对象
        //of: 只能传入一个具体值，不能传入null
        //ofNullable: 能传入具体值，也能传入null
        //empty: 存入的是null
        Optional<String> op1 = Optional.of("A");
//        Optional<String> op1 = Optional.of(null);
//        Optional<String> op2 = Optional.ofNullable("A");
        Optional<String> op2 = Optional.ofNullable(null);
//        Optional<Object> op3 = Optional.empty();
//        System.out.println(op3);

        //2.判断Optional中是否有具体值,有值返回true,无值返回false
        boolean present = op1.isPresent();
        System.out.println(present);

        //3.获取Optional的值,有值返回具体值,无值报空指针异常
//        String s = op2.get();
//        System.out.println(s);
        if (op2.isPresent()) {
            System.out.println("值为: " + op2.get());
        } else {
            System.out.println("没有值");
        }


    }
}
