package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class au implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103307b;

    private au(TXVideoEditer tXVideoEditer, int i10) {
        this.f103306a = tXVideoEditer;
        this.f103307b = i10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10) {
        return new au(tXVideoEditer, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setProfile$3(this.f103306a, this.f103307b);
    }
}
