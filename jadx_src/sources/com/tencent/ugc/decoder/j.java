package com.tencent.ugc.decoder;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodecOutputOESTextureDecoder f103486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceTexture f103487b;

    private j(MediaCodecOutputOESTextureDecoder mediaCodecOutputOESTextureDecoder, SurfaceTexture surfaceTexture) {
        this.f103486a = mediaCodecOutputOESTextureDecoder;
        this.f103487b = surfaceTexture;
    }

    public static Runnable a(MediaCodecOutputOESTextureDecoder mediaCodecOutputOESTextureDecoder, SurfaceTexture surfaceTexture) {
        return new j(mediaCodecOutputOESTextureDecoder, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        MediaCodecOutputOESTextureDecoder.lambda$onFrameAvailable$0(this.f103486a, this.f103487b);
    }
}
