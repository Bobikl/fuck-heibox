package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ce implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass3 f103414a;

    private ce(TXVideoEditer.AnonymousClass3 anonymousClass3) {
        this.f103414a = anonymousClass3;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass3 anonymousClass3) {
        return new ce(anonymousClass3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.AnonymousClass3.a(this.f103414a);
    }
}
