package com.tencent.ugc.videobase.frame;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements IRecycler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FramePool f103896a;

    private a(FramePool framePool) {
        this.f103896a = framePool;
    }

    public static IRecycler a(FramePool framePool) {
        return new a(framePool);
    }

    @Override // com.tencent.ugc.videobase.frame.IRecycler
    public final void recycle(RefCounted refCounted) {
        FramePool.lambda$new$0(this.f103896a, refCounted);
    }
}
