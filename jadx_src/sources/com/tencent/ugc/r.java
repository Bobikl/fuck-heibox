package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103792b;

    private r(TXVideoEditer tXVideoEditer, int i10) {
        this.f103791a = tXVideoEditer;
        this.f103792b = i10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10) {
        return new r(tXVideoEditer, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setRenderRotation$21(this.f103791a, this.f103792b);
    }
}
