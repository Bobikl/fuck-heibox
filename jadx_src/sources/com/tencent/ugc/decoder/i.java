package com.tencent.ugc.decoder;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodecHDRDecoder f103484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f103485b;

    private i(MediaCodecHDRDecoder mediaCodecHDRDecoder, Surface surface) {
        this.f103484a = mediaCodecHDRDecoder;
        this.f103485b = surface;
    }

    public static Runnable a(MediaCodecHDRDecoder mediaCodecHDRDecoder, Surface surface) {
        return new i(mediaCodecHDRDecoder, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103484a.mOutputSurface = this.f103485b;
    }
}
