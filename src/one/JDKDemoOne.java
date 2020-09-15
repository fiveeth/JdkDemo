package one;

public class JDKDemoOne {

    public static void main(String[] args) {
        //匿名内部类
        //1 大括号 -》 {@Override public void run() {}}定义了一个没有名字的类
        //2 Runnable -》 这个类实现了Runnable接口
        //3 new -》 创建了这个类的对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是匿名内部类");
            }
        }).start();
        System.out.println("*************************************");
        //无返回的lambda
        //lambda表达式的格式：(参数列表)—>{}
        //lambda表达式相当于是对接口抽象方法的重写
        new Thread(() -> {
            System.out.println("这是lambda");
        }).start();
    }
}
