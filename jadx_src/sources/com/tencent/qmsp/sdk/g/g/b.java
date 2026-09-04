package com.tencent.qmsp.sdk.g.g;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static String a(Context context) {
        if (a.f102008a) {
            return e.f102014f.a(a.a(context), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static boolean a() {
        if (a.f102008a) {
            return a.f102009b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (a.f102008a) {
            return e.f102014f.a(a.a(context), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void c(Context context) {
        a.f102009b = e.f102014f.a(a.a(context));
        a.f102008a = true;
    }
}
