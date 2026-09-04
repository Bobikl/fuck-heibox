package androidx.emoji2.text.flatbuffer;

import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.x1;

/* JADX INFO: loaded from: classes6.dex */
public class FlexBuffers {
    public static final int A = 26;
    public static final int B = 36;
    private static final p C = new androidx.emoji2.text.flatbuffer.a(new byte[]{0}, 1);
    static final /* synthetic */ boolean D = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22989a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22990b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22991c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22992d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22993e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22994f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22995g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22996h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22997i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f22998j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f22999k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f23000l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f23001m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f23002n = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f23003o = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f23004p = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f23005q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f23006r = 17;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f23007s = 18;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f23008t = 19;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f23009u = 20;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f23010v = 21;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f23011w = 22;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f23012x = 23;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f23013y = 24;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f23014z = 25;

    public static class FlexBufferException extends RuntimeException {
        FlexBufferException(String str) {
            super(str);
        }
    }

    public static class a extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final a f23015e = new a(FlexBuffers.C, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f23016f = false;

        a(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
        }

        public static a d() {
            return f23015e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append(kotlin.text.y.f128593b);
            sb2.append(this.f23020a.n(this.f23021b, b()));
            sb2.append(kotlin.text.y.f128593b);
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.g
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public ByteBuffer c() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f23020a.e());
            byteBufferWrap.position(this.f23021b);
            byteBufferWrap.limit(this.f23021b + b());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i10) {
            return this.f23020a.get(this.f23021b + i10);
        }

