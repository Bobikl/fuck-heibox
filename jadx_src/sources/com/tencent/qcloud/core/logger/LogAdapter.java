package com.tencent.qcloud.core.logger;

import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public interface LogAdapter {
    boolean isLoggable(int i10, @p0 String str);

    void log(int i10, @n0 String str, @n0 String str2, @p0 Throwable th2);
}
