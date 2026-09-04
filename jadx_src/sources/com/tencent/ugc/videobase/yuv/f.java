package com.tencent.ugc.videobase.yuv;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageYUVOutputFilter f103933a;

    private f(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        this.f103933a = tXCGPUImageYUVOutputFilter;
    }

    public static Runnable a(TXCGPUImageYUVOutputFilter tXCGPUImageYUVOutputFilter) {
        return new f(tXCGPUImageYUVOutputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageYUVOutputFilter.lambda$onOutputSizeChanged$1(this.f103933a);
    }
}
