package com.igexin.push.f.b;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g extends com.igexin.a.a.d.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f64032d;

    public g(long j10) {
        this(0L, j10);
    }

    public g(long j10, long j11) {
        super(5);
        j11 = j10 > 0 ? j11 + (j10 - System.currentTimeMillis()) : j11;
        this.f64032d = j11;
        a(j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.igexin.a.a.d.e
    public final void b() throws Exception {
        super.b();
        d_();
    }

    protected abstract void d_();

    @Override // com.igexin.a.a.d.e
    protected void e() {
    }
}
