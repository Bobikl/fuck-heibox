package com.tencent.ugc.videobase.frame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements IRecycler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f103897a = new b();

    private b() {
    }

    public static IRecycler a() {
        return f103897a;
    }

    @Override // com.tencent.ugc.videobase.frame.IRecycler
    public final void recycle(RefCounted refCounted) {
        ((GLTexturePool.TextureFrame) refCounted).mTexture.release();
    }
}
