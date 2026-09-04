package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCThumbnailGenerator f103659a;

    private gn(UGCThumbnailGenerator uGCThumbnailGenerator) {
        this.f103659a = uGCThumbnailGenerator;
    }

    public static Runnable a(UGCThumbnailGenerator uGCThumbnailGenerator) {
        return new gn(uGCThumbnailGenerator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCThumbnailGenerator.lambda$stop$4(this.f103659a);
    }
}
