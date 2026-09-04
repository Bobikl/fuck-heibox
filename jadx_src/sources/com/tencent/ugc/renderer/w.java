package com.tencent.ugc.renderer;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayTarget f103847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103848c;

    private w(VideoRenderer videoRenderer, DisplayTarget displayTarget, boolean z10) {
        this.f103846a = videoRenderer;
        this.f103847b = displayTarget;
        this.f103848c = z10;
    }

    public static Runnable a(VideoRenderer videoRenderer, DisplayTarget displayTarget, boolean z10) {
        return new w(videoRenderer, displayTarget, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103846a.setDisplayViewInternal(this.f103847b, this.f103848c);
    }
}
