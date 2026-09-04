package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider.AnonymousClass1 f103646a;

    private gf(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1) {
        this.f103646a = anonymousClass1;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1) {
        return new gf(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.AnonymousClass1.a(this.f103646a);
    }
}
