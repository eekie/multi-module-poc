package net.eekie.poc.mod2;

import org.junit.Assert;
import org.junit.Test;

public class GreeterIT {

    @Test
    public void sayHello() throws Exception {
        Assert.assertEquals(new Greeter().sayHello("Tom"), "Hello Tom");
    }

}