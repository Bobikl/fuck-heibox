package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103668b;

    private gs(UGCVideoProcessor uGCVideoProcessor, int i10) {
        this.f103667a = uGCVideoProcessor;
        this.f103668b = i10;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, int i10) {
        return new gs(uGCVideoProcessor, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103667a.mTransitionType = this.f103668b;
    }
}
