package com.tencent.thumbplayer.tcmedia.g.b;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public interface c {
    int a(long j10);

    int a(MediaCodec.BufferInfo bufferInfo, long j10);

    MediaCodec a();

    void a(int i10, int i11, int i12, long j10, int i13);

    void a(int i10, boolean z10);

    void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10);

    void a(Surface surface);

    void a(com.tencent.thumbplayer.tcmedia.g.a.a aVar);

    com.tencent.thumbplayer.tcmedia.g.f.a.b b(e eVar);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();
}
