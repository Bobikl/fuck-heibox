package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class by implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass2 f103404a;

    private by(TXVideoEditer.AnonymousClass2 anonymousClass2) {
        this.f103404a = anonymousClass2;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass2 anonymousClass2) {
        return new by(anonymousClass2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.this.mIsVideoEncoderStarted = true;
    }
}
