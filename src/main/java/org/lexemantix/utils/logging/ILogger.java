package org.lexemantix.utils.logging;

/**
 * Created by dks02 on 6/20/15.
 */
public interface ILogger
{
    public String getLoggerName();

    public ILogger createLogger(Class invokingClass);

    public void setLevel(Level level);

    public boolean isEnabled(Level level);

    public void trace(final Object obj);

    public void trace(final String message);

    public void trace(final String message, final Object... arguments);

    public void trace(final String message, final Throwable exception);

    public void trace(final Throwable exception);


    public void debug(final Object obj);

    public void debug(final String message);

    public void debug(final String message, final Object... arguments);

    public void debug(final String message, final Throwable exception);

    public void debug(final Throwable exception);



    public void info(final Object obj);

    public void info(final String message);

    public void info(final String message, final Object... arguments);

    public void info(final String message, final Throwable exception);

    public void info(final Throwable exception);


    public void warn(final Object obj);

    public void warn(final String message);

    public void warn(final String message, final Object... arguments);

    public void warn(final String message, final Throwable exception);

    public void warn(final Throwable exception);


    public void error(final Object obj);

    public void error(final String message);

    public void error(final String message, final Object... arguments);

    public void error(final String message, final Throwable exception);

    public void error(final Throwable exception);
}
