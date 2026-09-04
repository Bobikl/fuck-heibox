package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103407a;

    private c(TXVideoEditer tXVideoEditer) {
        this.f103407a = tXVideoEditer;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer) {
        return new c(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103407a.onPlayComplete();
    }
}
