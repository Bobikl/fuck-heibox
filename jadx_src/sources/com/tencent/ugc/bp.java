package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103377b;

    private bp(TXVideoEditer tXVideoEditer, int i10) {
        this.f103376a = tXVideoEditer;
        this.f103377b = i10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10) {
        return new bp(tXVideoEditer, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103376a.handleProcessComplete(this.f103377b);
    }
}
