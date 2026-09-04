package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.o0;
import com.google.common.base.c0;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(23)
public final class c implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f46717h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f46718i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f46719j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f46720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f46721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f46722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f46723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Surface f46726g;

    /* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
    public static final class b implements m.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0<HandlerThread> f46727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c0<HandlerThread> f46728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f46729d;

        public b(int i10) {
            this(i10, false);
        }

        public b(final int i10, boolean z10) {
            this(new c0() { // from class: com.google.android.exoplayer2.mediacodec.d
                @Override // com.google.common.base.c0
                public final Object get() {
                    return c.b.e(i10);
                }
            }, new c0() { // from class: com.google.android.exoplayer2.mediacodec.e
                @Override // com.google.common.base.c0
                public final Object get() {
                    return c.b.f(i10);
                }
            }, z10);
        }

        @j1
        b(c0<HandlerThread> c0Var, c0<HandlerThread> c0Var2, boolean z10) {
            this.f46727b = c0Var;
            this.f46728c = c0Var2;
            this.f46729d = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(c.p(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(c.q(i10));
        }

        @Override // com.google.android.exoplayer2.mediacodec.m.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(m.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f46787a.f46797a;
            c cVar = null;
            try {
                String strValueOf = String.valueOf(str);
                o0.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    c cVar2 = new c(mediaCodecCreateByCodecName, this.f46727b.get(), this.f46728c.get(), this.f46729d);
                    try {
                        o0.c();
                        cVar2.s(aVar.f46788b, aVar.f46790d, aVar.f46791e, aVar.f46792f, aVar.f46793g);
                        return cVar2;
                    } catch (Exception e10) {
                        e = e10;
                        cVar = cVar2;
                        if (cVar != null) {
                            cVar.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    private c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f46720a = mediaCodec;
        this.f46721b = new h(handlerThread);
        this.f46722c = new f(mediaCodec, handlerThread2);
        this.f46723d = z10;
        this.f46725f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String p(int i10) {
        return r(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String q(int i10) {
        return r(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String r(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(@p0 MediaFormat mediaFormat, @p0 Surface surface, @p0 MediaCrypto mediaCrypto, int i10, boolean z10) {
        this.f46721b.h(this.f46720a);
        o0.a("configureCodec");
        this.f46720a.configure(mediaFormat, surface, mediaCrypto, i10);
        o0.c();
        if (z10) {
            this.f46726g = this.f46720a.createInputSurface();
        }
        this.f46722c.r();
        o0.a("startCodec");
        this.f46720a.start();
        o0.c();
        this.f46725f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(m.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void u() {
        if (this.f46723d) {
            try {
                this.f46722c.s();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @p0
    public Surface a() {
        return this.f46726g;
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void c(int i10) {
        u();
        this.f46720a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void d(int i10, long j10) {
        this.f46720a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public int e(MediaCodec.BufferInfo bufferInfo) {
        return this.f46721b.d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void f(int i10, int i11, com.google.android.exoplayer2.decoder.d dVar, long j10, int i12) {
        this.f46722c.n(i10, i11, dVar, j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void flush() {
        this.f46722c.i();
        this.f46720a.flush();
        h hVar = this.f46721b;
        final MediaCodec mediaCodec = this.f46720a;
        Objects.requireNonNull(mediaCodec);
        hVar.e(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.b
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void g(final m.c cVar, Handler handler) {
        u();
        this.f46720a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f46714a.t(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public MediaFormat getOutputFormat() {
        return this.f46721b.g();
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @p0
    public ByteBuffer h(int i10) {
        return this.f46720a.getInputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void i() {
        this.f46720a.signalEndOfInputStream();
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public int j() {
        return this.f46721b.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @p0
    public ByteBuffer k(int i10) {
        return this.f46720a.getOutputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f46722c.m(i10, i11, i12, j10, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void release() {
        try {
            if (this.f46725f == 1) {
                this.f46722c.q();
                this.f46721b.q();
            }
            this.f46725f = 2;
        } finally {
            Surface surface = this.f46726g;
            if (surface != null) {
                surface.release();
            }
            if (!this.f46724e) {
                this.f46720a.release();
                this.f46724e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f46720a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void setOutputSurface(Surface surface) {
        u();
        this.f46720a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void setParameters(Bundle bundle) {
        u();
        this.f46720a.setParameters(bundle);
    }

    @j1
    void v(MediaCodec.CodecException codecException) {
        this.f46721b.onError(this.f46720a, codecException);
    }

    @j1
    void w(MediaFormat mediaFormat) {
        this.f46721b.onOutputFormatChanged(this.f46720a, mediaFormat);
    }
}
