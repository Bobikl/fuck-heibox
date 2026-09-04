package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCImageProvider f103510a;

    private dm(UGCImageProvider uGCImageProvider) {
        this.f103510a = uGCImageProvider;
    }

    public static Runnable a(UGCImageProvider uGCImageProvider) {
        return new dm(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103510a.decodeBitmapFrame();
    }
}
