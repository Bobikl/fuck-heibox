package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103443b;

    private cp(TXVideoJoiner tXVideoJoiner, boolean z10) {
        this.f103442a = tXVideoJoiner;
        this.f103443b = z10;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, boolean z10) {
        return new cp(tXVideoJoiner, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103442a.mIsNeedEdit = this.f103443b;
    }
}
