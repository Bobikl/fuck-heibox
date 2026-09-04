package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider.AnonymousClass2 f103647a;

    private gg(UGCSingleFilePixelFrameProvider.AnonymousClass2 anonymousClass2) {
        this.f103647a = anonymousClass2;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider.AnonymousClass2 anonymousClass2) {
        return new gg(anonymousClass2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.AnonymousClass2.a(this.f103647a);
    }
}
