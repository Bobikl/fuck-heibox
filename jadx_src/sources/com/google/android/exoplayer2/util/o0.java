package com.google.android.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: compiled from: TraceUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o0 {
    private o0() {
    }

    public static void a(String str) {
        if (u0.f51536a >= 18) {
            b(str);
        }
    }

    @androidx.annotation.w0(18)
    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (u0.f51536a >= 18) {
            d();
        }
    }

    @androidx.annotation.w0(18)
    private static void d() {
        Trace.endSection();
    }
}
