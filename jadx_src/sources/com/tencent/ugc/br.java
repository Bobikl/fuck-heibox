package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class br implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.TXVideoProcessListener f103380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103381b;

    private br(TXVideoEditer.TXVideoProcessListener tXVideoProcessListener, float f10) {
        this.f103380a = tXVideoProcessListener;
        this.f103381b = f10;
    }

    public static Runnable a(TXVideoEditer.TXVideoProcessListener tXVideoProcessListener, float f10) {
        return new br(tXVideoProcessListener, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103380a.onProcessProgress(this.f103381b);
    }
}
