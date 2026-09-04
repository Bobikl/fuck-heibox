package com.tencent.ugc.preprocessor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BeautyProcessor f103767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103768b;

    private b(BeautyProcessor beautyProcessor, float f10) {
        this.f103767a = beautyProcessor;
        this.f103768b = f10;
    }

    public static Runnable a(BeautyProcessor beautyProcessor, float f10) {
        return new b(beautyProcessor, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        BeautyProcessor.lambda$setWhitenessLevel$1(this.f103767a, this.f103768b);
    }
}
