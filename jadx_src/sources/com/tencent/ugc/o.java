package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103748b;

    private o(TXVideoEditer tXVideoEditer, List list) {
        this.f103747a = tXVideoEditer;
        this.f103748b = list;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, List list) {
        return new o(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setSubtitleList$18(this.f103747a, this.f103748b);
    }
}
