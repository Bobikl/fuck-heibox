package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HardwareVideoDecoder f103478a;

    private e(HardwareVideoDecoder hardwareVideoDecoder) {
        this.f103478a = hardwareVideoDecoder;
    }

    public static Runnable a(HardwareVideoDecoder hardwareVideoDecoder) {
        return new e(hardwareVideoDecoder);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103478a.stopInternal();
    }
}
