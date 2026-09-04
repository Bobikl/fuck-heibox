package com.ss.android.ttvecamera;

import android.os.Trace;

/* JADX INFO: compiled from: TETraceUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f97837a = false;

    public static void a(String str) {
        if (f97837a) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (f97837a) {
            Trace.endSection();
        }
    }

    public static synchronized void c(boolean z10) {
        f97837a = z10;
    }
}
