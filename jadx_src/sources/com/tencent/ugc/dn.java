package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103511a;

    private dn(UGCMediaListSource uGCMediaListSource) {
        this.f103511a = uGCMediaListSource;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource) {
        return new dn(uGCMediaListSource);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103511a.uninitializeInternal();
    }
}
