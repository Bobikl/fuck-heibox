package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class de implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCImageProvider f103468a;

    private de(UGCImageProvider uGCImageProvider) {
        this.f103468a = uGCImageProvider;
    }

    public static Runnable a(UGCImageProvider uGCImageProvider) {
        return new de(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103468a.decodeBitmapFrame();
    }
}
