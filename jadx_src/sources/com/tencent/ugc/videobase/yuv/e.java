package com.tencent.ugc.videobase.yuv;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageYUVOutputFilter f103932a;

    private e(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        this.f103932a = tXCGPUImageYUVOutputFilter;
    }

    public static Runnable a(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        return new e(tXCGPUImageYUVOutputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageYUVOutputFilter.lambda$setColorFormat$0(this.f103932a);
    }
}
