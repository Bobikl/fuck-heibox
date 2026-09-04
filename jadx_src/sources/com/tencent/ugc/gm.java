package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCThumbnailGenerator f103658a;

    private gm(UGCThumbnailGenerator uGCThumbnailGenerator) {
        this.f103658a = uGCThumbnailGenerator;
    }

    public static Runnable a(UGCThumbnailGenerator uGCThumbnailGenerator) {
        return new gm(uGCThumbnailGenerator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103658a.getNextThumbnail();
    }
}
