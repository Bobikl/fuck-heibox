package cn.fly.verify;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fc f36447a = new fc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f36448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile fa f36449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile fa f36450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile fa f36451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f36452f = new AtomicBoolean(false);

    public static fc a(Context context) {
        if (f36447a.f36448b == null && context != null) {
            f36447a.f36448b = context.getApplicationContext();
        }
        return f36447a;
    }

    public CountDownLatch a() {
        b();
        return fd.a(this.f36448b).a();
    }

    public boolean a(fa faVar) {
        this.f36451e = faVar;
        return true;
    }

    public void b() {
        if (this.f36452f.compareAndSet(false, true)) {
            d();
            c();
            fe.a(this.f36448b);
        }
    }

    public fa c() {
        if (this.f36449c == null) {
            this.f36449c = new fi(this.f36448b);
        }
        return this.f36449c;
    }

    public fa d() {
        if (this.f36450d == null) {
            this.f36450d = new fg(this.f36448b);
        }
        return this.f36450d;
    }

    public fa e() {
        return this.f36451e == null ? c() : this.f36451e;
    }
}
