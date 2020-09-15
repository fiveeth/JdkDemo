package three;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        toLowerCase(s -> {
            s = s.toLowerCase();
            System.out.println(s);
        });
    }

    public static void toLowerCase(Consumer<String> consumer) {
        consumer.accept("AsdFGh");
    }
}
