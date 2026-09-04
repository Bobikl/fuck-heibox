package com.tencent.liteav.videoconsumer.renderer;

import android.view.TextureView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f100621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextureView f100622b;

    private m(k kVar, TextureView textureView) {
        this.f100621a = kVar;
        this.f100622b = textureView;
    }

    public static Runnable a(k kVar, TextureView textureView) {
        return new m(kVar, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100621a.a(this.f100622b);
    }
}
