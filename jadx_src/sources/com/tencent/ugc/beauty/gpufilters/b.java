package com.tencent.ugc.beauty.gpufilters;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUGreenScreenFilter f103341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103343c;

    private b(TXCGPUGreenScreenFilter tXCGPUGreenScreenFilter, String str, boolean z10) {
        this.f103341a = tXCGPUGreenScreenFilter;
        this.f103342b = str;
        this.f103343c = z10;
    }

    public static Runnable a(TXCGPUGreenScreenFilter tXCGPUGreenScreenFilter, String str, boolean z10) {
        return new b(tXCGPUGreenScreenFilter, str, z10);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        TXCGPUGreenScreenFilter.lambda$setGreenScreenFile$0(this.f103341a, this.f103342b, this.f103343c);
    }
}
