package five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//一个ArrayList结合中存储有一下数据：张无忌，赵芷若，虚竹，张三丰，张天宝，张强
//需求：1.拿到所有姓张的 2.拿到名字长度等于3 3.打印这些数据
public class StreamOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "赵芷若", "虚竹", "张三丰", "张天宝", "张强");
        //1.拿到所有姓张的
        List<String> zhangList = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                zhangList.add(name);
            }
        }
        //2.拿到名字长度等于3
        List<String> lenList = new ArrayList<>();
        for (String name : zhangList) {
            if (name.length() == 3) {
                lenList.add(name);
            }
        }
        //3.打印这些数据
        for (String name : lenList) {
            System.out.println(name);
        }
        System.out.println("------------------------------");
        //采取流的方式
        list.stream().filter((String s) -> {
            return s.startsWith("张");
        }).filter((String s) -> {
            return s.length() == 3;
        }).forEach((String s) -> {
            System.out.println(s);
        });
    }
}
