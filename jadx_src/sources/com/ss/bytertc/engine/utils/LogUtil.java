package com.ss.bytertc.engine.utils;

import android.content.Context;
import androidx.compose.animation.core.s0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class LogUtil {
    private static final String DEBUG_LEVEL = "DEBUG";
    public static final String DIR_TAIL = "logs";
    private static final String ERROR_LEVEL = "ERROR";
    private static final String INFO_LEVEL = "INFO";
    private static final String LOG_TAG = "ByteRTC";
    private static final String WARN_LEVEL = "WARNING";
    private static AtomicReference<ILoggerSink> sLoggerSink = new AtomicReference<>();
    private static String sDeviceID = null;
    private static LogLevel sLogLevel = LogLevel.LOG_LEVEL_INFO;
    private static String sLogDir = null;

    public interface ILoggerSink {
        void onLoggerMessage(LogLevel logLevel, String str, Throwable th2);
    }

    public enum LogLevel {
        LOG_LEVEL_TRACE,
        LOG_LEVEL_DEBUG,
        LOG_LEVEL_INFO,
        LOG_LEVEL_WARNING,
        LOG_LEVEL_ERROR
    }

    public static void d(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_DEBUG;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), null);
        }
    }

    public static void e(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_ERROR;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), null);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_ERROR;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), th2);
        }
    }

    public static String getDeviceID() {
        return sDeviceID;
    }

    public static String getLogDir(Context context) {
        String str = sLogDir;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getExternalFilesDir(null));
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("RTCEngine");
        sb2.append(str2);
        sb2.append("Log");
        sb2.append(str2);
        sb2.append(DIR_TAIL);
        String string = sb2.toString();
        sLogDir = string;
        return string;
    }

    public static LogLevel getLogLevel() {
        return sLogLevel;
    }

    private static ILoggerSink getLoggerSink() {
        return sLoggerSink.get();
    }

    public static void i(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_INFO;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), null);
        }
    }

    private static void notifyLoggerSinks(LogLevel logLevel, String str, Throwable th2) {
        ILoggerSink loggerSink;
        if (sLoggerSink == null || (loggerSink = getLoggerSink()) == null) {
            return;
        }
        loggerSink.onLoggerMessage(logLevel, str, th2);
    }

    public static void setDebug(boolean z10) {
    }

    public static void setDeviceID(String str) {
        sDeviceID = str;
    }

    public static void setLogDir(String str) {
        sLogDir = str + File.separator + DIR_TAIL;
    }

    public static void setLogLevel(LogLevel logLevel) {
        sLogLevel = logLevel;
    }

    public static void setLoggerSink(ILoggerSink iLoggerSink) {
        if (iLoggerSink != null) {
            sLoggerSink.set(iLoggerSink);
        } else {
            s0.a(sLoggerSink, getLoggerSink(), null);
        }
    }

    public static void w(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_WARNING;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), null);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_WARNING;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, String.format("[%s:%s]:%s", LOG_TAG, str, String.format("[msg:%s]", str2)), th2);
        }
    }
}
