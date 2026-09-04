package com.alibaba.sdk.android.httpdns.e;

import android.util.Log;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f37955t;

    /* JADX INFO: renamed from: com.alibaba.sdk.android.httpdns.e.a$a, reason: collision with other inner class name */
    public static final class C0289a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f37956a = new a();
    }

    private a() {
        try {
            Random random = new Random();
            char[] cArr = new char[12];
            for (int i10 = 0; i10 < 12; i10++) {
                cArr[i10] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62));
            }
            this.f37955t = new String(cArr);
        } catch (Exception e10) {
            Log.d("SessionTrackMgr", e10.getMessage(), e10);
        }
    }

    public static a a() {
        return C0289a.f37956a;
    }

    public String getSessionId() {
        return this.f37955t;
    }

    public String l() {
        int networkType = com.alibaba.sdk.android.httpdns.c.a.a().getNetworkType();
        if (networkType == 1) {
            return "wifi";
        }
        if (networkType == 2) {
            return "2g";
        }
        if (networkType != 3) {
            return networkType != 4 ? "unknown" : "4g";
        }
        return "3g";
    }
}
