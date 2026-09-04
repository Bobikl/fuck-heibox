package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103357b;

    private bf(TXVideoEditer tXVideoEditer, float f10) {
        this.f103356a = tXVideoEditer;
        this.f103357b = f10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, float f10) {
        return new bf(tXVideoEditer, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setSpecialRatio$4(this.f103356a, this.f103357b);
    }
}
