package com.tencent.ugc.decoder;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HardwareVideoDecoder f103482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f103483b;

    private h(HardwareVideoDecoder hardwareVideoDecoder, Surface surface) {
        this.f103482a = hardwareVideoDecoder;
        this.f103483b = surface;
    }

    public static Runnable a(HardwareVideoDecoder hardwareVideoDecoder, Surface surface) {
        return new h(hardwareVideoDecoder, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HardwareVideoDecoder.lambda$setOutputSurface$2(this.f103482a, this.f103483b);
    }
}
