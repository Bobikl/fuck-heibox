package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCThumbnailGenerator f103652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f103654c;

    private gk(UGCThumbnailGenerator uGCThumbnailGenerator, long j10, long j11) {
        this.f103652a = uGCThumbnailGenerator;
        this.f103653b = j10;
        this.f103654c = j11;
    }

    public static Runnable a(UGCThumbnailGenerator uGCThumbnailGenerator, long j10, long j11) {
        return new gk(uGCThumbnailGenerator, j10, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103652a.mMediaListSource.setVideoSourceRange(this.f103653b, this.f103654c);
    }
}
