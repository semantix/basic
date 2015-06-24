package org.lexemantix.utils.logging;

import junit.framework.TestCase;

import java.util.Date;

/**
 * Created by dks02 on 6/23/15.
 */
public class LUTest extends TestCase
{
    public ILogger logger = LU.createLogger(this.getClass());

    public void testTrace() throws Exception
    {
        logger.trace("This is a test Trace 1");
    }

    public void testDebug() throws Exception {
        logger.debug("This is {} debug", "FIRST");
    }

    public void testWarn() throws Exception {
        logger.warn("This one has an exception", new Exception("Mock Exception"));
    }

    public void testInfo() throws Exception {
        logger.info("Testing info with integer value={}", 1000);
    }

    public void testError() throws Exception {
        logger.error("Testing error with 2 parameters int={} and date={}", 556, new Date());
    }

    public void testOff() throws Exception {
        //logger.setLevel(Level.DEBUG.OFF);
        logger.error("This should not get printed as level was set to OFF, check your code...");
    }
}