package com.airbnb.lottie.model.content;

/* JADX INFO: loaded from: classes6.dex */
public class Mask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaskMode f37486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f37487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f37488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37489d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, com.airbnb.lottie.model.animatable.h hVar, com.airbnb.lottie.model.animatable.d dVar, boolean z10) {
        this.f37486a = maskMode;
        this.f37487b = hVar;
        this.f37488c = dVar;
        this.f37489d = z10;
    }

    public MaskMode a() {
        return this.f37486a;
    }

    public com.airbnb.lottie.model.animatable.h b() {
        return this.f37487b;
    }

    public com.airbnb.lottie.model.animatable.d c() {
        return this.f37488c;
    }

    public boolean d() {
        return this.f37489d;
    }
}
