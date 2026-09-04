package com.alipay.mobile.android.verify.sdk;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {
    public static void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
