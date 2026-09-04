package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ca implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass2 f103408a;

    private ca(TXVideoEditer.AnonymousClass2 anonymousClass2) {
        this.f103408a = anonymousClass2;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass2 anonymousClass2) {
        return new ca(anonymousClass2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.AnonymousClass2.a(this.f103408a);
    }
}
