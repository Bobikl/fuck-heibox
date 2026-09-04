package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HardwareVideoDecoder f103473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f103474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VideoDecoderListener f103475c;

    private b(HardwareVideoDecoder hardwareVideoDecoder, Object obj, VideoDecoderListener videoDecoderListener) {
        this.f103473a = hardwareVideoDecoder;
        this.f103474b = obj;
        this.f103475c = videoDecoderListener;
    }

    public static Runnable a(HardwareVideoDecoder hardwareVideoDecoder, Object obj, VideoDecoderListener videoDecoderListener) {
        return new b(hardwareVideoDecoder, obj, videoDecoderListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103473a.startInternal(this.f103474b, this.f103475c);
    }
}
