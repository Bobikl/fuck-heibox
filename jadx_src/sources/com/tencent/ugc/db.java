package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class db implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner.AnonymousClass3 f103463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103465c;

    private db(TXVideoJoiner.AnonymousClass3 anonymousClass3, int i10, String str) {
        this.f103463a = anonymousClass3;
        this.f103464b = i10;
        this.f103465c = str;
    }

    public static Runnable a(TXVideoJoiner.AnonymousClass3 anonymousClass3, int i10, String str) {
        return new db(anonymousClass3, i10, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.AnonymousClass3.a(this.f103463a, this.f103464b, this.f103465c);
    }
}
