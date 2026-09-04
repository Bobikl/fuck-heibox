package com.tencent.ugc.renderer;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GLConstants.GLScaleType f103855b;

    private z(VideoRenderer videoRenderer, GLConstants.GLScaleType gLScaleType) {
        this.f103854a = videoRenderer;
        this.f103855b = gLScaleType;
    }

    public static Runnable a(VideoRenderer videoRenderer, GLConstants.GLScaleType gLScaleType) {
        return new z(videoRenderer, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setScaleType$5(this.f103854a, this.f103855b);
    }
}
