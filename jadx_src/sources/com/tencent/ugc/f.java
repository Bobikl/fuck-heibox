package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103598c;

    private f(TXVideoEditer tXVideoEditer, String str, boolean z10) {
        this.f103596a = tXVideoEditer;
        this.f103597b = str;
        this.f103598c = z10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, String str, boolean z10) {
        return new f(tXVideoEditer, str, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGM$10(this.f103596a, this.f103597b, this.f103598c);
    }
}
