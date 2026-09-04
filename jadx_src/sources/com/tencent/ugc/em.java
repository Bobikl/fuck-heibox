package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class em implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103556b;

    private em(UGCMediaListSource uGCMediaListSource, List list) {
        this.f103555a = uGCMediaListSource;
        this.f103556b = list;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, List list) {
        return new em(uGCMediaListSource, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$clearVideoFrameQueue$20(this.f103555a, this.f103556b);
    }
}
