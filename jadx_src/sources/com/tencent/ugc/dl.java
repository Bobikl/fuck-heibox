package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCImageProvider f103509a;

    private dl(UGCImageProvider uGCImageProvider) {
        this.f103509a = uGCImageProvider;
    }

    public static Runnable a(UGCImageProvider uGCImageProvider) {
        return new dl(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103509a.decodeBitmapFrame();
    }
}
