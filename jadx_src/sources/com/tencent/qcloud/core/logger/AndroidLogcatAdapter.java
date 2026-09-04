package com.tencent.qcloud.core.logger;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLogcatAdapter implements LogAdapter {
    private int d(String str, String str2, @p0 Throwable th2) {
        return th2 == null ? Log.d(str, str2) : Log.d(str, str2, th2);
    }

    private int e(String str, String str2, @p0 Throwable th2) {
        return th2 == null ? Log.e(str, str2) : Log.e(str, str2, th2);
    }

    private int i(String str, String str2, @p0 Throwable th2) {
        return th2 == null ? Log.i(str, str2) : Log.i(str, str2, th2);
    }

    private int v(String str, String str2, @p0 Throwable th2) {
        return th2 == null ? Log.v(str, str2) : Log.v(str, str2, th2);
    }

    private int w(String str, String str2, @p0 Throwable th2) {
        return th2 == null ? Log.w(str, str2) : Log.w(str, str2, th2);
    }

    @Override // com.tencent.qcloud.core.logger.LogAdapter
    public boolean isLoggable(int i10, @p0 String str) {
        if (TextUtils.isEmpty(str) || str.length() >= 23) {
            return false;
        }
        return Log.isLoggable(str, i10);
    }

    @Override // com.tencent.qcloud.core.logger.LogAdapter
    public void log(int i10, @n0 String str, @n0 String str2, @p0 Throwable th2) {
        if (i10 == 2) {
            v(str, str2, th2);
            return;
        }
        if (i10 == 3) {
            d(str, str2, th2);
            return;
        }
        if (i10 == 4) {
            i(str, str2, th2);
        } else if (i10 == 5) {
            w(str, str2, th2);
        } else {
            if (i10 != 6) {
                return;
            }
            e(str, str2, th2);
        }
    }
}
