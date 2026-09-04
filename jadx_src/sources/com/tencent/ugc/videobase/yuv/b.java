package com.tencent.ugc.videobase.yuv;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageI420InputFilter f103929a;

    private b(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        this.f103929a = tXCGPUImageI420InputFilter;
    }

    public static Runnable a(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        return new b(tXCGPUImageI420InputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageI420InputFilter.lambda$setColorFormat$1(this.f103929a);
    }
}
