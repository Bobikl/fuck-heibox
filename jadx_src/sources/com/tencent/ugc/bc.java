package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103325b;

    private bc(TXVideoEditer tXVideoEditer, boolean z10) {
        this.f103324a = tXVideoEditer;
        this.f103325b = z10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, boolean z10) {
        return new bc(tXVideoEditer, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setIsSplitScreen$56(this.f103324a, this.f103325b);
    }
}
