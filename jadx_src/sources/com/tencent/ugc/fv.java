package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider f103631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103632b;

    private fv(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, boolean z10) {
        this.f103631a = uGCSingleFilePixelFrameProvider;
        this.f103632b = z10;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, boolean z10) {
        return new fv(uGCSingleFilePixelFrameProvider, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103631a.setReverseInternal(this.f103632b);
    }
}
