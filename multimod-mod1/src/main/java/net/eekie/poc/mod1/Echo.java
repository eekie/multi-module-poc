package net.eekie.poc.mod1;

/**
 * Echo class with multiple echo methods which we will tested in different ways (unit/integration-test)
 * to verify sonar is properly configured.
 */
public class Echo {

    String echo(String text) {
        return text;
    }

    String echo2(String text) {
        return text;
    }

    /**
     * For testing with failsafe IT from module 3.
     * @param text the text to echo
     * @return the same as text
     */
    public String echo3(String text) {
        return text;
    }

}
