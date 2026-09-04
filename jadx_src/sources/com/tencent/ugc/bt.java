package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXVideoEditer.TXVideoGenerateListener f103385b;

    private bt(int i10, TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener) {
        this.f103384a = i10;
        this.f103385b = tXVideoGenerateListener;
    }

    public static Runnable a(int i10, TXVideoEditer.TXVideoGenerateListener tXVideoGenerateListener) {
        return new bt(i10, tXVideoGenerateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$notifyGenerateComplete$70(this.f103384a, this.f103385b);
    }
}
