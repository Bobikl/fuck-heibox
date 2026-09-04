package com.apm.lite.j;

import android.content.Context;
import com.apm.lite.k.p;
import com.apm.lite.k.q;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.runtime.m;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f40031b;

    private h(Context context) {
        this.f40031b = context;
    }

    public static void a(Context context) {
        b(context, 0);
    }

    public static void b(Context context, int i10) {
        m.b().f(new h(context), i10);
    }

    public static boolean c() {
        return b.b().s() || !com.apm.lite.k.a.k(com.apm.lite.e.m());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.apm.lite.b.d.f();
        } catch (Throwable unused) {
        }
        try {
            if (com.apm.lite.k.a.k(this.f40031b)) {
                b.b().k(p.c(this.f40031b));
            } else {
                NativeImpl.setUploadEnd();
            }
            com.apm.lite.runtime.p.b().f(com.apm.lite.e.a().d(), com.apm.lite.d.b.j());
            if (m.b().a() == null || com.apm.lite.d.b() == null) {
            }
        } catch (Throwable th2) {
            try {
                q.g(th2);
            } finally {
                com.apm.lite.runtime.p.b().f(com.apm.lite.e.a().d(), com.apm.lite.d.b.j());
                if (m.b().a() != null && com.apm.lite.d.b() != null) {
                    com.apm.lite.i.d.a(m.b().a(), this.f40031b).b();
                }
            }
        }
    }
}
