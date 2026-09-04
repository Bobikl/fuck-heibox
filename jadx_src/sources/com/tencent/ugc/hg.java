package com.tencent.ugc;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayTarget f103705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GLConstants.GLScaleType f103706c;

    private hg(UGCVideoProcessor uGCVideoProcessor, DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
        this.f103704a = uGCVideoProcessor;
        this.f103705b = displayTarget;
        this.f103706c = gLScaleType;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
        return new hg(uGCVideoProcessor, displayTarget, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$setDisplayView$5(this.f103704a, this.f103705b, this.f103706c);
    }
}
