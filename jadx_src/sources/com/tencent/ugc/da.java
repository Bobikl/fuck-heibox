package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class da implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner.AnonymousClass3 f103461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f103462b;

    private da(TXVideoJoiner.AnonymousClass3 anonymousClass3, float f10) {
        this.f103461a = anonymousClass3;
        this.f103462b = f10;
    }

    public static Runnable a(TXVideoJoiner.AnonymousClass3 anonymousClass3, float f10) {
        return new da(anonymousClass3, f10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.this.notifyJoinProgress(this.f103462b);
    }
}
