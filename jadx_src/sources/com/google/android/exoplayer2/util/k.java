package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.f3;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.z3;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: DebugTextViewHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class k implements c3.h, Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f51445e = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.t f51446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f51447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51448d;

    public k(com.google.android.exoplayer2.t tVar, TextView textView) {
        a.a(tVar.x1() == Looper.getMainLooper());
        this.f51446b = tVar;
        this.f51447c = textView;
    }

    private static String A(com.google.android.exoplayer2.decoder.g gVar) {
        if (gVar == null) {
            return "";
        }
        gVar.c();
        int i10 = gVar.f44515d;
        int i11 = gVar.f44517f;
        int i12 = gVar.f44516e;
        int i13 = gVar.f44518g;
        int i14 = gVar.f44519h;
        int i15 = gVar.f44520i;
        StringBuilder sb2 = new StringBuilder(93);
        sb2.append(" sib:");
        sb2.append(i10);
        sb2.append(" sb:");
        sb2.append(i11);
        sb2.append(" rb:");
        sb2.append(i12);
        sb2.append(" db:");
        sb2.append(i13);
        sb2.append(" mcdb:");
        sb2.append(i14);
        sb2.append(" dk:");
        sb2.append(i15);
        return sb2.toString();
    }

    private static String C(float f10) {
        if (f10 == -1.0f || f10 == 1.0f) {
            return "";
        }
        String strValueOf = String.valueOf(String.format(Locale.US, "%.02f", Float.valueOf(f10)));
        return strValueOf.length() != 0 ? " par:".concat(strValueOf) : new String(" par:");
    }

    private static String E(long j10, int i10) {
        return i10 == 0 ? "N/A" : String.valueOf((long) (j10 / ((double) i10)));
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void B(int i10) {
        f3.b(this, i10);
    }

    protected String D() {
        String str;
        int playbackState = this.f51446b.getPlaybackState();
        if (playbackState == 1) {
            str = "idle";
        } else if (playbackState == 2) {
            str = "buffering";
        } else if (playbackState != 3) {
            str = playbackState != 4 ? "unknown" : "ended";
        } else {
            str = "ready";
        }
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.f51446b.p0()), str, Integer.valueOf(this.f51446b.Z1()));
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void F(int i10, boolean z10) {
        f3.f(this, i10, z10);
    }

    protected String G() {
        a2 a2VarO1 = this.f51446b.o1();
        com.google.android.exoplayer2.decoder.g gVarG0 = this.f51446b.G0();
        if (a2VarO1 == null || gVarG0 == null) {
            return "";
        }
        String str = a2VarO1.f43593m;
        String str2 = a2VarO1.f43582b;
        int i10 = a2VarO1.f43598r;
        int i11 = a2VarO1.f43599s;
        String strC = C(a2VarO1.f43602v);
        String strA = A(gVarG0);
        String strE = E(gVarG0.f44521j, gVarG0.f44522k);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length() + String.valueOf(strC).length() + String.valueOf(strA).length() + String.valueOf(strE).length());
        sb2.append("\n");
        sb2.append(str);
        sb2.append("(id:");
        sb2.append(str2);
        sb2.append(" r:");
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        sb2.append(strC);
        sb2.append(strA);
        sb2.append(" vfpo: ");
        sb2.append(strE);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void H() {
        e3.v(this);
    }

    public final void I() {
        if (this.f51448d) {
            return;
        }
        this.f51448d = true;
        this.f51446b.S1(this);
        L();
    }

    public final void J() {
        if (this.f51448d) {
            this.f51448d = false;
            this.f51446b.U(this);
            this.f51447c.removeCallbacks(this);
        }
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void K(com.google.android.exoplayer2.audio.f fVar) {
        f3.a(this, fVar);
    }

    @SuppressLint({"SetTextI18n"})
    protected final void L() {
        this.f51447c.setText(z());
        this.f51447c.removeCallbacks(this);
        this.f51447c.postDelayed(this, 1000L);
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void V(com.google.android.exoplayer2.p pVar) {
        f3.e(this, pVar);
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void X() {
        f3.u(this);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.audio.t
    public /* synthetic */ void a(boolean z10) {
        f3.z(this, z10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void b(b3 b3Var) {
        f3.n(this, b3Var);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void c(c3.l lVar, c3.l lVar2, int i10) {
        L();
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void d(z3 z3Var, int i10) {
        f3.B(this, z3Var, i10);
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void d0(p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
        e3.z(this, p1Var, pVar);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void e(m2 m2Var) {
        f3.k(this, m2Var);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void f(boolean z10) {
        f3.y(this, z10);
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void f0(com.google.android.exoplayer2.trackselection.u uVar) {
        e3.y(this, uVar);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.video.y
    public /* synthetic */ void g(com.google.android.exoplayer2.video.a0 a0Var) {
        f3.D(this, a0Var);
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void g0(int i10, int i11) {
        f3.A(this, i10, i11);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void h(PlaybackException playbackException) {
        f3.r(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void h0(int i10) {
        e3.q(this, i10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void i(PlaybackException playbackException) {
        f3.q(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void j(long j10) {
        f3.x(this, j10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void k(boolean z10, int i10) {
        L();
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void k0(float f10) {
        f3.E(this, f10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void l(boolean z10) {
        f3.i(this, z10);
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void l0(boolean z10, int i10) {
        e3.o(this, z10, i10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void m(int i10) {
        f3.p(this, i10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void n(e4 e4Var) {
        f3.C(this, e4Var);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void o(c3.c cVar) {
        f3.c(this, cVar);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void onRepeatModeChanged(int i10) {
        f3.v(this, i10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public final void p(int i10) {
        L();
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void p0(long j10) {
        e3.f(this, j10);
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void q(Metadata metadata) {
        f3.l(this, metadata);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void r(long j10) {
        f3.w(this, j10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        L();
    }

    protected String s() {
        a2 a2VarR1 = this.f51446b.R1();
        com.google.android.exoplayer2.decoder.g gVarQ0 = this.f51446b.Q0();
        if (a2VarR1 == null || gVarQ0 == null) {
            return "";
        }
        String str = a2VarR1.f43593m;
        String str2 = a2VarR1.f43582b;
        int i10 = a2VarR1.A;
        int i11 = a2VarR1.f43606z;
        String strA = A(gVarQ0);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(strA).length());
        sb2.append("\n");
        sb2.append(str);
        sb2.append("(id:");
        sb2.append(str2);
        sb2.append(" hz:");
        sb2.append(i10);
        sb2.append(" ch:");
        sb2.append(i11);
        sb2.append(strA);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.c3.h
    public /* synthetic */ void t(List list) {
        f3.d(this, list);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void u(boolean z10) {
        f3.h(this, z10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void v(c3 c3Var, c3.g gVar) {
        f3.g(this, c3Var, gVar);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void w(i2 i2Var, int i10) {
        f3.j(this, i2Var, i10);
    }

    @Override // com.google.android.exoplayer2.c3.h, com.google.android.exoplayer2.c3.f
    public /* synthetic */ void x(m2 m2Var) {
        f3.s(this, m2Var);
    }

    @Override // com.google.android.exoplayer2.c3.f
    public /* synthetic */ void y(boolean z10) {
        e3.e(this, z10);
    }

    protected String z() {
        String strD = D();
        String strG = G();
        String strS = s();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strD).length() + String.valueOf(strG).length() + String.valueOf(strS).length());
        sb2.append(strD);
        sb2.append(strG);
        sb2.append(strS);
        return sb2.toString();
    }
}
