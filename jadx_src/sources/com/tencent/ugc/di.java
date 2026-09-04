package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class di implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCImageProvider f103504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103505b;

    private di(UGCImageProvider uGCImageProvider, long j10) {
        this.f103504a = uGCImageProvider;
        this.f103505b = j10;
    }

    public static Runnable a(UGCImageProvider uGCImageProvider, long j10) {
        return new di(uGCImageProvider, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCImageProvider.lambda$seekTo$4(this.f103504a, this.f103505b);
    }
}
