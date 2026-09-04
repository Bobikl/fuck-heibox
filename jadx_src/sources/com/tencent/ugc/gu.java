package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103673c;

    private gu(UGCVideoProcessor uGCVideoProcessor, int i10, int i11) {
        this.f103671a = uGCVideoProcessor;
        this.f103672b = i10;
        this.f103673c = i11;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, int i10, int i11) {
        return new gu(uGCVideoProcessor, i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103671a.mVideoProcessManager.setBeautyFilter(this.f103672b, this.f103673c);
    }
}
