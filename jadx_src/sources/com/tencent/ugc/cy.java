package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cy implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103456b;

    private cy(TXVideoJoiner tXVideoJoiner, int i10) {
        this.f103455a = tXVideoJoiner;
        this.f103456b = i10;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, int i10) {
        return new cy(tXVideoJoiner, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103455a.mProfile = this.f103456b;
    }
}
