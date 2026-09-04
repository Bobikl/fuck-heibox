package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103452a;

    private cw(TXVideoJoiner tXVideoJoiner) {
        this.f103452a = tXVideoJoiner;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner) {
        return new cw(tXVideoJoiner);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103452a.stopPlayInternal();
    }
}
