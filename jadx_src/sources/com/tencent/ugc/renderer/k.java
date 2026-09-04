package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextureViewRenderHelper f103819a;

    private k(TextureViewRenderHelper textureViewRenderHelper) {
        this.f103819a = textureViewRenderHelper;
    }

    public static Runnable a(TextureViewRenderHelper textureViewRenderHelper) {
        return new k(textureViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper.lambda$checkViewAvailability$3(this.f103819a);
    }
}
