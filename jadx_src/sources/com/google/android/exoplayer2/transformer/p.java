package com.google.android.exoplayer2.transformer;

import android.media.MediaCodec;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.s0;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TransformerAudioRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class p extends q {
    private static final String G = "TransformerAudioRenderer";
    private static final int H = 131072;
    private static final float I = -1.0f;
    private ByteBuffer A;
    private long B;
    private float C;
    private boolean D;
    private boolean E;
    private boolean F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f50321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DecoderInputBuffer f50322t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final s0 f50323u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private c f50324v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private c f50325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private j f50326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a2 f50327y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AudioProcessor.a f50328z;

    public p(e eVar, s sVar, m mVar) {
        super(1, eVar, sVar, mVar);
        this.f50321s = new DecoderInputBuffer(0);
        this.f50322t = new DecoderInputBuffer(0);
        this.f50323u = new s0();
        this.A = AudioProcessor.f43946a;
        this.B = 0L;
        this.C = -1.0f;
    }

    private ExoPlaybackException N(Throwable th2, int i10) {
        return ExoPlaybackException.l(th2, G, A(), this.f50327y, 4, false, i10);
    }

    @mk.e(expression = {"decoderInputFormat", "decoder"}, result = true)
    private boolean O() throws ExoPlaybackException {
        if (this.f50324v != null && this.f50327y != null) {
            return true;
        }
        b2 b2VarZ = z();
        if (L(b2VarZ, this.f50321s, 2) != -5) {
            return false;
        }
        a2 a2Var = (a2) com.google.android.exoplayer2.util.a.g(b2VarZ.f44366b);
        this.f50327y = a2Var;
        try {
            c cVarA = c.a(a2Var);
            i iVar = new i(this.f50327y);
            this.f50326x = iVar;
            this.C = iVar.a(0L);
            this.f50324v = cVarA;
            return true;
        } catch (IOException e10) {
            throw N(e10, 1000);
        }
    }

    @mk.e(expression = {"encoder", "encoderInputAudioFormat"}, result = true)
    @mk.m({"decoder", "decoderInputFormat"})
    private boolean P() throws ExoPlaybackException {
        if (this.f50325w != null && this.f50328z != null) {
            return true;
        }
        a2 a2VarJ = this.f50324v.j();
        if (a2VarJ == null) {
            return false;
        }
        AudioProcessor.a aVar = new AudioProcessor.a(a2VarJ.A, a2VarJ.f43606z, a2VarJ.B);
        if (this.f50331p.f50287c) {
            try {
                aVar = this.f50323u.e(aVar);
                W(this.C);
            } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                throw N(e10, 1000);
            }
        }
        String str = this.f50331p.f50289e;
        if (str == null) {
            str = this.f50327y.f43593m;
        }
        try {
            this.f50325w = c.b(new a2.b().e0(str).f0(aVar.f43948a).H(aVar.f43949b).G(131072).E());
            this.f50328z = aVar;
            return true;
        } catch (IOException e11) {
            throw N(e11, 1000);
        }
    }

    private boolean Q(c cVar) {
        if (!cVar.m(this.f50321s)) {
            return false;
        }
        this.f50321s.f();
        int iL = L(z(), this.f50321s, 0);
        if (iL == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (iL != -4) {
            return false;
        }
        this.f50330o.a(d(), this.f50321s.f44490g);
        DecoderInputBuffer decoderInputBuffer = this.f50321s;
        decoderInputBuffer.f44490g -= this.f50333r;
        decoderInputBuffer.p();
        cVar.o(this.f50321s);
        return !this.f50321s.k();
    }

    @mk.m({"encoderInputAudioFormat"})
    private void R(c cVar, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = (ByteBuffer) com.google.android.exoplayer2.util.a.g(this.f50322t.f44488e);
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + byteBuffer2.capacity()));
        byteBuffer2.put(byteBuffer);
        DecoderInputBuffer decoderInputBuffer = this.f50322t;
        long j10 = this.B;
        decoderInputBuffer.f44490g = j10;
        long jPosition = byteBuffer2.position();
        AudioProcessor.a aVar = this.f50328z;
        this.B = j10 + X(jPosition, aVar.f43951d, aVar.f43948a);
        this.f50322t.m(0);
        this.f50322t.p();
        byteBuffer.limit(iLimit);
        cVar.o(this.f50322t);
    }

    @mk.m({"encoderInputAudioFormat"})
    private boolean S(c cVar, c cVar2) {
        if (!cVar2.m(this.f50322t)) {
            return false;
        }
        if (cVar.k()) {
            Z(cVar2);
            return false;
        }
        ByteBuffer byteBufferH = cVar.h();
        if (byteBufferH == null) {
            return false;
        }
        if (Y((MediaCodec.BufferInfo) com.google.android.exoplayer2.util.a.g(cVar.i()))) {
            W(this.C);
            return false;
        }
        R(cVar2, byteBufferH);
        if (byteBufferH.hasRemaining()) {
            return true;
        }
        cVar.q();
        return true;
    }

    @mk.m({"encoderInputAudioFormat"})
    private boolean T(c cVar, c cVar2) {
        if (!cVar2.m(this.f50322t)) {
            return false;
        }
        if (!this.A.hasRemaining()) {
            ByteBuffer byteBufferD = this.f50323u.d();
            this.A = byteBufferD;
            if (!byteBufferD.hasRemaining()) {
                if (cVar.k() && this.f50323u.b()) {
                    Z(cVar2);
                }
                return false;
            }
        }
        R(cVar2, this.A);
        return true;
    }

    private boolean U(c cVar) {
        if (!this.E) {
            a2 a2VarJ = cVar.j();
            if (a2VarJ == null) {
                return false;
            }
            this.E = true;
            this.f50329n.a(a2VarJ);
        }
        if (cVar.k()) {
            this.f50329n.c(d());
            this.D = true;
            return false;
        }
        ByteBuffer byteBufferH = cVar.h();
        if (byteBufferH == null) {
            return false;
        }
        if (!this.f50329n.h(d(), byteBufferH, true, ((MediaCodec.BufferInfo) com.google.android.exoplayer2.util.a.g(cVar.i())).presentationTimeUs)) {
            return false;
        }
        cVar.q();
        return true;
    }

    private boolean V(c cVar) {
        if (this.F) {
            if (this.f50323u.b() && !this.A.hasRemaining()) {
                W(this.C);
                this.F = false;
            }
            return false;
        }
        if (this.A.hasRemaining()) {
            return false;
        }
        if (cVar.k()) {
            this.f50323u.c();
            return false;
        }
        com.google.android.exoplayer2.util.a.i(!this.f50323u.b());
        ByteBuffer byteBufferH = cVar.h();
        if (byteBufferH == null) {
            return false;
        }
        if (Y((MediaCodec.BufferInfo) com.google.android.exoplayer2.util.a.g(cVar.i()))) {
            this.f50323u.c();
            this.F = true;
            return false;
        }
        this.f50323u.a(byteBufferH);
        if (!byteBufferH.hasRemaining()) {
            cVar.q();
        }
        return true;
    }

    private void W(float f10) {
        this.f50323u.i(f10);
        this.f50323u.h(f10);
        this.f50323u.flush();
    }

    private static long X(long j10, int i10, int i11) {
        return ((j10 / ((long) i10)) * 1000000) / ((long) i11);
    }

    private boolean Y(MediaCodec.BufferInfo bufferInfo) {
        if (!this.f50331p.f50287c) {
            return false;
        }
        float fA = ((j) com.google.android.exoplayer2.util.a.g(this.f50326x)).a(bufferInfo.presentationTimeUs);
        boolean z10 = fA != this.C;
        this.C = fA;
        return z10;
    }

    private void Z(c cVar) {
        com.google.android.exoplayer2.util.a.i(((ByteBuffer) com.google.android.exoplayer2.util.a.g(this.f50322t.f44488e)).position() == 0);
        DecoderInputBuffer decoderInputBuffer = this.f50322t;
        decoderInputBuffer.f44490g = this.B;
        decoderInputBuffer.e(4);
        this.f50322t.p();
        cVar.o(this.f50322t);
    }

    @Override // com.google.android.exoplayer2.e
    protected void H() {
        this.f50321s.f();
        this.f50321s.f44488e = null;
        this.f50322t.f();
        this.f50322t.f44488e = null;
        this.f50323u.reset();
        c cVar = this.f50324v;
        if (cVar != null) {
            cVar.p();
            this.f50324v = null;
        }
        c cVar2 = this.f50325w;
        if (cVar2 != null) {
            cVar2.p();
            this.f50325w = null;
        }
        this.f50326x = null;
        this.A = AudioProcessor.f43946a;
        this.B = 0L;
        this.C = -1.0f;
        this.D = false;
        this.E = false;
        this.F = false;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return this.D;
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public String getName() {
        return G;
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) throws ExoPlaybackException {
        if (this.f50332q && !b() && O()) {
            c cVar = this.f50324v;
            if (P()) {
                c cVar2 = this.f50325w;
                while (U(cVar2)) {
                }
                if (this.f50323u.isActive()) {
                    while (T(cVar, cVar2)) {
                    }
                    while (V(cVar)) {
                    }
                } else {
                    while (S(cVar, cVar2)) {
                    }
                }
            }
            while (Q(cVar)) {
            }
        }
    }
}
