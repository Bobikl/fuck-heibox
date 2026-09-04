package com.jd.jdcache;

import androidx.annotation.Keep;
import dl.e;

/* JADX INFO: compiled from: JDCacheLogger.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public interface JDCacheLogger {
    void d(@e String str);

    void d(@e String str, @e String str2);

    void d(@e String str, @e String str2, @e Throwable th2);

    void d(@e String str, @e Throwable th2);

    void e(@e String str);

    void e(@e String str, @e String str2);

    void e(@e String str, @e String str2, @e Throwable th2);

    void e(@e String str, @e Throwable th2);

    void w(@e String str);

    void w(@e String str, @e String str2);

    void w(@e String str, @e String str2, @e Throwable th2);

    void w(@e String str, @e Throwable th2);
}
