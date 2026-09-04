package com.tencent.liteav.videoproducer.capture.b;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.AnonymousClass4 f100760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TotalCaptureResult f100761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CaptureRequest f100762c;

    private c(a.AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
        this.f100760a = anonymousClass4;
        this.f100761b = totalCaptureResult;
        this.f100762c = captureRequest;
    }

    public static Runnable a(a.AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
        return new c(anonymousClass4, totalCaptureResult, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.AnonymousClass4.a(this.f100760a, this.f100761b, this.f100762c);
    }
}
