package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HardwareVideoDecoder f103477a;

    private d(HardwareVideoDecoder hardwareVideoDecoder) {
        this.f103477a = hardwareVideoDecoder;
    }

    public static Runnable a(HardwareVideoDecoder hardwareVideoDecoder) {
        return new d(hardwareVideoDecoder);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103477a.drainAndFeedFrame();
    }
}
