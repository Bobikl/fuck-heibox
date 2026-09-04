package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ey implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMultiFilePixelFrameProvider f103592a;

    private ey(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        this.f103592a = uGCMultiFilePixelFrameProvider;
    }

    public static Runnable a(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        return new ey(uGCMultiFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFilePixelFrameProvider.lambda$stop$1(this.f103592a);
    }
}
