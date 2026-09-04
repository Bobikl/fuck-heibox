package com.igexin.a.a.d;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements com.igexin.a.a.d.a.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f63218a = true;

    public void a() {
        this.f63218a = false;
    }

    @Override // com.igexin.a.a.d.a.f
    public boolean a(long j10, e eVar) {
        return TimeUnit.SECONDS.toMillis((long) eVar.f63245x) < j10 - eVar.f63243v;
    }

    @Override // com.igexin.a.a.d.a.f
    public long b(long j10, e eVar) {
        return (TimeUnit.SECONDS.toMillis(eVar.f63245x) + eVar.f63243v) - j10;
    }
}
