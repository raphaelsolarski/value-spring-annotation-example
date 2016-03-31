package com.raphaelsolarski.value;

import com.raphaelsolarski.value.config.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class FooTest {

    @Autowired
    private Foo foo;

    @Test
    public void shouldReturnPropertyValue() throws Exception {
        String actual = foo.getAddress();
        String expected = "Warsaw";
        Assert.assertEquals(expected, actual);
    }

}