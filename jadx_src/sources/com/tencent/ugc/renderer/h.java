package com.tencent.ugc.renderer;

import android.view.TextureView;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextureViewRenderHelper f103812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TXCloudVideoView f103813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextureView f103814c;

    private h(TextureViewRenderHelper textureViewRenderHelper, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        this.f103812a = textureViewRenderHelper;
        this.f103813b = tXCloudVideoView;
        this.f103814c = textureView;
    }

    public static Runnable a(TextureViewRenderHelper textureViewRenderHelper, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        return new h(textureViewRenderHelper, tXCloudVideoView, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper.lambda$new$0(this.f103812a, this.f103813b, this.f103814c);
    }
}
