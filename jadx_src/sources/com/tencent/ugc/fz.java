package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider f103636a;

    private fz(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f103636a = uGCSingleFilePixelFrameProvider;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new fz(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103636a.decodeInternal();
    }
}
