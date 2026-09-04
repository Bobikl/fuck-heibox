package com.apm.lite.i;

import android.content.Context;
import android.os.Handler;
import com.apm.lite.e;
import com.apm.lite.runtime.m;
import com.apm.lite.runtime.p;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b extends com.apm.lite.i.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Runnable f39971e = new a();

    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.b().a().removeCallbacks(this);
            m.b().e(new b(m.b().a(), 0L, 30000L, e.m()));
        }
    }

    public b(Handler handler, long j10, long j11, Context context) {
        super(handler, j10, j11);
    }

    public static void e() {
        m.b().f(f39971e, 100L);
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, Object> mapD;
        try {
            mapD = e.a().d();
        } catch (Throwable unused) {
            mapD = null;
        }
        try {
            p.b().f(mapD, com.apm.lite.d.b.j());
        } catch (Throwable unused2) {
        }
    }
}
