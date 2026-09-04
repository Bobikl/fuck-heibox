package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCRotateScaleFilter f103605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103606b;

    private fc(UGCRotateScaleFilter uGCRotateScaleFilter, float f10) {
        this.f103605a = uGCRotateScaleFilter;
        this.f103606b = f10;
    }

    public static Runnable a(UGCRotateScaleFilter uGCRotateScaleFilter, float f10) {
        return new fc(uGCRotateScaleFilter, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103605a.setRotateInternal(null, this.f103606b);
    }
}
