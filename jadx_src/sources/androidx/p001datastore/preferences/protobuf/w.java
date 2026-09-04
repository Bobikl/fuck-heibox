package androidx.p001datastore.preferences.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22648f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f22649g = 100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f22650h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f22651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f22653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    x f22654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22655e;

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class b extends w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final byte[] f22656i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f22657j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f22658k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f22659l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f22660m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f22661n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f22662o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f22663p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f22664q;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f22664q = Integer.MAX_VALUE;
            this.f22656i = bArr;
            this.f22658k = i11 + i10;
            this.f22660m = i10;
            this.f22661n = i10;
            this.f22657j = z10;
        }

        private void m0() {
            int i10 = this.f22658k + this.f22659l;
            this.f22658k = i10;
            int i11 = i10 - this.f22661n;
            int i12 = this.f22664q;
            if (i11 <= i12) {
                this.f22659l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f22659l = i13;
            this.f22658k = i10 - i13;
        }

        private void n0() throws IOException {
            if (this.f22658k - this.f22660m >= 10) {
                o0();
            } else {
                p0();
            }
        }

        private void o0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f22656i;
                int i11 = this.f22660m;
                this.f22660m = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void p0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public <T extends z1> T D(int i10, p2<T> p2Var, p0 p0Var) throws IOException {
            int i11 = this.f22651a;
            if (i11 >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f22651a = i11 + 1;
            T tO = p2Var.o(this, p0Var);
            a(WireFormat.c(i10, 4));
            this.f22651a--;
            return tO;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void E(int i10, z1.a aVar, p0 p0Var) throws IOException {
            int i11 = this.f22651a;
            if (i11 >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f22651a = i11 + 1;
            aVar.b1(this, p0Var);
            a(WireFormat.c(i10, 4));
            this.f22651a--;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public <T extends z1> T H(p2<T> p2Var, p0 p0Var) throws IOException {
            int iN = N();
            if (this.f22651a >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            int iT = t(iN);
            this.f22651a++;
            T tO = p2Var.o(this, p0Var);
            a(0);
            this.f22651a--;
            s(iT);
            return tO;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void I(z1.a aVar, p0 p0Var) throws IOException {
            int iN = N();
            if (this.f22651a >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            int iT = t(iN);
            this.f22651a++;
            aVar.b1(this, p0Var);
            a(0);
            this.f22651a--;
            s(iT);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte J() throws IOException {
            int i10 = this.f22660m;
            if (i10 == this.f22658k) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f22656i;
            this.f22660m = i10 + 1;
            return bArr[i10];
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte[] K(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f22658k;
                int i12 = this.f22660m;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f22660m = i13;
                    return Arrays.copyOfRange(this.f22656i, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i10 == 0) {
                return i1.f22459d;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int L() throws IOException {
            int i10 = this.f22660m;
            if (this.f22658k - i10 < 4) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f22656i;
            this.f22660m = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long M() throws IOException {
            int i10 = this.f22660m;
            if (this.f22658k - i10 < 8) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f22656i;
            this.f22660m = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // androidx.p001datastore.preferences.protobuf.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f22660m
                int r1 = r5.f22658k
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f22656i
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f22660m = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.R()
                int r0 = (int) r0
                return r0
            L70:
                r5.f22660m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w.b.N():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        @Override // androidx.p001datastore.preferences.protobuf.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long Q() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f22660m
                int r1 = r11.f22658k
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f22656i
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f22660m = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.R()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f22660m = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w.b.Q():long");
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        long R() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = J();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int U() throws IOException {
            return w.b(N());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long V() throws IOException {
            return w.c(Q());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public String W() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f22658k;
                int i11 = this.f22660m;
                if (iN <= i10 - i11) {
                    String str = new String(this.f22656i, i11, iN, i1.f22456a);
                    this.f22660m += iN;
                    return str;
                }
            }
            if (iN == 0) {
                return "";
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public String X() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f22658k;
                int i11 = this.f22660m;
                if (iN <= i10 - i11) {
                    String strH = Utf8.h(this.f22656i, i11, iN);
                    this.f22660m += iN;
                    return strH;
                }
            }
            if (iN == 0) {
                return "";
            }
            if (iN <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int Y() throws IOException {
            if (i()) {
                this.f22662o = 0;
                return 0;
            }
            int iN = N();
            this.f22662o = iN;
            if (WireFormat.a(iN) != 0) {
                return this.f22662o;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f22662o != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        @Deprecated
        public void b0(int i10, z1.a aVar) throws IOException {
            E(i10, aVar, p0.d());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void c0() {
            this.f22661n = this.f22660m;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void e(boolean z10) {
            this.f22663p = z10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int f() {
            int i10 = this.f22664q;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - h();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int g() {
            return this.f22662o;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean g0(int i10) throws IOException {
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                n0();
                return true;
            }
            if (iB == 1) {
                k0(8);
                return true;
            }
            if (iB == 2) {
                k0(N());
                return true;
            }
            if (iB == 3) {
                i0();
                a(WireFormat.c(WireFormat.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int h() {
            return this.f22660m - this.f22661n;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                long jG = G();
                codedOutputStream.Z1(i10);
                codedOutputStream.i2(jG);
                return true;
            }
            if (iB == 1) {
                long jM = M();
                codedOutputStream.Z1(i10);
                codedOutputStream.D1(jM);
                return true;
            }
            if (iB == 2) {
                ByteString byteStringX = x();
                codedOutputStream.Z1(i10);
                codedOutputStream.z1(byteStringX);
                return true;
            }
            if (iB == 3) {
                codedOutputStream.Z1(i10);
                j0(codedOutputStream);
                int iC = WireFormat.c(WireFormat.a(i10), 4);
                a(iC);
                codedOutputStream.Z1(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int iL = L();
            codedOutputStream.Z1(i10);
            codedOutputStream.C1(iL);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean i() throws IOException {
            return this.f22660m == this.f22658k;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void i0() throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (g0(iY));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (h0(iY, codedOutputStream));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void k0(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f22658k;
                int i12 = this.f22660m;
                if (i10 <= i11 - i12) {
                    this.f22660m = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void s(int i10) {
            this.f22664q = i10;
            m0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int t(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iH = i10 + h();
            int i11 = this.f22664q;
            if (iH > i11) {
                throw InvalidProtocolBufferException.l();
            }
            this.f22664q = iH;
            m0();
            return i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public ByteBuffer w() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f22658k;
                int i11 = this.f22660m;
                if (iN <= i10 - i11) {
                    ByteBuffer byteBufferWrap = (this.f22657j || !this.f22663p) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f22656i, i11, i11 + iN)) : ByteBuffer.wrap(this.f22656i, i11, iN).slice();
                    this.f22660m += iN;
                    return byteBufferWrap;
                }
            }
            if (iN == 0) {
                return i1.f22460e;
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public ByteString x() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f22658k;
                int i11 = this.f22660m;
                if (iN <= i10 - i11) {
                    ByteString byteStringT0 = (this.f22657j && this.f22663p) ? ByteString.t0(this.f22656i, i11, iN) : ByteString.v(this.f22656i, i11, iN);
                    this.f22660m += iN;
                    return byteStringT0;
                }
            }
            return iN == 0 ? ByteString.f22239f : ByteString.s0(K(iN));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int z() throws IOException {
            return N();
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class c extends w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Iterable<ByteBuffer> f22665i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Iterator<ByteBuffer> f22666j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ByteBuffer f22667k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f22668l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f22669m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f22670n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f22671o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f22672p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f22673q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f22674r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f22675s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f22676t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f22677u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private long f22678v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private long f22679w;

        private c(Iterable<ByteBuffer> iterable, int i10, boolean z10) {
            super();
            this.f22672p = Integer.MAX_VALUE;
            this.f22670n = i10;
            this.f22665i = iterable;
            this.f22666j = iterable.iterator();
            this.f22668l = z10;
            this.f22674r = 0;
            this.f22675s = 0;
            if (i10 != 0) {
                t0();
                return;
            }
            this.f22667k = i1.f22460e;
            this.f22676t = 0L;
            this.f22677u = 0L;
            this.f22679w = 0L;
            this.f22678v = 0L;
        }

        private long m0() {
            return this.f22679w - this.f22676t;
        }

        private void n0() throws InvalidProtocolBufferException {
            if (!this.f22666j.hasNext()) {
                throw InvalidProtocolBufferException.l();
            }
            t0();
        }

        private void o0(byte[] bArr, int i10, int i11) throws IOException {
            if (i11 < 0 || i11 > q0()) {
                if (i11 > 0) {
                    throw InvalidProtocolBufferException.l();
                }
                if (i11 != 0) {
                    throw InvalidProtocolBufferException.g();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (m0() == 0) {
                    n0();
                }
                int iMin = Math.min(i12, (int) m0());
                long j10 = iMin;
                z3.n(this.f22676t, bArr, (i11 - i12) + i10, j10);
                i12 -= iMin;
                this.f22676t += j10;
            }
        }

        private void p0() {
            int i10 = this.f22670n + this.f22671o;
            this.f22670n = i10;
            int i11 = i10 - this.f22675s;
            int i12 = this.f22672p;
            if (i11 <= i12) {
                this.f22671o = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f22671o = i13;
            this.f22670n = i10 - i13;
        }

        private int q0() {
            return (int) ((((long) (this.f22670n - this.f22674r)) - this.f22676t) + this.f22677u);
        }

        private void r0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private ByteBuffer s0(int i10, int i11) throws IOException {
            int iPosition = this.f22667k.position();
            int iLimit = this.f22667k.limit();
            try {
                try {
                    this.f22667k.position(i10);
                    this.f22667k.limit(i11);
                    ByteBuffer byteBufferSlice = this.f22667k.slice();
                    this.f22667k.position(iPosition);
                    this.f22667k.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.l();
                }
            } catch (Throwable th2) {
                this.f22667k.position(iPosition);
                this.f22667k.limit(iLimit);
                throw th2;
            }
        }

        private void t0() {
            ByteBuffer next = this.f22666j.next();
            this.f22667k = next;
            this.f22674r += (int) (this.f22676t - this.f22677u);
            long jPosition = next.position();
            this.f22676t = jPosition;
            this.f22677u = jPosition;
            this.f22679w = this.f22667k.limit();
            long jI = z3.i(this.f22667k);
            this.f22678v = jI;
            this.f22676t += jI;
            this.f22677u += jI;
            this.f22679w += jI;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public <T extends z1> T D(int i10, p2<T> p2Var, p0 p0Var) throws IOException {
            int i11 = this.f22651a;
            if (i11 >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f22651a = i11 + 1;
            T tO = p2Var.o(this, p0Var);
            a(WireFormat.c(i10, 4));
            this.f22651a--;
            return tO;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void E(int i10, z1.a aVar, p0 p0Var) throws IOException {
            int i11 = this.f22651a;
            if (i11 >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f22651a = i11 + 1;
            aVar.b1(this, p0Var);
            a(WireFormat.c(i10, 4));
            this.f22651a--;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public <T extends z1> T H(p2<T> p2Var, p0 p0Var) throws IOException {
            int iN = N();
            if (this.f22651a >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            int iT = t(iN);
            this.f22651a++;
            T tO = p2Var.o(this, p0Var);
            a(0);
            this.f22651a--;
            s(iT);
            return tO;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void I(z1.a aVar, p0 p0Var) throws IOException {
            int iN = N();
            if (this.f22651a >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            int iT = t(iN);
            this.f22651a++;
            aVar.b1(this, p0Var);
            a(0);
            this.f22651a--;
            s(iT);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte J() throws IOException {
            if (m0() == 0) {
                n0();
            }
            long j10 = this.f22676t;
            this.f22676t = 1 + j10;
            return z3.y(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte[] K(int i10) throws IOException {
            if (i10 >= 0) {
                long j10 = i10;
                if (j10 <= m0()) {
                    byte[] bArr = new byte[i10];
                    z3.n(this.f22676t, bArr, 0L, j10);
                    this.f22676t += j10;
                    return bArr;
                }
            }
            if (i10 >= 0 && i10 <= q0()) {
                byte[] bArr2 = new byte[i10];
                o0(bArr2, 0, i10);
                return bArr2;
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i10 == 0) {
                return i1.f22459d;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int L() throws IOException {
            if (m0() < 4) {
                return (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24);
            }
            long j10 = this.f22676t;
            this.f22676t = 4 + j10;
            return ((z3.y(j10 + 3) & 255) << 24) | (z3.y(j10) & 255) | ((z3.y(1 + j10) & 255) << 8) | ((z3.y(2 + j10) & 255) << 16);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long M() throws IOException {
            long J;
            byte bJ;
            if (m0() >= 8) {
                long j10 = this.f22676t;
                this.f22676t = 8 + j10;
                J = (((long) z3.y(j10)) & 255) | ((((long) z3.y(1 + j10)) & 255) << 8) | ((((long) z3.y(2 + j10)) & 255) << 16) | ((((long) z3.y(3 + j10)) & 255) << 24) | ((((long) z3.y(4 + j10)) & 255) << 32) | ((((long) z3.y(5 + j10)) & 255) << 40) | ((((long) z3.y(6 + j10)) & 255) << 48);
                bJ = z3.y(j10 + 7);
            } else {
                J = (((long) J()) & 255) | ((((long) J()) & 255) << 8) | ((((long) J()) & 255) << 16) | ((((long) J()) & 255) << 24) | ((((long) J()) & 255) << 32) | ((((long) J()) & 255) << 40) | ((((long) J()) & 255) << 48);
                bJ = J();
            }
            return ((((long) bJ) & 255) << 56) | J;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (androidx.p001datastore.preferences.protobuf.z3.y(r4) < 0) goto L34;
         */
        @Override // androidx.p001datastore.preferences.protobuf.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f22676t
                long r2 = r10.f22679w
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8a
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = androidx.p001datastore.preferences.protobuf.z3.y(r0)
                if (r0 < 0) goto L1a
                long r4 = r10.f22676t
                long r4 = r4 + r2
                r10.f22676t = r4
                return r0
            L1a:
                long r6 = r10.f22679w
                long r8 = r10.f22676t
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L8a
            L26:
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L34
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L90
            L34:
                long r4 = r6 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L43
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r4
                goto L90
            L43:
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L53
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L90
            L53:
                long r4 = r6 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                if (r1 >= 0) goto L90
            L8a:
                long r0 = r10.R()
                int r0 = (int) r0
                return r0
            L90:
                r10.f22676t = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w.c.N():int");
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long Q() throws IOException {
            long jY;
            long j10;
            long j11;
            int i10;
            long j12 = this.f22676t;
            if (this.f22679w != j12) {
                long j13 = j12 + 1;
                byte bY = z3.y(j12);
                if (bY >= 0) {
                    this.f22676t++;
                    return bY;
                }
                if (this.f22679w - this.f22676t >= 10) {
                    long j14 = j13 + 1;
                    int iY = bY ^ (z3.y(j13) << 7);
                    if (iY >= 0) {
                        long j15 = j14 + 1;
                        int iY2 = iY ^ (z3.y(j14) << 14);
                        if (iY2 < 0) {
                            j14 = j15 + 1;
                            int iY3 = iY2 ^ (z3.y(j15) << com.google.common.base.a.f56672y);
                            if (iY3 < 0) {
                                i10 = iY3 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long jY2 = ((long) iY3) ^ (((long) z3.y(j14)) << 28);
                                if (jY2 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j16 = j15 + 1;
                                    long jY3 = jY2 ^ (((long) z3.y(j15)) << 35);
                                    if (jY3 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        jY2 = jY3 ^ (((long) z3.y(j16)) << 42);
                                        if (jY2 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            jY3 = jY2 ^ (((long) z3.y(j15)) << 49);
                                            if (jY3 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                jY = (jY3 ^ (((long) z3.y(j16)) << 56)) ^ 71499008037633920L;
                                                if (jY < 0) {
                                                    long j17 = 1 + j15;
                                                    if (z3.y(j15) >= 0) {
                                                        j14 = j17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    jY = jY3 ^ j10;
                                    j14 = j16;
                                }
                                jY = jY2 ^ j11;
                            }
                            this.f22676t = j14;
                            return jY;
                        }
                        jY = iY2 ^ 16256;
                        j14 = j15;
                        this.f22676t = j14;
                        return jY;
                    }
                    i10 = iY ^ n5.a.f132012g;
                    jY = i10;
                    this.f22676t = j14;
                    return jY;
                }
            }
            return R();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        long R() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = J();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int U() throws IOException {
            return w.b(N());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long V() throws IOException {
            return w.c(Q());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public String W() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j10 = iN;
                long j11 = this.f22679w;
                long j12 = this.f22676t;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[iN];
                    z3.n(j12, bArr, 0L, j10);
                    String str = new String(bArr, i1.f22456a);
                    this.f22676t += j10;
                    return str;
                }
            }
            if (iN > 0 && iN <= q0()) {
                byte[] bArr2 = new byte[iN];
                o0(bArr2, 0, iN);
                return new String(bArr2, i1.f22456a);
            }
            if (iN == 0) {
                return "";
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public String X() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j10 = iN;
                long j11 = this.f22679w;
                long j12 = this.f22676t;
                if (j10 <= j11 - j12) {
                    String strG = Utf8.g(this.f22667k, (int) (j12 - this.f22677u), iN);
                    this.f22676t += j10;
                    return strG;
                }
            }
            if (iN >= 0 && iN <= q0()) {
                byte[] bArr = new byte[iN];
                o0(bArr, 0, iN);
                return Utf8.h(bArr, 0, iN);
            }
            if (iN == 0) {
                return "";
            }
            if (iN <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int Y() throws IOException {
            if (i()) {
                this.f22673q = 0;
                return 0;
            }
            int iN = N();
            this.f22673q = iN;
            if (WireFormat.a(iN) != 0) {
                return this.f22673q;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f22673q != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        @Deprecated
        public void b0(int i10, z1.a aVar) throws IOException {
            E(i10, aVar, p0.d());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void c0() {
            this.f22675s = (int) ((((long) this.f22674r) + this.f22676t) - this.f22677u);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void e(boolean z10) {
            this.f22669m = z10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int f() {
            int i10 = this.f22672p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - h();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int g() {
            return this.f22673q;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean g0(int i10) throws IOException {
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                r0();
                return true;
            }
            if (iB == 1) {
                k0(8);
                return true;
            }
            if (iB == 2) {
                k0(N());
                return true;
            }
            if (iB == 3) {
                i0();
                a(WireFormat.c(WireFormat.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int h() {
            return (int) ((((long) (this.f22674r - this.f22675s)) + this.f22676t) - this.f22677u);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                long jG = G();
                codedOutputStream.Z1(i10);
                codedOutputStream.i2(jG);
                return true;
            }
            if (iB == 1) {
                long jM = M();
                codedOutputStream.Z1(i10);
                codedOutputStream.D1(jM);
                return true;
            }
            if (iB == 2) {
                ByteString byteStringX = x();
                codedOutputStream.Z1(i10);
                codedOutputStream.z1(byteStringX);
                return true;
            }
            if (iB == 3) {
                codedOutputStream.Z1(i10);
                j0(codedOutputStream);
                int iC = WireFormat.c(WireFormat.a(i10), 4);
                a(iC);
                codedOutputStream.Z1(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int iL = L();
            codedOutputStream.Z1(i10);
            codedOutputStream.C1(iL);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean i() throws IOException {
            return (((long) this.f22674r) + this.f22676t) - this.f22677u == ((long) this.f22670n);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void i0() throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (g0(iY));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (h0(iY, codedOutputStream));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void k0(int i10) throws IOException {
            if (i10 < 0 || i10 > (((long) (this.f22670n - this.f22674r)) - this.f22676t) + this.f22677u) {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.g();
            }
            while (i10 > 0) {
                if (m0() == 0) {
                    n0();
                }
                int iMin = Math.min(i10, (int) m0());
                i10 -= iMin;
                this.f22676t += (long) iMin;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void s(int i10) {
            this.f22672p = i10;
            p0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int t(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iH = i10 + h();
            int i11 = this.f22672p;
            if (iH > i11) {
                throw InvalidProtocolBufferException.l();
            }
            this.f22672p = iH;
            p0();
            return i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public ByteBuffer w() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j10 = iN;
                if (j10 <= m0()) {
                    if (this.f22668l || !this.f22669m) {
                        byte[] bArr = new byte[iN];
                        z3.n(this.f22676t, bArr, 0L, j10);
                        this.f22676t += j10;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j11 = this.f22676t + j10;
                    this.f22676t = j11;
                    long j12 = this.f22678v;
                    return s0((int) ((j11 - j12) - j10), (int) (j11 - j12));
                }
            }
            if (iN > 0 && iN <= q0()) {
                byte[] bArr2 = new byte[iN];
                o0(bArr2, 0, iN);
                return ByteBuffer.wrap(bArr2);
            }
            if (iN == 0) {
                return i1.f22460e;
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public ByteString x() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j10 = iN;
                long j11 = this.f22679w;
                long j12 = this.f22676t;
                if (j10 <= j11 - j12) {
                    if (this.f22668l && this.f22669m) {
                        int i10 = (int) (j12 - this.f22678v);
                        ByteString byteStringR0 = ByteString.r0(s0(i10, iN + i10));
                        this.f22676t += j10;
                        return byteStringR0;
                    }
                    byte[] bArr = new byte[iN];
                    z3.n(j12, bArr, 0L, j10);
                    this.f22676t += j10;
                    return ByteString.s0(bArr);
                }
            }
            if (iN > 0 && iN <= q0()) {
                byte[] bArr2 = new byte[iN];
                o0(bArr2, 0, iN);
                return ByteString.s0(bArr2);
            }
            if (iN == 0) {
                return ByteString.f22239f;
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int z() throws IOException {
            return N();
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class d extends w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final InputStream f22680i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final byte[] f22681j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f22682k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f22683l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f22684m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f22685n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f22686o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f22687p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private a f22688q;

        /* JADX INFO: compiled from: CodedInputStream.java */
        public interface a {
            void a();
        }

        /* JADX INFO: compiled from: CodedInputStream.java */
        public class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f22689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private ByteArrayOutputStream f22690b;

            private b() {
                this.f22689a = d.this.f22684m;
            }

            @Override // androidx.datastore.preferences.protobuf.w.d.a
            public void a() {
                if (this.f22690b == null) {
                    this.f22690b = new ByteArrayOutputStream();
                }
                this.f22690b.write(d.this.f22681j, this.f22689a, d.this.f22684m - this.f22689a);
                this.f22689a = 0;
            }

            ByteBuffer b() {
                ByteArrayOutputStream byteArrayOutputStream = this.f22690b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(d.this.f22681j, this.f22689a, d.this.f22684m - this.f22689a);
                }
                byteArrayOutputStream.write(d.this.f22681j, this.f22689a, d.this.f22684m);
                return ByteBuffer.wrap(this.f22690b.toByteArray());
            }
        }

        private d(InputStream inputStream, int i10) {
            super();
            this.f22687p = Integer.MAX_VALUE;
            this.f22688q = null;
            i1.e(inputStream, "input");
            this.f22680i = inputStream;
            this.f22681j = new byte[i10];
            this.f22682k = 0;
            this.f22684m = 0;
            this.f22686o = 0;
        }

        private ByteString o0(int i10) throws IOException {
            byte[] bArrQ0 = q0(i10);
            if (bArrQ0 != null) {
                return ByteString.u(bArrQ0);
            }
            int i11 = this.f22684m;
            int i12 = this.f22682k;
            int length = i12 - i11;
            this.f22686o += i12;
            this.f22684m = 0;
            this.f22682k = 0;
            List<byte[]> listR0 = r0(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f22681j, i11, bArr, 0, length);
            for (byte[] bArr2 : listR0) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.s0(bArr);
        }

        private byte[] p0(int i10, boolean z10) throws IOException {
            byte[] bArrQ0 = q0(i10);
            if (bArrQ0 != null) {
                return z10 ? (byte[]) bArrQ0.clone() : bArrQ0;
            }
            int i11 = this.f22684m;
            int i12 = this.f22682k;
            int length = i12 - i11;
            this.f22686o += i12;
            this.f22684m = 0;
            this.f22682k = 0;
            List<byte[]> listR0 = r0(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f22681j, i11, bArr, 0, length);
            for (byte[] bArr2 : listR0) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] q0(int i10) throws IOException {
            if (i10 == 0) {
                return i1.f22459d;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = this.f22686o;
            int i12 = this.f22684m;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f22653c > 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i14 = this.f22687p;
            if (i13 > i14) {
                k0((i14 - i11) - i12);
                throw InvalidProtocolBufferException.l();
            }
            int i15 = this.f22682k - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > this.f22680i.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f22681j, this.f22684m, bArr, 0, i15);
            this.f22686o += this.f22682k;
            this.f22684m = 0;
            this.f22682k = 0;
            while (i15 < i10) {
                int i17 = this.f22680i.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.l();
                }
                this.f22686o += i17;
                i15 += i17;
            }
            return bArr;
        }

        private List<byte[]> r0(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f22680i.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.l();
                    }
                    this.f22686o += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void s0() {
            int i10 = this.f22682k + this.f22683l;
            this.f22682k = i10;
            int i11 = this.f22686o + i10;
            int i12 = this.f22687p;
            if (i11 <= i12) {
                this.f22683l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f22683l = i13;
            this.f22682k = i10 - i13;
        }

        private void t0(int i10) throws IOException {
            if (y0(i10)) {
                return;
            }
            if (i10 <= (this.f22653c - this.f22686o) - this.f22684m) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.k();
        }

        private void u0(int i10) throws IOException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = this.f22686o;
            int i12 = this.f22684m;
            int i13 = i11 + i12 + i10;
            int i14 = this.f22687p;
            if (i13 > i14) {
                k0((i14 - i11) - i12);
                throw InvalidProtocolBufferException.l();
            }
            int i15 = 0;
            if (this.f22688q == null) {
                this.f22686o = i11 + i12;
                int i16 = this.f22682k - i12;
                this.f22682k = 0;
                this.f22684m = 0;
                i15 = i16;
                while (i15 < i10) {
                    try {
                        long j10 = i10 - i15;
                        long jSkip = this.f22680i.skip(j10);
                        if (jSkip < 0 || jSkip > j10) {
                            throw new IllegalStateException(this.f22680i.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i15 += (int) jSkip;
                        }
                    } catch (Throwable th2) {
                        this.f22686o += i15;
                        s0();
                        throw th2;
                    }
                }
                this.f22686o += i15;
                s0();
            }
            if (i15 >= i10) {
                return;
            }
            int i17 = this.f22682k;
            int i18 = i17 - this.f22684m;
            this.f22684m = i17;
            t0(1);
            while (true) {
                int i19 = i10 - i18;
                int i20 = this.f22682k;
                if (i19 <= i20) {
                    this.f22684m = i19;
                    return;
                } else {
                    i18 += i20;
                    this.f22684m = i20;
                    t0(1);
                }
            }
        }

        private void v0() throws IOException {
            if (this.f22682k - this.f22684m >= 10) {
                w0();
            } else {
                x0();
            }
        }

        private void w0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f22681j;
                int i11 = this.f22684m;
                this.f22684m = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void x0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private boolean y0(int i10) throws IOException {
            int i11 = this.f22684m;
            if (i11 + i10 <= this.f22682k) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i12 = this.f22653c;
            int i13 = this.f22686o;
            if (i10 > (i12 - i13) - i11 || i13 + i11 + i10 > this.f22687p) {
                return false;
            }
            a aVar = this.f22688q;
            if (aVar != null) {
                aVar.a();
            }
            int i14 = this.f22684m;
            if (i14 > 0) {
                int i15 = this.f22682k;
                if (i15 > i14) {
                    byte[] bArr = this.f22681j;
                    System.arraycopy(bArr, i14, bArr, 0, i15 - i14);
                }
                this.f22686o += i14;
                this.f22682k -= i14;
                this.f22684m = 0;
            }
            InputStream inputStream = this.f22680i;
            byte[] bArr2 = this.f22681j;
            int i16 = this.f22682k;
            int i17 = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f22653c - this.f22686o) - i16));
            if (i17 == 0 || i17 < -1 || i17 > this.f22681j.length) {
                throw new IllegalStateException(this.f22680i.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f22682k += i17;
            s0();
            if (this.f22682k >= i10) {
                return true;
            }
            return y0(i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public <T extends z1> T D(int i10, p2<T> p2Var, p0 p0Var) throws IOException {
            int i11 = this.f22651a;
            if (i11 >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f22651a = i11 + 1;
            T tO = p2Var.o(this, p0Var);
            a(WireFormat.c(i10, 4));
            this.f22651a--;
            return tO;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void E(int i10, z1.a aVar, p0 p0Var) throws IOException {
            int i11 = this.f22651a;
            if (i11 >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f22651a = i11 + 1;
            aVar.b1(this, p0Var);
            a(WireFormat.c(i10, 4));
            this.f22651a--;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public <T extends z1> T H(p2<T> p2Var, p0 p0Var) throws IOException {
            int iN = N();
            if (this.f22651a >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            int iT = t(iN);
            this.f22651a++;
            T tO = p2Var.o(this, p0Var);
            a(0);
            this.f22651a--;
            s(iT);
            return tO;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void I(z1.a aVar, p0 p0Var) throws IOException {
            int iN = N();
            if (this.f22651a >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            int iT = t(iN);
            this.f22651a++;
            aVar.b1(this, p0Var);
            a(0);
            this.f22651a--;
            s(iT);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte J() throws IOException {
            if (this.f22684m == this.f22682k) {
                t0(1);
            }
            byte[] bArr = this.f22681j;
            int i10 = this.f22684m;
            this.f22684m = i10 + 1;
            return bArr[i10];
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte[] K(int i10) throws IOException {
            int i11 = this.f22684m;
            if (i10 > this.f22682k - i11 || i10 <= 0) {
                return p0(i10, false);
            }
            int i12 = i10 + i11;
            this.f22684m = i12;
            return Arrays.copyOfRange(this.f22681j, i11, i12);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int L() throws IOException {
            int i10 = this.f22684m;
            if (this.f22682k - i10 < 4) {
                t0(4);
                i10 = this.f22684m;
            }
            byte[] bArr = this.f22681j;
            this.f22684m = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long M() throws IOException {
            int i10 = this.f22684m;
            if (this.f22682k - i10 < 8) {
                t0(8);
                i10 = this.f22684m;
            }
            byte[] bArr = this.f22681j;
            this.f22684m = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // androidx.p001datastore.preferences.protobuf.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f22684m
                int r1 = r5.f22682k
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f22681j
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f22684m = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.R()
                int r0 = (int) r0
                return r0
            L70:
                r5.f22684m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w.d.N():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        @Override // androidx.p001datastore.preferences.protobuf.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long Q() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f22684m
                int r1 = r11.f22682k
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f22681j
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f22684m = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.R()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f22684m = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w.d.Q():long");
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        long R() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = J();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int U() throws IOException {
            return w.b(N());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long V() throws IOException {
            return w.c(Q());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public String W() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i10 = this.f22682k;
                int i11 = this.f22684m;
                if (iN <= i10 - i11) {
                    String str = new String(this.f22681j, i11, iN, i1.f22456a);
                    this.f22684m += iN;
                    return str;
                }
            }
            if (iN == 0) {
                return "";
            }
            if (iN > this.f22682k) {
                return new String(p0(iN, false), i1.f22456a);
            }
            t0(iN);
            String str2 = new String(this.f22681j, this.f22684m, iN, i1.f22456a);
            this.f22684m += iN;
            return str2;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public String X() throws IOException {
            byte[] bArrP0;
            int iN = N();
            int i10 = this.f22684m;
            int i11 = this.f22682k;
            if (iN <= i11 - i10 && iN > 0) {
                bArrP0 = this.f22681j;
                this.f22684m = i10 + iN;
            } else {
                if (iN == 0) {
                    return "";
                }
                if (iN <= i11) {
                    t0(iN);
                    bArrP0 = this.f22681j;
                    this.f22684m = iN + 0;
                } else {
                    bArrP0 = p0(iN, false);
                }
                i10 = 0;
            }
            return Utf8.h(bArrP0, i10, iN);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int Y() throws IOException {
            if (i()) {
                this.f22685n = 0;
                return 0;
            }
            int iN = N();
            this.f22685n = iN;
            if (WireFormat.a(iN) != 0) {
                return this.f22685n;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f22685n != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        @Deprecated
        public void b0(int i10, z1.a aVar) throws IOException {
            E(i10, aVar, p0.d());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void c0() {
            this.f22686o = -this.f22684m;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void e(boolean z10) {
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int f() {
            int i10 = this.f22687p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f22686o + this.f22684m);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int g() {
            return this.f22685n;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean g0(int i10) throws IOException {
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                v0();
                return true;
            }
            if (iB == 1) {
                k0(8);
                return true;
            }
            if (iB == 2) {
                k0(N());
                return true;
            }
            if (iB == 3) {
                i0();
                a(WireFormat.c(WireFormat.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int h() {
            return this.f22686o + this.f22684m;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                long jG = G();
                codedOutputStream.Z1(i10);
                codedOutputStream.i2(jG);
                return true;
            }
            if (iB == 1) {
                long jM = M();
                codedOutputStream.Z1(i10);
                codedOutputStream.D1(jM);
                return true;
            }
            if (iB == 2) {
                ByteString byteStringX = x();
                codedOutputStream.Z1(i10);
                codedOutputStream.z1(byteStringX);
                return true;
            }
            if (iB == 3) {
                codedOutputStream.Z1(i10);
                j0(codedOutputStream);
                int iC = WireFormat.c(WireFormat.a(i10), 4);
                a(iC);
                codedOutputStream.Z1(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int iL = L();
            codedOutputStream.Z1(i10);
            codedOutputStream.C1(iL);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean i() throws IOException {
            return this.f22684m == this.f22682k && !y0(1);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void i0() throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (g0(iY));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (h0(iY, codedOutputStream));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void k0(int i10) throws IOException {
            int i11 = this.f22682k;
            int i12 = this.f22684m;
            if (i10 > i11 - i12 || i10 < 0) {
                u0(i10);
            } else {
                this.f22684m = i12 + i10;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void s(int i10) {
            this.f22687p = i10;
            s0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int t(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i11 = i10 + this.f22686o + this.f22684m;
            int i12 = this.f22687p;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.l();
            }
            this.f22687p = i11;
            s0();
            return i12;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte[] v() throws IOException {
            int iN = N();
            int i10 = this.f22682k;
            int i11 = this.f22684m;
            if (iN > i10 - i11 || iN <= 0) {
                return p0(iN, false);
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f22681j, i11, i11 + iN);
            this.f22684m += iN;
            return bArrCopyOfRange;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public ByteBuffer w() throws IOException {
            int iN = N();
            int i10 = this.f22682k;
            int i11 = this.f22684m;
            if (iN > i10 - i11 || iN <= 0) {
                return iN == 0 ? i1.f22460e : ByteBuffer.wrap(p0(iN, true));
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f22681j, i11, i11 + iN));
            this.f22684m += iN;
            return byteBufferWrap;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public ByteString x() throws IOException {
            int iN = N();
            int i10 = this.f22682k;
            int i11 = this.f22684m;
            if (iN > i10 - i11 || iN <= 0) {
                return iN == 0 ? ByteString.f22239f : o0(iN);
            }
            ByteString byteStringV = ByteString.v(this.f22681j, i11, iN);
            this.f22684m += iN;
            return byteStringV;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int z() throws IOException {
            return N();
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class e extends w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ByteBuffer f22692i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f22693j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f22694k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f22695l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f22696m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f22697n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f22698o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f22699p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f22700q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f22701r;

        private e(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f22701r = Integer.MAX_VALUE;
            this.f22692i = byteBuffer;
            long jI = z3.i(byteBuffer);
            this.f22694k = jI;
            this.f22695l = ((long) byteBuffer.limit()) + jI;
            long jPosition = jI + ((long) byteBuffer.position());
            this.f22696m = jPosition;
            this.f22697n = jPosition;
            this.f22693j = z10;
        }

        private int m0(long j10) {
            return (int) (j10 - this.f22694k);
        }

        static boolean n0() {
            return z3.T();
        }

        private void o0() {
            long j10 = this.f22695l + ((long) this.f22698o);
            this.f22695l = j10;
            int i10 = (int) (j10 - this.f22697n);
            int i11 = this.f22701r;
            if (i10 <= i11) {
                this.f22698o = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f22698o = i12;
            this.f22695l = j10 - ((long) i12);
        }

        private int p0() {
            return (int) (this.f22695l - this.f22696m);
        }

        private void q0() throws IOException {
            if (p0() >= 10) {
                r0();
            } else {
                s0();
            }
        }

        private void r0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f22696m;
                this.f22696m = 1 + j10;
                if (z3.y(j10) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void s0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private ByteBuffer t0(long j10, long j11) throws IOException {
            int iPosition = this.f22692i.position();
            int iLimit = this.f22692i.limit();
            try {
                try {
                    this.f22692i.position(m0(j10));
                    this.f22692i.limit(m0(j11));
                    ByteBuffer byteBufferSlice = this.f22692i.slice();
                    this.f22692i.position(iPosition);
                    this.f22692i.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.l();
                }
            } catch (Throwable th2) {
                this.f22692i.position(iPosition);
                this.f22692i.limit(iLimit);
                throw th2;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int A() throws IOException {
            return L();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long B() throws IOException {
            return M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public float C() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public <T extends z1> T D(int i10, p2<T> p2Var, p0 p0Var) throws IOException {
            int i11 = this.f22651a;
            if (i11 >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f22651a = i11 + 1;
            T tO = p2Var.o(this, p0Var);
            a(WireFormat.c(i10, 4));
            this.f22651a--;
            return tO;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void E(int i10, z1.a aVar, p0 p0Var) throws IOException {
            int i11 = this.f22651a;
            if (i11 >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            this.f22651a = i11 + 1;
            aVar.b1(this, p0Var);
            a(WireFormat.c(i10, 4));
            this.f22651a--;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int F() throws IOException {
            return N();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long G() throws IOException {
            return Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public <T extends z1> T H(p2<T> p2Var, p0 p0Var) throws IOException {
            int iN = N();
            if (this.f22651a >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            int iT = t(iN);
            this.f22651a++;
            T tO = p2Var.o(this, p0Var);
            a(0);
            this.f22651a--;
            s(iT);
            return tO;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void I(z1.a aVar, p0 p0Var) throws IOException {
            int iN = N();
            if (this.f22651a >= this.f22652b) {
                throw InvalidProtocolBufferException.i();
            }
            int iT = t(iN);
            this.f22651a++;
            aVar.b1(this, p0Var);
            a(0);
            this.f22651a--;
            s(iT);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte J() throws IOException {
            long j10 = this.f22696m;
            if (j10 == this.f22695l) {
                throw InvalidProtocolBufferException.l();
            }
            this.f22696m = 1 + j10;
            return z3.y(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte[] K(int i10) throws IOException {
            if (i10 < 0 || i10 > p0()) {
                if (i10 > 0) {
                    throw InvalidProtocolBufferException.l();
                }
                if (i10 == 0) {
                    return i1.f22459d;
                }
                throw InvalidProtocolBufferException.g();
            }
            byte[] bArr = new byte[i10];
            long j10 = this.f22696m;
            long j11 = i10;
            t0(j10, j10 + j11).get(bArr);
            this.f22696m += j11;
            return bArr;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int L() throws IOException {
            long j10 = this.f22696m;
            if (this.f22695l - j10 < 4) {
                throw InvalidProtocolBufferException.l();
            }
            this.f22696m = 4 + j10;
            return ((z3.y(j10 + 3) & 255) << 24) | (z3.y(j10) & 255) | ((z3.y(1 + j10) & 255) << 8) | ((z3.y(2 + j10) & 255) << 16);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long M() throws IOException {
            long j10 = this.f22696m;
            if (this.f22695l - j10 < 8) {
                throw InvalidProtocolBufferException.l();
            }
            this.f22696m = 8 + j10;
            return ((((long) z3.y(j10 + 7)) & 255) << 56) | (((long) z3.y(j10)) & 255) | ((((long) z3.y(1 + j10)) & 255) << 8) | ((((long) z3.y(2 + j10)) & 255) << 16) | ((((long) z3.y(3 + j10)) & 255) << 24) | ((((long) z3.y(4 + j10)) & 255) << 32) | ((((long) z3.y(5 + j10)) & 255) << 40) | ((((long) z3.y(6 + j10)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (androidx.p001datastore.preferences.protobuf.z3.y(r4) < 0) goto L34;
         */
        @Override // androidx.p001datastore.preferences.protobuf.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f22696m
                long r2 = r10.f22695l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = androidx.p001datastore.preferences.protobuf.z3.y(r0)
                if (r0 < 0) goto L17
                r10.f22696m = r4
                return r0
            L17:
                long r6 = r10.f22695l
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = androidx.p001datastore.preferences.protobuf.z3.y(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.R()
                int r0 = (int) r0
                return r0
            L8b:
                r10.f22696m = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w.e.N():int");
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long Q() throws IOException {
            long jY;
            long j10;
            long j11;
            int i10;
            long j12 = this.f22696m;
            if (this.f22695l != j12) {
                long j13 = j12 + 1;
                byte bY = z3.y(j12);
                if (bY >= 0) {
                    this.f22696m = j13;
                    return bY;
                }
                if (this.f22695l - j13 >= 9) {
                    long j14 = j13 + 1;
                    int iY = bY ^ (z3.y(j13) << 7);
                    if (iY >= 0) {
                        long j15 = j14 + 1;
                        int iY2 = iY ^ (z3.y(j14) << 14);
                        if (iY2 < 0) {
                            j14 = j15 + 1;
                            int iY3 = iY2 ^ (z3.y(j15) << com.google.common.base.a.f56672y);
                            if (iY3 < 0) {
                                i10 = iY3 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long jY2 = ((long) iY3) ^ (((long) z3.y(j14)) << 28);
                                if (jY2 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j16 = j15 + 1;
                                    long jY3 = jY2 ^ (((long) z3.y(j15)) << 35);
                                    if (jY3 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        jY2 = jY3 ^ (((long) z3.y(j16)) << 42);
                                        if (jY2 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            jY3 = jY2 ^ (((long) z3.y(j15)) << 49);
                                            if (jY3 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                jY = (jY3 ^ (((long) z3.y(j16)) << 56)) ^ 71499008037633920L;
                                                if (jY < 0) {
                                                    long j17 = 1 + j15;
                                                    if (z3.y(j15) >= 0) {
                                                        j14 = j17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    jY = jY3 ^ j10;
                                    j14 = j16;
                                }
                                jY = jY2 ^ j11;
                            }
                            this.f22696m = j14;
                            return jY;
                        }
                        jY = iY2 ^ 16256;
                        j14 = j15;
                        this.f22696m = j14;
                        return jY;
                    }
                    i10 = iY ^ n5.a.f132012g;
                    jY = i10;
                    this.f22696m = j14;
                    return jY;
                }
            }
            return R();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        long R() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = J();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int S() throws IOException {
            return L();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long T() throws IOException {
            return M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int U() throws IOException {
            return w.b(N());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long V() throws IOException {
            return w.c(Q());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public String W() throws IOException {
            int iN = N();
            if (iN <= 0 || iN > p0()) {
                if (iN == 0) {
                    return "";
                }
                if (iN < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = new byte[iN];
            long j10 = iN;
            z3.n(this.f22696m, bArr, 0L, j10);
            String str = new String(bArr, i1.f22456a);
            this.f22696m += j10;
            return str;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public String X() throws IOException {
            int iN = N();
            if (iN > 0 && iN <= p0()) {
                String strG = Utf8.g(this.f22692i, m0(this.f22696m), iN);
                this.f22696m += (long) iN;
                return strG;
            }
            if (iN == 0) {
                return "";
            }
            if (iN <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int Y() throws IOException {
            if (i()) {
                this.f22699p = 0;
                return 0;
            }
            int iN = N();
            this.f22699p = iN;
            if (WireFormat.a(iN) != 0) {
                return this.f22699p;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int Z() throws IOException {
            return N();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f22699p != i10) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public long a0() throws IOException {
            return Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        @Deprecated
        public void b0(int i10, z1.a aVar) throws IOException {
            E(i10, aVar, p0.d());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void c0() {
            this.f22697n = this.f22696m;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void e(boolean z10) {
            this.f22700q = z10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int f() {
            int i10 = this.f22701r;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - h();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int g() {
            return this.f22699p;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean g0(int i10) throws IOException {
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                q0();
                return true;
            }
            if (iB == 1) {
                k0(8);
                return true;
            }
            if (iB == 2) {
                k0(N());
                return true;
            }
            if (iB == 3) {
                i0();
                a(WireFormat.c(WireFormat.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            k0(4);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int h() {
            return (int) (this.f22696m - this.f22697n);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                long jG = G();
                codedOutputStream.Z1(i10);
                codedOutputStream.i2(jG);
                return true;
            }
            if (iB == 1) {
                long jM = M();
                codedOutputStream.Z1(i10);
                codedOutputStream.D1(jM);
                return true;
            }
            if (iB == 2) {
                ByteString byteStringX = x();
                codedOutputStream.Z1(i10);
                codedOutputStream.z1(byteStringX);
                return true;
            }
            if (iB == 3) {
                codedOutputStream.Z1(i10);
                j0(codedOutputStream);
                int iC = WireFormat.c(WireFormat.a(i10), 4);
                a(iC);
                codedOutputStream.Z1(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            int iL = L();
            codedOutputStream.Z1(i10);
            codedOutputStream.C1(iL);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean i() throws IOException {
            return this.f22696m == this.f22695l;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void i0() throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (g0(iY));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void j0(CodedOutputStream codedOutputStream) throws IOException {
            int iY;
            do {
                iY = Y();
                if (iY == 0) {
                    return;
                }
            } while (h0(iY, codedOutputStream));
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void k0(int i10) throws IOException {
            if (i10 >= 0 && i10 <= p0()) {
                this.f22696m += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public void s(int i10) {
            this.f22701r = i10;
            o0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int t(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iH = i10 + h();
            int i11 = this.f22701r;
            if (iH > i11) {
                throw InvalidProtocolBufferException.l();
            }
            this.f22701r = iH;
            o0();
            return i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public boolean u() throws IOException {
            return Q() != 0;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public byte[] v() throws IOException {
            return K(N());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public ByteBuffer w() throws IOException {
            int iN = N();
            if (iN <= 0 || iN > p0()) {
                if (iN == 0) {
                    return i1.f22460e;
                }
                if (iN < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.l();
            }
            if (this.f22693j || !this.f22700q) {
                byte[] bArr = new byte[iN];
                long j10 = iN;
                z3.n(this.f22696m, bArr, 0L, j10);
                this.f22696m += j10;
                return ByteBuffer.wrap(bArr);
            }
            long j11 = this.f22696m;
            long j12 = iN;
            ByteBuffer byteBufferT0 = t0(j11, j11 + j12);
            this.f22696m += j12;
            return byteBufferT0;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public ByteString x() throws IOException {
            int iN = N();
            if (iN <= 0 || iN > p0()) {
                if (iN == 0) {
                    return ByteString.f22239f;
                }
                if (iN < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.l();
            }
            if (this.f22693j && this.f22700q) {
                long j10 = this.f22696m;
                long j11 = iN;
                ByteBuffer byteBufferT0 = t0(j10, j10 + j11);
                this.f22696m += j11;
                return ByteString.r0(byteBufferT0);
            }
            byte[] bArr = new byte[iN];
            long j12 = iN;
            z3.n(this.f22696m, bArr, 0L, j12);
            this.f22696m += j12;
            return ByteString.s0(bArr);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public double y() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w
        public int z() throws IOException {
            return N();
        }
    }

    private w() {
        this.f22652b = 100;
        this.f22653c = Integer.MAX_VALUE;
        this.f22655e = false;
    }

    public static int O(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.l();
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
                throw InvalidProtocolBufferException.l();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    static int P(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return O(i10, inputStream);
        }
        throw InvalidProtocolBufferException.l();
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static w j(InputStream inputStream) {
        return k(inputStream, 4096);
    }

    public static w k(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? p(i1.f22459d) : new d(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static w l(Iterable<ByteBuffer> iterable) {
        return !e.n0() ? j(new j1(iterable)) : m(iterable, false);
    }

    static w m(Iterable<ByteBuffer> iterable, boolean z10) {
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new c(iterable, iRemaining, z10) : j(new j1(iterable));
    }

    public static w n(ByteBuffer byteBuffer) {
        return o(byteBuffer, false);
    }

    static w o(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return r(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && e.n0()) {
            return new e(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return r(bArr, 0, iRemaining, true);
    }

    public static w p(byte[] bArr) {
        return q(bArr, 0, bArr.length);
    }

    public static w q(byte[] bArr, int i10, int i11) {
        return r(bArr, i10, i11, false);
    }

    static w r(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.t(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract float C() throws IOException;

    public abstract <T extends z1> T D(int i10, p2<T> p2Var, p0 p0Var) throws IOException;

    public abstract void E(int i10, z1.a aVar, p0 p0Var) throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract <T extends z1> T H(p2<T> p2Var, p0 p0Var) throws IOException;

    public abstract void I(z1.a aVar, p0 p0Var) throws IOException;

    public abstract byte J() throws IOException;

    public abstract byte[] K(int i10) throws IOException;

    public abstract int L() throws IOException;

    public abstract long M() throws IOException;

    public abstract int N() throws IOException;

    public abstract long Q() throws IOException;

    abstract long R() throws IOException;

    public abstract int S() throws IOException;

    public abstract long T() throws IOException;

    public abstract int U() throws IOException;

    public abstract long V() throws IOException;

    public abstract String W() throws IOException;

    public abstract String X() throws IOException;

    public abstract int Y() throws IOException;

    public abstract int Z() throws IOException;

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract long a0() throws IOException;

    @Deprecated
    public abstract void b0(int i10, z1.a aVar) throws IOException;

    public abstract void c0();

    final void d() {
        this.f22655e = true;
    }

    public final int d0(int i10) {
        if (i10 >= 0) {
            int i11 = this.f22652b;
            this.f22652b = i10;
            return i11;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i10);
    }

    public abstract void e(boolean z10);

    public final int e0(int i10) {
        if (i10 >= 0) {
            int i11 = this.f22653c;
            this.f22653c = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    public abstract int f();

    final boolean f0() {
        return this.f22655e;
    }

    public abstract int g();

    public abstract boolean g0(int i10) throws IOException;

    public abstract int h();

    @Deprecated
    public abstract boolean h0(int i10, CodedOutputStream codedOutputStream) throws IOException;

    public abstract boolean i() throws IOException;

    public abstract void i0() throws IOException;

    public abstract void j0(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void k0(int i10) throws IOException;

    final void l0() {
        this.f22655e = false;
    }

    public abstract void s(int i10);

    public abstract int t(int i10) throws InvalidProtocolBufferException;

    public abstract boolean u() throws IOException;

    public abstract byte[] v() throws IOException;

    public abstract ByteBuffer w() throws IOException;

    public abstract ByteString x() throws IOException;

    public abstract double y() throws IOException;

    public abstract int z() throws IOException;
}
