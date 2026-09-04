package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCMediaListSource f103520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103522c;

    private dr(UGCMediaListSource uGCMediaListSource, List list, int i10) {
        this.f103520a = uGCMediaListSource;
        this.f103521b = list;
        this.f103522c = i10;
    }

    public static Runnable a(UGCMediaListSource uGCMediaListSource, List list, int i10) {
        return new dr(uGCMediaListSource, list, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setPictureList$6(this.f103520a, this.f103521b, this.f103522c);
    }
}
