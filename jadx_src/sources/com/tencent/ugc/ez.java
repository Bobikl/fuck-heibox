package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ez implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMultiFilePixelFrameProvider f103593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103595c;

    private ez(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider, long j10, boolean z10) {
        this.f103593a = uGCMultiFilePixelFrameProvider;
        this.f103594b = j10;
        this.f103595c = z10;
    }

    public static Runnable a(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider, long j10, boolean z10) {
        return new ez(uGCMultiFilePixelFrameProvider, j10, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFilePixelFrameProvider.lambda$seekTo$2(this.f103593a, this.f103594b, this.f103595c);
    }
}
