package kotlin;

/* JADX INFO: compiled from: Numbers.kt */
/* JADX INFO: loaded from: classes5.dex */
public class i0 extends h0 {
    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int T0(byte b10) {
        return Integer.numberOfLeadingZeros(b10 & 255) - 24;
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int U0(short s10) {
        return Integer.numberOfLeadingZeros(s10 & x1.f128661e) - 16;
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int V0(byte b10) {
        return Integer.bitCount(b10 & 255);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int W0(short s10) {
        return Integer.bitCount(s10 & x1.f128661e);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int X0(byte b10) {
        return Integer.numberOfTrailingZeros(b10 | 256);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final int Y0(short s10) {
        return Integer.numberOfTrailingZeros(s10 | 65536);
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class})
    public static final byte Z0(byte b10, int i10) {
        int i11 = i10 & 7;
        return (byte) (((b10 & 255) >>> (8 - i11)) | (b10 << i11));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class})
    public static final short a1(short s10, int i10) {
        int i11 = i10 & 15;
        return (short) (((s10 & 65535) >>> (16 - i11)) | (s10 << i11));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class})
    public static final byte b1(byte b10, int i10) {
        int i11 = i10 & 7;
        return (byte) (((b10 & 255) >>> i11) | (b10 << (8 - i11)));
    }

    @u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {q.class})
    public static final short c1(short s10, int i10) {
        int i11 = i10 & 15;
        return (short) (((s10 & 65535) >>> i11) | (s10 << (16 - i11)));
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final byte d1(byte b10) {
        return (byte) Integer.highestOneBit(b10 & 255);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final short e1(short s10) {
        return (short) Integer.highestOneBit(s10 & x1.f128661e);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final byte f1(byte b10) {
        return (byte) Integer.lowestOneBit(b10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {q.class})
    @sh.f
    private static final short g1(short s10) {
        return (short) Integer.lowestOneBit(s10);
    }
}
