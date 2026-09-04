package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider.AnonymousClass1 f103643a;

    private gd(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1) {
        this.f103643a = anonymousClass1;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1) {
        return new gd(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.AnonymousClass1.b(this.f103643a);
    }
}
