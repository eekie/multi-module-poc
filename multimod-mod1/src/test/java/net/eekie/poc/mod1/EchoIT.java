package net.eekie.poc.mod1;

import org.junit.Assert;
import org.junit.Test;

public class EchoIT {

    @Test
    public void testEcho2() throws Exception {
        Assert.assertEquals(new Echo().echo2("Meneertje Koekepeertje"), "Meneertje Koekepeertje");
    }

}