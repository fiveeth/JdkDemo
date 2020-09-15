package seven;

import java.util.Optional;

public class OptionalDemo2 {

    public static void main(String[] args) {
        Optional<String> op = Optional.of("AA");
        Optional<String> op2 = Optional.empty();

        //orElse: 有值则取出具体的值，无值则返回参数的值
        String str1 = op.orElse("BB"); //AA
        System.out.println(str1);
        String str2 = op2.orElse("BB");//BB
        System.out.println(str2);

        //ifPresent: 如果有值就调用参数，没有值就啥也不干
        op.ifPresent((String s) -> {
            System.out.println(s);
        });
        op2.ifPresent((String s) -> {
            System.out.println(s);
        });

        User user = new User("mike", 18);
        String s = toUpperCase(user);
        System.out.println(s);

        Optional<User> userOp = Optional.of(user);
        String s1 = toUpperCase2(userOp);
        System.out.println(s1);
    }

    //传统方式
    public static String toUpperCase(User user) {
        if (user != null) {
            String name = user.getName();
            if (name != null) {
                return name.toUpperCase();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    //传统方式
    public static String toUpperCase2(Optional<User> optional) {
//        String aNull = optional.map(u -> u.getName()).map(s -> s.toUpperCase()).orElse("null");
        String aNull = optional.map(User::getName).map(String::toUpperCase).orElse("null");
        return aNull;

    }
}
