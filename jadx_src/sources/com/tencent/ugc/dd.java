package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCImageProvider f103467a;

    private dd(UGCImageProvider uGCImageProvider) {
        this.f103467a = uGCImageProvider;
    }

    public static Runnable a(UGCImageProvider uGCImageProvider) {
        return new dd(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103467a.decodeBitmapFrame();
    }
}
