package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor.AnonymousClass1 f103707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103709c;

    private hh(UGCVideoProcessor.AnonymousClass1 anonymousClass1, int i10, int i11) {
        this.f103707a = anonymousClass1;
        this.f103708b = i10;
        this.f103709c = i11;
    }

    public static Runnable a(UGCVideoProcessor.AnonymousClass1 anonymousClass1, int i10, int i11) {
        return new hh(anonymousClass1, i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.this.mVideoProcessManager.setOutputSize(this.f103708b, this.f103709c);
    }
}
