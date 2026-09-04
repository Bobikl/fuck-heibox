package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCSingleFilePixelFrameProvider.AnonymousClass1 f103642a;

    private gc(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1) {
        this.f103642a = anonymousClass1;
    }

    public static Runnable a(UGCSingleFilePixelFrameProvider.AnonymousClass1 anonymousClass1) {
        return new gc(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.this.onDecodeCompletedInternal();
    }
}
