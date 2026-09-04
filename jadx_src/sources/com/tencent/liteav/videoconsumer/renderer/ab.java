package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ab implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f100563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f100564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Matrix f100566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.tencent.liteav.videobase.base.a f100567f;

    private ab(u uVar, ByteBuffer byteBuffer, int i10, int i11, Matrix matrix, com.tencent.liteav.videobase.base.a aVar) {
        this.f100562a = uVar;
        this.f100563b = byteBuffer;
        this.f100564c = i10;
        this.f100565d = i11;
        this.f100566e = matrix;
        this.f100567f = aVar;
    }

    public static Runnable a(u uVar, ByteBuffer byteBuffer, int i10, int i11, Matrix matrix, com.tencent.liteav.videobase.base.a aVar) {
        return new ab(uVar, byteBuffer, i10, i11, matrix, aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(this.f100562a, this.f100563b, this.f100564c, this.f100565d, this.f100566e, this.f100567f);
    }
}
