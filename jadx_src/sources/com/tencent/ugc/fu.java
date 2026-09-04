package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider f103628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103630c;

    private fu(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, long j10, boolean z10) {
        this.f103628a = uGCSingleFilePixelFrameProvider;
        this.f103629b = j10;
        this.f103630c = z10;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, long j10, boolean z10) {
        return new fu(uGCSingleFilePixelFrameProvider, j10, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.lambda$seekTo$0(this.f103628a, this.f103629b, this.f103630c);
    }
}
