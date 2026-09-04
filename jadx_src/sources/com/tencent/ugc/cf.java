package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer.AnonymousClass4 f103415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103416b;

    private cf(TXVideoEditer.AnonymousClass4 anonymousClass4, long j10) {
        this.f103415a = anonymousClass4;
        this.f103416b = j10;
    }

    public static Runnable a(TXVideoEditer.AnonymousClass4 anonymousClass4, long j10) {
        return new cf(anonymousClass4, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.AnonymousClass4.a(this.f103415a, this.f103416b);
    }
}
