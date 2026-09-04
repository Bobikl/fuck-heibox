package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103532b;

    private dx(UGCMediaListSource uGCMediaListSource, boolean z10) {
        this.f103531a = uGCMediaListSource;
        this.f103532b = z10;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, boolean z10) {
        return new dx(uGCMediaListSource, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$seekTo$11(this.f103531a, this.f103532b);
    }
}
