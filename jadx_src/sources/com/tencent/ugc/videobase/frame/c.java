package com.tencent.ugc.videobase.frame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements IRecycler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f103898a = new c();

    private c() {
    }

    public static IRecycler a() {
        return f103898a;
    }

    @Override // com.tencent.ugc.videobase.frame.IRecycler
    public final void recycle(RefCounted refCounted) {
        ((TextureHolderPool.a) refCounted).f103895a.release();
    }
}
