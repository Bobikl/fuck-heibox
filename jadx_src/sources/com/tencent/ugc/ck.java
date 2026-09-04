package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ck implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103433c;

    private ck(TXVideoJoiner tXVideoJoiner, String str, int i10) {
        this.f103431a = tXVideoJoiner;
        this.f103432b = str;
        this.f103433c = i10;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, String str, int i10) {
        return new ck(tXVideoJoiner, str, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$joinVideo$8(this.f103431a, this.f103432b, this.f103433c);
    }
}
