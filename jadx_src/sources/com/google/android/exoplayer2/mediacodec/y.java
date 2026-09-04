package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.o0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public class y implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f46813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final Surface f46814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private ByteBuffer[] f46815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private ByteBuffer[] f46816d;

    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    @w0(18)
    public static final class b {
        private b() {
        }

        @androidx.annotation.u
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }

        @androidx.annotation.u
        public static void b(MediaCodec mediaCodec) {
            mediaCodec.signalEndOfInputStream();
        }
    }

    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    public static class c implements m.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.y$a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.google.android.exoplayer2.mediacodec.m.b
        public m a(m.a aVar) throws Throwable {
            MediaCodec mediaCodecB;
            Surface surfaceA;
            ?? r10 = 0;
            r10 = 0;
            r10 = 0;
            try {
                mediaCodecB = b(aVar);
                try {
                    o0.a("configureCodec");
                    mediaCodecB.configure(aVar.f46788b, aVar.f46790d, aVar.f46791e, aVar.f46792f);
                    o0.c();
                    if (!aVar.f46793g) {
                        surfaceA = null;
                    } else {
                        if (u0.f51536a < 18) {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                        surfaceA = b.a(mediaCodecB);
                    }
                    try {
                        o0.a("startCodec");
                        mediaCodecB.start();
                        o0.c();
                        return new y(mediaCodecB, surfaceA);
                    } catch (IOException | RuntimeException e10) {
                        r10 = surfaceA;
                        e = e10;
                        if (r10 != 0) {
                            r10.release();
                        }
                        if (mediaCodecB != null) {
                            mediaCodecB.release();
                        }
                        throw e;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (RuntimeException e12) {
                    e = e12;
                }
            } catch (IOException | RuntimeException e13) {
                e = e13;
                mediaCodecB = null;
            }
        }

        protected MediaCodec b(m.a aVar) throws IOException {
            com.google.android.exoplayer2.util.a.g(aVar.f46787a);
            String str = aVar.f46787a.f46797a;
            String strValueOf = String.valueOf(str);
            o0.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            o0.c();
            return mediaCodecCreateByCodecName;
        }
    }

    private y(MediaCodec mediaCodec, @p0 Surface surface) {
        this.f46813a = mediaCodec;
        this.f46814b = surface;
        if (u0.f51536a < 21) {
            this.f46815c = mediaCodec.getInputBuffers();
            this.f46816d = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(m.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @p0
    public Surface a() {
        return this.f46814b;
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void c(int i10) {
        this.f46813a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @w0(21)
    public void d(int i10, long j10) {
        this.f46813a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public int e(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f46813a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && u0.f51536a < 21) {
                this.f46816d = this.f46813a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void f(int i10, int i11, com.google.android.exoplayer2.decoder.d dVar, long j10, int i12) {
        this.f46813a.queueSecureInputBuffer(i10, i11, dVar.a(), j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void flush() {
        this.f46813a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @w0(23)
    public void g(final m.c cVar, Handler handler) {
        this.f46813a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.x
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f46811a.m(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public MediaFormat getOutputFormat() {
        return this.f46813a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @p0
    public ByteBuffer h(int i10) {
        return u0.f51536a >= 21 ? this.f46813a.getInputBuffer(i10) : ((ByteBuffer[]) u0.k(this.f46815c))[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @w0(18)
    public void i() {
        b.b(this.f46813a);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public int j() {
        return this.f46813a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @p0
    public ByteBuffer k(int i10) {
        return u0.f51536a >= 21 ? this.f46813a.getOutputBuffer(i10) : ((ByteBuffer[]) u0.k(this.f46816d))[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f46813a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void release() {
        this.f46815c = null;
        this.f46816d = null;
        Surface surface = this.f46814b;
        if (surface != null) {
            surface.release();
        }
        this.f46813a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f46813a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @w0(23)
    public void setOutputSurface(Surface surface) {
        this.f46813a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.m
    @w0(19)
    public void setParameters(Bundle bundle) {
        this.f46813a.setParameters(bundle);
    }
}
