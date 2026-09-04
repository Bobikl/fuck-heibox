package com.tencent.ugc;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoJoiner f103429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103430b;

    private cj(TXVideoJoiner tXVideoJoiner, List list) {
        this.f103429a = tXVideoJoiner;
        this.f103430b = list;
    }

    public static Runnable a(TXVideoJoiner tXVideoJoiner, List list) {
        return new cj(tXVideoJoiner, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103429a.mVideoSourceList = this.f103430b;
    }
}
