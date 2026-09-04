package com.tencent.ugc.preprocessor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BeautyProcessor f103772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103773b;

    private d(BeautyProcessor beautyProcessor, boolean z10) {
        this.f103772a = beautyProcessor;
        this.f103773b = z10;
    }

    public static Runnable a(BeautyProcessor beautyProcessor, boolean z10) {
        return new d(beautyProcessor, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        BeautyProcessor.lambda$setPerformanceMode$3(this.f103772a, this.f103773b);
    }
}
