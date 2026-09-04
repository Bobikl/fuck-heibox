package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextureViewRenderHelper f103820a;

    private l(TextureViewRenderHelper textureViewRenderHelper) {
        this.f103820a = textureViewRenderHelper;
    }

    public static Runnable a(TextureViewRenderHelper textureViewRenderHelper) {
        return new l(textureViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper textureViewRenderHelper = this.f103820a;
        textureViewRenderHelper.updateTextureViewRenderMatrix(textureViewRenderHelper.mTextureView);
    }
}
