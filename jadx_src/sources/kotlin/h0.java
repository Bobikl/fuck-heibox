package kotlin;

/* JADX INFO: compiled from: NumbersJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h0 extends g0 {
    @u0(version = "1.2")
    @sh.f
    private static final float A0(kotlin.jvm.internal.y yVar, int i10) {
        kotlin.jvm.internal.f0.p(yVar, "<this>");
        return Float.intBitsToFloat(i10);
    }

    @sh.f
    private static final boolean B0(double d10) {
        return (Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true;
    }

    @sh.f
    private static final boolean C0(float f10) {
        return (Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true;
    }

    @sh.f
    private static final boolean D0(double d10) {
        return Double.isInfinite(d10);
    }

    @sh.f
    private static final boolean E0(float f10) {
        return Float.isInfinite(f10);
    }

    @sh.f
    private static final boolean F0(double d10) {
        return Double.isNaN(d10);
    }

    @sh.f
    private static final boolean G0(float f10) {
        return Float.isNaN(f10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class})
    @sh.f
    private static final int H0(int i10, int i11) {
        return Integer.rotateLeft(i10, i11);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class})
    @sh.f
    private static final long I0(long j10, int i10) {
        return Long.rotateLeft(j10, i10);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class})
    @sh.f
    private static final int J0(int i10, int i11) {
        return Integer.rotateRight(i10, i11);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class})
    @sh.f
    private static final long K0(long j10, int i10) {
        return Long.rotateRight(j10, i10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int L0(int i10) {
        return Integer.highestOneBit(i10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final long M0(long j10) {
        return Long.highestOneBit(j10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int N0(int i10) {
        return Integer.lowestOneBit(i10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final long O0(long j10) {
        return Long.lowestOneBit(j10);
    }

    @u0(version = "1.2")
    @sh.f
    private static final int P0(float f10) {
        return Float.floatToIntBits(f10);
    }

    @u0(version = "1.2")
    @sh.f
    private static final long Q0(double d10) {
        return Double.doubleToLongBits(d10);
    }

    @u0(version = "1.2")
    @sh.f
    private static final int R0(float f10) {
        return Float.floatToRawIntBits(f10);
    }

    @u0(version = "1.2")
    @sh.f
    private static final long S0(double d10) {
        return Double.doubleToRawLongBits(d10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int t0(int i10) {
        return Integer.numberOfLeadingZeros(i10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int u0(long j10) {
        return Long.numberOfLeadingZeros(j10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int v0(int i10) {
        return Integer.bitCount(i10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int w0(long j10) {
        return Long.bitCount(j10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int x0(int i10) {
        return Integer.numberOfTrailingZeros(i10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int y0(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    @u0(version = "1.2")
    @sh.f
    private static final double z0(kotlin.jvm.internal.v vVar, long j10) {
        kotlin.jvm.internal.f0.p(vVar, "<this>");
        return Double.longBitsToDouble(j10);
    }
}
