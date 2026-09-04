package com.alibaba.sdk.android.httpdns.d;

import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.h;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static int a() {
        return 0;
    }

    public static int a(Throwable th2) {
        if (th2 instanceof h) {
            return ((h) th2).getErrorCode();
        }
        return th2 instanceof SocketTimeoutException ? 10001 : 10000;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m21a(Throwable th2) {
        if (th2 == null || TextUtils.isEmpty(th2.getMessage())) {
            return th2 instanceof SocketTimeoutException ? "time out exception" : "default error";
        }
        return th2.getMessage();
    }
}
