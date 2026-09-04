package com.tencent.ugc.renderer;

import android.view.TextureView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextureViewRenderHelper f103815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextureView f103816b;

    private i(TextureViewRenderHelper textureViewRenderHelper, TextureView textureView) {
        this.f103815a = textureViewRenderHelper;
        this.f103816b = textureView;
    }

    public static Runnable a(TextureViewRenderHelper textureViewRenderHelper, TextureView textureView) {
        return new i(textureViewRenderHelper, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103815a.setup(this.f103816b);
    }
}
