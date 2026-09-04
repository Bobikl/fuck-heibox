package com.tencent.ugc;

import com.tencent.ugc.encoder.UGCVideoEncoderJNI;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass2 f103409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UGCVideoEncoderJNI.EncoderType f103410b;

    private cb(TXVideoEditer.AnonymousClass2 anonymousClass2, UGCVideoEncoderJNI.EncoderType encoderType) {
        this.f103409a = anonymousClass2;
        this.f103410b = encoderType;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass2 anonymousClass2, UGCVideoEncoderJNI.EncoderType encoderType) {
        return new cb(anonymousClass2, encoderType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.AnonymousClass2.a(this.f103409a, this.f103410b);
    }
}
