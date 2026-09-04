package com.tencent.ugc.renderer;

import com.tencent.ugc.videobase.base.TakeSnapshotListener;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RenderViewHelperInterface f103828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f103829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f103831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TakeSnapshotListener f103832f;

    private q(VideoRenderer videoRenderer, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i10, int i11, TakeSnapshotListener takeSnapshotListener) {
        this.f103827a = videoRenderer;
        this.f103828b = renderViewHelperInterface;
        this.f103829c = byteBuffer;
        this.f103830d = i10;
        this.f103831e = i11;
        this.f103832f = takeSnapshotListener;
    }

    public static Runnable a(VideoRenderer videoRenderer, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i10, int i11, TakeSnapshotListener takeSnapshotListener) {
        return new q(videoRenderer, renderViewHelperInterface, byteBuffer, i10, i11, takeSnapshotListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$snapshotVideoFrameFromFrameBuffer$12(this.f103827a, this.f103828b, this.f103829c, this.f103830d, this.f103831e, this.f103832f);
    }
}
