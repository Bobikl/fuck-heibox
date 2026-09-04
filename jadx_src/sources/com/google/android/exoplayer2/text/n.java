package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n extends com.google.android.exoplayer2.e implements Handler.Callback {
    private static final String C = "TextRenderer";
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 0;
    private int A;
    private long B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private final Handler f49653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m f49654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final i f49655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b2 f49656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f49657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f49659t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f49660u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private a2 f49661v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private h f49662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private k f49663x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private l f49664y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private l f49665z;

    public n(m mVar, @p0 Looper looper) {
        this(mVar, looper, i.f49631a);
    }

    public n(m mVar, @p0 Looper looper, i iVar) {
        super(3);
        this.f49654o = (m) com.google.android.exoplayer2.util.a.g(mVar);
        this.f49653n = looper == null ? null : u0.x(looper, this);
        this.f49655p = iVar;
        this.f49656q = new b2();
        this.B = com.google.android.exoplayer2.j.f46377b;
    }

    private void N() {
        W(Collections.emptyList());
    }

    private long O() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        com.google.android.exoplayer2.util.a.g(this.f49664y);
        if (this.A >= this.f49664y.b()) {
            return Long.MAX_VALUE;
        }
        return this.f49664y.a(this.A);
    }

    private void P(SubtitleDecoderException subtitleDecoderException) {
        String strValueOf = String.valueOf(this.f49661v);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(strValueOf);
        u.e(C, sb2.toString(), subtitleDecoderException);
        N();
        U();
    }

    private void Q() {
        this.f49659t = true;
        this.f49662w = this.f49655p.b((a2) com.google.android.exoplayer2.util.a.g(this.f49661v));
    }

    private void R(List<b> list) {
        this.f49654o.t(list);
    }

    private void S() {
        this.f49663x = null;
        this.A = -1;
        l lVar = this.f49664y;
        if (lVar != null) {
            lVar.n();
            this.f49664y = null;
        }
        l lVar2 = this.f49665z;
        if (lVar2 != null) {
            lVar2.n();
            this.f49665z = null;
        }
    }

    private void T() {
        S();
        ((h) com.google.android.exoplayer2.util.a.g(this.f49662w)).release();
        this.f49662w = null;
        this.f49660u = 0;
    }

    private void U() {
        T();
        Q();
    }

    private void W(List<b> list) {
        Handler handler = this.f49653n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            R(list);
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void E() {
        this.f49661v = null;
        this.B = com.google.android.exoplayer2.j.f46377b;
        N();
        T();
    }

    @Override // com.google.android.exoplayer2.e
    protected void G(long j10, boolean z10) {
        N();
        this.f49657r = false;
        this.f49658s = false;
        this.B = com.google.android.exoplayer2.j.f46377b;
        if (this.f49660u != 0) {
            U();
        } else {
            S();
            ((h) com.google.android.exoplayer2.util.a.g(this.f49662w)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void K(a2[] a2VarArr, long j10, long j11) {
        this.f49661v = a2VarArr[0];
        if (this.f49662w != null) {
            this.f49660u = 1;
        } else {
            Q();
        }
    }

    public void V(long j10) {
        com.google.android.exoplayer2.util.a.i(i());
        this.B = j10;
    }

    @Override // com.google.android.exoplayer2.o3
    public int a(a2 a2Var) {
        if (this.f49655p.a(a2Var)) {
            return n3.a(a2Var.F == 0 ? 4 : 2);
        }
        return y.s(a2Var.f43593m) ? n3.a(1) : n3.a(0);
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return this.f49658s;
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public String getName() {
        return C;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        R((List) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) throws DecoderException {
        boolean z10;
        if (i()) {
            long j12 = this.B;
            if (j12 != com.google.android.exoplayer2.j.f46377b && j10 >= j12) {
                S();
                this.f49658s = true;
            }
        }
        if (this.f49658s) {
            return;
        }
        if (this.f49665z == null) {
            ((h) com.google.android.exoplayer2.util.a.g(this.f49662w)).b(j10);
            try {
                this.f49665z = ((h) com.google.android.exoplayer2.util.a.g(this.f49662w)).dequeueOutputBuffer();
            } catch (SubtitleDecoderException e10) {
                P(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f49664y != null) {
            long jO = O();
            z10 = false;
            while (jO <= j10) {
                this.A++;
                jO = O();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        l lVar = this.f49665z;
        if (lVar != null) {
            if (lVar.k()) {
                if (!z10 && O() == Long.MAX_VALUE) {
                    if (this.f49660u == 2) {
                        U();
                    } else {
                        S();
                        this.f49658s = true;
                    }
                }
            } else if (lVar.f44523c <= j10) {
                l lVar2 = this.f49664y;
                if (lVar2 != null) {
                    lVar2.n();
                }
                this.A = lVar.c(j10);
                this.f49664y = lVar;
                this.f49665z = null;
                z10 = true;
            }
        }
        if (z10) {
            com.google.android.exoplayer2.util.a.g(this.f49664y);
            W(this.f49664y.d(j10));
        }
        if (this.f49660u == 2) {
            return;
        }
        while (!this.f49657r) {
            try {
                k kVarA = this.f49663x;
                if (kVarA == null) {
                    kVarA = ((h) com.google.android.exoplayer2.util.a.g(this.f49662w)).a();
                    if (kVarA == null) {
                        return;
                    } else {
                        this.f49663x = kVarA;
                    }
                }
                if (this.f49660u == 1) {
                    kVarA.m(4);
                    ((h) com.google.android.exoplayer2.util.a.g(this.f49662w)).c(kVarA);
                    this.f49663x = null;
                    this.f49660u = 2;
                    return;
                }
                int iL = L(this.f49656q, kVarA, 0);
                if (iL == -4) {
                    if (kVarA.k()) {
                        this.f49657r = true;
                        this.f49659t = false;
                    } else {
                        a2 a2Var = this.f49656q.f44366b;
                        if (a2Var == null) {
                            return;
                        }
                        kVarA.f49650n = a2Var.f43597q;
                        kVarA.p();
                        this.f49659t &= !kVarA.l();
                    }
                    if (!this.f49659t) {
                        ((h) com.google.android.exoplayer2.util.a.g(this.f49662w)).c(kVarA);
                        this.f49663x = null;
                    }
                } else if (iL == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                P(e11);
                return;
            }
        }
    }
}
