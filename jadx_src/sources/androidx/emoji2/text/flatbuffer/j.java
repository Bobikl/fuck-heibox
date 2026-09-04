package androidx.emoji2.text.flatbuffer;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: compiled from: FlexBuffersBuilder.java */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f23066h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f23067i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f23068j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f23069k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f23070l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f23071m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f23072n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f23073o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f23074p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f23075q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final /* synthetic */ boolean f23076r = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f23077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f23078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Integer> f23079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, Integer> f23080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Comparator<b> f23083g;

    /* JADX INFO: compiled from: FlexBuffersBuilder.java */
    public class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b10;
            byte b11;
            int i10 = bVar.f23090e;
            int i11 = bVar2.f23090e;
            do {
                b10 = j.this.f23077a.get(i10);
                b11 = j.this.f23077a.get(i11);
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
            } while (b10 == b11);
            return b10 - b11;
        }
    }

    /* JADX INFO: compiled from: FlexBuffersBuilder.java */
    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f23085f = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f23086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f23087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final double f23088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f23089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23090e;

        b(int i10, int i11, int i12, double d10) {
            this.f23090e = i10;
            this.f23086a = i11;
            this.f23087b = i12;
            this.f23088c = d10;
            this.f23089d = Long.MIN_VALUE;
        }

        b(int i10, int i11, int i12, long j10) {
            this.f23090e = i10;
            this.f23086a = i11;
            this.f23087b = i12;
            this.f23089d = j10;
            this.f23088c = Double.MIN_VALUE;
        }

        static b f(int i10, int i11, int i12, int i13) {
            return new b(i10, i12, i13, i11);
        }

        static b g(int i10, boolean z10) {
            return new b(i10, 26, 0, z10 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i10, int i11) {
            return i(this.f23086a, this.f23087b, this.f23089d, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int i(int i10, int i11, long j10, int i12, int i13) {
            if (FlexBuffers.j(i10)) {
                return i11;
            }
            for (int i14 = 1; i14 <= 32; i14 *= 2) {
                int iE = j.E((int) (((long) ((q(i12, i14) + i12) + (i13 * i14))) - j10));
                if ((1 << iE) == i14) {
                    return iE;
                }
            }
            return 3;
        }

        static b j(int i10, float f10) {
            return new b(i10, 3, 2, f10);
        }

        static b k(int i10, double d10) {
            return new b(i10, 3, 3, d10);
        }

        static b l(int i10, int i11) {
            return new b(i10, 1, 1, i11);
        }

        static b m(int i10, int i11) {
            return new b(i10, 1, 2, i11);
        }

        static b n(int i10, long j10) {
            return new b(i10, 1, 3, j10);
        }

        static b o(int i10, int i11) {
            return new b(i10, 1, 0, i11);
        }

        private static byte p(int i10, int i11) {
            return (byte) (i10 | (i11 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int q(int i10, int i11) {
            return ((~i10) + 1) & (i11 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte r() {
            return s(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte s(int i10) {
            return p(t(i10), this.f23086a);
        }

        private int t(int i10) {
            return FlexBuffers.j(this.f23086a) ? Math.max(this.f23087b, i10) : this.f23087b;
        }

        static b u(int i10, int i11) {
            return new b(i10, 2, 1, i11);
        }

        static b v(int i10, int i11) {
            return new b(i10, 2, 2, i11);
        }

        static b w(int i10, long j10) {
            return new b(i10, 2, 3, j10);
        }

        static b x(int i10, int i11) {
            return new b(i10, 2, 0, i11);
        }
    }

    public j() {
        this(256);
    }

    public j(int i10) {
        this(new androidx.emoji2.text.flatbuffer.a(i10), 1);
    }

    public j(q qVar, int i10) {
        this.f23078b = new ArrayList<>();
        this.f23079c = new HashMap<>();
        this.f23080d = new HashMap<>();
        this.f23082f = false;
        this.f23083g = new a();
        this.f23077a = qVar;
        this.f23081e = i10;
    }

    public j(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }

    @Deprecated
    public j(ByteBuffer byteBuffer, int i10) {
        this(new androidx.emoji2.text.flatbuffer.a(byteBuffer.array()), i10);
    }

    private void A(String str, long j10) {
        this.f23078b.add(b.w(u(str), j10));
    }

    static int E(long j10) {
        if (j10 <= FlexBuffers.i.a((byte) -1)) {
            return 0;
        }
        if (j10 <= FlexBuffers.i.c((short) -1)) {
            return 1;
        }
        return j10 <= FlexBuffers.i.b(-1) ? 2 : 3;
    }

    private void F(b bVar, int i10) {
        int i11 = bVar.f23086a;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                H(bVar.f23088c, i10);
                return;
            } else if (i11 != 26) {
                J(bVar.f23089d, i10);
                return;
            }
        }
        I(bVar.f23089d, i10);
    }

    private b G(int i10, byte[] bArr, int i11, boolean z10) {
        int iE = E(bArr.length);
        I(bArr.length, b(iE));
        int iK = this.f23077a.k();
        this.f23077a.o(bArr, 0, bArr.length);
        if (z10) {
            this.f23077a.l((byte) 0);
        }
        return b.f(i10, iK, i11, iE);
    }

    private void H(double d10, int i10) {
        if (i10 == 4) {
            this.f23077a.a((float) d10);
        } else if (i10 == 8) {
            this.f23077a.f(d10);
        }
    }

    private void I(long j10, int i10) {
        if (i10 == 1) {
            this.f23077a.l((byte) j10);
            return;
        }
        if (i10 == 2) {
            this.f23077a.g((short) j10);
        } else if (i10 == 4) {
            this.f23077a.c((int) j10);
        } else {
            if (i10 != 8) {
                return;
            }
            this.f23077a.d(j10);
        }
    }

    private void J(long j10, int i10) {
        I((int) (((long) this.f23077a.k()) - j10), i10);
    }

    private b K(int i10, String str) {
        return G(i10, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int b(int i10) {
        int i11 = 1 << i10;
        int iQ = b.q(this.f23077a.k(), i11);
        while (true) {
            int i12 = iQ - 1;
            if (iQ == 0) {
                return i11;
            }
            this.f23077a.l((byte) 0);
            iQ = i12;
        }
    }

    private b c(int i10, int i11) {
        long j10 = i11;
        int iMax = Math.max(0, E(j10));
        int i12 = i10;
        while (i12 < this.f23078b.size()) {
            i12++;
            iMax = Math.max(iMax, b.i(4, 0, this.f23078b.get(i12).f23090e, this.f23077a.k(), i12));
        }
        int iB = b(iMax);
        I(j10, iB);
        int iK = this.f23077a.k();
        while (i10 < this.f23078b.size()) {
            int i13 = this.f23078b.get(i10).f23090e;
            J(this.f23078b.get(i10).f23090e, iB);
            i10++;
        }
        return new b(-1, FlexBuffers.q(4, 0), iMax, iK);
    }

    private b d(int i10, int i11, int i12, boolean z10, boolean z11, b bVar) {
        int i13;
        int iQ;
        int i14 = i12;
        long j10 = i14;
        int iMax = Math.max(0, E(j10));
        if (bVar != null) {
            iMax = Math.max(iMax, bVar.h(this.f23077a.k(), 0));
            i13 = 3;
        } else {
            i13 = 1;
        }
        int i15 = 4;
        int iMax2 = iMax;
        for (int i16 = i11; i16 < this.f23078b.size(); i16++) {
            iMax2 = Math.max(iMax2, this.f23078b.get(i16).h(this.f23077a.k(), i16 + i13));
            if (z10 && i16 == i11) {
                i15 = this.f23078b.get(i16).f23086a;
                if (!FlexBuffers.l(i15)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i17 = i11;
        int iB = b(iMax2);
        if (bVar != null) {
            J(bVar.f23089d, iB);
            I(1 << bVar.f23087b, iB);
        }
        if (!z11) {
            I(j10, iB);
        }
        int iK = this.f23077a.k();
        for (int i18 = i17; i18 < this.f23078b.size(); i18++) {
            F(this.f23078b.get(i18), iB);
        }
        if (!z10) {
            while (i17 < this.f23078b.size()) {
                this.f23077a.l(this.f23078b.get(i17).s(iMax2));
                i17++;
            }
        }
        if (bVar != null) {
            iQ = 9;
        } else if (z10) {
            if (!z11) {
                i14 = 0;
            }
            iQ = FlexBuffers.q(i15, i14);
        } else {
            iQ = 10;
        }
        return new b(i10, iQ, iMax2, iK);
    }

    private int u(String str) {
        if (str == null) {
            return -1;
        }
        int iK = this.f23077a.k();
        if ((this.f23081e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f23077a.o(bytes, 0, bytes.length);
            this.f23077a.l((byte) 0);
            this.f23079c.put(str, Integer.valueOf(iK));
            return iK;
        }
        Integer num = this.f23079c.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f23077a.o(bytes2, 0, bytes2.length);
        this.f23077a.l((byte) 0);
        this.f23079c.put(str, Integer.valueOf(iK));
        return iK;
    }

    private void z(String str, long j10) {
        b bVarV;
        int iU = u(str);
        int iE = E(j10);
        if (iE == 0) {
            bVarV = b.x(iU, (int) j10);
        } else if (iE == 1) {
            bVarV = b.u(iU, (int) j10);
        } else {
            bVarV = iE == 2 ? b.v(iU, (int) j10) : b.w(iU, j10);
        }
        this.f23078b.add(bVarV);
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.f23078b.size();
    }

    public int D() {
        return this.f23078b.size();
    }

    public int e(String str, int i10) {
        int iU = u(str);
        ArrayList<b> arrayList = this.f23078b;
        Collections.sort(arrayList.subList(i10, arrayList.size()), this.f23083g);
        b bVarD = d(iU, i10, this.f23078b.size() - i10, false, false, c(i10, this.f23078b.size() - i10));
        while (this.f23078b.size() > i10) {
            ArrayList<b> arrayList2 = this.f23078b;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f23078b.add(bVarD);
        return (int) bVarD.f23089d;
    }

    public int f(String str, int i10, boolean z10, boolean z11) {
        b bVarD = d(u(str), i10, this.f23078b.size() - i10, z10, z11, null);
        while (this.f23078b.size() > i10) {
            ArrayList<b> arrayList = this.f23078b;
            arrayList.remove(arrayList.size() - 1);
        }
        this.f23078b.add(bVarD);
        return (int) bVarD.f23089d;
    }

    public ByteBuffer g() {
        int iB = b(this.f23078b.get(0).h(this.f23077a.k(), 0));
        F(this.f23078b.get(0), iB);
        this.f23077a.l(this.f23078b.get(0).r());
        this.f23077a.l((byte) iB);
        this.f23082f = true;
        return ByteBuffer.wrap(this.f23077a.e(), 0, this.f23077a.k());
    }

    public q h() {
        return this.f23077a;
    }

    public int i(String str, byte[] bArr) {
        b bVarG = G(u(str), bArr, 25, false);
        this.f23078b.add(bVarG);
        return (int) bVarG.f23089d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z10) {
        this.f23078b.add(b.g(u(str), z10));
    }

    public void l(boolean z10) {
        k(null, z10);
    }

    public void m(double d10) {
        o(null, d10);
    }

    public void n(float f10) {
        p(null, f10);
    }

    public void o(String str, double d10) {
        this.f23078b.add(b.k(u(str), d10));
    }

    public void p(String str, float f10) {
        this.f23078b.add(b.j(u(str), f10));
    }

    public void q(int i10) {
        s(null, i10);
    }

    public void r(long j10) {
        t(null, j10);
    }

    public void s(String str, int i10) {
        t(str, i10);
    }

    public void t(String str, long j10) {
        int iU = u(str);
        if (-128 <= j10 && j10 <= 127) {
            this.f23078b.add(b.o(iU, (int) j10));
            return;
        }
        if (-32768 <= j10 && j10 <= 32767) {
            this.f23078b.add(b.l(iU, (int) j10));
        } else if (-2147483648L > j10 || j10 > 2147483647L) {
            this.f23078b.add(b.n(iU, j10));
        } else {
            this.f23078b.add(b.m(iU, (int) j10));
        }
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int iU = u(str);
        if ((this.f23081e & 2) == 0) {
            b bVarK = K(iU, str2);
            this.f23078b.add(bVarK);
            return (int) bVarK.f23089d;
        }
        Integer num = this.f23080d.get(str2);
        if (num != null) {
            this.f23078b.add(b.f(iU, num.intValue(), 5, E(str2.length())));
            return num.intValue();
        }
        b bVarK2 = K(iU, str2);
        this.f23080d.put(str2, Integer.valueOf((int) bVarK2.f23089d));
        this.f23078b.add(bVarK2);
        return (int) bVarK2.f23089d;
    }

    public void x(int i10) {
        z(null, i10);
    }

    public void y(long j10) {
        z(null, j10);
    }
}
