package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCThumbnailGenerator f103650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103651b;

    private gj(UGCThumbnailGenerator uGCThumbnailGenerator, List list) {
        this.f103650a = uGCThumbnailGenerator;
        this.f103651b = list;
    }

    public static Runnable a(UGCThumbnailGenerator uGCThumbnailGenerator, List list) {
        return new gj(uGCThumbnailGenerator, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCThumbnailGenerator.lambda$setVideoSourceList$1(this.f103650a, this.f103651b);
    }
}
