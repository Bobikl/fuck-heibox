package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103735b;

    private j(TXVideoEditer tXVideoEditer, float f10) {
        this.f103734a = tXVideoEditer;
        this.f103735b = f10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, float f10) {
        return new j(tXVideoEditer, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setBGMVolume$14(this.f103734a, this.f103735b);
    }
}
