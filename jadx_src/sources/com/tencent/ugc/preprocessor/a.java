package com.tencent.ugc.preprocessor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BeautyProcessor f103765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103766b;

    private a(BeautyProcessor beautyProcessor, float f10) {
        this.f103765a = beautyProcessor;
        this.f103766b = f10;
    }

    public static Runnable a(BeautyProcessor beautyProcessor, float f10) {
        return new a(beautyProcessor, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        BeautyProcessor.lambda$setBeautyLevel$0(this.f103765a, this.f103766b);
    }
}
