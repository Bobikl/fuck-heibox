package com.alipay.deviceid.module.x;

import android.content.Context;

/* JADX INFO: compiled from: OpenApdidTokenStorage.java */
/* JADX INFO: loaded from: classes6.dex */
public final class bw {
    public static synchronized String a(Context context, String str) {
        return bz.a(context, "alipay_device_id_storage", "hash" + str);
    }

    public static synchronized void a() {
    }

    public static synchronized void a(Context context, String str, String str2) {
        c(context, "hash" + str, str2);
    }

    public static synchronized String b(Context context, String str) {
        return bz.a(context, "alipay_device_id_storage", "apdidtoekn" + str);
    }

    public static synchronized void b(Context context, String str, String str2) {
        c(context, "apdidtoekn" + str, str2);
    }

    private static void c(Context context, String str, String str2) {
        bz.a(context, "alipay_device_id_storage", str, str2);
    }
}
