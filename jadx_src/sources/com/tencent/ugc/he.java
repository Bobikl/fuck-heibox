package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class he implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103699d;

    private he(UGCVideoProcessor uGCVideoProcessor, List list, int i10, int i11) {
        this.f103696a = uGCVideoProcessor;
        this.f103697b = list;
        this.f103698c = i10;
        this.f103699d = i11;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, List list, int i10, int i11) {
        return new he(uGCVideoProcessor, list, i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$setSplitScreenList$3(this.f103696a, this.f103697b, this.f103698c, this.f103699d);
    }
}
