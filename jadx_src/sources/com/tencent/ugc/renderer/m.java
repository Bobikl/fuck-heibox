package com.tencent.ugc.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextureViewRenderHelper.AnonymousClass1 f103821a;

    private m(TextureViewRenderHelper.AnonymousClass1 anonymousClass1) {
        this.f103821a = anonymousClass1;
    }

    public static Runnable a(TextureViewRenderHelper.AnonymousClass1 anonymousClass1) {
        return new m(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper.this.notifyFirstFrameRendered();
    }
}
