package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HardwareVideoDecoder f103479a;

    private f(HardwareVideoDecoder hardwareVideoDecoder) {
        this.f103479a = hardwareVideoDecoder;
    }

    public static Runnable a(HardwareVideoDecoder hardwareVideoDecoder) {
        return new f(hardwareVideoDecoder);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103479a.abandonDecodingFramesInternal();
    }
}
