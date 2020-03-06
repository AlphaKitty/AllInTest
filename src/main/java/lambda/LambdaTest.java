package lambda;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        // lambda表达式是对接口的一种实现
        LambdaInterface consumer = s -> {
            System.out.println(s);
        };
        consumer.doSomething("123");
        doSomething(s -> System.out.println(s), "123");



    }

    // 接口实现作为参数
    public static void doSomething(LambdaInterface l, String s){
        l.doSomething(s);
    }

    // 内置的模板接口 可以减少函数式接口
    public static void checkAndExec(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person localPerson : persons) {
            if (predicate.test(localPerson))
                consumer.accept(localPerson);
        }
    }
}
