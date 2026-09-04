package com.tencent.thumbplayer.tcmedia.g.b;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f102676a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec f102677b;

    public d(MediaCodec mediaCodec) {
        this.f102677b = mediaCodec;
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper sCodecNum:" + f102676a.incrementAndGet());
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final int a(long j10) {
        return this.f102677b.dequeueInputBuffer(j10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final int a(MediaCodec.BufferInfo bufferInfo, long j10) {
        return this.f102677b.dequeueOutputBuffer(bufferInfo, j10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final MediaCodec a() {
        return this.f102677b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void a(int i10, int i11, int i12, long j10, int i13) {
        this.f102677b.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void a(int i10, boolean z10) {
        this.f102677b.releaseOutputBuffer(i10, z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f102677b.configure(mediaFormat, surface, mediaCrypto, i10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void a(Surface surface) {
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper setOutputSurface start, surface:".concat(String.valueOf(surface)));
        this.f102677b.setOutputSurface(surface);
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper setOutputSurface end ...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void a(com.tencent.thumbplayer.tcmedia.g.a.a aVar) {
        com.tencent.thumbplayer.tcmedia.g.h.b.d("DirectCodecWrapper", "DirectCodecWrapper setCodecCallback ignore...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final com.tencent.thumbplayer.tcmedia.g.f.a.b b(e eVar) {
        com.tencent.thumbplayer.tcmedia.g.h.b.d("DirectCodecWrapper", "setCanReuseType setCodecCallback ignore...");
        return com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void b() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void c() {
        com.tencent.thumbplayer.tcmedia.g.h.b.d("DirectCodecWrapper", "DirectCodecWrapper prepareToReUse ignore...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void d() {
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper start ...");
        this.f102677b.start();
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper start end...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void e() {
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper flush start ...");
        this.f102677b.flush();
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper flush end ...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void f() {
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper stop before ...");
        this.f102677b.stop();
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper stop end ...");
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public final void g() {
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper release start ...");
        this.f102677b.release();
        com.tencent.thumbplayer.tcmedia.g.h.b.c("DirectCodecWrapper", "DirectCodecWrapper release end ... sCodecNum:" + f102676a.decrementAndGet());
    }
}
