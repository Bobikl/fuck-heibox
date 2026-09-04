package okhttp3.internal.platform.android;

import android.util.Log;
import dl.d;
import dl.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import okhttp3.z;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes5.dex */
@SuppressSignatureCheck
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0007R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "", "loggerName", "loggerTag", "logger", "tag", "Lkotlin/b2;", "enableLogging", "", "logLevel", "message", "", "t", "androidLog$okhttp", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "androidLog", "enable", "MAX_LOG_LENGTH", "I", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "configuredLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "knownLoggers", "Ljava/util/Map;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final Map<String, String> knownLoggers;
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = z.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        f0.o(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        f0.o(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        f0.o(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = s0.D0(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            f0.o(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String loggerName) {
        String str = knownLoggers.get(loggerName);
        return str != null ? str : StringsKt___StringsKt.Y8(loggerName, 23);
    }

    public final void androidLog$okhttp(@d String loggerName, int logLevel, @d String message, @e Throwable t10) {
        int iMin;
        f0.p(loggerName, "loggerName");
        f0.p(message, "message");
        String strLoggerTag = loggerTag(loggerName);
        if (Log.isLoggable(strLoggerTag, logLevel)) {
            if (t10 != null) {
                message = message + "\n" + Log.getStackTraceString(t10);
            }
            int i10 = 0;
            int length = message.length();
            while (i10 < length) {
                int iR3 = StringsKt__StringsKt.r3(message, '\n', i10, false, 4, null);
                if (iR3 == -1) {
                    iR3 = length;
                }
                while (true) {
                    iMin = Math.min(iR3, i10 + 4000);
                    String strSubstring = message.substring(i10, iMin);
                    f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(logLevel, strLoggerTag, strSubstring);
                    if (iMin >= iR3) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}
