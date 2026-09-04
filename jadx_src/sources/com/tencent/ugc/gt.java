package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103670b;

    private gt(UGCVideoProcessor uGCVideoProcessor, List list) {
        this.f103669a = uGCVideoProcessor;
        this.f103670b = list;
    }

    public static Runnable a(UGCVideoProcessor uGCVideoProcessor, List list) {
        return new gt(uGCVideoProcessor, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$setSpeedList$10(this.f103669a, this.f103670b);
    }
}
