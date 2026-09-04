package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103790b;

    private q(TXVideoEditer tXVideoEditer, List list) {
        this.f103789a = tXVideoEditer;
        this.f103790b = list;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, List list) {
        return new q(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setPasterList$20(this.f103789a, this.f103790b);
    }
}
