package org.lexemantix.utils.logging;

import junit.framework.TestCase;

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

    public void testTrace1() throws Exception {

    }

    public void testTrace2() throws Exception {

    }

    public void testTrace3() throws Exception {

    }

    public void testTrace4() throws Exception {

    }

    public void testDebug() throws Exception {

    }

    public void testDebug1() throws Exception {

    }

    public void testDebug2() throws Exception {

    }

    public void testDebug3() throws Exception {

    }

    public void testDebug4() throws Exception {

    }
}