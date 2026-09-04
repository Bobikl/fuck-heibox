package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ah implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103282a;

    private ah(TXVideoEditer tXVideoEditer) {
        this.f103282a = tXVideoEditer;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer) {
        return new ah(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103282a.processVideoInternal();
    }
}
