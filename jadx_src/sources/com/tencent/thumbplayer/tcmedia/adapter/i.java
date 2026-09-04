package com.tencent.thumbplayer.tcmedia.adapter;

import com.tencent.thumbplayer.tcmedia.api.TPPlayerState;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TPPlayerState f102409a;

    public i(TPPlayerState tPPlayerState) {
        this.f102409a = tPPlayerState;
    }

    private static boolean a(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(2) || tPPlayerState.is(8) || tPPlayerState.is(9);
    }

    private static boolean b(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1);
    }

    private static boolean c(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7) || tPPlayerState.is(8) || tPPlayerState.is(9);
    }

    private static boolean d(TPPlayerState tPPlayerState) {
        return true;
    }

    private static boolean e(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean f(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean g(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean h(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7) || tPPlayerState.is(10);
    }

    private static boolean i(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean j(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean k(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean l(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean m(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean n(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean o(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7);
    }

    private static boolean p(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(1) || tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(7) || tPPlayerState.is(10);
    }

    private static boolean q(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3);
    }

    private static boolean r(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean s(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean t(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(2) || tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean u(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean v(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6);
    }

    private static boolean w(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(3) || tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7) || tPPlayerState.is(8);
    }

    private static boolean x(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    private static boolean y(TPPlayerState tPPlayerState) {
        return tPPlayerState.is(4) || tPPlayerState.is(5) || tPPlayerState.is(8) || tPPlayerState.is(9) || tPPlayerState.is(6) || tPPlayerState.is(7);
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            return a(this.f102409a);
        }
        if (i10 == 2) {
            return b(this.f102409a);
        }
        if (i10 == 3) {
            return c(this.f102409a);
        }
        if (i10 == 4) {
            return d(this.f102409a);
        }
        if (i10 == 5) {
            return e(this.f102409a);
        }
        if (i10 == 6) {
            return f(this.f102409a);
        }
        if (i10 == 7) {
            return g(this.f102409a);
        }
        if (i10 == 8) {
            return h(this.f102409a);
        }
        if (i10 == 9) {
            return i(this.f102409a);
        }
        if (i10 == 11) {
            return j(this.f102409a);
        }
        if (i10 == 12) {
            return k(this.f102409a);
        }
        if (i10 == 13) {
            return m(this.f102409a);
        }
        if (i10 == 14) {
            return n(this.f102409a);
        }
        if (i10 == 15) {
            return o(this.f102409a);
        }
        if (i10 == 16) {
            return p(this.f102409a);
        }
        if (i10 == 17) {
            return x(this.f102409a);
        }
        if (i10 == 18) {
            return y(this.f102409a);
        }
        if (i10 == 19) {
            return l(this.f102409a);
        }
        return false;
    }

    public final boolean b(int i10) {
        if (i10 == 1) {
            return q(this.f102409a);
        }
        if (i10 == 2) {
            return r(this.f102409a);
        }
        if (i10 == 3) {
            return s(this.f102409a);
        }
        if (i10 == 4) {
            return t(this.f102409a);
        }
        if (i10 == 5) {
            return u(this.f102409a);
        }
        if (i10 == 6) {
            return v(this.f102409a);
        }
        if (i10 == 7) {
            return w(this.f102409a);
        }
        return false;
    }
}
