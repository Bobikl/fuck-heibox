package com.jd.jdcache.util;

import android.util.Log;
import androidx.annotation.Keep;
import com.jd.jdcache.JDCacheLogger;
import com.jd.jdcache.JDCacheParamsProvider;
import dl.d;
import dl.e;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: JDCacheLog.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
@Keep
public final class JDCacheLog implements JDCacheLogger {

    @d
    public static final JDCacheLog INSTANCE = new JDCacheLog();

    @d
    private static final String LOG_HYBRID = "JDCache";
    private static boolean canLog;

    @e
    private static JDCacheLogger myLogger;

    private JDCacheLog() {
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void d(@e String str) {
        if (str != null) {
            JDCacheLogger jDCacheLogger = myLogger;
            if (jDCacheLogger != null) {
                jDCacheLogger.d(str);
            } else {
                Log.d(LOG_HYBRID, str);
            }
        }
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void d(@e String str, @e String str2) {
        if (str2 != null) {
            JDCacheLogger jDCacheLogger = myLogger;
            if (jDCacheLogger != null) {
                jDCacheLogger.d(str, str2);
                return;
            }
            Log.d("JDCache-" + str, str2);
        }
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void d(@e String str, @e String str2, @e Throwable th2) {
        JDCacheLogger jDCacheLogger = myLogger;
        if (jDCacheLogger != null) {
            jDCacheLogger.d(str, str2, th2);
            return;
        }
        Log.d("JDCache-" + str, str2, th2);
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void d(@e String str, @e Throwable th2) {
        if (th2 != null) {
            JDCacheLogger jDCacheLogger = myLogger;
            if (jDCacheLogger != null) {
                jDCacheLogger.d(str, th2);
                return;
            }
            String str2 = "JDCache-" + str;
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            Log.d(str2, message);
        }
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void e(@e String str) {
        if (str != null) {
            JDCacheLogger jDCacheLogger = myLogger;
            if (jDCacheLogger != null) {
                jDCacheLogger.e(str);
            } else {
                Log.e(LOG_HYBRID, str);
            }
        }
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void e(@e String str, @e String str2) {
        if (str2 != null) {
            JDCacheLogger jDCacheLogger = myLogger;
            if (jDCacheLogger != null) {
                jDCacheLogger.e(str, str2);
                return;
            }
            Log.e("JDCache-" + str, str2);
        }
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void e(@e String str, @e String str2, @e Throwable th2) {
        JDCacheLogger jDCacheLogger = myLogger;
        if (jDCacheLogger != null) {
            jDCacheLogger.e(str, str2, th2);
            return;
        }
        Log.e("JDCache-" + str, str2, th2);
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void e(@e String str, @e Throwable th2) {
        if (th2 != null) {
            JDCacheLogger jDCacheLogger = myLogger;
            if (jDCacheLogger != null) {
                jDCacheLogger.e(str, th2);
                return;
            }
            Log.e("JDCache-" + str, th2.getMessage(), th2);
        }
    }

    public final boolean getCanLog() {
        com.jd.jdcache.c cVar = com.jd.jdcache.c.f64138a;
        if (!cVar.b()) {
            JDCacheParamsProvider jDCacheParamsProviderD = cVar.d();
            if (!(jDCacheParamsProviderD != null && jDCacheParamsProviderD.showLog())) {
                return false;
            }
        }
        return true;
    }

    @e
    public final JDCacheLogger getMyLogger() {
        return myLogger;
    }

    public final void setMyLogger(@e JDCacheLogger jDCacheLogger) {
        myLogger = jDCacheLogger;
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void w(@e String str) {
        if (str != null) {
            JDCacheLogger jDCacheLogger = myLogger;
            if (jDCacheLogger != null) {
                jDCacheLogger.w(str);
            } else {
                Log.w(LOG_HYBRID, str);
            }
        }
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void w(@e String str, @e String str2) {
        if (str2 != null) {
            JDCacheLogger jDCacheLogger = myLogger;
            if (jDCacheLogger != null) {
                jDCacheLogger.w(str, str2);
                return;
            }
            Log.w("JDCache-" + str, str2);
        }
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void w(@e String str, @e String str2, @e Throwable th2) {
        JDCacheLogger jDCacheLogger = myLogger;
        if (jDCacheLogger != null) {
            jDCacheLogger.w(str, str2, th2);
            return;
        }
        Log.w("JDCache-" + str, str2, th2);
    }

    @Override // com.jd.jdcache.JDCacheLogger
    public void w(@e String str, @e Throwable th2) {
        JDCacheLogger jDCacheLogger = myLogger;
        if (jDCacheLogger != null) {
            jDCacheLogger.w(str, th2);
            return;
        }
        Log.w("JDCache-" + str, th2);
    }
}
