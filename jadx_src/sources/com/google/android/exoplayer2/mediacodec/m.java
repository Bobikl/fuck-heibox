package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: MediaCodecAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public interface m {

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f46787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f46788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a2 f46789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final Surface f46790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final MediaCrypto f46791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f46792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f46793g;

        private a(n nVar, MediaFormat mediaFormat, a2 a2Var, @p0 Surface surface, @p0 MediaCrypto mediaCrypto, int i10, boolean z10) {
            this.f46787a = nVar;
            this.f46788b = mediaFormat;
            this.f46789c = a2Var;
            this.f46790d = surface;
            this.f46791e = mediaCrypto;
            this.f46792f = i10;
            this.f46793g = z10;
        }

        public static a a(n nVar, MediaFormat mediaFormat, a2 a2Var, @p0 MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, a2Var, null, mediaCrypto, 0, false);
        }

        public static a b(n nVar, MediaFormat mediaFormat, a2 a2Var) {
            return new a(nVar, mediaFormat, a2Var, null, null, 1, false);
        }

        public static a c(n nVar, MediaFormat mediaFormat, a2 a2Var, @p0 Surface surface, @p0 MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, a2Var, surface, mediaCrypto, 0, false);
        }

        @w0(18)
        public static a d(n nVar, MediaFormat mediaFormat, a2 a2Var) {
            return new a(nVar, mediaFormat, a2Var, null, null, 1, true);
        }
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46794a = new k();

        m a(a aVar) throws IOException;
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface c {
        void a(m mVar, long j10, long j11);
    }

    @p0
    Surface a();

    boolean b();

    void c(int i10);

    @w0(21)
    void d(int i10, long j10);

    int e(MediaCodec.BufferInfo bufferInfo);

    void f(int i10, int i11, com.google.android.exoplayer2.decoder.d dVar, long j10, int i12);

    void flush();

    @w0(23)
    void g(c cVar, Handler handler);

    MediaFormat getOutputFormat();

    @p0
    ByteBuffer h(int i10);

    @w0(18)
    void i();

    int j();

    @p0
    ByteBuffer k(int i10);

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void release();

    void releaseOutputBuffer(int i10, boolean z10);

    @w0(23)
    void setOutputSurface(Surface surface);

    @w0(19)
    void setParameters(Bundle bundle);
}
