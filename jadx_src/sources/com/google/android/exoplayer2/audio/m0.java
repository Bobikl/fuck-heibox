package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.n3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public class m0 extends MediaCodecRenderer implements com.google.android.exoplayer2.util.w {
    private static final String H4 = "MediaCodecAudioRenderer";
    private static final String I4 = "v-bits-per-sample";

    @androidx.annotation.p0
    private a2 A4;
    private long B4;
    private boolean C4;
    private boolean D4;
    private boolean E4;
    private boolean F4;

    @androidx.annotation.p0
    private m3.c G4;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private final Context f44162v4;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private final t.a f44163w4;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private final AudioSink f44164x4;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private int f44165y4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private boolean f44166z4;

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    public final class b implements AudioSink.a {
        private b() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void a(boolean z10) {
            m0.this.f44163w4.C(z10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void b(long j10) {
            m0.this.f44163w4.B(j10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void c(int i10, long j10, long j11) {
            m0.this.f44163w4.D(i10, j10, j11);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void d(long j10) {
            if (m0.this.G4 != null) {
                m0.this.G4.b(j10);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void e() {
            m0.this.v1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void f() {
            if (m0.this.G4 != null) {
                m0.this.G4.a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void s(Exception exc) {
            com.google.android.exoplayer2.util.u.e(m0.H4, "Audio sink error", exc);
            m0.this.f44163w4.l(exc);
        }
    }

    public m0(Context context, com.google.android.exoplayer2.mediacodec.m.b bVar, com.google.android.exoplayer2.mediacodec.p pVar, boolean z10, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar, AudioSink audioSink) {
        super(1, bVar, pVar, z10, 44100.0f);
        this.f44162v4 = context.getApplicationContext();
        this.f44164x4 = audioSink;
        this.f44163w4 = new t.a(handler, tVar);
        audioSink.p(new b());
    }

    public m0(Context context, com.google.android.exoplayer2.mediacodec.p pVar) {
        this(context, pVar, null, null);
    }

    public m0(Context context, com.google.android.exoplayer2.mediacodec.p pVar, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar) {
        this(context, pVar, handler, tVar, (h) null, new AudioProcessor[0]);
    }

    public m0(Context context, com.google.android.exoplayer2.mediacodec.p pVar, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar, AudioSink audioSink) {
        this(context, com.google.android.exoplayer2.mediacodec.m.b.f46794a, pVar, false, handler, tVar, audioSink);
    }

    public m0(Context context, com.google.android.exoplayer2.mediacodec.p pVar, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar, @androidx.annotation.p0 h hVar, AudioProcessor... audioProcessorArr) {
        this(context, pVar, handler, tVar, new DefaultAudioSink(hVar, audioProcessorArr));
    }

    public m0(Context context, com.google.android.exoplayer2.mediacodec.p pVar, boolean z10, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar, AudioSink audioSink) {
        this(context, com.google.android.exoplayer2.mediacodec.m.b.f46794a, pVar, z10, handler, tVar, audioSink);
    }

    private static boolean p1(String str) {
        if (com.google.android.exoplayer2.util.u0.f51536a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(com.google.android.exoplayer2.util.u0.f51538c)) {
            String str2 = com.google.android.exoplayer2.util.u0.f51537b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean q1() {
        if (com.google.android.exoplayer2.util.u0.f51536a == 23) {
            String str = com.google.android.exoplayer2.util.u0.f51539d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int s1(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f46797a) || (i10 = com.google.android.exoplayer2.util.u0.f51536a) >= 24 || (i10 == 23 && com.google.android.exoplayer2.util.u0.L0(this.f44162v4))) {
            return a2Var.f43594n;
        }
        return -1;
    }

    private void w1() {
        long jS = this.f44164x4.s(b());
        if (jS != Long.MIN_VALUE) {
            if (!this.D4) {
                jS = Math.max(this.B4, jS);
            }
            this.B4 = jS;
            this.D4 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void E() {
        this.E4 = true;
        try {
            this.f44164x4.flush();
            try {
                super.E();
            } finally {
                this.f44163w4.o(this.Y3);
            }
        } catch (Throwable th2) {
            try {
                super.E();
                throw th2;
            } finally {
                this.f44163w4.o(this.Y3);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void F(boolean z10, boolean z11) throws ExoPlaybackException {
        super.F(z10, z11);
        this.f44163w4.p(this.Y3);
        if (y().f47323a) {
            this.f44164x4.m();
        } else {
            this.f44164x4.c();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void G(long j10, boolean z10) throws ExoPlaybackException {
        super.G(j10, z10);
        if (this.F4) {
            this.f44164x4.l();
        } else {
            this.f44164x4.flush();
        }
        this.B4 = j10;
        this.C4 = true;
        this.D4 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void G0(Exception exc) {
        com.google.android.exoplayer2.util.u.e(H4, "Audio codec error", exc);
        this.f44163w4.k(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void H() {
        try {
            super.H();
        } finally {
            if (this.E4) {
                this.E4 = false;
                this.f44164x4.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void H0(String str, long j10, long j11) {
        this.f44163w4.m(str, j10, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void I() {
        super.I();
        this.f44164x4.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void I0(String str) {
        this.f44163w4.n(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void J() {
        w1();
        this.f44164x4.pause();
        super.J();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.p0
    protected com.google.android.exoplayer2.decoder.i J0(b2 b2Var) throws ExoPlaybackException {
        com.google.android.exoplayer2.decoder.i iVarJ0 = super.J0(b2Var);
        this.f44163w4.q(b2Var.f44366b, iVarJ0);
        return iVarJ0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void K0(a2 a2Var, @androidx.annotation.p0 MediaFormat mediaFormat) throws ExoPlaybackException {
        int iM0;
        int i10;
        a2 a2Var2 = this.A4;
        int[] iArr = null;
        if (a2Var2 != null) {
            a2Var = a2Var2;
        } else if (l0() != null) {
            if (com.google.android.exoplayer2.util.y.I.equals(a2Var.f43593m)) {
                iM0 = a2Var.B;
            } else if (com.google.android.exoplayer2.util.u0.f51536a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iM0 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey(I4)) {
                iM0 = com.google.android.exoplayer2.util.u0.m0(mediaFormat.getInteger(I4));
            } else {
                iM0 = com.google.android.exoplayer2.util.y.I.equals(a2Var.f43593m) ? a2Var.B : 2;
            }
            a2 a2VarE = new a2.b().e0(com.google.android.exoplayer2.util.y.I).Y(iM0).N(a2Var.C).O(a2Var.D).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.f44166z4 && a2VarE.f43606z == 6 && (i10 = a2Var.f43606z) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < a2Var.f43606z; i11++) {
                    iArr[i11] = i11;
                }
            }
            a2Var = a2VarE;
        }
        try {
            this.f44164x4.u(a2Var, 0, iArr);
        } catch (AudioSink.ConfigurationException e10) {
            throw w(e10, e10.f43956b, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void M0() {
        super.M0();
        this.f44164x4.t();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void N0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.C4 || decoderInputBuffer.j()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f44490g - this.B4) > 500000) {
            this.B4 = decoderInputBuffer.f44490g;
        }
        this.C4 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.decoder.i P(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var, a2 a2Var2) {
        com.google.android.exoplayer2.decoder.i iVarE = nVar.e(a2Var, a2Var2);
        int i10 = iVarE.f44548e;
        if (s1(nVar, a2Var2) > this.f44165y4) {
            i10 |= 64;
        }
        int i11 = i10;
        return new com.google.android.exoplayer2.decoder.i(nVar.f46797a, a2Var, a2Var2, i11 != 0 ? 0 : iVarE.f44547d, i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean P0(long j10, long j11, @androidx.annotation.p0 com.google.android.exoplayer2.mediacodec.m mVar, @androidx.annotation.p0 ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, a2 a2Var) throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.g(byteBuffer);
        if (this.A4 != null && (i11 & 2) != 0) {
            ((com.google.android.exoplayer2.mediacodec.m) com.google.android.exoplayer2.util.a.g(mVar)).releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            if (mVar != null) {
                mVar.releaseOutputBuffer(i10, false);
            }
            this.Y3.f44517f += i12;
            this.f44164x4.t();
            return true;
        }
        try {
            if (!this.f44164x4.o(byteBuffer, j12, i12)) {
                return false;
            }
            if (mVar != null) {
                mVar.releaseOutputBuffer(i10, false);
            }
            this.Y3.f44516e += i12;
            return true;
        } catch (AudioSink.InitializationException e10) {
            throw x(e10, e10.f43959d, e10.f43958c, 5001);
        } catch (AudioSink.WriteException e11) {
            throw x(e11, a2Var, e11.f43963c, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void U0() throws ExoPlaybackException {
        try {
            this.f44164x4.r();
        } catch (AudioSink.WriteException e10) {
            throw x(e10, e10.f43964d, e10.f43963c, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.m3
    public boolean b() {
        return super.b() && this.f44164x4.b();
    }

    @Override // com.google.android.exoplayer2.util.w
    public void e(b3 b3Var) {
        this.f44164x4.e(b3Var);
    }

    @Override // com.google.android.exoplayer2.util.w
    public b3 g() {
        return this.f44164x4.g();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean g1(a2 a2Var) {
        return this.f44164x4.a(a2Var);
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public String getName() {
        return H4;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.h3.b
    public void h(int i10, @androidx.annotation.p0 Object obj) throws ExoPlaybackException {
        if (i10 == 2) {
            this.f44164x4.j(((Float) obj).floatValue());
        }
        if (i10 == 3) {
            this.f44164x4.i((f) obj);
            return;
        }
        if (i10 == 6) {
            this.f44164x4.h((x) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.f44164x4.k(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f44164x4.f(((Integer) obj).intValue());
                break;
            case 11:
                this.G4 = (m3.c) obj;
                break;
            default:
                super.h(i10, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int h1(com.google.android.exoplayer2.mediacodec.p pVar, a2 a2Var) throws MediaCodecUtil.DecoderQueryException {
        if (!com.google.android.exoplayer2.util.y.p(a2Var.f43593m)) {
            return n3.a(0);
        }
        int i10 = com.google.android.exoplayer2.util.u0.f51536a >= 21 ? 32 : 0;
        boolean z10 = a2Var.F != 0;
        boolean zI1 = MediaCodecRenderer.i1(a2Var);
        int i11 = 8;
        if (zI1 && this.f44164x4.a(a2Var) && (!z10 || MediaCodecUtil.v() != null)) {
            return n3.b(4, 8, i10);
        }
        if ((!com.google.android.exoplayer2.util.y.I.equals(a2Var.f43593m) || this.f44164x4.a(a2Var)) && this.f44164x4.a(com.google.android.exoplayer2.util.u0.n0(2, a2Var.f43606z, a2Var.A))) {
            List<com.google.android.exoplayer2.mediacodec.n> listR0 = r0(pVar, a2Var, false);
            if (listR0.isEmpty()) {
                return n3.a(1);
            }
            if (!zI1) {
                return n3.a(2);
            }
            com.google.android.exoplayer2.mediacodec.n nVar = listR0.get(0);
            boolean zO = nVar.o(a2Var);
            if (zO && nVar.q(a2Var)) {
                i11 = 16;
            }
            return n3.b(zO ? 4 : 3, i11, i10);
        }
        return n3.a(1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.m3
    public boolean isReady() {
        return this.f44164x4.n() || super.isReady();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.m3
    @androidx.annotation.p0
    public com.google.android.exoplayer2.util.w n() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float p0(float f10, a2 a2Var, a2[] a2VarArr) {
        int iMax = -1;
        for (a2 a2Var2 : a2VarArr) {
            int i10 = a2Var2.A;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List<com.google.android.exoplayer2.mediacodec.n> r0(com.google.android.exoplayer2.mediacodec.p pVar, a2 a2Var, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        com.google.android.exoplayer2.mediacodec.n nVarV;
        String str = a2Var.f43593m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f44164x4.a(a2Var) && (nVarV = MediaCodecUtil.v()) != null) {
            return Collections.singletonList(nVarV);
        }
        List<com.google.android.exoplayer2.mediacodec.n> listU = MediaCodecUtil.u(pVar.a(str, z10, false), a2Var);
        if (com.google.android.exoplayer2.util.y.N.equals(str)) {
            ArrayList arrayList = new ArrayList(listU);
            arrayList.addAll(pVar.a(com.google.android.exoplayer2.util.y.M, z10, false));
            listU = arrayList;
        }
        return Collections.unmodifiableList(listU);
    }

    public void r1(boolean z10) {
        this.F4 = z10;
    }

    @Override // com.google.android.exoplayer2.util.w
    public long s() {
        if (getState() == 2) {
            w1();
        }
        return this.B4;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.mediacodec.m.a t0(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var, @androidx.annotation.p0 MediaCrypto mediaCrypto, float f10) {
        this.f44165y4 = t1(nVar, a2Var, C());
        this.f44166z4 = p1(nVar.f46797a);
        MediaFormat mediaFormatU1 = u1(a2Var, nVar.f46799c, this.f44165y4, f10);
        this.A4 = com.google.android.exoplayer2.util.y.I.equals(nVar.f46798b) && !com.google.android.exoplayer2.util.y.I.equals(a2Var.f43593m) ? a2Var : null;
        return com.google.android.exoplayer2.mediacodec.m.a.a(nVar, mediaFormatU1, a2Var, mediaCrypto);
    }

    protected int t1(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var, a2[] a2VarArr) {
        int iS1 = s1(nVar, a2Var);
        if (a2VarArr.length == 1) {
            return iS1;
        }
        for (a2 a2Var2 : a2VarArr) {
            if (nVar.e(a2Var, a2Var2).f44547d != 0) {
                iS1 = Math.max(iS1, s1(nVar, a2Var2));
            }
        }
        return iS1;
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat u1(a2 a2Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(org.apache.tools.ant.taskdefs.email.b.I, str);
        mediaFormat.setInteger("channel-count", a2Var.f43606z);
        mediaFormat.setInteger("sample-rate", a2Var.A);
        com.google.android.exoplayer2.util.x.j(mediaFormat, a2Var.f43595o);
        com.google.android.exoplayer2.util.x.e(mediaFormat, "max-input-size", i10);
        int i11 = com.google.android.exoplayer2.util.u0.f51536a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !q1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && com.google.android.exoplayer2.util.y.O.equals(a2Var.f43593m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f44164x4.q(com.google.android.exoplayer2.util.u0.n0(4, a2Var.f43606z, a2Var.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    @androidx.annotation.i
    protected void v1() {
        this.D4 = true;
    }
}
