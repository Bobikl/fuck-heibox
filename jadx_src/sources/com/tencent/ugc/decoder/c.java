package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HardwareVideoDecoder f103476a;

    private c(HardwareVideoDecoder hardwareVideoDecoder) {
        this.f103476a = hardwareVideoDecoder;
    }

    public static Runnable a(HardwareVideoDecoder hardwareVideoDecoder) {
        return new c(hardwareVideoDecoder);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103476a.drainAndFeedFrame();
    }
}
