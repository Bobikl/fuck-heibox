package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HardwareVideoDecoder f103480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoDecoderDef.ConsumerScene f103481b;

    private g(HardwareVideoDecoder hardwareVideoDecoder, VideoDecoderDef.ConsumerScene consumerScene) {
        this.f103480a = hardwareVideoDecoder;
        this.f103481b = consumerScene;
    }

    public static Runnable a(HardwareVideoDecoder hardwareVideoDecoder, VideoDecoderDef.ConsumerScene consumerScene) {
        return new g(hardwareVideoDecoder, consumerScene);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HardwareVideoDecoder.lambda$setScene$1(this.f103480a, this.f103481b);
    }
}
