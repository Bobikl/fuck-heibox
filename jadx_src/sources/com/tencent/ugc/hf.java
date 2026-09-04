package com.tencent.ugc;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GLConstants.GLScaleType f103703d;

    private hf(UGCVideoProcessor uGCVideoProcessor, int i10, int i11, GLConstants.GLScaleType gLScaleType) {
        this.f103700a = uGCVideoProcessor;
        this.f103701b = i10;
        this.f103702c = i11;
        this.f103703d = gLScaleType;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, int i10, int i11, GLConstants.GLScaleType gLScaleType) {
        return new hf(uGCVideoProcessor, i10, i11, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$setOutputSize$4(this.f103700a, this.f103701b, this.f103702c, this.f103703d);
    }
}
