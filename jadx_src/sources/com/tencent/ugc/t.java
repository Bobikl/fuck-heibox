package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103859b;

    private t(TXVideoEditer tXVideoEditer, List list) {
        this.f103858a = tXVideoEditer;
        this.f103859b = list;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, List list) {
        return new t(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setRepeatPlay$23(this.f103858a, this.f103859b);
    }
}
