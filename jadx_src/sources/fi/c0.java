package fi;

import io.flutter.embedding.android.KeyboardMap;
import java.util.NoSuchElementException;
import kotlin.e2;
import kotlin.j1;
import kotlin.jvm.internal.f0;
import kotlin.n1;
import kotlin.r1;
import kotlin.random.Random;
import kotlin.u0;
import kotlin.x1;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: _URanges.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c0 {
    @u0(version = s0.f136932w)
    public static final int A(@dl.d v vVar) {
        f0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.h();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @u0(version = s0.f136932w)
    public static final long B(@dl.d y yVar) {
        f0.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.h();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final n1 C(@dl.d v vVar) {
        f0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return n1.b(vVar.h());
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final r1 D(@dl.d y yVar) {
        f0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return r1.b(yVar.h());
    }

    @u0(version = s0.f136932w)
    public static final int E(@dl.d v vVar) {
        f0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.i();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @u0(version = s0.f136932w)
    public static final long F(@dl.d y yVar) {
        f0.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.i();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final n1 G(@dl.d v vVar) {
        f0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return n1.b(vVar.i());
    }

    @u0(version = s0.f136932w)
    @dl.e
    public static final r1 H(@dl.d y yVar) {
        f0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return r1.b(yVar.i());
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @sh.f
    private static final int I(x xVar) {
        f0.p(xVar, "<this>");
        return J(xVar, Random.f125033b);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final int J(@dl.d x xVar, @dl.d Random random) {
        f0.p(xVar, "<this>");
        f0.p(random, "random");
        try {
            return kotlin.random.e.h(random, xVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @sh.f
    private static final long K(a0 a0Var) {
        f0.p(a0Var, "<this>");
        return L(a0Var, Random.f125033b);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final long L(@dl.d a0 a0Var, @dl.d Random random) {
        f0.p(a0Var, "<this>");
        f0.p(random, "random");
        try {
            return kotlin.random.e.l(random, a0Var);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class, kotlin.s.class})
    @sh.f
    private static final n1 M(x xVar) {
        f0.p(xVar, "<this>");
        return N(xVar, Random.f125033b);
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.q.class, kotlin.s.class})
    public static final n1 N(@dl.d x xVar, @dl.d Random random) {
        f0.p(xVar, "<this>");
        f0.p(random, "random");
        if (xVar.isEmpty()) {
            return null;
        }
        return n1.b(kotlin.random.e.h(random, xVar));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.q.class, kotlin.s.class})
    @sh.f
    private static final r1 O(a0 a0Var) {
        f0.p(a0Var, "<this>");
        return P(a0Var, Random.f125033b);
    }

    @u0(version = s0.f136928s)
    @dl.e
    @e2(markerClass = {kotlin.q.class, kotlin.s.class})
    public static final r1 P(@dl.d a0 a0Var, @dl.d Random random) {
        f0.p(a0Var, "<this>");
        f0.p(random, "random");
        if (a0Var.isEmpty()) {
            return null;
        }
        return r1.b(kotlin.random.e.l(random, a0Var));
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final v Q(@dl.d v vVar) {
        f0.p(vVar, "<this>");
        return v.f118893e.a(vVar.i(), vVar.h(), -vVar.j());
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final y R(@dl.d y yVar) {
        f0.p(yVar, "<this>");
        return y.f118903e.a(yVar.i(), yVar.h(), -yVar.j());
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final v S(@dl.d v vVar, int i10) {
        f0.p(vVar, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        v.a aVar = v.f118893e;
        int iH = vVar.h();
        int i11 = vVar.i();
        if (vVar.j() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iH, i11, i10);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final y T(@dl.d y yVar, long j10) {
        f0.p(yVar, "<this>");
        t.a(j10 > 0, Long.valueOf(j10));
        y.a aVar = y.f118903e;
        long jH = yVar.h();
        long jI = yVar.i();
        if (yVar.j() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jH, jI, j10);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final x U(short s10, short s11) {
        int i10 = s11 & x1.f128661e;
        return f0.t(i10, 0) <= 0 ? x.f118901f.a() : new x(n1.h(s10 & x1.f128661e), n1.h(n1.h(i10) - 1), null);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final x V(int i10, int i11) {
        return Integer.compare(i11 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) <= 0 ? x.f118901f.a() : new x(i10, n1.h(i11 - 1), null);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final x W(byte b10, byte b11) {
        int i10 = b11 & 255;
        return f0.t(i10, 0) <= 0 ? x.f118901f.a() : new x(n1.h(b10 & 255), n1.h(n1.h(i10) - 1), null);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final a0 X(long j10, long j11) {
        return Long.compare(j11 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0 ? a0.f118853f.a() : new a0(j10, r1.h(j11 - r1.h(((long) 1) & KeyboardMap.kValueMask)), null);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final short a(short s10, short s11) {
        return f0.t(s10 & x1.f128661e, 65535 & s11) < 0 ? s11 : s10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final int b(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0 ? i11 : i10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final byte c(byte b10, byte b11) {
        return f0.t(b10 & 255, b11 & 255) < 0 ? b11 : b10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final long d(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j11 : j10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final short e(short s10, short s11) {
        return f0.t(s10 & x1.f128661e, 65535 & s11) > 0 ? s11 : s10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final int f(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0 ? i11 : i10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final byte g(byte b10, byte b11) {
        return f0.t(b10 & 255, b11 & 255) > 0 ? b11 : b10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final long h(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0 ? j11 : j10;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final long i(long j10, @dl.d g<r1> range) {
        f0.p(range, "range");
        if (range instanceof f) {
            return ((r1) u.M(r1.b(j10), (f) range)).q0();
        }
        if (!range.isEmpty()) {
            if (Long.compare(j10 ^ Long.MIN_VALUE, ((r1) range.D()).q0() ^ Long.MIN_VALUE) < 0) {
                return ((r1) range.D()).q0();
            }
            return Long.compare(j10 ^ Long.MIN_VALUE, ((r1) range.e()).q0() ^ Long.MIN_VALUE) > 0 ? ((r1) range.e()).q0() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + lg.a.f131414g);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final short j(short s10, short s11, short s12) {
        int i10 = s11 & x1.f128661e;
        int i11 = s12 & x1.f128661e;
        if (f0.t(i10, i11) <= 0) {
            int i12 = 65535 & s10;
            if (f0.t(i12, i10) < 0) {
                return s11;
            }
            return f0.t(i12, i11) > 0 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) x1.j0(s12)) + " is less than minimum " + ((Object) x1.j0(s11)) + lg.a.f131414g);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final int k(int i10, int i11, int i12) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) <= 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return i11;
            }
            return Integer.compare(i10 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) > 0 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) n1.l0(i12)) + " is less than minimum " + ((Object) n1.l0(i11)) + lg.a.f131414g);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final byte l(byte b10, byte b11, byte b12) {
        int i10 = b11 & 255;
        int i11 = b12 & 255;
        if (f0.t(i10, i11) <= 0) {
            int i12 = b10 & 255;
            if (f0.t(i12, i10) < 0) {
                return b11;
            }
            return f0.t(i12, i11) > 0 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) j1.j0(b12)) + " is less than minimum " + ((Object) j1.j0(b11)) + lg.a.f131414g);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final long m(long j10, long j11, long j12) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) <= 0) {
            if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0) {
                return j11;
            }
            return Long.compare(j10 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) r1.l0(j12)) + " is less than minimum " + ((Object) r1.l0(j11)) + lg.a.f131414g);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final int n(int i10, @dl.d g<n1> range) {
        f0.p(range, "range");
        if (range instanceof f) {
            return ((n1) u.M(n1.b(i10), (f) range)).q0();
        }
        if (!range.isEmpty()) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, ((n1) range.D()).q0() ^ Integer.MIN_VALUE) < 0) {
                return ((n1) range.D()).q0();
            }
            return Integer.compare(i10 ^ Integer.MIN_VALUE, ((n1) range.e()).q0() ^ Integer.MIN_VALUE) > 0 ? ((n1) range.e()).q0() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + lg.a.f131414g);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final boolean o(@dl.d x contains, byte b10) {
        f0.p(contains, "$this$contains");
        return contains.o(n1.h(b10 & 255));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @sh.f
    private static final boolean p(a0 contains, r1 r1Var) {
        f0.p(contains, "$this$contains");
        return r1Var != null && contains.o(r1Var.q0());
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final boolean q(@dl.d a0 contains, int i10) {
        f0.p(contains, "$this$contains");
        return contains.o(r1.h(((long) i10) & KeyboardMap.kValueMask));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final boolean r(@dl.d a0 contains, byte b10) {
        f0.p(contains, "$this$contains");
        return contains.o(r1.h(((long) b10) & 255));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final boolean s(@dl.d x contains, short s10) {
        f0.p(contains, "$this$contains");
        return contains.o(n1.h(s10 & x1.f128661e));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    @sh.f
    private static final boolean t(x contains, n1 n1Var) {
        f0.p(contains, "$this$contains");
        return n1Var != null && contains.o(n1Var.q0());
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final boolean u(@dl.d x contains, long j10) {
        f0.p(contains, "$this$contains");
        return r1.h(j10 >>> 32) == 0 && contains.o(n1.h((int) j10));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {kotlin.s.class})
    public static final boolean v(@dl.d a0 contains, short s10) {
        f0.p(contains, "$this$contains");
        return contains.o(r1.h(((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final v w(short s10, short s11) {
        return v.f118893e.a(n1.h(s10 & x1.f128661e), n1.h(s11 & x1.f128661e), -1);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final v x(int i10, int i11) {
        return v.f118893e.a(i10, i11, -1);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final v y(byte b10, byte b11) {
        return v.f118893e.a(n1.h(b10 & 255), n1.h(b11 & 255), -1);
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {kotlin.s.class})
    public static final y z(long j10, long j11) {
        return y.f118903e.a(j10, j11, -1L);
    }
}
