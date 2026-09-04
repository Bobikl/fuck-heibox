package com.tencent.open.log;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Tracer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f101099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f101100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f101101c;

    public Tracer() {
        this(c.f101123a, true, g.f101144a);
    }

    public Tracer(int i10, boolean z10, g gVar) {
        this.f101099a = c.f101123a;
        this.f101100b = true;
        this.f101101c = g.f101144a;
        a(i10);
        a(z10);
        a(gVar);
    }

    public void a(int i10) {
        this.f101099a = i10;
    }

    public void a(int i10, Thread thread, long j10, String str, String str2, Throwable th2) {
        if (d() && d.a.a(this.f101099a, i10)) {
            doTrace(i10, thread, j10, str, str2, th2);
        }
    }

    public void a(g gVar) {
        this.f101101c = gVar;
    }

    public void a(boolean z10) {
        this.f101100b = z10;
    }

    public boolean d() {
        return this.f101100b;
    }

    protected abstract void doTrace(int i10, Thread thread, long j10, String str, String str2, Throwable th2);

    public g e() {
        return this.f101101c;
    }
}