        public byte[] f() {
            int iB = b();
            byte[] bArr = new byte[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                bArr[i10] = this.f23020a.get(this.f23021b + i10);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public String toString() {
            return this.f23020a.n(this.f23021b, b());
        }
    }

    public static class b extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final b f23017d = new b(FlexBuffers.C, 0, 0);

        b(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
        }

        public static b d() {
            return f23017d;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        int c(byte[] bArr) {
            byte b10;
            byte b11;
            int i10 = this.f23021b;
            int i11 = 0;
            do {
                b10 = this.f23020a.get(i10);
                b11 = bArr[i11];
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
                if (i11 == bArr.length) {
                    return b10 - b11;
                }
            } while (b10 == b11);
            return b10 - b11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f23021b == this.f23021b && bVar.f23022c == this.f23022c;
        }

        public int hashCode() {
            return this.f23021b ^ this.f23022c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public String toString() {
            int i10 = this.f23021b;
            while (this.f23020a.get(i10) != 0) {
                i10++;
            }
            int i11 = this.f23021b;
            return this.f23020a.n(i11, i10 - i11);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f23018a;

        c(h hVar) {
            this.f23018a = hVar;
        }

        public b a(int i10) {
            if (i10 >= b()) {
                return b.f23017d;
            }
            h hVar = this.f23018a;
            int i11 = hVar.f23021b + (i10 * hVar.f23022c);
            h hVar2 = this.f23018a;
            p pVar = hVar2.f23020a;
            return new b(pVar, FlexBuffers.i(pVar, i11, hVar2.f23022c), 1);
        }

        public int b() {
            return this.f23018a.b();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (int i10 = 0; i10 < this.f23018a.b(); i10++) {
                this.f23018a.d(i10).z(sb2);
                if (i10 != this.f23018a.b() - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class d extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final d f23019f = new d(FlexBuffers.C, 1, 1);

        d(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
        }

        private int f(c cVar, byte[] bArr) {
            int iB = cVar.b() - 1;
            int i10 = 0;
            while (i10 <= iB) {
                int i11 = (i10 + iB) >>> 1;
                int iC = cVar.a(i11).c(bArr);
                if (iC < 0) {
                    i10 = i11 + 1;
                } else {
                    if (iC <= 0) {
                        return i11;
                    }
                    iB = i11 - 1;
                }
            }
            return -(i10 + 1);
        }

        public static d g() {
            return f23019f;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j, androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("{ ");
            c cVarJ = j();
            int iB = b();
            j jVarK = k();
            for (int i10 = 0; i10 < iB; i10++) {
                sb2.append(kotlin.text.y.f128593b);
                sb2.append(cVarJ.a(i10).toString());
                sb2.append("\" : ");
                sb2.append(jVarK.d(i10).toString());
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public f h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public f i(byte[] bArr) {
            c cVarJ = j();
            int iB = cVarJ.b();
            int iF = f(cVarJ, bArr);
            return (iF < 0 || iF >= iB) ? f.f23023f : d(iF);
        }

        public c j() {
            int i10 = this.f23021b - (this.f23022c * 3);
            p pVar = this.f23020a;
            int i11 = FlexBuffers.i(pVar, i10, this.f23022c);
            p pVar2 = this.f23020a;
            int i12 = this.f23022c;
            return new c(new h(pVar, i11, FlexBuffers.n(pVar2, i10 + i12, i12), 4));
        }

        public j k() {
            return new j(this.f23020a, this.f23021b, this.f23022c);
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        p f23020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23022c;

        e(p pVar, int i10, int i11) {
            this.f23020a = pVar;
            this.f23021b = i10;
            this.f23022c = i11;
        }

        public abstract StringBuilder a(StringBuilder sb2);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final f f23023f = new f(FlexBuffers.C, 0, 1, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f23024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23028e;

        f(p pVar, int i10, int i11, int i12) {
            this(pVar, i10, i11, 1 << (i12 & 3), i12 >> 2);
        }

        f(p pVar, int i10, int i11, int i12, int i13) {
            this.f23024a = pVar;
            this.f23025b = i10;
            this.f23026c = i11;
            this.f23027d = i12;
            this.f23028e = i13;
        }

        public a b() {
            if (!m() && !v()) {
                return a.d();
            }
            p pVar = this.f23024a;
            return new a(pVar, FlexBuffers.i(pVar, this.f23025b, this.f23026c), this.f23027d);
        }

        public boolean c() {
            if (n()) {
                return this.f23024a.get(this.f23025b) != 0;
            }
            return j() != 0;
        }

        public double d() {
            int i10 = this.f23028e;
            if (i10 == 3) {
                return FlexBuffers.m(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 1) {
                return FlexBuffers.n(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 != 2) {
                if (i10 == 5) {
                    return Double.parseDouble(i());
                }
                if (i10 == 6) {
                    p pVar = this.f23024a;
                    return FlexBuffers.n(pVar, FlexBuffers.i(pVar, this.f23025b, this.f23026c), this.f23027d);
                }
                if (i10 == 7) {
                    p pVar2 = this.f23024a;
                    return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f23025b, this.f23026c), this.f23027d);
                }
                if (i10 == 8) {
                    p pVar3 = this.f23024a;
                    return FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f23025b, this.f23026c), this.f23027d);
                }
                if (i10 == 10) {
                    return k().b();
                }
                if (i10 != 26) {
                    return 0.0d;
                }
            }
            return FlexBuffers.p(this.f23024a, this.f23025b, this.f23026c);
        }

        public int e() {
            int i10 = this.f23028e;
            if (i10 == 1) {
                return FlexBuffers.n(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 2) {
                return (int) FlexBuffers.p(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 3) {
                return (int) FlexBuffers.m(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 5) {
                return Integer.parseInt(i());
            }
            if (i10 == 6) {
                p pVar = this.f23024a;
                return FlexBuffers.n(pVar, FlexBuffers.i(pVar, this.f23025b, this.f23026c), this.f23027d);
            }
            if (i10 == 7) {
                p pVar2 = this.f23024a;
                return (int) FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f23025b, this.f23026c), this.f23026c);
            }
            if (i10 == 8) {
                p pVar3 = this.f23024a;
                return (int) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f23025b, this.f23026c), this.f23027d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0;
            }
            return FlexBuffers.n(this.f23024a, this.f23025b, this.f23026c);
        }

        public b f() {
            if (!r()) {
                return b.d();
            }
            p pVar = this.f23024a;
            return new b(pVar, FlexBuffers.i(pVar, this.f23025b, this.f23026c), this.f23027d);
        }

        public long g() {
            int i10 = this.f23028e;
            if (i10 == 1) {
                return FlexBuffers.o(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 2) {
                return FlexBuffers.p(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 3) {
                return (long) FlexBuffers.m(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 5) {
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i10 == 6) {
                p pVar = this.f23024a;
                return FlexBuffers.o(pVar, FlexBuffers.i(pVar, this.f23025b, this.f23026c), this.f23027d);
            }
            if (i10 == 7) {
                p pVar2 = this.f23024a;
                return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f23025b, this.f23026c), this.f23026c);
            }
            if (i10 == 8) {
                p pVar3 = this.f23024a;
                return (long) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f23025b, this.f23026c), this.f23027d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0L;
            }
            return FlexBuffers.n(this.f23024a, this.f23025b, this.f23026c);
        }

        public d h() {
            if (!s()) {
                return d.g();
            }
            p pVar = this.f23024a;
            return new d(pVar, FlexBuffers.i(pVar, this.f23025b, this.f23026c), this.f23027d);
        }

        public String i() {
            if (v()) {
                int i10 = FlexBuffers.i(this.f23024a, this.f23025b, this.f23026c);
                p pVar = this.f23024a;
                int i11 = this.f23027d;
                return this.f23024a.n(i10, (int) FlexBuffers.p(pVar, i10 - i11, i11));
            }
            if (!r()) {
                return "";
            }
            int i12 = FlexBuffers.i(this.f23024a, this.f23025b, this.f23027d);
            int i13 = i12;
            while (this.f23024a.get(i13) != 0) {
                i13++;
            }
            return this.f23024a.n(i12, i13 - i12);
        }

        public long j() {
            int i10 = this.f23028e;
            if (i10 == 2) {
                return FlexBuffers.p(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 1) {
                return FlexBuffers.o(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 3) {
                return (long) FlexBuffers.m(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 == 26) {
                return FlexBuffers.n(this.f23024a, this.f23025b, this.f23026c);
            }
            if (i10 == 5) {
                return Long.parseLong(i());
            }
            if (i10 == 6) {
                p pVar = this.f23024a;
                return FlexBuffers.o(pVar, FlexBuffers.i(pVar, this.f23025b, this.f23026c), this.f23027d);
            }
            if (i10 == 7) {
                p pVar2 = this.f23024a;
                return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f23025b, this.f23026c), this.f23027d);
            }
            if (i10 != 8) {
                return 0L;
            }
            p pVar3 = this.f23024a;
            return (long) FlexBuffers.m(pVar3, FlexBuffers.i(pVar3, this.f23025b, this.f23026c), this.f23026c);
        }

        public j k() {
            if (y()) {
                p pVar = this.f23024a;
                return new j(pVar, FlexBuffers.i(pVar, this.f23025b, this.f23026c), this.f23027d);
            }
            int i10 = this.f23028e;
            if (i10 == 15) {
                p pVar2 = this.f23024a;
                return new h(pVar2, FlexBuffers.i(pVar2, this.f23025b, this.f23026c), this.f23027d, 4);
            }
            if (!FlexBuffers.k(i10)) {
                return j.c();
            }
            p pVar3 = this.f23024a;
            return new h(pVar3, FlexBuffers.i(pVar3, this.f23025b, this.f23026c), this.f23027d, FlexBuffers.r(this.f23028e));
        }

        public int l() {
            return this.f23028e;
        }

        public boolean m() {
            return this.f23028e == 25;
        }

        public boolean n() {
            return this.f23028e == 26;
        }

        public boolean o() {
            int i10 = this.f23028e;
            return i10 == 3 || i10 == 8;
        }

        public boolean p() {
            int i10 = this.f23028e;
            return i10 == 1 || i10 == 6;
        }

        public boolean q() {
            return p() || x();
        }

        public boolean r() {
            return this.f23028e == 4;
        }

        public boolean s() {
            return this.f23028e == 9;
        }

        public boolean t() {
            return this.f23028e == 0;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            return q() || o();
        }

        public boolean v() {
            return this.f23028e == 5;
        }

        public boolean w() {
            return FlexBuffers.k(this.f23028e);
        }

        public boolean x() {
            int i10 = this.f23028e;
            return i10 == 2 || i10 == 7;
        }

        public boolean y() {
            int i10 = this.f23028e;
            return i10 == 10 || i10 == 9;
        }

        StringBuilder z(StringBuilder sb2) {
            int i10 = this.f23028e;
            if (i10 != 36) {
                switch (i10) {
                    case 0:
                        sb2.append("null");
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(g());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(j());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(d());
                        return sb2;
                    case 4:
                        b bVarF = f();
                        sb2.append(kotlin.text.y.f128593b);
                        StringBuilder sbA = bVarF.a(sb2);
                        sbA.append(kotlin.text.y.f128593b);
                        return sbA;
                    case 5:
                        sb2.append(kotlin.text.y.f128593b);
                        sb2.append(i());
                        sb2.append(kotlin.text.y.f128593b);
                        return sb2;
                    case 9:
                        return h().a(sb2);
                    case 10:
                        return k().a(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.f23028e);
                    case 25:
                        return b().a(sb2);
                    case 26:
                        sb2.append(c());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(k());
            return sb2;
        }
    }

    public static abstract class g extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final int f23029d;

        g(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
            this.f23029d = FlexBuffers.n(this.f23020a, i10 - i11, i11);
        }

        public int b() {
            return this.f23029d;
        }
    }

    public static class h extends j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final h f23030g = new h(FlexBuffers.C, 1, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f23031f;

        h(p pVar, int i10, int i11, int i12) {
            super(pVar, i10, i11);
            this.f23031f = i12;
        }

        public static h f() {
            return f23030g;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j
        public f d(int i10) {
            if (i10 >= b()) {
                return f.f23023f;
            }
            return new f(this.f23020a, this.f23021b + (i10 * this.f23022c), this.f23022c, 1, this.f23031f);
        }

        public int g() {
            return this.f23031f;
        }

        public boolean h() {
            return this == f23030g;
        }
    }

    public static class i {
        i() {
        }

        static int a(byte b10) {
            return b10 & 255;
        }

        static long b(int i10) {
            return ((long) i10) & KeyboardMap.kValueMask;
        }

        static int c(short s10) {
            return s10 & x1.f128661e;
        }
    }

    public static class j extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final j f23032e = new j(FlexBuffers.C, 1, 1);

        j(p pVar, int i10, int i11) {
            super(pVar, i10, i11);
        }

        public static j c() {
            return f23032e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("[ ");
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                d(i10).z(sb2);
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" ]");
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.g
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public f d(int i10) {
            long jB = b();
            long j10 = i10;
            if (j10 >= jB) {
                return f.f23023f;
            }
            return new f(this.f23020a, this.f23021b + (i10 * this.f23022c), this.f23022c, i.a(this.f23020a.get((int) (((long) this.f23021b) + (jB * ((long) this.f23022c)) + j10))));
        }

        public boolean e() {
            return this == f23032e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static f g(p pVar) {
        int iLimit = pVar.limit() - 1;
        byte b10 = pVar.get(iLimit);
        int i10 = iLimit - 1;
        return new f(pVar, i10 - b10, b10, i.a(pVar.get(i10)));
    }

    @Deprecated
    public static f h(ByteBuffer byteBuffer) {
        return g(byteBuffer.hasArray() ? new androidx.emoji2.text.flatbuffer.a(byteBuffer.array(), byteBuffer.limit()) : new androidx.emoji2.text.flatbuffer.d(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(p pVar, int i10, int i11) {
        return (int) (((long) i10) - p(pVar, i10, i11));
    }

    static boolean j(int i10) {
        return i10 <= 3 || i10 == 26;
    }

    static boolean k(int i10) {
        return (i10 >= 11 && i10 <= 15) || i10 == 36;
    }

    static boolean l(int i10) {
        return (i10 >= 1 && i10 <= 4) || i10 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double m(p pVar, int i10, int i11) {
        if (i11 == 4) {
            return pVar.getFloat(i10);
        }
        if (i11 != 8) {
            return -1.0d;
        }
        return pVar.getDouble(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(p pVar, int i10, int i11) {
        return (int) o(pVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o(p pVar, int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = pVar.get(i10);
        } else if (i11 == 2) {
            i12 = pVar.getShort(i10);
        } else {
            if (i11 != 4) {
                if (i11 != 8) {
                    return -1L;
                }
                return pVar.getLong(i10);
            }
            i12 = pVar.getInt(i10);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long p(p pVar, int i10, int i11) {
        if (i11 == 1) {
            return i.a(pVar.get(i10));
        }
        if (i11 == 2) {
            return i.c(pVar.getShort(i10));
        }
        if (i11 == 4) {
            return i.b(pVar.getInt(i10));
        }
        if (i11 != 8) {
            return -1L;
        }
        return pVar.getLong(i10);
    }

    static int q(int i10, int i11) {
        if (i11 == 0) {
            return (i10 - 1) + 11;
        }
        if (i11 == 2) {
            return (i10 - 1) + 16;
        }
        if (i11 == 3) {
            return (i10 - 1) + 19;
        }
        if (i11 != 4) {
            return 0;
        }
        return (i10 - 1) + 22;
    }

    static int r(int i10) {
        return (i10 - 11) + 1;
    }
}
