package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.util.m0;
import com.google.android.exoplayer2.util.o0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: DecoderVideoRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d extends com.google.android.exoplayer2.e {
    private static final String W = "DecoderVideoRenderer";
    private static final int X = 0;
    private static final int Y = 1;
    private static final int Z = 2;

    @p0
    private i A;

    @p0
    private j B;

    @p0
    private DrmSession C;

    @p0
    private DrmSession D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private long J;
    private long K;
    private boolean L;
    private boolean M;
    private boolean N;

    @p0
    private a0 O;
    private long P;
    private int Q;
    private int R;
    private int S;
    private long T;
    private long U;
    protected com.google.android.exoplayer2.decoder.g V;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f51726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f51727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final y.a f51728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m0<a2> f51729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final DecoderInputBuffer f51730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a2 f51731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a2 f51732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.decoder.f<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.m, ? extends DecoderException> f51733u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private DecoderInputBuffer f51734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.google.android.exoplayer2.decoder.m f51735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f51736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private Object f51737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private Surface f51738z;

    protected d(long j10, @p0 Handler handler, @p0 y yVar, int i10) {
        super(2);
        this.f51726n = j10;
        this.f51727o = i10;
        this.K = com.google.android.exoplayer2.j.f46377b;
        P();
        this.f51729q = new m0<>();
        this.f51730r = DecoderInputBuffer.r();
        this.f51728p = new y.a(handler, yVar);
        this.E = 0;
        this.f51736x = -1;
    }

    private void O() {
        this.G = false;
    }

    private void P() {
        this.O = null;
    }

    private boolean R(long j10, long j11) throws ExoPlaybackException, DecoderException {
        if (this.f51735w == null) {
            com.google.android.exoplayer2.decoder.m mVarDequeueOutputBuffer = this.f51733u.dequeueOutputBuffer();
            this.f51735w = mVarDequeueOutputBuffer;
            if (mVarDequeueOutputBuffer == null) {
                return false;
            }
            com.google.android.exoplayer2.decoder.g gVar = this.V;
            int i10 = gVar.f44517f;
            int i11 = mVarDequeueOutputBuffer.f44524d;
            gVar.f44517f = i10 + i11;
            this.S -= i11;
        }
        if (!this.f51735w.k()) {
            boolean zL0 = l0(j10, j11);
            if (zL0) {
                j0(this.f51735w.f44523c);
                this.f51735w = null;
            }
            return zL0;
        }
        if (this.E == 2) {
            m0();
            Z();
        } else {
            this.f51735w.n();
            this.f51735w = null;
            this.N = true;
        }
        return false;
    }

    private boolean T() throws ExoPlaybackException, DecoderException {
        com.google.android.exoplayer2.decoder.f<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.m, ? extends DecoderException> fVar = this.f51733u;
        if (fVar == null || this.E == 2 || this.M) {
            return false;
        }
        if (this.f51734v == null) {
            DecoderInputBuffer decoderInputBufferA = fVar.a();
            this.f51734v = decoderInputBufferA;
            if (decoderInputBufferA == null) {
                return false;
            }
        }
        if (this.E == 1) {
            this.f51734v.m(4);
            this.f51733u.c(this.f51734v);
            this.f51734v = null;
            this.E = 2;
            return false;
        }
        b2 b2VarZ = z();
        int iL = L(b2VarZ, this.f51734v, 0);
        if (iL == -5) {
            f0(b2VarZ);
            return true;
        }
        if (iL != -4) {
            if (iL == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f51734v.k()) {
            this.M = true;
            this.f51733u.c(this.f51734v);
            this.f51734v = null;
            return false;
        }
        if (this.L) {
            this.f51729q.a(this.f51734v.f44490g, this.f51731s);
            this.L = false;
        }
        this.f51734v.p();
        DecoderInputBuffer decoderInputBuffer = this.f51734v;
        decoderInputBuffer.f44486c = this.f51731s;
        k0(decoderInputBuffer);
        this.f51733u.c(this.f51734v);
        this.S++;
        this.F = true;
        this.V.f44514c++;
        this.f51734v = null;
        return true;
    }

    private boolean V() {
        return this.f51736x != -1;
    }

    private static boolean W(long j10) {
        return j10 < -30000;
    }

    private static boolean X(long j10) {
        return j10 < -500000;
    }

    private void Z() throws ExoPlaybackException {
        if (this.f51733u != null) {
            return;
        }
        p0(this.D);
        com.google.android.exoplayer2.decoder.c cVarT = null;
        DrmSession drmSession = this.C;
        if (drmSession != null && (cVarT = drmSession.t()) == null && this.C.q() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f51733u = Q(this.f51731s, cVarT);
            q0(this.f51736x);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f51728p.k(this.f51733u.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.V.f44512a++;
        } catch (DecoderException e10) {
            com.google.android.exoplayer2.util.u.e(W, "Video codec error", e10);
            this.f51728p.C(e10);
            throw w(e10, this.f51731s, 4001);
        } catch (OutOfMemoryError e11) {
            throw w(e11, this.f51731s, 4001);
        }
    }

    private void a0() {
        if (this.Q > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f51728p.n(this.Q, jElapsedRealtime - this.P);
            this.Q = 0;
            this.P = jElapsedRealtime;
        }
    }

    private void b0() {
        this.I = true;
        if (this.G) {
            return;
        }
        this.G = true;
        this.f51728p.A(this.f51737y);
    }

    private void c0(int i10, int i11) {
        a0 a0Var = this.O;
        if (a0Var != null && a0Var.f51712b == i10 && a0Var.f51713c == i11) {
            return;
        }
        a0 a0Var2 = new a0(i10, i11);
        this.O = a0Var2;
        this.f51728p.D(a0Var2);
    }

    private void d0() {
        if (this.G) {
            this.f51728p.A(this.f51737y);
        }
    }

    private void e0() {
        a0 a0Var = this.O;
        if (a0Var != null) {
            this.f51728p.D(a0Var);
        }
    }

    private void g0() {
        e0();
        O();
        if (getState() == 2) {
            r0();
        }
    }

    private void h0() {
        P();
        O();
    }

    private void i0() {
        e0();
        d0();
    }

    private boolean l0(long j10, long j11) throws ExoPlaybackException, DecoderException {
        if (this.J == com.google.android.exoplayer2.j.f46377b) {
            this.J = j10;
        }
        long j12 = this.f51735w.f44523c - j10;
        if (!V()) {
            if (!W(j12)) {
                return false;
            }
            x0(this.f51735w);
            return true;
        }
        long j13 = this.f51735w.f44523c - this.U;
        a2 a2VarJ = this.f51729q.j(j13);
        if (a2VarJ != null) {
            this.f51732t = a2VarJ;
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.T;
        boolean z10 = getState() == 2;
        if ((this.I ? !this.G : z10 || this.H) || (z10 && w0(j12, jElapsedRealtime))) {
            n0(this.f51735w, j13, this.f51732t);
            return true;
        }
        if (!z10 || j10 == this.J || (u0(j12, j11) && Y(j10))) {
            return false;
        }
        if (v0(j12, j11)) {
            S(this.f51735w);
            return true;
        }
        if (j12 < 30000) {
            n0(this.f51735w, j13, this.f51732t);
            return true;
        }
        return false;
    }

    private void p0(@p0 DrmSession drmSession) {
        com.google.android.exoplayer2.drm.k.b(this.C, drmSession);
        this.C = drmSession;
    }

    private void r0() {
        this.K = this.f51726n > 0 ? SystemClock.elapsedRealtime() + this.f51726n : com.google.android.exoplayer2.j.f46377b;
    }

    private void t0(@p0 DrmSession drmSession) {
        com.google.android.exoplayer2.drm.k.b(this.D, drmSession);
        this.D = drmSession;
    }

    @Override // com.google.android.exoplayer2.e
    protected void E() {
        this.f51731s = null;
        P();
        O();
        try {
            t0(null);
            m0();
        } finally {
            this.f51728p.m(this.V);
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void F(boolean z10, boolean z11) throws ExoPlaybackException {
        com.google.android.exoplayer2.decoder.g gVar = new com.google.android.exoplayer2.decoder.g();
        this.V = gVar;
        this.f51728p.o(gVar);
        this.H = z11;
        this.I = false;
    }

    @Override // com.google.android.exoplayer2.e
    protected void G(long j10, boolean z10) throws ExoPlaybackException {
        this.M = false;
        this.N = false;
        O();
        this.J = com.google.android.exoplayer2.j.f46377b;
        this.R = 0;
        if (this.f51733u != null) {
            U();
        }
        if (z10) {
            r0();
        } else {
            this.K = com.google.android.exoplayer2.j.f46377b;
        }
        this.f51729q.c();
    }

    @Override // com.google.android.exoplayer2.e
    protected void I() {
        this.Q = 0;
        this.P = SystemClock.elapsedRealtime();
        this.T = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.google.android.exoplayer2.e
    protected void J() {
        this.K = com.google.android.exoplayer2.j.f46377b;
        a0();
    }

    @Override // com.google.android.exoplayer2.e
    protected void K(a2[] a2VarArr, long j10, long j11) throws ExoPlaybackException {
        this.U = j11;
        super.K(a2VarArr, j10, j11);
    }

    protected com.google.android.exoplayer2.decoder.i N(String str, a2 a2Var, a2 a2Var2) {
        return new com.google.android.exoplayer2.decoder.i(str, a2Var, a2Var2, 0, 1);
    }

    protected abstract com.google.android.exoplayer2.decoder.f<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.m, ? extends DecoderException> Q(a2 a2Var, @p0 com.google.android.exoplayer2.decoder.c cVar) throws DecoderException;

    protected void S(com.google.android.exoplayer2.decoder.m mVar) {
        y0(1);
        mVar.n();
    }

    @androidx.annotation.i
    protected void U() throws ExoPlaybackException {
        this.S = 0;
        if (this.E != 0) {
            m0();
            Z();
            return;
        }
        this.f51734v = null;
        com.google.android.exoplayer2.decoder.m mVar = this.f51735w;
        if (mVar != null) {
            mVar.n();
            this.f51735w = null;
        }
        this.f51733u.flush();
        this.F = false;
    }

    protected boolean Y(long j10) throws ExoPlaybackException {
        int iM = M(j10);
        if (iM == 0) {
            return false;
        }
        this.V.f44520i++;
        y0(this.S + iM);
        U();
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return this.N;
    }

    @androidx.annotation.i
    protected void f0(b2 b2Var) throws ExoPlaybackException {
        this.L = true;
        a2 a2Var = (a2) com.google.android.exoplayer2.util.a.g(b2Var.f44366b);
        t0(b2Var.f44365a);
        a2 a2Var2 = this.f51731s;
        this.f51731s = a2Var;
        com.google.android.exoplayer2.decoder.f<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.m, ? extends DecoderException> fVar = this.f51733u;
        if (fVar == null) {
            Z();
            this.f51728p.p(this.f51731s, null);
            return;
        }
        com.google.android.exoplayer2.decoder.i iVar = this.D != this.C ? new com.google.android.exoplayer2.decoder.i(fVar.getName(), a2Var2, a2Var, 0, 128) : N(fVar.getName(), a2Var2, a2Var);
        if (iVar.f44547d == 0) {
            if (this.F) {
                this.E = 1;
            } else {
                m0();
                Z();
            }
        }
        this.f51728p.p(this.f51731s, iVar);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.h3.b
    public void h(int i10, @p0 Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            s0(obj);
        } else if (i10 == 7) {
            this.B = (j) obj;
        } else {
            super.h(i10, obj);
        }
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean isReady() {
        if (this.f51731s != null && ((D() || this.f51735w != null) && (this.G || !V()))) {
            this.K = com.google.android.exoplayer2.j.f46377b;
            return true;
        }
        if (this.K == com.google.android.exoplayer2.j.f46377b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.K) {
            return true;
        }
        this.K = com.google.android.exoplayer2.j.f46377b;
        return false;
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) throws ExoPlaybackException {
        if (this.N) {
            return;
        }
        if (this.f51731s == null) {
            b2 b2VarZ = z();
            this.f51730r.f();
            int iL = L(b2VarZ, this.f51730r, 2);
            if (iL != -5) {
                if (iL == -4) {
                    com.google.android.exoplayer2.util.a.i(this.f51730r.k());
                    this.M = true;
                    this.N = true;
                    return;
                }
                return;
            }
            f0(b2VarZ);
        }
        Z();
        if (this.f51733u != null) {
            try {
                o0.a("drainAndFeed");
                while (R(j10, j11)) {
                }
                while (T()) {
                }
                o0.c();
                this.V.c();
            } catch (DecoderException e10) {
                com.google.android.exoplayer2.util.u.e(W, "Video codec error", e10);
                this.f51728p.C(e10);
                throw w(e10, this.f51731s, 4003);
            }
        }
    }

    @androidx.annotation.i
    protected void j0(long j10) {
        this.S--;
    }

    protected void k0(DecoderInputBuffer decoderInputBuffer) {
    }

    @androidx.annotation.i
    protected void m0() {
        this.f51734v = null;
        this.f51735w = null;
        this.E = 0;
        this.F = false;
        this.S = 0;
        com.google.android.exoplayer2.decoder.f<DecoderInputBuffer, ? extends com.google.android.exoplayer2.decoder.m, ? extends DecoderException> fVar = this.f51733u;
        if (fVar != null) {
            this.V.f44513b++;
            fVar.release();
            this.f51728p.l(this.f51733u.getName());
            this.f51733u = null;
        }
        p0(null);
    }

    protected void n0(com.google.android.exoplayer2.decoder.m mVar, long j10, a2 a2Var) throws DecoderException {
        j jVar = this.B;
        if (jVar != null) {
            jVar.a(j10, System.nanoTime(), a2Var, null);
        }
        this.T = u0.U0(SystemClock.elapsedRealtime() * 1000);
        int i10 = mVar.f44570f;
        boolean z10 = i10 == 1 && this.f51738z != null;
        boolean z11 = i10 == 0 && this.A != null;
        if (!z11 && !z10) {
            S(mVar);
            return;
        }
        c0(mVar.f44572h, mVar.f44573i);
        if (z11) {
            this.A.setOutputBuffer(mVar);
        } else {
            o0(mVar, this.f51738z);
        }
        this.R = 0;
        this.V.f44516e++;
        b0();
    }

    protected abstract void o0(com.google.android.exoplayer2.decoder.m mVar, Surface surface) throws DecoderException;

    protected abstract void q0(int i10);

    protected final void s0(@p0 Object obj) {
        if (obj instanceof Surface) {
            this.f51738z = (Surface) obj;
            this.A = null;
            this.f51736x = 1;
        } else if (obj instanceof i) {
            this.f51738z = null;
            this.A = (i) obj;
            this.f51736x = 0;
        } else {
            this.f51738z = null;
            this.A = null;
            this.f51736x = -1;
            obj = null;
        }
        if (this.f51737y == obj) {
            if (obj != null) {
                i0();
                return;
            }
            return;
        }
        this.f51737y = obj;
        if (obj == null) {
            h0();
            return;
        }
        if (this.f51733u != null) {
            q0(this.f51736x);
        }
        g0();
    }

    protected boolean u0(long j10, long j11) {
        return X(j10);
    }

    protected boolean v0(long j10, long j11) {
        return W(j10);
    }

    protected boolean w0(long j10, long j11) {
        return W(j10) && j11 > 100000;
    }

    protected void x0(com.google.android.exoplayer2.decoder.m mVar) {
        this.V.f44517f++;
        mVar.n();
    }

    protected void y0(int i10) {
        com.google.android.exoplayer2.decoder.g gVar = this.V;
        gVar.f44518g += i10;
        this.Q += i10;
        int i11 = this.R + i10;
        this.R = i11;
        gVar.f44519h = Math.max(i11, gVar.f44519h);
        int i12 = this.f51727o;
        if (i12 <= 0 || this.Q < i12) {
            return;
        }
        a0();
    }
}
