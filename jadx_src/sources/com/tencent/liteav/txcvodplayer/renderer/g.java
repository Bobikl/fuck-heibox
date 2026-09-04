package com.tencent.liteav.txcvodplayer.renderer;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f100203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayTarget f100204b;

    private g(d dVar, DisplayTarget displayTarget) {
        this.f100203a = dVar;
        this.f100204b = displayTarget;
    }

    public static Runnable a(d dVar, DisplayTarget displayTarget) {
        return new g(dVar, displayTarget);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.a(this.f100203a, this.f100204b);
    }
}
