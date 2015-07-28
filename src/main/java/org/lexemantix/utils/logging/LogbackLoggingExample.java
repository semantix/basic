package org.lexemantix.utils.logging;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class LogbackLoggingExample
{
    final static Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(LogbackLoggingExample.class);

    public static void main(String[] args)
    {
        logger.trace("This is first log line.");
        logger.debug("This is first log line.");
    }
}
