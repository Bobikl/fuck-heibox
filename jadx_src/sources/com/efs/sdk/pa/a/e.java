package com.efs.sdk.pa.a;

import android.os.SystemClock;
import android.util.Printer;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements Printer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f42801f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42797b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42798c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f42799d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f42800e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Vector<d> f42796a = new Vector<>();

    e() {
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            this.f42799d = SystemClock.elapsedRealtime();
            this.f42800e = SystemClock.currentThreadTimeMillis();
            this.f42798c = str;
            this.f42797b = true;
            Iterator<d> it = this.f42796a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.f42797b && str.startsWith("<")) {
            this.f42797b = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f42799d;
            if (jElapsedRealtime > this.f42801f) {
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f42800e;
                Iterator<d> it2 = this.f42796a.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f42798c, jElapsedRealtime, jCurrentThreadTimeMillis);
                }
            }
        }
    }
}
