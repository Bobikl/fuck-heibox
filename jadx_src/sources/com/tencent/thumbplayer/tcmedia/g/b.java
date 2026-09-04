package com.tencent.thumbplayer.tcmedia.g;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.g.b.c;
import com.tencent.thumbplayer.tcmedia.g.h.d;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f102657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f102658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f102659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.g.a.a f102660d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f102663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f102664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC1023b f102665i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f102662f = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.tencent.thumbplayer.tcmedia.g.g.a f102661e = new com.tencent.thumbplayer.tcmedia.g.g.a(b());

    public static abstract class a {
        public abstract void onError(b bVar, MediaCodec.CodecException codecException);

        public abstract void onInputBufferAvailable(b bVar, int i10);

        public abstract void onOutputBufferAvailable(b bVar, int i10, MediaCodec.BufferInfo bufferInfo);

        public abstract void onOutputFormatChanged(b bVar, MediaFormat mediaFormat);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b$b, reason: collision with other inner class name */
    public enum EnumC1023b {
        CreateByName,
        CreateByType
    }

    public static final class c extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f102671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f102672b;

        public c(b bVar, a aVar) {
            this.f102671a = bVar;
            this.f102672b = aVar;
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            a aVar = this.f102672b;
            if (aVar != null) {
                aVar.onError(this.f102671a, codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
            a aVar = this.f102672b;
            if (aVar != null) {
                aVar.onInputBufferAvailable(this.f102671a, i10);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
            a aVar = this.f102672b;
            if (aVar != null) {
                aVar.onOutputBufferAvailable(this.f102671a, i10, bufferInfo);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            a aVar = this.f102672b;
            if (aVar != null) {
                aVar.onOutputFormatChanged(this.f102671a, mediaFormat);
            }
        }
    }

    private b(String str, EnumC1023b enumC1023b) {
        this.f102664h = str;
        this.f102665i = enumC1023b;
    }

    public static b a(String str) {
        return new b(str, EnumC1023b.CreateByName);
    }

    private void b(Surface surface) {
        this.f102657a = com.tencent.thumbplayer.tcmedia.g.a.a().a(this, surface);
        this.f102661e.a();
        this.f102661e.b();
        this.f102661e.a(this.f102657a);
    }

    private void m() {
        this.f102661e.b(this.f102658b);
        d.b(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.g.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f102659c != null) {
                    b.this.f102659c.a(b.this.f102660d);
                }
                if (b.this.f102660d != null) {
                    b.this.f102660d.onCreate(Boolean.valueOf(b.this.f102658b));
                }
            }
        });
    }

    private void n() {
        this.f102661e.c();
    }

    private void o() {
        this.f102661e.d();
        d.b(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.g.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f102660d != null) {
                    b.this.f102660d.onStarted(Boolean.valueOf(b.this.f102658b), b.this.f102661e.e());
                }
            }
        });
    }

    public final int a(long j10) {
        c cVar = this.f102659c;
        if (cVar != null) {
            return cVar.a(j10);
        }
        return -1000;
    }

    public final int a(MediaCodec.BufferInfo bufferInfo, long j10) {
        c cVar = this.f102659c;
        if (cVar != null) {
            return cVar.a(bufferInfo, j10);
        }
        return -1000;
    }

    public final EnumC1023b a() {
        return this.f102665i;
    }

    public final ByteBuffer a(int i10) {
        MediaCodec mediaCodecA;
        c cVar = this.f102659c;
        if (cVar == null || (mediaCodecA = cVar.a()) == null) {
            return null;
        }
        return mediaCodecA.getOutputBuffer(i10);
    }

    public final void a(int i10, int i11, int i12, long j10, int i13) {
        c cVar = this.f102659c;
        if (cVar != null) {
            cVar.a(i10, i11, i12, j10, i13);
        }
    }

    public final void a(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        MediaCodec mediaCodecA;
        c cVar = this.f102659c;
        if (cVar == null || (mediaCodecA = cVar.a()) == null) {
            return;
        }
        mediaCodecA.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
    }

    public final void a(int i10, boolean z10) {
        c cVar = this.f102659c;
        if (cVar != null) {
            cVar.a(i10, z10);
        }
    }

    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        if (!this.f102663g) {
            this.f102663g = true;
            b(surface);
            try {
                this.f102659c = com.tencent.thumbplayer.tcmedia.g.a.a().a(mediaFormat, surface, mediaCrypto, i10, this);
            } catch (IOException e10) {
                com.tencent.thumbplayer.tcmedia.g.h.b.b("TMediaCodec", "createCodec mediaFormat:".concat(String.valueOf(mediaFormat)), e10);
            }
            m();
            return;
        }
        com.tencent.thumbplayer.tcmedia.g.h.b.d("TMediaCodec", "configure ignored, mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i10 + " stack:" + Log.getStackTraceString(new Throwable()));
    }

    public final void a(Bundle bundle) {
        MediaCodec mediaCodecA;
        c cVar = this.f102659c;
        if (cVar == null || (mediaCodecA = cVar.a()) == null) {
            return;
        }
        mediaCodecA.setParameters(bundle);
    }

    public final void a(Surface surface) {
        c cVar = this.f102659c;
        if (cVar != null) {
            cVar.a(surface);
        }
    }

    public final void a(com.tencent.thumbplayer.tcmedia.g.a.a aVar) {
        this.f102660d = aVar;
    }

    public final void a(a aVar, Handler handler) {
        MediaCodec mediaCodecA;
        c cVar = this.f102659c;
        if (cVar == null || (mediaCodecA = cVar.a()) == null) {
            return;
        }
        mediaCodecA.setCallback(new c(this, aVar), handler);
    }

    public final void a(boolean z10) {
        this.f102662f = z10;
    }

    public final Image b(int i10) {
        c cVar = this.f102659c;
        if (cVar != null) {
            return cVar.a().getOutputImage(i10);
        }
        return null;
    }

    public final boolean b() {
        return com.tencent.thumbplayer.tcmedia.g.h.c.a(this.f102664h);
    }

    public final com.tencent.thumbplayer.tcmedia.g.a.a c() {
        return this.f102660d;
    }

    public final ByteBuffer c(int i10) {
        c cVar = this.f102659c;
        if (cVar != null) {
            return cVar.a().getInputBuffer(i10);
        }
        return null;
    }

    public final void d(int i10) {
        MediaCodec mediaCodecA;
        c cVar = this.f102659c;
        if (cVar == null || (mediaCodecA = cVar.a()) == null) {
            return;
        }
        mediaCodecA.setVideoScalingMode(i10);
    }

    public final boolean d() {
        return this.f102662f;
    }

    public final void e() {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("TMediaCodec", "start codecWrapper:" + this.f102659c);
        }
        n();
        c cVar = this.f102659c;
        if (cVar != null) {
            cVar.d();
        }
        o();
    }

    public final void f() {
        c cVar = this.f102659c;
        if (cVar != null) {
            cVar.f();
        }
    }

    public final void g() {
        c cVar = this.f102659c;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h() {
        c cVar = this.f102659c;
        if (cVar != null) {
            cVar.e();
        }
    }

    public final MediaFormat i() {
        MediaCodec mediaCodecA;
        c cVar = this.f102659c;
        if (cVar == null || (mediaCodecA = cVar.a()) == null) {
            return null;
        }
        return mediaCodecA.getOutputFormat();
    }

    public final ByteBuffer[] j() {
        MediaCodec mediaCodecA;
        c cVar = this.f102659c;
        if (cVar == null || (mediaCodecA = cVar.a()) == null) {
            return null;
        }
        return mediaCodecA.getInputBuffers();
    }

    public final ByteBuffer[] k() {
        MediaCodec mediaCodecA;
        c cVar = this.f102659c;
        if (cVar == null || (mediaCodecA = cVar.a()) == null) {
            return null;
        }
        return mediaCodecA.getOutputBuffers();
    }

    public final String l() {
        return this.f102664h;
    }
}
