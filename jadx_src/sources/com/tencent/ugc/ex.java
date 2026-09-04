package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ex implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMultiFilePixelFrameProvider f103591a;

    private ex(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        this.f103591a = uGCMultiFilePixelFrameProvider;
    }

    public static Runnable a(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        return new ex(uGCMultiFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFilePixelFrameProvider.lambda$start$0(this.f103591a);
    }
}
