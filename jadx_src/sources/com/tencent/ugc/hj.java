package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor.b f103712a;

    private hj(UGCVideoProcessor.b bVar) {
        this.f103712a = bVar;
    }

    public static Runnable a(UGCVideoProcessor.b bVar) {
        return new hj(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.b.a(this.f103712a);
    }
}
