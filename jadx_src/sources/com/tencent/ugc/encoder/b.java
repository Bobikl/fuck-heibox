package com.tencent.ugc.encoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoEncodeController f103571a;

    private b(UGCVideoEncodeController uGCVideoEncodeController) {
        this.f103571a = uGCVideoEncodeController;
    }

    public static Runnable a(UGCVideoEncodeController uGCVideoEncodeController) {
        return new b(uGCVideoEncodeController);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoEncodeController.lambda$stop$1(this.f103571a);
    }
}
