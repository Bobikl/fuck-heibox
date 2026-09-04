package com.tencent.qmsp.oaid2;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class e0 {
    public static String a(Context context) {
        if (d0.f101582a) {
            return h0.f101596f.a(d0.a(context), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static boolean a() {
        if (d0.f101582a) {
            return d0.f101583b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (d0.f101582a) {
            return h0.f101596f.a(d0.a(context), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void c(Context context) {
        d0.f101583b = h0.f101596f.a(d0.a(context));
        d0.f101582a = true;
    }
}
