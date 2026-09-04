package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103361b;

    private bh(TXVideoEditer tXVideoEditer, boolean z10) {
        this.f103360a = tXVideoEditer;
        this.f103361b = z10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, boolean z10) {
        return new bh(tXVideoEditer, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103360a.mIsFullIFrame = this.f103361b;
    }
}
