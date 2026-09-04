package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.TXVideoGenerateListener f103382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103383b;

    private bs(TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener, float f10) {
        this.f103382a = tXVideoGenerateListener;
        this.f103383b = f10;
    }

    public static Runnable a(TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener, float f10) {
        return new bs(tXVideoGenerateListener, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103382a.onGenerateProgress(this.f103383b);
    }
}
