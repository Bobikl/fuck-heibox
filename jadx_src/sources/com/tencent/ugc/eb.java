package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103541b;

    private eb(UGCMediaListSource uGCMediaListSource, boolean z10) {
        this.f103540a = uGCMediaListSource;
        this.f103541b = z10;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, boolean z10) {
        return new eb(uGCMediaListSource, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setReverse$13(this.f103540a, this.f103541b);
    }
}
