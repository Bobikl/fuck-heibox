package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103857b;

    private s(TXVideoEditer tXVideoEditer, List list) {
        this.f103856a = tXVideoEditer;
        this.f103857b = list;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, List list) {
        return new s(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setSpeedList$22(this.f103856a, this.f103857b);
    }
}
