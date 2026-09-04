package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f103460c;

    private d(TXVideoEditer tXVideoEditer, int i10, List list) {
        this.f103458a = tXVideoEditer;
        this.f103459b = i10;
        this.f103460c = list;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, int i10, List list) {
        return new d(tXVideoEditer, i10, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setPictureList$8(this.f103458a, this.f103459b, this.f103460c);
    }
}
