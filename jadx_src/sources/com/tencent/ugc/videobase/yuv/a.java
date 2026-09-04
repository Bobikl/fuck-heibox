package com.tencent.ugc.videobase.yuv;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImageI420InputFilter f103928a;

    private a(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        this.f103928a = tXCGPUImageI420InputFilter;
    }

    public static Runnable a(TXCGPUImageI420InputFilter tXCGPUImageI420InputFilter) {
        return new a(tXCGPUImageI420InputFilter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImageI420InputFilter.lambda$onInit$0(this.f103928a);
    }
}
