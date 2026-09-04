package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class co implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103441c;

    private co(TXVideoJoiner tXVideoJoiner, int i10, String str) {
        this.f103439a = tXVideoJoiner;
        this.f103440b = i10;
        this.f103441c = str;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, int i10, String str) {
        return new co(tXVideoJoiner, i10, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103439a.joinVideoInternal(this.f103440b, this.f103441c, true);
    }
}
