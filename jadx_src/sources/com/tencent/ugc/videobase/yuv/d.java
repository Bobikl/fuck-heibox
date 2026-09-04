package com.tencent.ugc.videobase.yuv;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageNV12InputFilter f103931a;

    private d(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        this.f103931a = tXCGPUImageNV12InputFilter;
    }

    public static Runnable a(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        return new d(tXCGPUImageNV12InputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageNV12InputFilter.lambda$setColorFormat$1(this.f103931a);
    }
}
