package four;

import java.util.function.BiFunction;
import java.util.function.Supplier;

//类名::new引用类的构造器
public class MethodRefIntroFour {

    public static void main(String[] args) {
//        Supplier<Person> sup = () -> {
//            return new Person();
//        };
        Supplier<Person> sup = Person::new;
        Person person = sup.get();
        System.out.println(person);

//        BiFunction<String,Integer,Person> bFun = (String arg1,Integer arg2)->{
//            return new Person(arg1,arg2);
//        };
        BiFunction<String,Integer,Person> bFun = Person::new;
        Person person1 = bFun.apply("张三", 20);
        System.out.println(person1);
    }
}
