package com.google.android.exoplayer2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements c3 {
    protected final z3.d F0 = new z3.d();

    protected d() {
    }

    private int m2() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void n2(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != j.f46377b) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(Math.max(currentPosition, 0L));
    }

    @Override // com.google.android.exoplayer2.c3
    public final void E0(int i10) {
        D1(i10, j.f46377b);
    }

    @Override // com.google.android.exoplayer2.c3
    public final void F1(i2 i2Var) {
        T0(Collections.singletonList(i2Var));
    }

    @Override // com.google.android.exoplayer2.c3
    public final boolean H0() {
        z3 z3VarW1 = w1();
        return !z3VarW1.x() && z3VarW1.u(Z1(), this.F0).f52119i;
    }

    @Override // com.google.android.exoplayer2.c3
    public final boolean H1() {
        return Z0() != -1;
    }

    @Override // com.google.android.exoplayer2.c3
    public final void I1(i2 i2Var, long j10) {
        D0(Collections.singletonList(i2Var), 0, j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public final void K1(i2 i2Var, boolean z10) {
        V(Collections.singletonList(i2Var), z10);
    }

    @Override // com.google.android.exoplayer2.c3
    public final void L0(int i10, int i11) {
        if (i10 != i11) {
            e2(i10, i10 + 1, i11);
        }
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final boolean O1() {
        return H1();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final boolean P() {
        return e0();
    }

    @Override // com.google.android.exoplayer2.c3
    public final void P0() {
        n2(F0());
    }

    @Override // com.google.android.exoplayer2.c3
    public final void S0(int i10, i2 i2Var) {
        T1(i10, Collections.singletonList(i2Var));
    }

    @Override // com.google.android.exoplayer2.c3
    public final void T0(List<i2> list) {
        V(list, true);
    }

    @Override // com.google.android.exoplayer2.c3
    public final boolean U0() {
        z3 z3VarW1 = w1();
        return !z3VarW1.x() && z3VarW1.u(Z1(), this.F0).l();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final int U1() {
        return Z0();
    }

    @Override // com.google.android.exoplayer2.c3
    public final void V0() {
        Y(0, Integer.MAX_VALUE);
    }

    @Override // com.google.android.exoplayer2.c3
    public final boolean W() {
        return true;
    }

    @Override // com.google.android.exoplayer2.c3
    @androidx.annotation.p0
    public final i2 W0() {
        z3 z3VarW1 = w1();
        if (z3VarW1.x()) {
            return null;
        }
        return z3VarW1.u(Z1(), this.F0).f52114d;
    }

    @Override // com.google.android.exoplayer2.c3
    public final int Y0() {
        long jV1 = V1();
        long duration = getDuration();
        if (jV1 == j.f46377b || duration == j.f46377b) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return com.google.android.exoplayer2.util.u0.s((int) ((jV1 * 100) / duration), 0, 100);
    }

    @Override // com.google.android.exoplayer2.c3
    public final int Z0() {
        z3 z3VarW1 = w1();
        if (z3VarW1.x()) {
            return -1;
        }
        return z3VarW1.s(Z1(), m2(), h2());
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final void a0() {
        b1();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final boolean a1() {
        return H0();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final int a2() {
        return q1();
    }

    @Override // com.google.android.exoplayer2.c3
    @androidx.annotation.p0
    public final Object b0() {
        z3 z3VarW1 = w1();
        if (z3VarW1.x()) {
            return null;
        }
        return z3VarW1.u(Z1(), this.F0).f52115e;
    }

    @Override // com.google.android.exoplayer2.c3
    public final void b1() {
        int iZ0 = Z0();
        if (iZ0 != -1) {
            E0(iZ0);
        }
    }

    @Override // com.google.android.exoplayer2.c3
    public final void c0() {
        int iQ1 = q1();
        if (iQ1 != -1) {
            E0(iQ1);
        }
    }

    @Override // com.google.android.exoplayer2.c3
    public final void c1() {
        E0(Z1());
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final boolean d2() {
        return U0();
    }

    @Override // com.google.android.exoplayer2.c3
    public final boolean e0() {
        return q1() != -1;
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final void f1() {
        c0();
    }

    @Override // com.google.android.exoplayer2.c3
    public final void f2(List<i2> list) {
        T1(Integer.MAX_VALUE, list);
    }

    @Override // com.google.android.exoplayer2.c3
    public final boolean g0(int i10) {
        return E1().e(i10);
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final boolean g1() {
        return t1();
    }

    @Override // com.google.android.exoplayer2.c3
    public final void h1(int i10) {
        Y(i10, i10 + 1);
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final boolean hasNext() {
        return e0();
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final boolean hasPrevious() {
        return H1();
    }

    @Override // com.google.android.exoplayer2.c3
    public final int i1() {
        return w1().w();
    }

    @Override // com.google.android.exoplayer2.c3
    public final void i2() {
        n2(-k2());
    }

    @Override // com.google.android.exoplayer2.c3
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && p0() && u1() == 0;
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final int l1() {
        return Z1();
    }

    protected c3.c l2(c3.c cVar) {
        return new c3.c.a().b(cVar).e(4, !O()).e(5, H0() && !O()).e(6, H1() && !O()).e(7, !w1().x() && (H1() || !U0() || H0()) && !O()).e(8, e0() && !O()).e(9, !w1().x() && (e0() || (U0() && t1())) && !O()).e(10, !O()).e(11, H0() && !O()).e(12, H0() && !O()).f();
    }

    @Override // com.google.android.exoplayer2.c3
    public final void m1() {
        if (w1().x() || O()) {
            return;
        }
        boolean zH1 = H1();
        if (U0() && !H0()) {
            if (zH1) {
                b1();
            }
        } else if (!zH1 || getCurrentPosition() > u0()) {
            seekTo(0L);
        } else {
            b1();
        }
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final void next() {
        c0();
    }

    @Override // com.google.android.exoplayer2.c3
    public final long o0() {
        z3 z3VarW1 = w1();
        return (z3VarW1.x() || z3VarW1.u(Z1(), this.F0).f52117g == j.f46377b) ? j.f46377b : (this.F0.e() - this.F0.f52117g) - Q1();
    }

    @Override // com.google.android.exoplayer2.c3
    public final void pause() {
        n1(false);
    }

    @Override // com.google.android.exoplayer2.c3
    public final void play() {
        n1(true);
    }

    @Override // com.google.android.exoplayer2.c3
    @Deprecated
    public final void previous() {
        b1();
    }

    @Override // com.google.android.exoplayer2.c3
    public final int q1() {
        z3 z3VarW1 = w1();
        if (z3VarW1.x()) {
            return -1;
        }
        return z3VarW1.j(Z1(), m2(), h2());
    }

    @Override // com.google.android.exoplayer2.c3
    public final void seekTo(long j10) {
        D1(Z1(), j10);
    }

    @Override // com.google.android.exoplayer2.c3
    public final void setPlaybackSpeed(float f10) {
        e(g().f(f10));
    }

    @Override // com.google.android.exoplayer2.c3
    public final i2 t0(int i10) {
        return w1().u(i10, this.F0).f52114d;
    }

    @Override // com.google.android.exoplayer2.c3
    public final boolean t1() {
        z3 z3VarW1 = w1();
        return !z3VarW1.x() && z3VarW1.u(Z1(), this.F0).f52120j;
    }

    @Override // com.google.android.exoplayer2.c3
    public final long w0() {
        z3 z3VarW1 = w1();
        return z3VarW1.x() ? j.f46377b : z3VarW1.u(Z1(), this.F0).h();
    }

    @Override // com.google.android.exoplayer2.c3
    public final void y0(i2 i2Var) {
        f2(Collections.singletonList(i2Var));
    }

    @Override // com.google.android.exoplayer2.c3
    public final void y1() {
        if (w1().x() || O()) {
            return;
        }
        if (e0()) {
            c0();
        } else if (U0() && t1()) {
            c1();
        }
    }
}
