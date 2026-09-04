package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103403c;

    private bx(TXVideoEditer tXVideoEditer, int i10, int i11) {
        this.f103401a = tXVideoEditer;
        this.f103402b = i10;
        this.f103403c = i11;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, int i11) {
        return new bx(tXVideoEditer, i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBeautyFilter$7(this.f103401a, this.f103402b, this.f103403c);
    }
}
