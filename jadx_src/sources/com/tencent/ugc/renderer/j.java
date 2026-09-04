package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextureViewRenderHelper f103817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103818b;

    private j(TextureViewRenderHelper textureViewRenderHelper, boolean z10) {
        this.f103817a = textureViewRenderHelper;
        this.f103818b = z10;
    }

    public static Runnable a(TextureViewRenderHelper textureViewRenderHelper, boolean z10) {
        return new j(textureViewRenderHelper, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper.lambda$release$2(this.f103817a, this.f103818b);
    }
}
