package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoDecodeController.AnonymousClass1 f103496a;

    private q(UGCVideoDecodeController.AnonymousClass1 anonymousClass1) {
        this.f103496a = anonymousClass1;
    }

    public static Runnable a(UGCVideoDecodeController.AnonymousClass1 anonymousClass1) {
        return new q(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.AnonymousClass1.a(this.f103496a);
    }
}
