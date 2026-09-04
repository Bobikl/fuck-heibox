package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103444a;

    private cq(TXVideoJoiner tXVideoJoiner) {
        this.f103444a = tXVideoJoiner;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner) {
        return new cq(tXVideoJoiner);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$notifyJoinComplete$14(this.f103444a);
    }
}
