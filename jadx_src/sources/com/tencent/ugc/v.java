package com.tencent.ugc;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f103865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f103866e;

    private v(TXVideoEditer tXVideoEditer, int i10, long j10, long j11, AtomicBoolean atomicBoolean) {
        this.f103862a = tXVideoEditer;
        this.f103863b = i10;
        this.f103864c = j10;
        this.f103865d = j11;
        this.f103866e = atomicBoolean;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, long j10, long j11, AtomicBoolean atomicBoolean) {
        return new v(tXVideoEditer, i10, j10, j11, atomicBoolean);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setTransitionEffect$25(this.f103862a, this.f103863b, this.f103864c, this.f103865d, this.f103866e);
    }
}
