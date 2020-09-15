package four;

import java.util.Arrays;
import java.util.function.Function;

public class MethodRefIntroFive {

    public static void main(String[] args) {
//        Function<Integer, String[]> fun = (Integer arg) -> {
//            return new String[arg];
//        };
        Function<Integer, String[]> fun = String[]::new;
        String[] arr = fun.apply(10);
        System.out.println(Arrays.toString(arr));
    }
}
