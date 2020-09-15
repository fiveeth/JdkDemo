package four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        //方法引用
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(20);
        Collections.sort(list, Integer::compareTo);
        for (Integer num : list) {
            System.out.println("num: " + num);
        }
    }
}
