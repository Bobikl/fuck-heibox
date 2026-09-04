package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCRotateScaleFilter f103607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f103609c;

    private fd(UGCRotateScaleFilter uGCRotateScaleFilter, float f10, float f11) {
        this.f103607a = uGCRotateScaleFilter;
        this.f103608b = f10;
        this.f103609c = f11;
    }

    public static Runnable a(UGCRotateScaleFilter uGCRotateScaleFilter, float f10, float f11) {
        return new fd(uGCRotateScaleFilter, f10, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCRotateScaleFilter uGCRotateScaleFilter = this.f103607a;
        uGCRotateScaleFilter.setScaleInternal(uGCRotateScaleFilter.setRotateInternal(null, this.f103608b), this.f103609c);
    }
}
