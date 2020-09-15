package two;

public class JDKDemoTwo {

    public static void main(String[] args) {
        //1 无参数无返回值
        //匿名内部类
//        goSwimming(new Swimming() {
//            @Override
//            public void goSwimming() {
//                System.out.println("匿名内部类去游泳");
//            }
//        });
        //lambda
        goSwimming(() -> {
            System.out.println("lambda去游泳");
        });

        //2 有参数有返回值
        //匿名内部类
//        goSmoking(new SmokeAble() {
//            @Override
//            public int smoking(String name) {
//                System.out.println("匿名内部类去抽" + name + "烟");
//                return 1;
//            }
//        });
        //lambda
//        goSmoking((String name) -> {
//            System.out.println("lambda去抽" + name + "烟");
//            return 2;
//        });
    }

    public static void goSwimming(Swimming s) {
        s.goSwimming();
    }

    public static void goSmoking(SmokeAble s) {
        int i = s.smoking("中华");
        System.out.println("返回值：" + i);
    }
}
