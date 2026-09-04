package com.google.android.exoplayer2.audio;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.f;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.n3;

/* JADX INFO: compiled from: DecoderAudioRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a0<T extends com.google.android.exoplayer2.decoder.f<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.l, ? extends DecoderException>> extends com.google.android.exoplayer2.e implements com.google.android.exoplayer2.util.w {
    private static final String I = "DecoderAudioRenderer";
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private int A;
    private boolean B;
    private boolean C;
    private long D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t.a f44065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AudioSink f44066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final DecoderInputBuffer f44067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.exoplayer2.decoder.g f44068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a2 f44069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f44070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f44072u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private T f44073v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private DecoderInputBuffer f44074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.decoder.l f44075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    private DrmSession f44076y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.p0
    private DrmSession f44077z;

    /* JADX INFO: compiled from: DecoderAudioRenderer.java */
    public final class b implements AudioSink.a {
        private b() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void a(boolean z10) {
            a0.this.f44065n.C(z10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void b(long j10) {
            a0.this.f44065n.B(j10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void c(int i10, long j10, long j11) {
            a0.this.f44065n.D(i10, j10, j11);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public /* synthetic */ void d(long j10) {
            u.c(this, j10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void e() {
            a0.this.Y();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public /* synthetic */ void f() {
            u.b(this);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void s(Exception exc) {
            com.google.android.exoplayer2.util.u.e(a0.I, "Audio sink error", exc);
            a0.this.f44065n.l(exc);
        }
    }

    public a0() {
        this((Handler) null, (t) null, new AudioProcessor[0]);
    }

    public a0(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar, AudioSink audioSink) {
        super(1);
        this.f44065n = new t.a(handler, tVar);
        this.f44066o = audioSink;
        audioSink.p(new b());
        this.f44067p = DecoderInputBuffer.r();
        this.A = 0;
        this.C = true;
    }

    public a0(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar, @androidx.annotation.p0 h hVar, AudioProcessor... audioProcessorArr) {
        this(handler, tVar, new DefaultAudioSink(hVar, audioProcessorArr));
    }

    public a0(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 t tVar, AudioProcessor... audioProcessorArr) {
        this(handler, tVar, null, audioProcessorArr);
    }

    private boolean Q() throws ExoPlaybackException, AudioSink.WriteException, AudioSink.InitializationException, AudioSink.ConfigurationException, DecoderException {
        if (this.f44075x == null) {
            com.google.android.exoplayer2.decoder.l lVar = (com.google.android.exoplayer2.decoder.l) this.f44073v.dequeueOutputBuffer();
            this.f44075x = lVar;
            if (lVar == null) {
                return false;
            }
            int i10 = lVar.f44524d;
            if (i10 > 0) {
                this.f44068q.f44517f += i10;
                this.f44066o.t();
            }
        }
        if (this.f44075x.k()) {
            if (this.A == 2) {
                b0();
                W();
                this.C = true;
            } else {
                this.f44075x.n();
                this.f44075x = null;
                try {
                    a0();
                } catch (AudioSink.WriteException e10) {
                    throw x(e10, e10.f43964d, e10.f43963c, 5002);
                }
            }
            return false;
        }
        if (this.C) {
            this.f44066o.u(U(this.f44073v).c().N(this.f44070s).O(this.f44071t).E(), 0, null);
            this.C = false;
        }
        AudioSink audioSink = this.f44066o;
        com.google.android.exoplayer2.decoder.l lVar2 = this.f44075x;
        if (!audioSink.o(lVar2.f44564f, lVar2.f44523c, 1)) {
            return false;
        }
        this.f44068q.f44516e++;
        this.f44075x.n();
        this.f44075x = null;
        return true;
    }

    private boolean S() throws ExoPlaybackException, DecoderException {
        T t10 = this.f44073v;
        if (t10 == null || this.A == 2 || this.G) {
            return false;
        }
        if (this.f44074w == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) t10.a();
            this.f44074w = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.A == 1) {
            this.f44074w.m(4);
            this.f44073v.c(this.f44074w);
            this.f44074w = null;
            this.A = 2;
            return false;
        }
        b2 b2VarZ = z();
        int iL = L(b2VarZ, this.f44074w, 0);
        if (iL == -5) {
            X(b2VarZ);
            return true;
        }
        if (iL != -4) {
            if (iL == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f44074w.k()) {
            this.G = true;
            this.f44073v.c(this.f44074w);
            this.f44074w = null;
            return false;
        }
        this.f44074w.p();
        DecoderInputBuffer decoderInputBuffer2 = this.f44074w;
        decoderInputBuffer2.f44486c = this.f44069r;
        Z(decoderInputBuffer2);
        this.f44073v.c(this.f44074w);
        this.B = true;
        this.f44068q.f44514c++;
        this.f44074w = null;
        return true;
    }

    private void T() throws ExoPlaybackException {
        if (this.A != 0) {
            b0();
            W();
            return;
        }
        this.f44074w = null;
        com.google.android.exoplayer2.decoder.l lVar = this.f44075x;
        if (lVar != null) {
            lVar.n();
            this.f44075x = null;
        }
        this.f44073v.flush();
        this.B = false;
    }

    private void W() throws ExoPlaybackException {
        if (this.f44073v != null) {
            return;
        }
        c0(this.f44077z);
        com.google.android.exoplayer2.decoder.c cVarT = null;
        DrmSession drmSession = this.f44076y;
        if (drmSession != null && (cVarT = drmSession.t()) == null && this.f44076y.q() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            com.google.android.exoplayer2.util.o0.a("createAudioDecoder");
            this.f44073v = (T) P(this.f44069r, cVarT);
            com.google.android.exoplayer2.util.o0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f44065n.m(this.f44073v.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f44068q.f44512a++;
        } catch (DecoderException e10) {
            com.google.android.exoplayer2.util.u.e(I, "Audio codec error", e10);
            this.f44065n.k(e10);
            throw w(e10, this.f44069r, 4001);
        } catch (OutOfMemoryError e11) {
            throw w(e11, this.f44069r, 4001);
        }
    }

    private void X(b2 b2Var) throws ExoPlaybackException {
        a2 a2Var = (a2) com.google.android.exoplayer2.util.a.g(b2Var.f44366b);
        d0(b2Var.f44365a);
        a2 a2Var2 = this.f44069r;
        this.f44069r = a2Var;
        this.f44070s = a2Var.C;
        this.f44071t = a2Var.D;
        T t10 = this.f44073v;
        if (t10 == null) {
            W();
            this.f44065n.q(this.f44069r, null);
            return;
        }
        com.google.android.exoplayer2.decoder.i iVar = this.f44077z != this.f44076y ? new com.google.android.exoplayer2.decoder.i(t10.getName(), a2Var2, a2Var, 0, 128) : O(t10.getName(), a2Var2, a2Var);
        if (iVar.f44547d == 0) {
            if (this.B) {
                this.A = 1;
            } else {
                b0();
                W();
                this.C = true;
            }
        }
        this.f44065n.q(this.f44069r, iVar);
    }

    private void a0() throws AudioSink.WriteException {
        this.H = true;
        this.f44066o.r();
    }

    private void b0() {
        this.f44074w = null;
        this.f44075x = null;
        this.A = 0;
        this.B = false;
        T t10 = this.f44073v;
        if (t10 != null) {
            this.f44068q.f44513b++;
            t10.release();
            this.f44065n.n(this.f44073v.getName());
            this.f44073v = null;
        }
        c0(null);
    }

    private void c0(@androidx.annotation.p0 DrmSession drmSession) {
        com.google.android.exoplayer2.drm.k.b(this.f44076y, drmSession);
        this.f44076y = drmSession;
    }

    private void d0(@androidx.annotation.p0 DrmSession drmSession) {
        com.google.android.exoplayer2.drm.k.b(this.f44077z, drmSession);
        this.f44077z = drmSession;
    }

    private void g0() {
        long jS = this.f44066o.s(b());
        if (jS != Long.MIN_VALUE) {
            if (!this.F) {
                jS = Math.max(this.D, jS);
            }
            this.D = jS;
            this.F = false;
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void E() {
        this.f44069r = null;
        this.C = true;
        try {
            d0(null);
            b0();
            this.f44066o.reset();
        } finally {
            this.f44065n.o(this.f44068q);
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void F(boolean z10, boolean z11) throws ExoPlaybackException {
        com.google.android.exoplayer2.decoder.g gVar = new com.google.android.exoplayer2.decoder.g();
        this.f44068q = gVar;
        this.f44065n.p(gVar);
        if (y().f47323a) {
            this.f44066o.m();
        } else {
            this.f44066o.c();
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void G(long j10, boolean z10) throws ExoPlaybackException {
        if (this.f44072u) {
            this.f44066o.l();
        } else {
            this.f44066o.flush();
        }
        this.D = j10;
        this.E = true;
        this.F = true;
        this.G = false;
        this.H = false;
        if (this.f44073v != null) {
            T();
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void I() {
        this.f44066o.play();
    }

    @Override // com.google.android.exoplayer2.e
    protected void J() {
        g0();
        this.f44066o.pause();
    }

    protected com.google.android.exoplayer2.decoder.i O(String str, a2 a2Var, a2 a2Var2) {
        return new com.google.android.exoplayer2.decoder.i(str, a2Var, a2Var2, 0, 1);
    }

    protected abstract T P(a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.decoder.c cVar) throws DecoderException;

    public void R(boolean z10) {
        this.f44072u = z10;
    }

    protected abstract a2 U(T t10);

    protected final int V(a2 a2Var) {
        return this.f44066o.q(a2Var);
    }

    @androidx.annotation.i
    protected void Y() {
        this.F = true;
    }

    protected void Z(DecoderInputBuffer decoderInputBuffer) {
        if (!this.E || decoderInputBuffer.j()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f44490g - this.D) > 500000) {
            this.D = decoderInputBuffer.f44490g;
        }
        this.E = false;
    }

    @Override // com.google.android.exoplayer2.o3
    public final int a(a2 a2Var) {
        if (!com.google.android.exoplayer2.util.y.p(a2Var.f43593m)) {
            return n3.a(0);
        }
        int iF0 = f0(a2Var);
        if (iF0 <= 2) {
            return n3.a(iF0);
        }
        return n3.b(iF0, 8, com.google.android.exoplayer2.util.u0.f51536a >= 21 ? 32 : 0);
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return this.H && this.f44066o.b();
    }

    @Override // com.google.android.exoplayer2.util.w
    public void e(b3 b3Var) {
        this.f44066o.e(b3Var);
    }

    protected final boolean e0(a2 a2Var) {
        return this.f44066o.a(a2Var);
    }

    protected abstract int f0(a2 a2Var);

    @Override // com.google.android.exoplayer2.util.w
    public b3 g() {
        return this.f44066o.g();
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.h3.b
    public void h(int i10, @androidx.annotation.p0 Object obj) throws ExoPlaybackException {
        if (i10 == 2) {
            this.f44066o.j(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f44066o.i((f) obj);
            return;
        }
        if (i10 == 6) {
            this.f44066o.h((x) obj);
        } else if (i10 == 9) {
            this.f44066o.k(((Boolean) obj).booleanValue());
        } else if (i10 != 10) {
            super.h(i10, obj);
        } else {
            this.f44066o.f(((Integer) obj).intValue());
        }
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean isReady() {
        return this.f44066o.n() || (this.f44069r != null && (D() || this.f44075x != null));
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) throws ExoPlaybackException {
        if (this.H) {
            try {
                this.f44066o.r();
                return;
            } catch (AudioSink.WriteException e10) {
                throw x(e10, e10.f43964d, e10.f43963c, 5002);
            }
        }
        if (this.f44069r == null) {
            b2 b2VarZ = z();
            this.f44067p.f();
            int iL = L(b2VarZ, this.f44067p, 2);
            if (iL != -5) {
                if (iL == -4) {
                    com.google.android.exoplayer2.util.a.i(this.f44067p.k());
                    this.G = true;
                    try {
                        a0();
                        return;
                    } catch (AudioSink.WriteException e11) {
                        throw w(e11, null, 5002);
                    }
                }
                return;
            }
            X(b2VarZ);
        }
        W();
        if (this.f44073v != null) {
            try {
                com.google.android.exoplayer2.util.o0.a("drainAndFeed");
                while (Q()) {
                }
                while (S()) {
                }
                com.google.android.exoplayer2.util.o0.c();
                this.f44068q.c();
            } catch (AudioSink.ConfigurationException e12) {
                throw w(e12, e12.f43956b, 5001);
            } catch (AudioSink.InitializationException e13) {
                throw x(e13, e13.f43959d, e13.f43958c, 5001);
            } catch (AudioSink.WriteException e14) {
                throw x(e14, e14.f43964d, e14.f43963c, 5002);
            } catch (DecoderException e15) {
                com.google.android.exoplayer2.util.u.e(I, "Audio codec error", e15);
                this.f44065n.k(e15);
                throw w(e15, this.f44069r, 4003);
            }
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.m3
    @androidx.annotation.p0
    public com.google.android.exoplayer2.util.w n() {
        return this;
    }

    @Override // com.google.android.exoplayer2.util.w
    public long s() {
        if (getState() == 2) {
            g0();
        }
        return this.D;
    }
}
