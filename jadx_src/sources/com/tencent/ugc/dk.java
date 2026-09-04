package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCImageProvider f103508a;

    private dk(UGCImageProvider uGCImageProvider) {
        this.f103508a = uGCImageProvider;
    }

    public static Runnable a(UGCImageProvider uGCImageProvider) {
        return new dk(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103508a.decodeBitmapFrame();
    }
}
