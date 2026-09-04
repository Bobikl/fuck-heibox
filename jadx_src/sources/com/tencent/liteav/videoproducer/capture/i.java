package com.tencent.liteav.videoproducer.capture;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VirtualDisplayManager f100776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f100777b;

    private i(VirtualDisplayManager virtualDisplayManager, Surface surface) {
        this.f100776a = virtualDisplayManager;
        this.f100777b = surface;
    }

    public static Runnable a(VirtualDisplayManager virtualDisplayManager, Surface surface) {
        return new i(virtualDisplayManager, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualDisplayManager.a(this.f100776a, this.f100777b);
    }
}
