package com.tencent.liteav.videoconsumer.renderer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f100663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RenderViewHelperInterface f100664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f100665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f100667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.tencent.liteav.videobase.base.a f100668f;

    private x(u uVar, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i10, int i11, com.tencent.liteav.videobase.base.a aVar) {
        this.f100663a = uVar;
        this.f100664b = renderViewHelperInterface;
        this.f100665c = byteBuffer;
        this.f100666d = i10;
        this.f100667e = i11;
        this.f100668f = aVar;
    }

    public static Runnable a(u uVar, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i10, int i11, com.tencent.liteav.videobase.base.a aVar) {
        return new x(uVar, renderViewHelperInterface, byteBuffer, i10, i11, aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(this.f100663a, this.f100664b, this.f100665c, this.f100666d, this.f100667e, this.f100668f);
    }
}
