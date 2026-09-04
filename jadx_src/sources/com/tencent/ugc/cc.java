package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass3 f103411a;

    private cc(TXVideoEditer.AnonymousClass3 anonymousClass3) {
        this.f103411a = anonymousClass3;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass3 anonymousClass3) {
        return new cc(anonymousClass3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.AnonymousClass3.b(this.f103411a);
    }
}
