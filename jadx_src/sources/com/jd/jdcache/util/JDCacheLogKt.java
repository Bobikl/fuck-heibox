package com.jd.jdcache.util;

import androidx.annotation.Keep;
import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: JDCacheLog.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class JDCacheLogKt {
    @Keep
    public static final void log(@d l<? super JDCacheLog, b2> block) {
        f0.p(block, "block");
        JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
        if (jDCacheLog.getCanLog()) {
            block.invoke(jDCacheLog);
        }
    }
}
