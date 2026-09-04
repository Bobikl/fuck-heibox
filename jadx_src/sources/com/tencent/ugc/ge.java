package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ge implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider.AnonymousClass1 f103644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103645b;

    private ge(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1, long j10) {
        this.f103644a = anonymousClass1;
        this.f103645b = j10;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1, long j10) {
        return new ge(anonymousClass1, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.this.seekToInFileTime(this.f103645b, false);
    }
}
