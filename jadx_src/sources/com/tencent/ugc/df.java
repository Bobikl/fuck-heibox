package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class df implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCImageProvider f103501a;

    private df(UGCImageProvider uGCImageProvider) {
        this.f103501a = uGCImageProvider;
    }

    public static Runnable a(UGCImageProvider uGCImageProvider) {
        return new df(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCImageProvider.lambda$uninitialize$1(this.f103501a);
    }
}
