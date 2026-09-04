package com.ss.android.ttvecamera;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TECameraExceptionMonitor.java */
/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<a> f97608a;

    /* JADX INFO: compiled from: TECameraExceptionMonitor.java */
    public interface a {
        void a(Throwable th2);
    }

    public static void a(Throwable th2) {
        WeakReference<a> weakReference = f97608a;
        a aVar = weakReference == null ? null : weakReference.get();
        if (aVar != null) {
            aVar.a(th2);
        }
    }

    public static void b(a aVar) {
        f97608a = aVar == null ? null : new WeakReference<>(aVar);
    }
}
