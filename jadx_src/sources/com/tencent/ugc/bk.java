package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103366b;

    private bk(TXVideoEditer tXVideoEditer, float f10) {
        this.f103365a = tXVideoEditer;
        this.f103366b = f10;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, float f10) {
        return new bk(tXVideoEditer, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setVideoVolume$63(this.f103365a, this.f103366b);
    }
}
