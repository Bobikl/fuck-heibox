package com.tencent.ugc;

import com.tencent.ugc.encoder.UGCVideoEncoderJNI;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UGCVideoEncoderJNI.EncoderType f103692c;

    private hb(UGCVideoProcessor uGCVideoProcessor, boolean z10, UGCVideoEncoderJNI.EncoderType encoderType) {
        this.f103690a = uGCVideoProcessor;
        this.f103691b = z10;
        this.f103692c = encoderType;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, boolean z10, UGCVideoEncoderJNI.EncoderType encoderType) {
        return new hb(uGCVideoProcessor, z10, encoderType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$start$1(this.f103690a, this.f103691b, this.f103692c);
    }
}
