package net.eekie.poc.mod3;

import net.eekie.poc.mod1.Echo;
import org.junit.Assert;
import org.junit.Test;

public class EchoMod3IT {

    @Test
    public void echo3IT() {
        Assert.assertEquals(new Echo().echo3("xx"), "xx");
    }

}
