package com.tencent.liteav.videoconsumer.renderer;

import android.view.TextureView;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f100618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXCloudVideoView f100619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextureView f100620c;

    private l(k kVar, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        this.f100618a = kVar;
        this.f100619b = tXCloudVideoView;
        this.f100620c = textureView;
    }

    public static Runnable a(k kVar, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        return new l(kVar, tXCloudVideoView, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.a(this.f100618a, this.f100619b, this.f100620c);
    }
}
