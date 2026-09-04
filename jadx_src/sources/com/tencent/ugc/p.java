package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103750b;

    private p(TXVideoEditer tXVideoEditer, List list) {
        this.f103749a = tXVideoEditer;
        this.f103750b = list;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, List list) {
        return new p(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setAnimatedPasterList$19(this.f103749a, this.f103750b);
    }
}
