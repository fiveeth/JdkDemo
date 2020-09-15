package two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JDKDemoTwoMore {

    public static void main(String[] args) {
        //匿名内部类
//        List<Person> list = new ArrayList<>();
//        list.add(new Person(10, "张三"));
//        list.add(new Person(20, "李四"));
//        list.add(new Person(30, "王五"));
//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o2.age - o1.age;
//            }
//        });
//        for (Person person : list) {
//            System.out.println(person.toString());
//        }

        //lambda
        List<Person> list = new ArrayList<>();
        list.add(new Person(10, "张三"));
        list.add(new Person(20, "李四"));
        list.add(new Person(30, "王五"));
        Collections.sort(list, (Person o1, Person o2) -> {
            return o1.age - o2.age;
        });
        for (Person person : list) {
            System.out.println(person.toString());
        }
    }
}
