package org.lexemantix.utils.logging;

/**
 * Created by dks02 on 6/20/15.
 */
public class LU
{
    private static ILogger logger_ = null;

    public static void changeLogger(ILogger logger)
    {
        logger_ = logger;
    }

    public static ILogger createLogger(Class invokingClass)
    {
        if (logger_ == null)
            logger_ = new DefaultLogger();

        logger_.createLogger(invokingClass);

        return logger_;
    }

    public static boolean isEnabled(Level level) {
        return logger_.isEnabled(level);
    }

    //TRACE LEVEL
    public static void trace(Object obj) {
        logger_.trace(obj);
    }

    public static void trace(String message)
    {
        logger_.trace(message);
    }

    public static void trace(String message, Object... arguments)
    {
        logger_.trace(message, arguments);
    }

    public static void trace(final String message, final Throwable exception)
    {
        logger_.trace(message, exception);
    }

    public static void trace(Throwable exception)
    {
        logger_.trace(exception);
    }

    //DEBUG LEVEL
    public static void debug(Object obj)
    {
        logger_.debug(obj);
    }

    public static void debug(String message)
    {
        logger_.debug(message);
    }

    public static void debug(String message, Object... arguments)
    {
        logger_.debug(message, arguments);
    }

    public static void debug(final String message, final Throwable exception)
    {
        logger_.debug(message, exception);
    }

    public static void debug(Throwable exception)
    {
        logger_.debug(exception);
    }

    //INFO LEVEL
    public static void info(Object obj)
    {
        logger_.info(obj);
    }

    public static void info(String message)
    {
        logger_.info(message);
    }

    public static void info(String message, Object... arguments)
    {
        logger_.info(message, arguments);
    }

    public static void info(final String message, final Throwable exception)
    {
        logger_.info(message, exception);
    }

    public static void info(Throwable exception)
    {
        logger_.info(exception);
    }

    //WARN LEVEL
    public static void warn(Object obj)
    {
        logger_.warn(obj);
    }

    public static void warn(String message)
    {
        logger_.warn(message);
    }

    public static void warn(String message, Object... arguments)
    {
        logger_.warn(message, arguments);
    }

    public static void warn(final String message, final Throwable exception)
    {
        logger_.warn(message, exception);
    }

    public static void warn(Throwable exception)
    {
        logger_.warn(exception);
    }

    //ERROR LEVEL
    public static void error(Object obj)
    {
        logger_.error(obj);
    }

    public static void error(String message)
    {
        logger_.error(message);
    }

    public static void error(String message, Object... arguments)
    {
        logger_.error(message, arguments);
    }

    public static void error(final String message, final Throwable exception)
    {
        logger_.error(message, exception);
    }

    public static void error(Throwable exception)
    {
        logger_.error(exception);
    }
}
