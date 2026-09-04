package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner.AnonymousClass1 f103457a;

    private cz(TXVideoJoiner.AnonymousClass1 anonymousClass1) {
        this.f103457a = anonymousClass1;
    }

    public static Runnable a(TXVideoJoiner.AnonymousClass1 anonymousClass1) {
        return new cz(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.this.stopPlayInternal();
    }
}
