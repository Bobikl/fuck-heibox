package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider f103623a;

    private fp(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f103623a = uGCSingleFilePixelFrameProvider;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new fp(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103623a.uninitializeInternal();
    }
}
