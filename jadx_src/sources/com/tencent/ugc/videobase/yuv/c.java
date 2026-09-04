package com.tencent.ugc.videobase.yuv;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageNV12InputFilter f103930a;

    private c(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        this.f103930a = tXCGPUImageNV12InputFilter;
    }

    public static Runnable a(TXCGPUImageNV12InputFilter tXCGPUImageNV12InputFilter) {
        return new c(tXCGPUImageNV12InputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageNV12InputFilter.lambda$onInit$0(this.f103930a);
    }
}
