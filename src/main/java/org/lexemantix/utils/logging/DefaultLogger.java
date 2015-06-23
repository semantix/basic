package org.lexemantix.utils.logging;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Logging Utility class for SLF4J working with Logback Logger
 * Created by dks02 on 6/19/15.
 */
public class DefaultLogger implements ILogger
{
    private static ch.qos.logback.classic.Logger logger_ = null;

    public String getLoggerName()
    {
        return "DefaultLogger (Logback+SLF4J)";
    }

    public ILogger createLogger(Class invokingClass)
    {
        logger_ = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(invokingClass);
        return this;
    }

    public void setLevel(Level level)
    {
        logger_.setLevel(getLevel(level));
    }

    public boolean isEnabled(Level level)
    {
        return logger_.isEnabledFor(getLevel(level));
    }

    private ch.qos.logback.classic.Level getLevel(Level level)
    {
        switch (level)
        {
            case TRACE:return ch.qos.logback.classic.Level.TRACE;
            case DEBUG:return ch.qos.logback.classic.Level.DEBUG;
            case INFO:return ch.qos.logback.classic.Level.INFO;
            case WARN:return ch.qos.logback.classic.Level.WARN;
            case ERROR:return ch.qos.logback.classic.Level.ERROR;
            case OFF:return ch.qos.logback.classic.Level.OFF;
            default:return ch.qos.logback.classic.Level.ALL;
        }
    }

    // TRACE LEVEL
    public void trace(Object obj)
    {
        logger_.trace("" + obj);
    }

    public void trace(String message)
    {
        logger_.trace(message);
    }

    public void trace(String message, Object... arguments)
    {
        logger_.trace(message, arguments);
    }

    public void trace(String message, Throwable exception)
    {
        logger_.trace(message, exception);
    }

    public void trace(Throwable exception) {
        logger_.trace(exception.getMessage(), exception);
    }

    // DEBUG LEVEL
    public void debug(Object obj)
    {
        logger_.debug("" + obj);
    }

    public void debug(String message)
    {
        logger_.debug(message);
    }

    public void debug(String message, Object... arguments)
    {
        logger_.debug(message, arguments);
    }

    public void debug(String message, Throwable exception)
    {
        logger_.debug(message, exception);
    }

    public void debug(Throwable exception)
    {
        logger_.debug(exception.getMessage(), exception);
    }

    // INFO LEVEL
    public void info(Object obj)
    {
        logger_.info("" + obj);
    }

    public void info(String message)
    {
        logger_.info(message);
    }

    public void info(String message, Object... arguments)
    {
        logger_.info(message, arguments);
    }

    public void info(String message, Throwable exception)
    {
        logger_.info(message, exception);
    }

    public void info(Throwable exception)
    {
        logger_.info(exception.getMessage(), exception);
    }

    // WARN LEVEL
    public void warn(Object obj)
    {
        logger_.warn("" + obj);
    }

    public void warn(String message)
    {
        logger_.warn(message);
    }

    public void warn(String message, Object... arguments)
    {
        logger_.warn(message, arguments);
    }

    public void warn(String message, Throwable exception)
    {
        logger_.warn(message, exception);
    }

    public void warn(Throwable exception)
    {
        logger_.warn(exception.getMessage(), exception);
    }

    // ERROR LEVEL
    public void error(Object obj)
    {
        logger_.error("" + obj);
    }

    public void error(String message)
    {
        logger_.error(message);
    }

    public void error(String message, Object... arguments)
    {
        logger_.error(message, arguments);
    }

    public void error(String message, Throwable exception)
    {
        logger_.error(message, exception);
    }

    public void error(Throwable exception)
    {
        logger_.error(exception.getMessage(), exception);
    }
}
