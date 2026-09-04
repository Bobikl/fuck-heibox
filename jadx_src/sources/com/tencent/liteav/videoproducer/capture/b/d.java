package com.tencent.liteav.videoproducer.capture.b;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.AnonymousClass4 f100763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CaptureRequest f100764b;

    private d(a.AnonymousClass4 anonymousClass4, CaptureRequest captureRequest) {
        this.f100763a = anonymousClass4;
        this.f100764b = captureRequest;
    }

    public static Runnable a(a.AnonymousClass4 anonymousClass4, CaptureRequest captureRequest) {
        return new d(anonymousClass4, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.AnonymousClass4.a(this.f100763a, this.f100764b);
    }
}
