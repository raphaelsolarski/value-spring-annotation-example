package com.raphaelsolarski.value;

import com.raphaelsolarski.value.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static App app = new App();

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        Foo foo = (Foo) ac.getBean("foo");
        System.out.println(foo.getAddress());
    }
}
