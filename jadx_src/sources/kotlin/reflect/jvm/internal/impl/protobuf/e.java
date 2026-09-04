package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f127328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f127329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f127330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f127331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f127332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InputStream f127333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f127334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f127335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f127336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f127337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f127338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f127339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f127340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f127341n;

    /* JADX INFO: compiled from: CodedInputStream.java */
    public interface a {
        void a();
    }

    private e(InputStream inputStream) {
        this.f127335h = false;
        this.f127337j = Integer.MAX_VALUE;
        this.f127339l = 64;
        this.f127340m = 67108864;
        this.f127341n = null;
        this.f127328a = new byte[4096];
        this.f127330c = 0;
        this.f127332e = 0;
        this.f127336i = 0;
        this.f127333f = inputStream;
        this.f127329b = false;
    }

    private e(m mVar) {
        this.f127335h = false;
        this.f127337j = Integer.MAX_VALUE;
        this.f127339l = 64;
        this.f127340m = 67108864;
        this.f127341n = null;
        this.f127328a = mVar.f127364d;
        int iH = mVar.H();
        this.f127332e = iH;
        this.f127330c = iH + mVar.size();
        this.f127336i = -this.f127332e;
        this.f127333f = null;
        this.f127329b = true;
    }

    public static int B(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    private void N() {
        int i10 = this.f127330c + this.f127331d;
        this.f127330c = i10;
        int i11 = this.f127336i + i10;
        int i12 = this.f127337j;
        if (i11 <= i12) {
            this.f127331d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f127331d = i13;
        this.f127330c = i10 - i13;
    }

    private void O(int i10) throws IOException {
        if (!T(i10)) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void S(int i10) throws IOException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i11 = this.f127336i;
        int i12 = this.f127332e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f127337j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw InvalidProtocolBufferException.k();
        }
        int i15 = this.f127330c;
        int i16 = i15 - i12;
        this.f127332e = i15;
        O(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f127330c;
            if (i17 <= i18) {
                this.f127332e = i17;
                return;
            } else {
                i16 += i18;
                this.f127332e = i18;
                O(1);
            }
        }
    }

    private boolean T(int i10) throws IOException {
        int i11 = this.f127332e;
        if (i11 + i10 <= this.f127330c) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f127336i + i11 + i10 > this.f127337j) {
            return false;
        }
        a aVar = this.f127341n;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f127333f != null) {
            int i12 = this.f127332e;
            if (i12 > 0) {
                int i13 = this.f127330c;
                if (i13 > i12) {
                    byte[] bArr = this.f127328a;
                    System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
                }
                this.f127336i += i12;
                this.f127330c -= i12;
                this.f127332e = 0;
            }
            InputStream inputStream = this.f127333f;
            byte[] bArr2 = this.f127328a;
            int i14 = this.f127330c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f127328a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f127330c += i15;
                if ((this.f127336i + i10) - this.f127340m > 0) {
                    throw InvalidProtocolBufferException.j();
                }
                N();
                if (this.f127330c >= i10) {
                    return true;
                }
                return T(i10);
            }
        }
        return false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) throws IOException {
        if (this.f127330c - this.f127332e < i10) {
            O(i10);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    static e h(m mVar) {
        e eVar = new e(mVar);
        try {
            eVar.j(mVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private byte[] x(int i10) throws IOException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return h.f127353a;
            }
            throw InvalidProtocolBufferException.g();
        }
        int i11 = this.f127336i;
        int i12 = this.f127332e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f127337j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw InvalidProtocolBufferException.k();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f127330c - i12;
            System.arraycopy(this.f127328a, i12, bArr, 0, i15);
            this.f127332e = this.f127330c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f127328a, 0, bArr, i15, i16);
            this.f127332e = i16;
            return bArr;
        }
        int i17 = this.f127330c;
        this.f127336i = i11 + i17;
        this.f127332e = 0;
        this.f127330c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f127333f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.f127336i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f127328a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r2[r3] < 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f127332e
            int r1 = r9.f127330c
            if (r1 != r0) goto L8
            goto L7c
        L8:
            byte[] r2 = r9.f127328a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f127332e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7c
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L82
        L2d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3d:
            r1 = r3
            goto L82
        L3f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L82
        L7c:
            long r0 = r9.D()
            int r0 = (int) r0
            return r0
        L82:
            r9.f127332e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r2[r0] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long C() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f127332e
            int r1 = r9.f127330c
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            byte[] r2 = r9.f127328a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L14
            r9.f127332e = r3
            long r0 = (long) r0
            return r0
        L14:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L1b
            goto Lb8
        L1b:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r3 ^ r5
            goto Lbf
        L2f:
            int r0 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L42
            r1 = 16256(0x3f80, double:8.0315E-320)
        L3d:
            long r2 = r3 ^ r1
            r1 = r0
            goto Lbf
        L42:
            int r1 = r0 + 1
            r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L52
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L63
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3d
        L63:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L76
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L89
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3d
        L89:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L9c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto Lbd
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lbe
        Lb8:
            long r0 = r9.D()
            return r0
        Lbd:
            r1 = r0
        Lbe:
            r2 = r3
        Lbf:
            r9.f127332e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.C():long");
    }

    long D() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bW = w();
            j10 |= ((long) (bW & 127)) << i10;
            if ((bW & 128) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public int E() throws IOException {
        return y();
    }

    public long F() throws IOException {
        return z();
    }

    public int G() throws IOException {
        return b(A());
    }

    public long H() throws IOException {
        return c(C());
    }

    public String I() throws IOException {
        int iA = A();
        int i10 = this.f127330c;
        int i11 = this.f127332e;
        if (iA > i10 - i11 || iA <= 0) {
            return iA == 0 ? "" : new String(x(iA), "UTF-8");
        }
        String str = new String(this.f127328a, i11, iA, "UTF-8");
        this.f127332e += iA;
        return str;
    }

    public String J() throws IOException {
        byte[] bArrX;
        int iA = A();
        int i10 = this.f127332e;
        if (iA <= this.f127330c - i10 && iA > 0) {
            bArrX = this.f127328a;
            this.f127332e = i10 + iA;
        } else {
            if (iA == 0) {
                return "";
            }
            bArrX = x(iA);
            i10 = 0;
        }
        if (u.f(bArrX, i10, i10 + iA)) {
            return new String(bArrX, i10, iA, "UTF-8");
        }
        throw InvalidProtocolBufferException.d();
    }

    public int K() throws IOException {
        if (f()) {
            this.f127334g = 0;
            return 0;
        }
        int iA = A();
        this.f127334g = iA;
        if (WireFormat.a(iA) != 0) {
            return this.f127334g;
        }
        throw InvalidProtocolBufferException.c();
    }

    public int L() throws IOException {
        return A();
    }

    public long M() throws IOException {
        return C();
    }

    public boolean P(int i10, CodedOutputStream codedOutputStream) throws IOException {
        int iB = WireFormat.b(i10);
        if (iB == 0) {
            long jT = t();
            codedOutputStream.o0(i10);
            codedOutputStream.z0(jT);
            return true;
        }
        if (iB == 1) {
            long jZ = z();
            codedOutputStream.o0(i10);
            codedOutputStream.V(jZ);
            return true;
        }
        if (iB == 2) {
            d dVarL = l();
            codedOutputStream.o0(i10);
            codedOutputStream.P(dVarL);
            return true;
        }
        if (iB == 3) {
            codedOutputStream.o0(i10);
            Q(codedOutputStream);
            int iC = WireFormat.c(WireFormat.a(i10), 4);
            a(iC);
            codedOutputStream.o0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw InvalidProtocolBufferException.e();
        }
        int iY = y();
        codedOutputStream.o0(i10);
        codedOutputStream.U(iY);
        return true;
    }

    public void Q(CodedOutputStream codedOutputStream) throws IOException {
        int iK;
        do {
            iK = K();
            if (iK == 0) {
                return;
            }
        } while (P(iK, codedOutputStream));
    }

    public void R(int i10) throws IOException {
        int i11 = this.f127330c;
        int i12 = this.f127332e;
        if (i10 > i11 - i12 || i10 < 0) {
            S(i10);
        } else {
            this.f127332e = i12 + i10;
        }
    }

    public void a(int i10) throws InvalidProtocolBufferException {
        if (this.f127334g != i10) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public int e() {
        int i10 = this.f127337j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f127336i + this.f127332e);
    }

    public boolean f() throws IOException {
        return this.f127332e == this.f127330c && !T(1);
    }

    public void i(int i10) {
        this.f127337j = i10;
        N();
    }

    public int j(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i11 = i10 + this.f127336i + this.f127332e;
        int i12 = this.f127337j;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.k();
        }
        this.f127337j = i11;
        N();
        return i12;
    }

    public boolean k() throws IOException {
        return C() != 0;
    }

    public d l() throws IOException {
        int iA = A();
        int i10 = this.f127330c;
        int i11 = this.f127332e;
        if (iA > i10 - i11 || iA <= 0) {
            return iA == 0 ? d.f127320b : new m(x(iA));
        }
        d cVar = (this.f127329b && this.f127335h) ? new c(this.f127328a, this.f127332e, iA) : d.h(this.f127328a, i11, iA);
        this.f127332e += iA;
        return cVar;
    }

    public double m() throws IOException {
        return Double.longBitsToDouble(z());
    }

    public int n() throws IOException {
        return A();
    }

    public int o() throws IOException {
        return y();
    }

    public long p() throws IOException {
        return z();
    }

    public float q() throws IOException {
        return Float.intBitsToFloat(y());
    }

    public void r(int i10, n.a aVar, f fVar) throws IOException {
        int i11 = this.f127338k;
        if (i11 >= this.f127339l) {
            throw InvalidProtocolBufferException.h();
        }
        this.f127338k = i11 + 1;
        aVar.c(this, fVar);
        a(WireFormat.c(i10, 4));
        this.f127338k--;
    }

    public int s() throws IOException {
        return A();
    }

    public long t() throws IOException {
        return C();
    }

    public <T extends n> T u(p<T> pVar, f fVar) throws IOException {
        int iA = A();
        if (this.f127338k >= this.f127339l) {
            throw InvalidProtocolBufferException.h();
        }
        int iJ = j(iA);
        this.f127338k++;
        T tD = pVar.d(this, fVar);
        a(0);
        this.f127338k--;
        i(iJ);
        return tD;
    }

    public void v(n.a aVar, f fVar) throws IOException {
        int iA = A();
        if (this.f127338k >= this.f127339l) {
            throw InvalidProtocolBufferException.h();
        }
        int iJ = j(iA);
        this.f127338k++;
        aVar.c(this, fVar);
        a(0);
        this.f127338k--;
        i(iJ);
    }

    public byte w() throws IOException {
        if (this.f127332e == this.f127330c) {
            O(1);
        }
        byte[] bArr = this.f127328a;
        int i10 = this.f127332e;
        this.f127332e = i10 + 1;
        return bArr[i10];
    }

    public int y() throws IOException {
        int i10 = this.f127332e;
        if (this.f127330c - i10 < 4) {
            O(4);
            i10 = this.f127332e;
        }
        byte[] bArr = this.f127328a;
        this.f127332e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long z() throws IOException {
        int i10 = this.f127332e;
        if (this.f127330c - i10 < 8) {
            O(8);
            i10 = this.f127332e;
        }
        byte[] bArr = this.f127328a;
        this.f127332e = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
