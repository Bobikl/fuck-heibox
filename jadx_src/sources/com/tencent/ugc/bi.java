package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103363b;

    private bi(TXVideoEditer tXVideoEditer, List list) {
        this.f103362a = tXVideoEditer;
        this.f103363b = list;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, List list) {
        return new bi(tXVideoEditer, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103362a.setMediaSourcePathsInternal(this.f103363b);
    }
}
