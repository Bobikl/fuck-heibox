package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCWatermarkAlphaTextureFilter f103713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103714b;

    private hk(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, boolean z10) {
        this.f103713a = uGCWatermarkAlphaTextureFilter;
        this.f103714b = z10;
    }

    public static Runnable a(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, boolean z10) {
        return new hk(uGCWatermarkAlphaTextureFilter, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103713a.mIsShowBackImageMoment = this.f103714b;
    }
}
