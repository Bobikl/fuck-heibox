package com.max.hbutils.optimize;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: GcWatcherInternal.java */
/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<b> f73455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<Runnable> f73456b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f73457c = new Object();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f73458d;

    /* JADX INFO: compiled from: GcWatcherInternal.java */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        public void finalize() throws Throwable {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.lo, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            long unused = a.f73458d = SystemClock.uptimeMillis();
            synchronized (a.f73457c) {
                ArrayList arrayList = a.f73456b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    try {
                        if (arrayList.get(i10) != null) {
                            ((Runnable) arrayList.get(i10)).run();
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                WeakReference unused2 = a.f73455a = new WeakReference(new b());
            }
        }
    }

    public static void e(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, null, changeQuickRedirect, true, bb.c.k.jo, new Class[]{Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        synchronized (f73457c) {
            f73456b.add(runnable);
            if (f73455a == null) {
                f73455a = new WeakReference<>(new b());
            }
        }
    }

    public static void f(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, null, changeQuickRedirect, true, bb.c.k.ko, new Class[]{Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        synchronized (f73457c) {
            f73456b.remove(runnable);
            if (f73456b.isEmpty()) {
                f73455a = null;
            }
        }
    }
}
