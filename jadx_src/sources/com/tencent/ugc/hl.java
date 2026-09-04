package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCWatermarkAlphaTextureFilter f103715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f103719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f103720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f103721g;

    private hl(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, int i10, int i11, int i12, float f10, float f11, float f12) {
        this.f103715a = uGCWatermarkAlphaTextureFilter;
        this.f103716b = i10;
        this.f103717c = i11;
        this.f103718d = i12;
        this.f103719e = f10;
        this.f103720f = f11;
        this.f103721g = f12;
    }

    public static Runnable a(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, int i10, int i11, int i12, float f10, float f11, float f12) {
        return new hl(uGCWatermarkAlphaTextureFilter, i10, i11, i12, f10, f11, f12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCWatermarkAlphaTextureFilter.lambda$setTextureWatermark$1(this.f103715a, this.f103716b, this.f103717c, this.f103718d, this.f103719e, this.f103720f, this.f103721g);
    }
}
