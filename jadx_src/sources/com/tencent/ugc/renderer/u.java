package com.tencent.ugc.renderer;

import android.graphics.Matrix;
import com.tencent.ugc.videobase.base.TakeSnapshotListener;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f103839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Matrix f103842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TakeSnapshotListener f103843f;

    private u(VideoRenderer videoRenderer, ByteBuffer byteBuffer, int i10, int i11, Matrix matrix, TakeSnapshotListener takeSnapshotListener) {
        this.f103838a = videoRenderer;
        this.f103839b = byteBuffer;
        this.f103840c = i10;
        this.f103841d = i11;
        this.f103842e = matrix;
        this.f103843f = takeSnapshotListener;
    }

    public static Runnable a(VideoRenderer videoRenderer, ByteBuffer byteBuffer, int i10, int i11, Matrix matrix, TakeSnapshotListener takeSnapshotListener) {
        return new u(videoRenderer, byteBuffer, i10, i11, matrix, takeSnapshotListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103838a.notifySnapshotCompleted(this.f103839b, this.f103840c, this.f103841d, this.f103842e, this.f103843f);
    }
}
