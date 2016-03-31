package com.raphaelsolarski.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:foo.properties")
public class Foo {

    @Value("${address}")
    private String address;

    public String getAddress() {
        return address;
    }

}
