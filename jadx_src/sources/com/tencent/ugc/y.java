package com.tencent.ugc;

import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103963b;

    private y(TXVideoEditer tXVideoEditer, String str) {
        this.f103962a = tXVideoEditer;
        this.f103963b = str;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, String str) {
        return new y(tXVideoEditer, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103962a.setMediaSourcePathsInternal(Collections.singletonList(this.f103963b));
    }
}
