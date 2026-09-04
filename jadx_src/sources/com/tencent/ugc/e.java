package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103536b;

    private e(TXVideoEditer tXVideoEditer, int i10) {
        this.f103535a = tXVideoEditer;
        this.f103536b = i10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10) {
        return new e(tXVideoEditer, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setPictureTransition$9(this.f103535a, this.f103536b);
    }
}
