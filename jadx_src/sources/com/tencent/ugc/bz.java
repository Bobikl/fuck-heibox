package com.tencent.ugc;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass2 f103405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EncodedVideoFrame f103406b;

    private bz(TXVideoEditer.AnonymousClass2 anonymousClass2, EncodedVideoFrame encodedVideoFrame) {
        this.f103405a = anonymousClass2;
        this.f103406b = encodedVideoFrame;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass2 anonymousClass2, EncodedVideoFrame encodedVideoFrame) {
        return new bz(anonymousClass2, encodedVideoFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.AnonymousClass2.a(this.f103405a, this.f103406b);
    }
}
