package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private Object f52522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52523b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f52524c;

    public i0(d dVar, Object obj) {
        this.f52524c = dVar;
        this.f52522a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f52522a;
            if (this.f52523b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f52523b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f52522a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f52524c.f52492r) {
            this.f52524c.f52492r.remove(this);
        }
    }
}
