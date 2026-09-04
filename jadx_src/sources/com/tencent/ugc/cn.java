package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103438b;

    private cn(TXVideoJoiner tXVideoJoiner, List list) {
        this.f103437a = tXVideoJoiner;
        this.f103438b = list;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, List list) {
        return new cn(tXVideoJoiner, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$setVideoVolumes$11(this.f103437a, this.f103438b);
    }
}
