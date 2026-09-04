package com.alipay.zoloz.android.phone.mrpc.core;

import android.os.Looper;

/* JADX INFO: compiled from: ThreadUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class x {
    public static boolean a() {
        return Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }
}
