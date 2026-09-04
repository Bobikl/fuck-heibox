package com.tencent.ugc.preprocessor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BeautyProcessor f103769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103771c;

    private c(BeautyProcessor beautyProcessor, String str, int i10) {
        this.f103769a = beautyProcessor;
        this.f103770b = str;
        this.f103771c = i10;
    }

    public static Runnable a(BeautyProcessor beautyProcessor, String str, int i10) {
        return new c(beautyProcessor, str, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103769a.updateStatsInternal(this.f103770b, this.f103771c);
    }
}
