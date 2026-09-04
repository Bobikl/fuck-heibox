package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class be implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103331d;

    private be(TXVideoEditer tXVideoEditer, List list, int i10, int i11) {
        this.f103328a = tXVideoEditer;
        this.f103329b = list;
        this.f103330c = i10;
        this.f103331d = i11;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, List list, int i10, int i11) {
        return new be(tXVideoEditer, list, i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setSplitScreenList$58(this.f103328a, this.f103329b, this.f103330c, this.f103331d);
    }
}
