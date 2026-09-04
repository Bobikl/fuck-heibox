package com.tencent.ugc.renderer;

import com.tencent.ugc.videobase.base.TakeSnapshotListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TakeSnapshotListener f103850b;

    private x(VideoRenderer videoRenderer, TakeSnapshotListener takeSnapshotListener) {
        this.f103849a = videoRenderer;
        this.f103850b = takeSnapshotListener;
    }

    public static Runnable a(VideoRenderer videoRenderer, TakeSnapshotListener takeSnapshotListener) {
        return new x(videoRenderer, takeSnapshotListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$takeSnapshot$3(this.f103849a, this.f103850b);
    }
}
