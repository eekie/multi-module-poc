package net.eekie.poc.mod1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EchoTest {

    @Test
    public void echo() throws Exception {
        Assert.assertEquals(new Echo().echo("Tom"), "Tom");
    }

}