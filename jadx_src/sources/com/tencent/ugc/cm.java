package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoJoiner.SplitScreenParam f103436b;

    private cm(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.SplitScreenParam splitScreenParam) {
        this.f103435a = tXVideoJoiner;
        this.f103436b = splitScreenParam;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, TXVideoJoiner.SplitScreenParam splitScreenParam) {
        return new cm(tXVideoJoiner, splitScreenParam);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$setSplitScreenList$10(this.f103435a, this.f103436b);
    }
}
