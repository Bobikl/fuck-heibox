package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: BinaryWriter.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class n extends t implements Writer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22532e = 4096;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22533f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f22534g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f22535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayDeque<androidx.p001datastore.preferences.protobuf.d> f22537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f22538d;

    /* JADX INFO: compiled from: BinaryWriter.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22539a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22539a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22539a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22539a[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22539a[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22539a[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22539a[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22539a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22539a[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22539a[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22539a[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22539a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22539a[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22539a[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22539a[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22539a[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22539a[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22539a[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: compiled from: BinaryWriter.java */
    public static final class b extends n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ByteBuffer f22540h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f22541i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f22542j;

        b(r rVar, int i10) {
            super(rVar, i10, null);
            Z0();
        }

        private int Y0() {
            return this.f22541i - this.f22542j;
        }

        private void Z0() {
            b1(f0());
        }

        private void a1(int i10) {
            b1(g0(i10));
        }

        private void b1(androidx.p001datastore.preferences.protobuf.d dVar) {
            if (!dVar.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = dVar.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f22537c.addFirst(dVar);
            this.f22540h = byteBufferF;
            byteBufferF.limit(byteBufferF.capacity());
            this.f22540h.position(0);
            this.f22540h.order(ByteOrder.LITTLE_ENDIAN);
            int iLimit = this.f22540h.limit() - 1;
            this.f22541i = iLimit;
            this.f22542j = iLimit;
        }

        private int c1() {
            return this.f22542j + 1;
        }

        private void d1(int i10) {
            ByteBuffer byteBuffer = this.f22540h;
            int i11 = this.f22542j;
            this.f22542j = i11 - 1;
            byteBuffer.put(i11, (byte) (i10 >>> 28));
            int i12 = this.f22542j - 4;
            this.f22542j = i12;
            this.f22540h.putInt(i12 + 1, (i10 & 127) | 128 | ((((i10 >>> 21) & 127) | 128) << 24) | ((((i10 >>> 14) & 127) | 128) << 16) | ((((i10 >>> 7) & 127) | 128) << 8));
        }

        private void e1(int i10) {
            int i11 = this.f22542j - 4;
            this.f22542j = i11;
            this.f22540h.putInt(i11 + 1, (i10 & 127) | 128 | ((266338304 & i10) << 3) | (((2080768 & i10) | 2097152) << 2) | (((i10 & 16256) | 16384) << 1));
        }

        private void f1(int i10) {
            ByteBuffer byteBuffer = this.f22540h;
            int i11 = this.f22542j;
            this.f22542j = i11 - 1;
            byteBuffer.put(i11, (byte) i10);
        }

        private void g1(int i10) {
            int i11 = this.f22542j - 3;
            this.f22542j = i11;
            this.f22540h.putInt(i11, (((i10 & 127) | 128) << 8) | ((2080768 & i10) << 10) | (((i10 & 16256) | 16384) << 9));
        }

        private void h1(int i10) {
            int i11 = this.f22542j - 2;
            this.f22542j = i11;
            this.f22540h.putShort(i11 + 1, (short) ((i10 & 127) | 128 | ((i10 & 16256) << 1)));
        }

        private void i1(long j10) {
            int i10 = this.f22542j - 8;
            this.f22542j = i10;
            this.f22540h.putLong(i10 + 1, (j10 & 127) | 128 | ((71494644084506624L & j10) << 7) | (((558551906910208L & j10) | 562949953421312L) << 6) | (((4363686772736L & j10) | 4398046511104L) << 5) | (((34091302912L & j10) | 34359738368L) << 4) | (((266338304 & j10) | 268435456) << 3) | (((2080768 & j10) | 2097152) << 2) | (((16256 & j10) | 16384) << 1));
        }

        private void j1(long j10) {
            int i10 = this.f22542j - 8;
            this.f22542j = i10;
            this.f22540h.putLong(i10 + 1, (j10 & 127) | 128 | (((71494644084506624L & j10) | 72057594037927936L) << 7) | (((558551906910208L & j10) | 562949953421312L) << 6) | (((4363686772736L & j10) | 4398046511104L) << 5) | (((34091302912L & j10) | 34359738368L) << 4) | (((266338304 & j10) | 268435456) << 3) | (((2080768 & j10) | 2097152) << 2) | (((16256 & j10) | 16384) << 1));
        }

        private void k1(long j10) {
            int i10 = this.f22542j - 5;
            this.f22542j = i10;
            this.f22540h.putLong(i10 - 2, (((j10 & 127) | 128) << 24) | ((34091302912L & j10) << 28) | (((266338304 & j10) | 268435456) << 27) | (((2080768 & j10) | 2097152) << 26) | (((16256 & j10) | 16384) << 25));
        }

        private void l1(long j10) {
            e1((int) j10);
        }

        private void m1(long j10) {
            ByteBuffer byteBuffer = this.f22540h;
            int i10 = this.f22542j;
            this.f22542j = i10 - 1;
            byteBuffer.put(i10, (byte) (j10 >>> 56));
            j1(j10 & 72057594037927935L);
        }

        private void n1(long j10) {
            f1((int) j10);
        }

        private void o1(long j10) {
            int i10 = this.f22542j - 7;
            this.f22542j = i10;
            this.f22540h.putLong(i10, (((j10 & 127) | 128) << 8) | ((558551906910208L & j10) << 14) | (((4363686772736L & j10) | 4398046511104L) << 13) | (((34091302912L & j10) | 34359738368L) << 12) | (((266338304 & j10) | 268435456) << 11) | (((2080768 & j10) | 2097152) << 10) | (((16256 & j10) | 16384) << 9));
        }

        private void p1(long j10) {
            int i10 = this.f22542j - 6;
            this.f22542j = i10;
            this.f22540h.putLong(i10 - 1, (((j10 & 127) | 128) << 16) | ((4363686772736L & j10) << 21) | (((34091302912L & j10) | 34359738368L) << 20) | (((266338304 & j10) | 268435456) << 19) | (((2080768 & j10) | 2097152) << 18) | (((16256 & j10) | 16384) << 17));
        }

        private void q1(long j10) {
            ByteBuffer byteBuffer = this.f22540h;
            int i10 = this.f22542j;
            this.f22542j = i10 - 1;
            byteBuffer.put(i10, (byte) (j10 >>> 63));
            ByteBuffer byteBuffer2 = this.f22540h;
            int i11 = this.f22542j;
            this.f22542j = i11 - 1;
            byteBuffer2.put(i11, (byte) (((j10 >>> 56) & 127) | 128));
            j1(j10 & 72057594037927935L);
        }

        private void r1(long j10) {
            g1((int) j10);
        }

        private void s1(long j10) {
            h1((int) j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void A0(long j10) {
            int i10 = this.f22542j - 8;
            this.f22542j = i10;
            this.f22540h.putLong(i10 + 1, j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void F(int i10, Object obj, x2 x2Var) throws IOException {
            R0(i10, 4);
            x2Var.c(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void F0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void K(int i10, Object obj) throws IOException {
            int iC0 = c0();
            r2.a().k(obj, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void K0(int i10) {
            W0(CodedOutputStream.c1(i10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void N0(long j10) {
            X0(CodedOutputStream.d1(j10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void O(int i10, Object obj) throws IOException {
            R0(i10, 4);
            r2.a().k(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void Q0(String str) {
            int i10;
            int i11;
            int i12;
            char cCharAt;
            r0(str.length());
            int length = str.length() - 1;
            this.f22542j -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f22540h.put(this.f22542j + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.f22542j--;
                return;
            }
            this.f22542j += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i12 = this.f22542j) >= 0) {
                    ByteBuffer byteBuffer = this.f22540h;
                    this.f22542j = i12 - 1;
                    byteBuffer.put(i12, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i11 = this.f22542j) > 0) {
                    ByteBuffer byteBuffer2 = this.f22540h;
                    this.f22542j = i11 - 1;
                    byteBuffer2.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f22540h;
                    int i13 = this.f22542j;
                    this.f22542j = i13 - 1;
                    byteBuffer3.put(i13, (byte) ((cCharAt2 >>> 6) | bb.c.b.f31065yf));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i10 = this.f22542j) > 1) {
                    ByteBuffer byteBuffer4 = this.f22540h;
                    this.f22542j = i10 - 1;
                    byteBuffer4.put(i10, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f22540h;
                    int i14 = this.f22542j;
                    this.f22542j = i14 - 1;
                    byteBuffer5.put(i14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f22540h;
                    int i15 = this.f22542j;
                    this.f22542j = i15 - 1;
                    byteBuffer6.put(i15, (byte) ((cCharAt2 >>> '\f') | 480));
                } else {
                    if (this.f22542j > 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.f22540h;
                                int i16 = this.f22542j;
                                this.f22542j = i16 - 1;
                                byteBuffer7.put(i16, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.f22540h;
                                int i17 = this.f22542j;
                                this.f22542j = i17 - 1;
                                byteBuffer8.put(i17, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.f22540h;
                                int i18 = this.f22542j;
                                this.f22542j = i18 - 1;
                                byteBuffer9.put(i18, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.f22540h;
                                int i19 = this.f22542j;
                                this.f22542j = i19 - 1;
                                byteBuffer10.put(i19, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void R0(int i10, int i11) {
            W0(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void S(int i10, int i11) {
            r0(10);
            K0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void T(byte b10) {
            ByteBuffer byteBuffer = this.f22540h;
            int i10 = this.f22542j;
            this.f22542j = i10 - 1;
            byteBuffer.put(i10, b10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void U(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (c1() < iRemaining) {
                a1(iRemaining);
            }
            int i10 = this.f22542j - iRemaining;
            this.f22542j = i10;
            this.f22540h.position(i10 + 1);
            this.f22540h.put(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void V(byte[] bArr, int i10, int i11) {
            if (c1() < i11) {
                a1(i11);
            }
            int i12 = this.f22542j - i11;
            this.f22542j = i12;
            this.f22540h.position(i12 + 1);
            this.f22540h.put(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void W(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (c1() < iRemaining) {
                this.f22538d += iRemaining;
                this.f22537c.addFirst(androidx.p001datastore.preferences.protobuf.d.j(byteBuffer));
                Z0();
            } else {
                int i10 = this.f22542j - iRemaining;
                this.f22542j = i10;
                this.f22540h.position(i10 + 1);
                this.f22540h.put(byteBuffer);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void W0(int i10) {
            if ((i10 & n5.a.f132012g) == 0) {
                f1(i10);
                return;
            }
            if ((i10 & (-16384)) == 0) {
                h1(i10);
                return;
            }
            if (((-2097152) & i10) == 0) {
                g1(i10);
            } else if (((-268435456) & i10) == 0) {
                e1(i10);
            } else {
                d1(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void X(byte[] bArr, int i10, int i11) {
            if (c1() < i11) {
                this.f22538d += i11;
                this.f22537c.addFirst(androidx.p001datastore.preferences.protobuf.d.l(bArr, i10, i11));
                Z0();
            } else {
                int i12 = this.f22542j - i11;
                this.f22542j = i12;
                this.f22540h.position(i12 + 1);
                this.f22540h.put(bArr, i10, i11);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void X0(long j10) {
            switch (n.a0(j10)) {
                case 1:
                    n1(j10);
                    break;
                case 2:
                    s1(j10);
                    break;
                case 3:
                    r1(j10);
                    break;
                case 4:
                    l1(j10);
                    break;
                case 5:
                    k1(j10);
                    break;
                case 6:
                    p1(j10);
                    break;
                case 7:
                    o1(j10);
                    break;
                case 8:
                    i1(j10);
                    break;
                case 9:
                    m1(j10);
                    break;
                case 10:
                    q1(j10);
                    break;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void b0() {
            if (this.f22540h != null) {
                this.f22538d += Y0();
                this.f22540h.position(this.f22542j + 1);
                this.f22540h = null;
                this.f22542j = 0;
                this.f22541i = 0;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void c(int i10, int i11) {
            r0(9);
            x0(i11);
            R0(i10, 5);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        public int c0() {
            return this.f22538d + Y0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void e(int i10, String str) {
            int iC0 = c0();
            Q0(str);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void f(int i10, long j10) {
            r0(15);
            X0(j10);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void h(int i10, int i11) {
            r0(15);
            F0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void i(int i10, ByteString byteString) {
            try {
                byteString.A0(this);
                r0(10);
                W0(byteString.size());
                R0(i10, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void k(int i10, Object obj, x2 x2Var) throws IOException {
            int iC0 = c0();
            x2Var.c(obj, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void m(int i10, long j10) {
            r0(15);
            N0(j10);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void o(int i10, int i11) {
            r0(10);
            W0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void q(int i10, long j10) {
            r0(13);
            A0(j10);
            R0(i10, 1);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void r0(int i10) {
            if (c1() < i10) {
                a1(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void s(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void u(int i10) {
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void w(int i10) {
            R0(i10, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void x0(int i10) {
            int i11 = this.f22542j - 4;
            this.f22542j = i11;
            this.f22540h.putInt(i11 + 1, i10);
        }
    }

    /* JADX INFO: compiled from: BinaryWriter.java */
    public static final class c extends n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private androidx.p001datastore.preferences.protobuf.d f22543h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f22544i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f22545j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f22546k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f22547l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f22548m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f22549n;

        c(r rVar, int i10) {
            super(rVar, i10, null);
            Z0();
        }

        private void Z0() {
            b1(j0());
        }

        private void a1(int i10) {
            b1(k0(i10));
        }

        private void b1(androidx.p001datastore.preferences.protobuf.d dVar) {
            if (!dVar.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f22537c.addFirst(dVar);
            this.f22543h = dVar;
            this.f22544i = dVar.a();
            int iB = dVar.b();
            this.f22546k = dVar.e() + iB;
            int iG = iB + dVar.g();
            this.f22545j = iG;
            this.f22547l = iG - 1;
            int i10 = this.f22546k - 1;
            this.f22548m = i10;
            this.f22549n = i10;
        }

        private void d1(int i10) {
            byte[] bArr = this.f22544i;
            int i11 = this.f22549n;
            int i12 = i11 - 1;
            bArr[i11] = (byte) (i10 >>> 28);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((i10 >>> 21) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((i10 >>> 14) & 127) | 128);
            int i15 = i14 - 1;
            bArr[i14] = (byte) (((i10 >>> 7) & 127) | 128);
            this.f22549n = i15 - 1;
            bArr[i15] = (byte) ((i10 & 127) | 128);
        }

        private void e1(int i10) {
            byte[] bArr = this.f22544i;
            int i11 = this.f22549n;
            int i12 = i11 - 1;
            bArr[i11] = (byte) (i10 >>> 21);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((i10 >>> 14) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((i10 >>> 7) & 127) | 128);
            this.f22549n = i14 - 1;
            bArr[i14] = (byte) ((i10 & 127) | 128);
        }

        private void f1(int i10) {
            byte[] bArr = this.f22544i;
            int i11 = this.f22549n;
            this.f22549n = i11 - 1;
            bArr[i11] = (byte) i10;
        }

        private void g1(int i10) {
            byte[] bArr = this.f22544i;
            int i11 = this.f22549n;
            int i12 = i11 - 1;
            bArr[i11] = (byte) (i10 >>> 14);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((i10 >>> 7) & 127) | 128);
            this.f22549n = i13 - 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
        }

        private void h1(int i10) {
            byte[] bArr = this.f22544i;
            int i11 = this.f22549n;
            int i12 = i11 - 1;
            bArr[i11] = (byte) (i10 >>> 7);
            this.f22549n = i12 - 1;
            bArr[i12] = (byte) ((i10 & 127) | 128);
        }

        private void i1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (j10 >>> 49);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j10 >>> 42) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j10 >>> 35) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((j10 >>> 28) & 127) | 128);
            int i15 = i14 - 1;
            bArr[i14] = (byte) (((j10 >>> 21) & 127) | 128);
            int i16 = i15 - 1;
            bArr[i15] = (byte) (((j10 >>> 14) & 127) | 128);
            int i17 = i16 - 1;
            bArr[i16] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f22549n = i17 - 1;
            bArr[i17] = (byte) ((j10 & 127) | 128);
        }

        private void j1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (j10 >>> 28);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j10 >>> 21) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j10 >>> 14) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f22549n = i14 - 1;
            bArr[i14] = (byte) ((j10 & 127) | 128);
        }

        private void k1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (j10 >>> 21);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j10 >>> 14) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f22549n = i13 - 1;
            bArr[i13] = (byte) ((j10 & 127) | 128);
        }

        private void l1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (j10 >>> 56);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j10 >>> 49) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j10 >>> 42) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((j10 >>> 35) & 127) | 128);
            int i15 = i14 - 1;
            bArr[i14] = (byte) (((j10 >>> 28) & 127) | 128);
            int i16 = i15 - 1;
            bArr[i15] = (byte) (((j10 >>> 21) & 127) | 128);
            int i17 = i16 - 1;
            bArr[i16] = (byte) (((j10 >>> 14) & 127) | 128);
            int i18 = i17 - 1;
            bArr[i17] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f22549n = i18 - 1;
            bArr[i18] = (byte) ((j10 & 127) | 128);
        }

        private void m1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            this.f22549n = i10 - 1;
            bArr[i10] = (byte) j10;
        }

        private void n1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (j10 >>> 42);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j10 >>> 35) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j10 >>> 28) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((j10 >>> 21) & 127) | 128);
            int i15 = i14 - 1;
            bArr[i14] = (byte) (((j10 >>> 14) & 127) | 128);
            int i16 = i15 - 1;
            bArr[i15] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f22549n = i16 - 1;
            bArr[i16] = (byte) ((j10 & 127) | 128);
        }

        private void o1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (j10 >>> 35);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j10 >>> 28) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j10 >>> 21) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((j10 >>> 14) & 127) | 128);
            int i15 = i14 - 1;
            bArr[i14] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f22549n = i15 - 1;
            bArr[i15] = (byte) ((j10 & 127) | 128);
        }

        private void p1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (j10 >>> 63);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j10 >>> 56) & 127) | 128);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((j10 >>> 49) & 127) | 128);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((j10 >>> 42) & 127) | 128);
            int i15 = i14 - 1;
            bArr[i14] = (byte) (((j10 >>> 35) & 127) | 128);
            int i16 = i15 - 1;
            bArr[i15] = (byte) (((j10 >>> 28) & 127) | 128);
            int i17 = i16 - 1;
            bArr[i16] = (byte) (((j10 >>> 21) & 127) | 128);
            int i18 = i17 - 1;
            bArr[i17] = (byte) (((j10 >>> 14) & 127) | 128);
            int i19 = i18 - 1;
            bArr[i18] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f22549n = i19 - 1;
            bArr[i19] = (byte) ((j10 & 127) | 128);
        }

        private void q1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (((int) j10) >>> 14);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((j10 >>> 7) & 127) | 128);
            this.f22549n = i12 - 1;
            bArr[i12] = (byte) ((j10 & 127) | 128);
        }

        private void r1(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (j10 >>> 7);
            this.f22549n = i11 - 1;
            bArr[i11] = (byte) ((((int) j10) & 127) | 128);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void A0(long j10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            int i11 = i10 - 1;
            bArr[i10] = (byte) (((int) (j10 >> 56)) & 255);
            int i12 = i11 - 1;
            bArr[i11] = (byte) (((int) (j10 >> 48)) & 255);
            int i13 = i12 - 1;
            bArr[i12] = (byte) (((int) (j10 >> 40)) & 255);
            int i14 = i13 - 1;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
            int i15 = i14 - 1;
            bArr[i14] = (byte) (((int) (j10 >> 24)) & 255);
            int i16 = i15 - 1;
            bArr[i15] = (byte) (((int) (j10 >> 16)) & 255);
            int i17 = i16 - 1;
            bArr[i16] = (byte) (((int) (j10 >> 8)) & 255);
            this.f22549n = i17 - 1;
            bArr[i17] = (byte) (((int) j10) & 255);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void F(int i10, Object obj, x2 x2Var) throws IOException {
            R0(i10, 4);
            x2Var.c(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void F0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void K(int i10, Object obj) throws IOException {
            int iC0 = c0();
            r2.a().k(obj, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void K0(int i10) {
            W0(CodedOutputStream.c1(i10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void N0(long j10) {
            X0(CodedOutputStream.d1(j10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void O(int i10, Object obj) throws IOException {
            R0(i10, 4);
            r2.a().k(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void Q0(String str) {
            int i10;
            int i11;
            int i12;
            char cCharAt;
            r0(str.length());
            int length = str.length() - 1;
            this.f22549n -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f22544i[this.f22549n + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.f22549n--;
                return;
            }
            this.f22549n += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i12 = this.f22549n) > this.f22547l) {
                    byte[] bArr = this.f22544i;
                    this.f22549n = i12 - 1;
                    bArr[i12] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i11 = this.f22549n) > this.f22545j) {
                    byte[] bArr2 = this.f22544i;
                    int i13 = i11 - 1;
                    bArr2[i11] = (byte) ((cCharAt2 & '?') | 128);
                    this.f22549n = i13 - 1;
                    bArr2[i13] = (byte) ((cCharAt2 >>> 6) | bb.c.b.f31065yf);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i10 = this.f22549n) > this.f22545j + 1) {
                    byte[] bArr3 = this.f22544i;
                    int i14 = i10 - 1;
                    bArr3[i10] = (byte) ((cCharAt2 & '?') | 128);
                    int i15 = i14 - 1;
                    bArr3[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    this.f22549n = i15 - 1;
                    bArr3[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                } else {
                    if (this.f22549n > this.f22545j + 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.f22544i;
                                int i16 = this.f22549n;
                                int i17 = i16 - 1;
                                bArr4[i16] = (byte) ((codePoint & 63) | 128);
                                int i18 = i17 - 1;
                                bArr4[i17] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i19 = i18 - 1;
                                bArr4[i18] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.f22549n = i19 - 1;
                                bArr4[i19] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void R0(int i10, int i11) {
            W0(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void S(int i10, int i11) throws IOException {
            r0(10);
            K0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void T(byte b10) {
            byte[] bArr = this.f22544i;
            int i10 = this.f22549n;
            this.f22549n = i10 - 1;
            bArr[i10] = b10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void U(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (c1() < iRemaining) {
                a1(iRemaining);
            }
            int i10 = this.f22549n - iRemaining;
            this.f22549n = i10;
            byteBuffer.get(this.f22544i, i10 + 1, iRemaining);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void V(byte[] bArr, int i10, int i11) {
            if (c1() < i11) {
                a1(i11);
            }
            int i12 = this.f22549n - i11;
            this.f22549n = i12;
            System.arraycopy(bArr, i10, this.f22544i, i12 + 1, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void W(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (c1() < iRemaining) {
                this.f22538d += iRemaining;
                this.f22537c.addFirst(androidx.p001datastore.preferences.protobuf.d.j(byteBuffer));
                Z0();
            }
            int i10 = this.f22549n - iRemaining;
            this.f22549n = i10;
            byteBuffer.get(this.f22544i, i10 + 1, iRemaining);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void W0(int i10) {
            if ((i10 & n5.a.f132012g) == 0) {
                f1(i10);
                return;
            }
            if ((i10 & (-16384)) == 0) {
                h1(i10);
                return;
            }
            if (((-2097152) & i10) == 0) {
                g1(i10);
            } else if (((-268435456) & i10) == 0) {
                e1(i10);
            } else {
                d1(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void X(byte[] bArr, int i10, int i11) {
            if (c1() < i11) {
                this.f22538d += i11;
                this.f22537c.addFirst(androidx.p001datastore.preferences.protobuf.d.l(bArr, i10, i11));
                Z0();
            } else {
                int i12 = this.f22549n - i11;
                this.f22549n = i12;
                System.arraycopy(bArr, i10, this.f22544i, i12 + 1, i11);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void X0(long j10) {
            switch (n.a0(j10)) {
                case 1:
                    m1(j10);
                    break;
                case 2:
                    r1(j10);
                    break;
                case 3:
                    q1(j10);
                    break;
                case 4:
                    k1(j10);
                    break;
                case 5:
                    j1(j10);
                    break;
                case 6:
                    o1(j10);
                    break;
                case 7:
                    n1(j10);
                    break;
                case 8:
                    i1(j10);
                    break;
                case 9:
                    l1(j10);
                    break;
                case 10:
                    p1(j10);
                    break;
            }
        }

        int Y0() {
            return this.f22548m - this.f22549n;
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void b0() {
            if (this.f22543h != null) {
                this.f22538d += Y0();
                androidx.p001datastore.preferences.protobuf.d dVar = this.f22543h;
                dVar.h((this.f22549n - dVar.b()) + 1);
                this.f22543h = null;
                this.f22549n = 0;
                this.f22548m = 0;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void c(int i10, int i11) throws IOException {
            r0(9);
            x0(i11);
            R0(i10, 5);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        public int c0() {
            return this.f22538d + Y0();
        }

        int c1() {
            return this.f22549n - this.f22547l;
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void e(int i10, String str) throws IOException {
            int iC0 = c0();
            Q0(str);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void f(int i10, long j10) throws IOException {
            r0(15);
            X0(j10);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void h(int i10, int i11) throws IOException {
            r0(15);
            F0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void i(int i10, ByteString byteString) throws IOException {
            try {
                byteString.A0(this);
                r0(10);
                W0(byteString.size());
                R0(i10, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void k(int i10, Object obj, x2 x2Var) throws IOException {
            int iC0 = c0();
            x2Var.c(obj, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void m(int i10, long j10) throws IOException {
            r0(15);
            N0(j10);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void o(int i10, int i11) throws IOException {
            r0(10);
            W0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void q(int i10, long j10) throws IOException {
            r0(13);
            A0(j10);
            R0(i10, 1);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void r0(int i10) {
            if (c1() < i10) {
                a1(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void s(int i10, boolean z10) throws IOException {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void u(int i10) {
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void w(int i10) {
            R0(i10, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void x0(int i10) {
            byte[] bArr = this.f22544i;
            int i11 = this.f22549n;
            int i12 = i11 - 1;
            bArr[i11] = (byte) ((i10 >> 24) & 255);
            int i13 = i12 - 1;
            bArr[i12] = (byte) ((i10 >> 16) & 255);
            int i14 = i13 - 1;
            bArr[i13] = (byte) ((i10 >> 8) & 255);
            this.f22549n = i14 - 1;
            bArr[i14] = (byte) (i10 & 255);
        }
    }

    /* JADX INFO: compiled from: BinaryWriter.java */
    public static final class d extends n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ByteBuffer f22550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f22551i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f22552j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f22553k;

        d(r rVar, int i10) {
            super(rVar, i10, null);
            c1();
        }

        private int Z0() {
            return (int) (this.f22553k - this.f22551i);
        }

        private int a1() {
            return (int) (this.f22552j - this.f22553k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b1() {
            return z3.T();
        }

        private void c1() {
            e1(f0());
        }

        private void d1(int i10) {
            e1(g0(i10));
        }

        private void e1(androidx.p001datastore.preferences.protobuf.d dVar) {
            if (!dVar.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = dVar.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f22537c.addFirst(dVar);
            this.f22550h = byteBufferF;
            byteBufferF.limit(byteBufferF.capacity());
            this.f22550h.position(0);
            long jI = z3.i(this.f22550h);
            this.f22551i = jI;
            long jLimit = jI + ((long) (this.f22550h.limit() - 1));
            this.f22552j = jLimit;
            this.f22553k = jLimit;
        }

        private int f1() {
            return Z0() + 1;
        }

        private void g1(int i10) {
            long j10 = this.f22553k;
            this.f22553k = j10 - 1;
            z3.b0(j10, (byte) (i10 >>> 28));
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (((i10 >>> 21) & 127) | 128));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((i10 >>> 14) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((i10 >>> 7) & 127) | 128));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) ((i10 & 127) | 128));
        }

        private void h1(int i10) {
            long j10 = this.f22553k;
            this.f22553k = j10 - 1;
            z3.b0(j10, (byte) (i10 >>> 21));
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (((i10 >>> 14) & 127) | 128));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((i10 >>> 7) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) ((i10 & 127) | 128));
        }

        private void i1(int i10) {
            long j10 = this.f22553k;
            this.f22553k = j10 - 1;
            z3.b0(j10, (byte) i10);
        }

        private void j1(int i10) {
            long j10 = this.f22553k;
            this.f22553k = j10 - 1;
            z3.b0(j10, (byte) (i10 >>> 14));
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (((i10 >>> 7) & 127) | 128));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) ((i10 & 127) | 128));
        }

        private void k1(int i10) {
            long j10 = this.f22553k;
            this.f22553k = j10 - 1;
            z3.b0(j10, (byte) (i10 >>> 7));
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) ((i10 & 127) | 128));
        }

        private void l1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (j10 >>> 49));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((j10 >>> 42) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((j10 >>> 35) & 127) | 128));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) (((j10 >>> 28) & 127) | 128));
            long j15 = this.f22553k;
            this.f22553k = j15 - 1;
            z3.b0(j15, (byte) (((j10 >>> 21) & 127) | 128));
            long j16 = this.f22553k;
            this.f22553k = j16 - 1;
            z3.b0(j16, (byte) (((j10 >>> 14) & 127) | 128));
            long j17 = this.f22553k;
            this.f22553k = j17 - 1;
            z3.b0(j17, (byte) (((j10 >>> 7) & 127) | 128));
            long j18 = this.f22553k;
            this.f22553k = j18 - 1;
            z3.b0(j18, (byte) ((j10 & 127) | 128));
        }

        private void m1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (j10 >>> 28));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((j10 >>> 21) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((j10 >>> 14) & 127) | 128));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) (((j10 >>> 7) & 127) | 128));
            long j15 = this.f22553k;
            this.f22553k = j15 - 1;
            z3.b0(j15, (byte) ((j10 & 127) | 128));
        }

        private void n1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (j10 >>> 21));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((j10 >>> 14) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((j10 >>> 7) & 127) | 128));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) ((j10 & 127) | 128));
        }

        private void o1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (j10 >>> 56));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((j10 >>> 49) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((j10 >>> 42) & 127) | 128));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) (((j10 >>> 35) & 127) | 128));
            long j15 = this.f22553k;
            this.f22553k = j15 - 1;
            z3.b0(j15, (byte) (((j10 >>> 28) & 127) | 128));
            long j16 = this.f22553k;
            this.f22553k = j16 - 1;
            z3.b0(j16, (byte) (((j10 >>> 21) & 127) | 128));
            long j17 = this.f22553k;
            this.f22553k = j17 - 1;
            z3.b0(j17, (byte) (((j10 >>> 14) & 127) | 128));
            long j18 = this.f22553k;
            this.f22553k = j18 - 1;
            z3.b0(j18, (byte) (((j10 >>> 7) & 127) | 128));
            long j19 = this.f22553k;
            this.f22553k = j19 - 1;
            z3.b0(j19, (byte) ((j10 & 127) | 128));
        }

        private void p1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) j10);
        }

        private void q1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (j10 >>> 42));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((j10 >>> 35) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((j10 >>> 28) & 127) | 128));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) (((j10 >>> 21) & 127) | 128));
            long j15 = this.f22553k;
            this.f22553k = j15 - 1;
            z3.b0(j15, (byte) (((j10 >>> 14) & 127) | 128));
            long j16 = this.f22553k;
            this.f22553k = j16 - 1;
            z3.b0(j16, (byte) (((j10 >>> 7) & 127) | 128));
            long j17 = this.f22553k;
            this.f22553k = j17 - 1;
            z3.b0(j17, (byte) ((j10 & 127) | 128));
        }

        private void r1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (j10 >>> 35));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((j10 >>> 28) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((j10 >>> 21) & 127) | 128));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) (((j10 >>> 14) & 127) | 128));
            long j15 = this.f22553k;
            this.f22553k = j15 - 1;
            z3.b0(j15, (byte) (((j10 >>> 7) & 127) | 128));
            long j16 = this.f22553k;
            this.f22553k = j16 - 1;
            z3.b0(j16, (byte) ((j10 & 127) | 128));
        }

        private void s1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (j10 >>> 63));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((j10 >>> 56) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((j10 >>> 49) & 127) | 128));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) (((j10 >>> 42) & 127) | 128));
            long j15 = this.f22553k;
            this.f22553k = j15 - 1;
            z3.b0(j15, (byte) (((j10 >>> 35) & 127) | 128));
            long j16 = this.f22553k;
            this.f22553k = j16 - 1;
            z3.b0(j16, (byte) (((j10 >>> 28) & 127) | 128));
            long j17 = this.f22553k;
            this.f22553k = j17 - 1;
            z3.b0(j17, (byte) (((j10 >>> 21) & 127) | 128));
            long j18 = this.f22553k;
            this.f22553k = j18 - 1;
            z3.b0(j18, (byte) (((j10 >>> 14) & 127) | 128));
            long j19 = this.f22553k;
            this.f22553k = j19 - 1;
            z3.b0(j19, (byte) (((j10 >>> 7) & 127) | 128));
            long j20 = this.f22553k;
            this.f22553k = j20 - 1;
            z3.b0(j20, (byte) ((j10 & 127) | 128));
        }

        private void t1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (((int) j10) >>> 14));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((j10 >>> 7) & 127) | 128));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) ((j10 & 127) | 128));
        }

        private void u1(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (j10 >>> 7));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) ((((int) j10) & 127) | 128));
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void A0(long j10) {
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) (((int) (j10 >> 56)) & 255));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) (((int) (j10 >> 48)) & 255));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (((int) (j10 >> 40)) & 255));
            long j14 = this.f22553k;
            this.f22553k = j14 - 1;
            z3.b0(j14, (byte) (((int) (j10 >> 32)) & 255));
            long j15 = this.f22553k;
            this.f22553k = j15 - 1;
            z3.b0(j15, (byte) (((int) (j10 >> 24)) & 255));
            long j16 = this.f22553k;
            this.f22553k = j16 - 1;
            z3.b0(j16, (byte) (((int) (j10 >> 16)) & 255));
            long j17 = this.f22553k;
            this.f22553k = j17 - 1;
            z3.b0(j17, (byte) (((int) (j10 >> 8)) & 255));
            long j18 = this.f22553k;
            this.f22553k = j18 - 1;
            z3.b0(j18, (byte) (((int) j10) & 255));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void F(int i10, Object obj, x2 x2Var) throws IOException {
            R0(i10, 4);
            x2Var.c(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void F0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void K(int i10, Object obj) throws IOException {
            int iC0 = c0();
            r2.a().k(obj, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void K0(int i10) {
            W0(CodedOutputStream.c1(i10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void N0(long j10) {
            X0(CodedOutputStream.d1(j10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void O(int i10, Object obj) throws IOException {
            R0(i10, 4);
            r2.a().k(obj, this);
            R0(i10, 3);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Code duplicated, block: B:19:0x0048  */
        /* JADX WARN: Code duplicated, block: B:21:0x0050  */
        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code duplicated, block: B:24:0x0070  */
        /* JADX WARN: Code duplicated, block: B:26:0x0075  */
        /* JADX WARN: Code duplicated, block: B:28:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:37:0x0108  */
        /* JADX WARN: Code duplicated, block: B:43:0x0100 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0100 A[SYNTHETIC] */
        @Override // androidx.p001datastore.preferences.protobuf.n
        void Q0(String str) {
            long j10;
            char cCharAt;
            long j11;
            char cCharAt2;
            r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = str.charAt(length)) >= 128) {
                    break;
                }
                long j12 = this.f22553k;
                this.f22553k = j12 - 1;
                z3.b0(j12, (byte) cCharAt2);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char cCharAt3 = str.charAt(length);
                if (cCharAt3 < 128) {
                    long j13 = this.f22553k;
                    if (j13 >= this.f22551i) {
                        this.f22553k = j13 - 1;
                        z3.b0(j13, (byte) cCharAt3);
                    } else if (cCharAt3 < 2048) {
                        j11 = this.f22553k;
                        if (j11 > this.f22551i) {
                            this.f22553k = j11 - 1;
                            z3.b0(j11, (byte) ((cCharAt3 & '?') | 128));
                            long j14 = this.f22553k;
                            this.f22553k = j14 - 1;
                            z3.b0(j14, (byte) ((cCharAt3 >>> 6) | bb.c.b.f31065yf));
                        } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                            j10 = this.f22553k;
                            if (j10 > this.f22551i + 1) {
                                this.f22553k = j10 - 1;
                                z3.b0(j10, (byte) ((cCharAt3 & '?') | 128));
                                long j15 = this.f22553k;
                                this.f22553k = j15 - 1;
                                z3.b0(j15, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j16 = this.f22553k;
                                this.f22553k = j16 - 1;
                                z3.b0(j16, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f22553k > this.f22551i + 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j17 = this.f22553k;
                                            this.f22553k = j17 - 1;
                                            z3.b0(j17, (byte) ((codePoint & 63) | 128));
                                            long j18 = this.f22553k;
                                            this.f22553k = j18 - 1;
                                            z3.b0(j18, (byte) (((codePoint >>> 6) & 63) | 128));
                                            long j19 = this.f22553k;
                                            this.f22553k = j19 - 1;
                                            z3.b0(j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                            long j20 = this.f22553k;
                                            this.f22553k = j20 - 1;
                                            z3.b0(j20, (byte) ((codePoint >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                r0(length);
                                length++;
                            }
                        } else {
                            if (this.f22553k > this.f22551i + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j110 = this.f22553k;
                                        this.f22553k = j110 - 1;
                                        z3.b0(j110, (byte) ((codePoint2 & 63) | 128));
                                        long j111 = this.f22553k;
                                        this.f22553k = j111 - 1;
                                        z3.b0(j111, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        long j112 = this.f22553k;
                                        this.f22553k = j112 - 1;
                                        z3.b0(j112, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j21 = this.f22553k;
                                        this.f22553k = j21 - 1;
                                        z3.b0(j21, (byte) ((codePoint2 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else if (cCharAt3 >= 55296) {
                        j10 = this.f22553k;
                        if (j10 > this.f22551i + 1) {
                            this.f22553k = j10 - 1;
                            z3.b0(j10, (byte) ((cCharAt3 & '?') | 128));
                            long j113 = this.f22553k;
                            this.f22553k = j113 - 1;
                            z3.b0(j113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j114 = this.f22553k;
                            this.f22553k = j114 - 1;
                            z3.b0(j114, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f22553k > this.f22551i + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j115 = this.f22553k;
                                        this.f22553k = j115 - 1;
                                        z3.b0(j115, (byte) ((codePoint3 & 63) | 128));
                                        long j116 = this.f22553k;
                                        this.f22553k = j116 - 1;
                                        z3.b0(j116, (byte) (((codePoint3 >>> 6) & 63) | 128));
                                        long j117 = this.f22553k;
                                        this.f22553k = j117 - 1;
                                        z3.b0(j117, (byte) (((codePoint3 >>> 12) & 63) | 128));
                                        long j22 = this.f22553k;
                                        this.f22553k = j22 - 1;
                                        z3.b0(j22, (byte) ((codePoint3 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else {
                        j10 = this.f22553k;
                        if (j10 > this.f22551i + 1) {
                            this.f22553k = j10 - 1;
                            z3.b0(j10, (byte) ((cCharAt3 & '?') | 128));
                            long j118 = this.f22553k;
                            this.f22553k = j118 - 1;
                            z3.b0(j118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j119 = this.f22553k;
                            this.f22553k = j119 - 1;
                            z3.b0(j119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f22553k > this.f22551i + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j1110 = this.f22553k;
                                        this.f22553k = j1110 - 1;
                                        z3.b0(j1110, (byte) ((codePoint4 & 63) | 128));
                                        long j1111 = this.f22553k;
                                        this.f22553k = j1111 - 1;
                                        z3.b0(j1111, (byte) (((codePoint4 >>> 6) & 63) | 128));
                                        long j1112 = this.f22553k;
                                        this.f22553k = j1112 - 1;
                                        z3.b0(j1112, (byte) (((codePoint4 >>> 12) & 63) | 128));
                                        long j23 = this.f22553k;
                                        this.f22553k = j23 - 1;
                                        z3.b0(j23, (byte) ((codePoint4 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 < 2048) {
                    j11 = this.f22553k;
                    if (j11 > this.f22551i) {
                        this.f22553k = j11 - 1;
                        z3.b0(j11, (byte) ((cCharAt3 & '?') | 128));
                        long j120 = this.f22553k;
                        this.f22553k = j120 - 1;
                        z3.b0(j120, (byte) ((cCharAt3 >>> 6) | bb.c.b.f31065yf));
                    } else if (cCharAt3 >= 55296) {
                        j10 = this.f22553k;
                        if (j10 > this.f22551i + 1) {
                            this.f22553k = j10 - 1;
                            z3.b0(j10, (byte) ((cCharAt3 & '?') | 128));
                            long j1113 = this.f22553k;
                            this.f22553k = j1113 - 1;
                            z3.b0(j1113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j1114 = this.f22553k;
                            this.f22553k = j1114 - 1;
                            z3.b0(j1114, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f22553k > this.f22551i + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j1115 = this.f22553k;
                                        this.f22553k = j1115 - 1;
                                        z3.b0(j1115, (byte) ((codePoint5 & 63) | 128));
                                        long j1116 = this.f22553k;
                                        this.f22553k = j1116 - 1;
                                        z3.b0(j1116, (byte) (((codePoint5 >>> 6) & 63) | 128));
                                        long j1117 = this.f22553k;
                                        this.f22553k = j1117 - 1;
                                        z3.b0(j1117, (byte) (((codePoint5 >>> 12) & 63) | 128));
                                        long j24 = this.f22553k;
                                        this.f22553k = j24 - 1;
                                        z3.b0(j24, (byte) ((codePoint5 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else {
                        j10 = this.f22553k;
                        if (j10 > this.f22551i + 1) {
                            this.f22553k = j10 - 1;
                            z3.b0(j10, (byte) ((cCharAt3 & '?') | 128));
                            long j1118 = this.f22553k;
                            this.f22553k = j1118 - 1;
                            z3.b0(j1118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j1119 = this.f22553k;
                            this.f22553k = j1119 - 1;
                            z3.b0(j1119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f22553k > this.f22551i + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j11110 = this.f22553k;
                                        this.f22553k = j11110 - 1;
                                        z3.b0(j11110, (byte) ((codePoint6 & 63) | 128));
                                        long j11111 = this.f22553k;
                                        this.f22553k = j11111 - 1;
                                        z3.b0(j11111, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                        long j11112 = this.f22553k;
                                        this.f22553k = j11112 - 1;
                                        z3.b0(j11112, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                        long j25 = this.f22553k;
                                        this.f22553k = j25 - 1;
                                        z3.b0(j25, (byte) ((codePoint6 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 >= 55296) {
                    j10 = this.f22553k;
                    if (j10 > this.f22551i + 1) {
                        this.f22553k = j10 - 1;
                        z3.b0(j10, (byte) ((cCharAt3 & '?') | 128));
                        long j11113 = this.f22553k;
                        this.f22553k = j11113 - 1;
                        z3.b0(j11113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        long j11114 = this.f22553k;
                        this.f22553k = j11114 - 1;
                        z3.b0(j11114, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.f22553k > this.f22551i + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                    long j11115 = this.f22553k;
                                    this.f22553k = j11115 - 1;
                                    z3.b0(j11115, (byte) ((codePoint7 & 63) | 128));
                                    long j11116 = this.f22553k;
                                    this.f22553k = j11116 - 1;
                                    z3.b0(j11116, (byte) (((codePoint7 >>> 6) & 63) | 128));
                                    long j11117 = this.f22553k;
                                    this.f22553k = j11117 - 1;
                                    z3.b0(j11117, (byte) (((codePoint7 >>> 12) & 63) | 128));
                                    long j26 = this.f22553k;
                                    this.f22553k = j26 - 1;
                                    z3.b0(j26, (byte) ((codePoint7 >>> 18) | 240));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        r0(length);
                        length++;
                    }
                } else {
                    j10 = this.f22553k;
                    if (j10 > this.f22551i + 1) {
                        this.f22553k = j10 - 1;
                        z3.b0(j10, (byte) ((cCharAt3 & '?') | 128));
                        long j11118 = this.f22553k;
                        this.f22553k = j11118 - 1;
                        z3.b0(j11118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        long j11119 = this.f22553k;
                        this.f22553k = j11119 - 1;
                        z3.b0(j11119, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.f22553k > this.f22551i + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                    long j111110 = this.f22553k;
                                    this.f22553k = j111110 - 1;
                                    z3.b0(j111110, (byte) ((codePoint8 & 63) | 128));
                                    long j111111 = this.f22553k;
                                    this.f22553k = j111111 - 1;
                                    z3.b0(j111111, (byte) (((codePoint8 >>> 6) & 63) | 128));
                                    long j111112 = this.f22553k;
                                    this.f22553k = j111112 - 1;
                                    z3.b0(j111112, (byte) (((codePoint8 >>> 12) & 63) | 128));
                                    long j27 = this.f22553k;
                                    this.f22553k = j27 - 1;
                                    z3.b0(j27, (byte) ((codePoint8 >>> 18) | 240));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        r0(length);
                        length++;
                    }
                }
                length--;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void R0(int i10, int i11) {
            W0(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void S(int i10, int i11) {
            r0(10);
            K0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void T(byte b10) {
            long j10 = this.f22553k;
            this.f22553k = j10 - 1;
            z3.b0(j10, b10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void U(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (f1() < iRemaining) {
                d1(iRemaining);
            }
            this.f22553k -= (long) iRemaining;
            this.f22550h.position(Z0() + 1);
            this.f22550h.put(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void V(byte[] bArr, int i10, int i11) {
            if (f1() < i11) {
                d1(i11);
            }
            this.f22553k -= (long) i11;
            this.f22550h.position(Z0() + 1);
            this.f22550h.put(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void W(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (f1() < iRemaining) {
                this.f22538d += iRemaining;
                this.f22537c.addFirst(androidx.p001datastore.preferences.protobuf.d.j(byteBuffer));
                c1();
            } else {
                this.f22553k -= (long) iRemaining;
                this.f22550h.position(Z0() + 1);
                this.f22550h.put(byteBuffer);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void W0(int i10) {
            if ((i10 & n5.a.f132012g) == 0) {
                i1(i10);
                return;
            }
            if ((i10 & (-16384)) == 0) {
                k1(i10);
                return;
            }
            if (((-2097152) & i10) == 0) {
                j1(i10);
            } else if (((-268435456) & i10) == 0) {
                h1(i10);
            } else {
                g1(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void X(byte[] bArr, int i10, int i11) {
            if (f1() < i11) {
                this.f22538d += i11;
                this.f22537c.addFirst(androidx.p001datastore.preferences.protobuf.d.l(bArr, i10, i11));
                c1();
            } else {
                this.f22553k -= (long) i11;
                this.f22550h.position(Z0() + 1);
                this.f22550h.put(bArr, i10, i11);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void X0(long j10) {
            switch (n.a0(j10)) {
                case 1:
                    p1(j10);
                    break;
                case 2:
                    u1(j10);
                    break;
                case 3:
                    t1(j10);
                    break;
                case 4:
                    n1(j10);
                    break;
                case 5:
                    m1(j10);
                    break;
                case 6:
                    r1(j10);
                    break;
                case 7:
                    q1(j10);
                    break;
                case 8:
                    l1(j10);
                    break;
                case 9:
                    o1(j10);
                    break;
                case 10:
                    s1(j10);
                    break;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void b0() {
            if (this.f22550h != null) {
                this.f22538d += a1();
                this.f22550h.position(Z0() + 1);
                this.f22550h = null;
                this.f22553k = 0L;
                this.f22552j = 0L;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void c(int i10, int i11) {
            r0(9);
            x0(i11);
            R0(i10, 5);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        public int c0() {
            return this.f22538d + a1();
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void e(int i10, String str) {
            int iC0 = c0();
            Q0(str);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void f(int i10, long j10) {
            r0(15);
            X0(j10);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void h(int i10, int i11) {
            r0(15);
            F0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void i(int i10, ByteString byteString) {
            try {
                byteString.A0(this);
                r0(10);
                W0(byteString.size());
                R0(i10, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void k(int i10, Object obj, x2 x2Var) throws IOException {
            int iC0 = c0();
            x2Var.c(obj, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void m(int i10, long j10) {
            r0(15);
            N0(j10);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void o(int i10, int i11) {
            r0(10);
            W0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void q(int i10, long j10) {
            r0(13);
            A0(j10);
            R0(i10, 1);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void r0(int i10) {
            if (f1() < i10) {
                d1(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void s(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void u(int i10) {
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void w(int i10) {
            R0(i10, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void x0(int i10) {
            long j10 = this.f22553k;
            this.f22553k = j10 - 1;
            z3.b0(j10, (byte) ((i10 >> 24) & 255));
            long j11 = this.f22553k;
            this.f22553k = j11 - 1;
            z3.b0(j11, (byte) ((i10 >> 16) & 255));
            long j12 = this.f22553k;
            this.f22553k = j12 - 1;
            z3.b0(j12, (byte) ((i10 >> 8) & 255));
            long j13 = this.f22553k;
            this.f22553k = j13 - 1;
            z3.b0(j13, (byte) (i10 & 255));
        }
    }

    /* JADX INFO: compiled from: BinaryWriter.java */
    public static final class e extends n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private androidx.p001datastore.preferences.protobuf.d f22554h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f22555i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f22556j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f22557k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f22558l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f22559m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f22560n;

        e(r rVar, int i10) {
            super(rVar, i10, null);
            b1();
        }

        private int Y0() {
            return (int) this.f22560n;
        }

        static boolean a1() {
            return z3.S();
        }

        private void b1() {
            d1(j0());
        }

        private void c1(int i10) {
            d1(k0(i10));
        }

        private void d1(androidx.p001datastore.preferences.protobuf.d dVar) {
            if (!dVar.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f22537c.addFirst(dVar);
            this.f22554h = dVar;
            this.f22555i = dVar.a();
            int iB = dVar.b();
            this.f22557k = dVar.e() + iB;
            long jG = iB + dVar.g();
            this.f22556j = jG;
            this.f22558l = jG - 1;
            long j10 = this.f22557k - 1;
            this.f22559m = j10;
            this.f22560n = j10;
        }

        private void f1(int i10) {
            byte[] bArr = this.f22555i;
            long j10 = this.f22560n;
            this.f22560n = j10 - 1;
            z3.d0(bArr, j10, (byte) (i10 >>> 28));
            byte[] bArr2 = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr2, j11, (byte) (((i10 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr3, j12, (byte) (((i10 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr4, j13, (byte) (((i10 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr5, j14, (byte) ((i10 & 127) | 128));
        }

        private void g1(int i10) {
            byte[] bArr = this.f22555i;
            long j10 = this.f22560n;
            this.f22560n = j10 - 1;
            z3.d0(bArr, j10, (byte) (i10 >>> 21));
            byte[] bArr2 = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr2, j11, (byte) (((i10 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr3, j12, (byte) (((i10 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr4, j13, (byte) ((i10 & 127) | 128));
        }

        private void h1(int i10) {
            byte[] bArr = this.f22555i;
            long j10 = this.f22560n;
            this.f22560n = j10 - 1;
            z3.d0(bArr, j10, (byte) i10);
        }

        private void i1(int i10) {
            byte[] bArr = this.f22555i;
            long j10 = this.f22560n;
            this.f22560n = j10 - 1;
            z3.d0(bArr, j10, (byte) (i10 >>> 14));
            byte[] bArr2 = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr2, j11, (byte) (((i10 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr3, j12, (byte) ((i10 & 127) | 128));
        }

        private void j1(int i10) {
            byte[] bArr = this.f22555i;
            long j10 = this.f22560n;
            this.f22560n = j10 - 1;
            z3.d0(bArr, j10, (byte) (i10 >>> 7));
            byte[] bArr2 = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr2, j11, (byte) ((i10 & 127) | 128));
        }

        private void k1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (j10 >>> 49));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((j10 >>> 42) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) (((j10 >>> 35) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr4, j14, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr5 = this.f22555i;
            long j15 = this.f22560n;
            this.f22560n = j15 - 1;
            z3.d0(bArr5, j15, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr6 = this.f22555i;
            long j16 = this.f22560n;
            this.f22560n = j16 - 1;
            z3.d0(bArr6, j16, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr7 = this.f22555i;
            long j17 = this.f22560n;
            this.f22560n = j17 - 1;
            z3.d0(bArr7, j17, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr8 = this.f22555i;
            long j18 = this.f22560n;
            this.f22560n = j18 - 1;
            z3.d0(bArr8, j18, (byte) ((j10 & 127) | 128));
        }

        private void l1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (j10 >>> 28));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr4, j14, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f22555i;
            long j15 = this.f22560n;
            this.f22560n = j15 - 1;
            z3.d0(bArr5, j15, (byte) ((j10 & 127) | 128));
        }

        private void m1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (j10 >>> 21));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr4, j14, (byte) ((j10 & 127) | 128));
        }

        private void n1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (j10 >>> 56));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((j10 >>> 49) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) (((j10 >>> 42) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr4, j14, (byte) (((j10 >>> 35) & 127) | 128));
            byte[] bArr5 = this.f22555i;
            long j15 = this.f22560n;
            this.f22560n = j15 - 1;
            z3.d0(bArr5, j15, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr6 = this.f22555i;
            long j16 = this.f22560n;
            this.f22560n = j16 - 1;
            z3.d0(bArr6, j16, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr7 = this.f22555i;
            long j17 = this.f22560n;
            this.f22560n = j17 - 1;
            z3.d0(bArr7, j17, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr8 = this.f22555i;
            long j18 = this.f22560n;
            this.f22560n = j18 - 1;
            z3.d0(bArr8, j18, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr9 = this.f22555i;
            long j19 = this.f22560n;
            this.f22560n = j19 - 1;
            z3.d0(bArr9, j19, (byte) ((j10 & 127) | 128));
        }

        private void o1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) j10);
        }

        private void p1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (j10 >>> 42));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((j10 >>> 35) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr4, j14, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr5 = this.f22555i;
            long j15 = this.f22560n;
            this.f22560n = j15 - 1;
            z3.d0(bArr5, j15, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr6 = this.f22555i;
            long j16 = this.f22560n;
            this.f22560n = j16 - 1;
            z3.d0(bArr6, j16, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr7 = this.f22555i;
            long j17 = this.f22560n;
            this.f22560n = j17 - 1;
            z3.d0(bArr7, j17, (byte) ((j10 & 127) | 128));
        }

        private void q1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (j10 >>> 35));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr4, j14, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr5 = this.f22555i;
            long j15 = this.f22560n;
            this.f22560n = j15 - 1;
            z3.d0(bArr5, j15, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr6 = this.f22555i;
            long j16 = this.f22560n;
            this.f22560n = j16 - 1;
            z3.d0(bArr6, j16, (byte) ((j10 & 127) | 128));
        }

        private void r1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (j10 >>> 63));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((j10 >>> 56) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) (((j10 >>> 49) & 127) | 128));
            byte[] bArr4 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr4, j14, (byte) (((j10 >>> 42) & 127) | 128));
            byte[] bArr5 = this.f22555i;
            long j15 = this.f22560n;
            this.f22560n = j15 - 1;
            z3.d0(bArr5, j15, (byte) (((j10 >>> 35) & 127) | 128));
            byte[] bArr6 = this.f22555i;
            long j16 = this.f22560n;
            this.f22560n = j16 - 1;
            z3.d0(bArr6, j16, (byte) (((j10 >>> 28) & 127) | 128));
            byte[] bArr7 = this.f22555i;
            long j17 = this.f22560n;
            this.f22560n = j17 - 1;
            z3.d0(bArr7, j17, (byte) (((j10 >>> 21) & 127) | 128));
            byte[] bArr8 = this.f22555i;
            long j18 = this.f22560n;
            this.f22560n = j18 - 1;
            z3.d0(bArr8, j18, (byte) (((j10 >>> 14) & 127) | 128));
            byte[] bArr9 = this.f22555i;
            long j19 = this.f22560n;
            this.f22560n = j19 - 1;
            z3.d0(bArr9, j19, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr10 = this.f22555i;
            long j20 = this.f22560n;
            this.f22560n = j20 - 1;
            z3.d0(bArr10, j20, (byte) ((j10 & 127) | 128));
        }

        private void s1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (((int) j10) >>> 14));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((j10 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) ((j10 & 127) | 128));
        }

        private void t1(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (j10 >>> 7));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) ((((int) j10) & 127) | 128));
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void A0(long j10) {
            byte[] bArr = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr, j11, (byte) (((int) (j10 >> 56)) & 255));
            byte[] bArr2 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr2, j12, (byte) (((int) (j10 >> 48)) & 255));
            byte[] bArr3 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr3, j13, (byte) (((int) (j10 >> 40)) & 255));
            byte[] bArr4 = this.f22555i;
            long j14 = this.f22560n;
            this.f22560n = j14 - 1;
            z3.d0(bArr4, j14, (byte) (((int) (j10 >> 32)) & 255));
            byte[] bArr5 = this.f22555i;
            long j15 = this.f22560n;
            this.f22560n = j15 - 1;
            z3.d0(bArr5, j15, (byte) (((int) (j10 >> 24)) & 255));
            byte[] bArr6 = this.f22555i;
            long j16 = this.f22560n;
            this.f22560n = j16 - 1;
            z3.d0(bArr6, j16, (byte) (((int) (j10 >> 16)) & 255));
            byte[] bArr7 = this.f22555i;
            long j17 = this.f22560n;
            this.f22560n = j17 - 1;
            z3.d0(bArr7, j17, (byte) (((int) (j10 >> 8)) & 255));
            byte[] bArr8 = this.f22555i;
            long j18 = this.f22560n;
            this.f22560n = j18 - 1;
            z3.d0(bArr8, j18, (byte) (((int) j10) & 255));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void F(int i10, Object obj, x2 x2Var) throws IOException {
            R0(i10, 4);
            x2Var.c(obj, this);
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void F0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void K(int i10, Object obj) throws IOException {
            int iC0 = c0();
            r2.a().k(obj, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void K0(int i10) {
            W0(CodedOutputStream.c1(i10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void N0(long j10) {
            X0(CodedOutputStream.d1(j10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void O(int i10, Object obj) throws IOException {
            R0(i10, 4);
            r2.a().k(obj, this);
            R0(i10, 3);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:19:0x004c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0054  */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        /* JADX WARN: Code duplicated, block: B:24:0x0078  */
        /* JADX WARN: Code duplicated, block: B:26:0x007d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0086  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:37:0x011e  */
        /* JADX WARN: Code duplicated, block: B:43:0x0116 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0116 A[SYNTHETIC] */
        @Override // androidx.p001datastore.preferences.protobuf.n
        void Q0(String str) {
            long j10;
            char cCharAt;
            long j11;
            char cCharAt2;
            r0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.f22555i;
                long j12 = this.f22560n;
                this.f22560n = j12 - 1;
                z3.d0(bArr, j12, (byte) cCharAt2);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char cCharAt3 = str.charAt(length);
                if (cCharAt3 < 128) {
                    long j13 = this.f22560n;
                    if (j13 > this.f22558l) {
                        byte[] bArr2 = this.f22555i;
                        this.f22560n = j13 - 1;
                        z3.d0(bArr2, j13, (byte) cCharAt3);
                    } else if (cCharAt3 < 2048) {
                        j11 = this.f22560n;
                        if (j11 > this.f22556j) {
                            byte[] bArr3 = this.f22555i;
                            this.f22560n = j11 - 1;
                            z3.d0(bArr3, j11, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr4 = this.f22555i;
                            long j14 = this.f22560n;
                            this.f22560n = j14 - 1;
                            z3.d0(bArr4, j14, (byte) ((cCharAt3 >>> 6) | bb.c.b.f31065yf));
                        } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                            j10 = this.f22560n;
                            if (j10 > this.f22556j + 1) {
                                byte[] bArr5 = this.f22555i;
                                this.f22560n = j10 - 1;
                                z3.d0(bArr5, j10, (byte) ((cCharAt3 & '?') | 128));
                                byte[] bArr6 = this.f22555i;
                                long j15 = this.f22560n;
                                this.f22560n = j15 - 1;
                                z3.d0(bArr6, j15, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                byte[] bArr7 = this.f22555i;
                                long j16 = this.f22560n;
                                this.f22560n = j16 - 1;
                                z3.d0(bArr7, j16, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f22560n > this.f22556j + 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                            byte[] bArr8 = this.f22555i;
                                            long j17 = this.f22560n;
                                            this.f22560n = j17 - 1;
                                            z3.d0(bArr8, j17, (byte) ((codePoint & 63) | 128));
                                            byte[] bArr9 = this.f22555i;
                                            long j18 = this.f22560n;
                                            this.f22560n = j18 - 1;
                                            z3.d0(bArr9, j18, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byte[] bArr10 = this.f22555i;
                                            long j19 = this.f22560n;
                                            this.f22560n = j19 - 1;
                                            z3.d0(bArr10, j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                            byte[] bArr11 = this.f22555i;
                                            long j20 = this.f22560n;
                                            this.f22560n = j20 - 1;
                                            z3.d0(bArr11, j20, (byte) ((codePoint >>> 18) | 240));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                r0(length);
                                length++;
                            }
                        } else {
                            if (this.f22560n > this.f22556j + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr12 = this.f22555i;
                                        long j110 = this.f22560n;
                                        this.f22560n = j110 - 1;
                                        z3.d0(bArr12, j110, (byte) ((codePoint2 & 63) | 128));
                                        byte[] bArr13 = this.f22555i;
                                        long j111 = this.f22560n;
                                        this.f22560n = j111 - 1;
                                        z3.d0(bArr13, j111, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        byte[] bArr14 = this.f22555i;
                                        long j112 = this.f22560n;
                                        this.f22560n = j112 - 1;
                                        z3.d0(bArr14, j112, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        byte[] bArr15 = this.f22555i;
                                        long j21 = this.f22560n;
                                        this.f22560n = j21 - 1;
                                        z3.d0(bArr15, j21, (byte) ((codePoint2 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else if (cCharAt3 >= 55296) {
                        j10 = this.f22560n;
                        if (j10 > this.f22556j + 1) {
                            byte[] bArr16 = this.f22555i;
                            this.f22560n = j10 - 1;
                            z3.d0(bArr16, j10, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr17 = this.f22555i;
                            long j113 = this.f22560n;
                            this.f22560n = j113 - 1;
                            z3.d0(bArr17, j113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr18 = this.f22555i;
                            long j114 = this.f22560n;
                            this.f22560n = j114 - 1;
                            z3.d0(bArr18, j114, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f22560n > this.f22556j + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr19 = this.f22555i;
                                        long j115 = this.f22560n;
                                        this.f22560n = j115 - 1;
                                        z3.d0(bArr19, j115, (byte) ((codePoint3 & 63) | 128));
                                        byte[] bArr110 = this.f22555i;
                                        long j116 = this.f22560n;
                                        this.f22560n = j116 - 1;
                                        z3.d0(bArr110, j116, (byte) (((codePoint3 >>> 6) & 63) | 128));
                                        byte[] bArr111 = this.f22555i;
                                        long j117 = this.f22560n;
                                        this.f22560n = j117 - 1;
                                        z3.d0(bArr111, j117, (byte) (((codePoint3 >>> 12) & 63) | 128));
                                        byte[] bArr112 = this.f22555i;
                                        long j22 = this.f22560n;
                                        this.f22560n = j22 - 1;
                                        z3.d0(bArr112, j22, (byte) ((codePoint3 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else {
                        j10 = this.f22560n;
                        if (j10 > this.f22556j + 1) {
                            byte[] bArr113 = this.f22555i;
                            this.f22560n = j10 - 1;
                            z3.d0(bArr113, j10, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr114 = this.f22555i;
                            long j118 = this.f22560n;
                            this.f22560n = j118 - 1;
                            z3.d0(bArr114, j118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr115 = this.f22555i;
                            long j119 = this.f22560n;
                            this.f22560n = j119 - 1;
                            z3.d0(bArr115, j119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f22560n > this.f22556j + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr116 = this.f22555i;
                                        long j1110 = this.f22560n;
                                        this.f22560n = j1110 - 1;
                                        z3.d0(bArr116, j1110, (byte) ((codePoint4 & 63) | 128));
                                        byte[] bArr117 = this.f22555i;
                                        long j1111 = this.f22560n;
                                        this.f22560n = j1111 - 1;
                                        z3.d0(bArr117, j1111, (byte) (((codePoint4 >>> 6) & 63) | 128));
                                        byte[] bArr118 = this.f22555i;
                                        long j1112 = this.f22560n;
                                        this.f22560n = j1112 - 1;
                                        z3.d0(bArr118, j1112, (byte) (((codePoint4 >>> 12) & 63) | 128));
                                        byte[] bArr119 = this.f22555i;
                                        long j23 = this.f22560n;
                                        this.f22560n = j23 - 1;
                                        z3.d0(bArr119, j23, (byte) ((codePoint4 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 < 2048) {
                    j11 = this.f22560n;
                    if (j11 > this.f22556j) {
                        byte[] bArr20 = this.f22555i;
                        this.f22560n = j11 - 1;
                        z3.d0(bArr20, j11, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr21 = this.f22555i;
                        long j120 = this.f22560n;
                        this.f22560n = j120 - 1;
                        z3.d0(bArr21, j120, (byte) ((cCharAt3 >>> 6) | bb.c.b.f31065yf));
                    } else if (cCharAt3 >= 55296) {
                        j10 = this.f22560n;
                        if (j10 > this.f22556j + 1) {
                            byte[] bArr1110 = this.f22555i;
                            this.f22560n = j10 - 1;
                            z3.d0(bArr1110, j10, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr1111 = this.f22555i;
                            long j1113 = this.f22560n;
                            this.f22560n = j1113 - 1;
                            z3.d0(bArr1111, j1113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr1112 = this.f22555i;
                            long j1114 = this.f22560n;
                            this.f22560n = j1114 - 1;
                            z3.d0(bArr1112, j1114, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f22560n > this.f22556j + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr1113 = this.f22555i;
                                        long j1115 = this.f22560n;
                                        this.f22560n = j1115 - 1;
                                        z3.d0(bArr1113, j1115, (byte) ((codePoint5 & 63) | 128));
                                        byte[] bArr1114 = this.f22555i;
                                        long j1116 = this.f22560n;
                                        this.f22560n = j1116 - 1;
                                        z3.d0(bArr1114, j1116, (byte) (((codePoint5 >>> 6) & 63) | 128));
                                        byte[] bArr1115 = this.f22555i;
                                        long j1117 = this.f22560n;
                                        this.f22560n = j1117 - 1;
                                        z3.d0(bArr1115, j1117, (byte) (((codePoint5 >>> 12) & 63) | 128));
                                        byte[] bArr1116 = this.f22555i;
                                        long j24 = this.f22560n;
                                        this.f22560n = j24 - 1;
                                        z3.d0(bArr1116, j24, (byte) ((codePoint5 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else {
                        j10 = this.f22560n;
                        if (j10 > this.f22556j + 1) {
                            byte[] bArr1117 = this.f22555i;
                            this.f22560n = j10 - 1;
                            z3.d0(bArr1117, j10, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr1118 = this.f22555i;
                            long j1118 = this.f22560n;
                            this.f22560n = j1118 - 1;
                            z3.d0(bArr1118, j1118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr1119 = this.f22555i;
                            long j1119 = this.f22560n;
                            this.f22560n = j1119 - 1;
                            z3.d0(bArr1119, j1119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f22560n > this.f22556j + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr11110 = this.f22555i;
                                        long j11110 = this.f22560n;
                                        this.f22560n = j11110 - 1;
                                        z3.d0(bArr11110, j11110, (byte) ((codePoint6 & 63) | 128));
                                        byte[] bArr11111 = this.f22555i;
                                        long j11111 = this.f22560n;
                                        this.f22560n = j11111 - 1;
                                        z3.d0(bArr11111, j11111, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                        byte[] bArr11112 = this.f22555i;
                                        long j11112 = this.f22560n;
                                        this.f22560n = j11112 - 1;
                                        z3.d0(bArr11112, j11112, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                        byte[] bArr11113 = this.f22555i;
                                        long j25 = this.f22560n;
                                        this.f22560n = j25 - 1;
                                        z3.d0(bArr11113, j25, (byte) ((codePoint6 >>> 18) | 240));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 >= 55296) {
                    j10 = this.f22560n;
                    if (j10 > this.f22556j + 1) {
                        byte[] bArr11114 = this.f22555i;
                        this.f22560n = j10 - 1;
                        z3.d0(bArr11114, j10, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr11115 = this.f22555i;
                        long j11113 = this.f22560n;
                        this.f22560n = j11113 - 1;
                        z3.d0(bArr11115, j11113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        byte[] bArr11116 = this.f22555i;
                        long j11114 = this.f22560n;
                        this.f22560n = j11114 - 1;
                        z3.d0(bArr11116, j11114, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.f22560n > this.f22556j + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                    byte[] bArr11117 = this.f22555i;
                                    long j11115 = this.f22560n;
                                    this.f22560n = j11115 - 1;
                                    z3.d0(bArr11117, j11115, (byte) ((codePoint7 & 63) | 128));
                                    byte[] bArr11118 = this.f22555i;
                                    long j11116 = this.f22560n;
                                    this.f22560n = j11116 - 1;
                                    z3.d0(bArr11118, j11116, (byte) (((codePoint7 >>> 6) & 63) | 128));
                                    byte[] bArr11119 = this.f22555i;
                                    long j11117 = this.f22560n;
                                    this.f22560n = j11117 - 1;
                                    z3.d0(bArr11119, j11117, (byte) (((codePoint7 >>> 12) & 63) | 128));
                                    byte[] bArr111110 = this.f22555i;
                                    long j26 = this.f22560n;
                                    this.f22560n = j26 - 1;
                                    z3.d0(bArr111110, j26, (byte) ((codePoint7 >>> 18) | 240));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        r0(length);
                        length++;
                    }
                } else {
                    j10 = this.f22560n;
                    if (j10 > this.f22556j + 1) {
                        byte[] bArr111111 = this.f22555i;
                        this.f22560n = j10 - 1;
                        z3.d0(bArr111111, j10, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr111112 = this.f22555i;
                        long j11118 = this.f22560n;
                        this.f22560n = j11118 - 1;
                        z3.d0(bArr111112, j11118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        byte[] bArr111113 = this.f22555i;
                        long j11119 = this.f22560n;
                        this.f22560n = j11119 - 1;
                        z3.d0(bArr111113, j11119, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.f22560n > this.f22556j + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                    byte[] bArr111114 = this.f22555i;
                                    long j111110 = this.f22560n;
                                    this.f22560n = j111110 - 1;
                                    z3.d0(bArr111114, j111110, (byte) ((codePoint8 & 63) | 128));
                                    byte[] bArr111115 = this.f22555i;
                                    long j111111 = this.f22560n;
                                    this.f22560n = j111111 - 1;
                                    z3.d0(bArr111115, j111111, (byte) (((codePoint8 >>> 6) & 63) | 128));
                                    byte[] bArr111116 = this.f22555i;
                                    long j111112 = this.f22560n;
                                    this.f22560n = j111112 - 1;
                                    z3.d0(bArr111116, j111112, (byte) (((codePoint8 >>> 12) & 63) | 128));
                                    byte[] bArr111117 = this.f22555i;
                                    long j27 = this.f22560n;
                                    this.f22560n = j27 - 1;
                                    z3.d0(bArr111117, j27, (byte) ((codePoint8 >>> 18) | 240));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        r0(length);
                        length++;
                    }
                }
                length--;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void R0(int i10, int i11) {
            W0(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void S(int i10, int i11) {
            r0(10);
            K0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void T(byte b10) {
            byte[] bArr = this.f22555i;
            long j10 = this.f22560n;
            this.f22560n = j10 - 1;
            z3.d0(bArr, j10, b10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void U(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            r0(iRemaining);
            this.f22560n -= (long) iRemaining;
            byteBuffer.get(this.f22555i, Y0() + 1, iRemaining);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void V(byte[] bArr, int i10, int i11) {
            if (i10 < 0 || i10 + i11 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            r0(i11);
            this.f22560n -= (long) i11;
            System.arraycopy(bArr, i10, this.f22555i, Y0() + 1, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void W(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (e1() < iRemaining) {
                this.f22538d += iRemaining;
                this.f22537c.addFirst(androidx.p001datastore.preferences.protobuf.d.j(byteBuffer));
                b1();
            }
            this.f22560n -= (long) iRemaining;
            byteBuffer.get(this.f22555i, Y0() + 1, iRemaining);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void W0(int i10) {
            if ((i10 & n5.a.f132012g) == 0) {
                h1(i10);
                return;
            }
            if ((i10 & (-16384)) == 0) {
                j1(i10);
                return;
            }
            if (((-2097152) & i10) == 0) {
                i1(i10);
            } else if (((-268435456) & i10) == 0) {
                g1(i10);
            } else {
                f1(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.t
        public void X(byte[] bArr, int i10, int i11) {
            if (i10 < 0 || i10 + i11 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            if (e1() >= i11) {
                this.f22560n -= (long) i11;
                System.arraycopy(bArr, i10, this.f22555i, Y0() + 1, i11);
            } else {
                this.f22538d += i11;
                this.f22537c.addFirst(androidx.p001datastore.preferences.protobuf.d.l(bArr, i10, i11));
                b1();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void X0(long j10) {
            switch (n.a0(j10)) {
                case 1:
                    o1(j10);
                    break;
                case 2:
                    t1(j10);
                    break;
                case 3:
                    s1(j10);
                    break;
                case 4:
                    m1(j10);
                    break;
                case 5:
                    l1(j10);
                    break;
                case 6:
                    q1(j10);
                    break;
                case 7:
                    p1(j10);
                    break;
                case 8:
                    k1(j10);
                    break;
                case 9:
                    n1(j10);
                    break;
                case 10:
                    r1(j10);
                    break;
            }
        }

        int Z0() {
            return (int) (this.f22559m - this.f22560n);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void b0() {
            if (this.f22554h != null) {
                this.f22538d += Z0();
                this.f22554h.h((Y0() - this.f22554h.b()) + 1);
                this.f22554h = null;
                this.f22560n = 0L;
                this.f22559m = 0L;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void c(int i10, int i11) {
            r0(9);
            x0(i11);
            R0(i10, 5);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        public int c0() {
            return this.f22538d + Z0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void e(int i10, String str) {
            int iC0 = c0();
            Q0(str);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        int e1() {
            return (int) (this.f22560n - this.f22558l);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void f(int i10, long j10) {
            r0(15);
            X0(j10);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void h(int i10, int i11) {
            r0(15);
            F0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void i(int i10, ByteString byteString) {
            try {
                byteString.A0(this);
                r0(10);
                W0(byteString.size());
                R0(i10, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void k(int i10, Object obj, x2 x2Var) throws IOException {
            int iC0 = c0();
            x2Var.c(obj, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(i10, 2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void m(int i10, long j10) {
            r0(15);
            N0(j10);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void o(int i10, int i11) {
            r0(10);
            W0(i11);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void q(int i10, long j10) {
            r0(13);
            A0(j10);
            R0(i10, 1);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void r0(int i10) {
            if (e1() < i10) {
                c1(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void s(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void u(int i10) {
            R0(i10, 3);
        }

        @Override // androidx.p001datastore.preferences.protobuf.Writer
        public void w(int i10) {
            R0(i10, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.n
        void x0(int i10) {
            byte[] bArr = this.f22555i;
            long j10 = this.f22560n;
            this.f22560n = j10 - 1;
            z3.d0(bArr, j10, (byte) ((i10 >> 24) & 255));
            byte[] bArr2 = this.f22555i;
            long j11 = this.f22560n;
            this.f22560n = j11 - 1;
            z3.d0(bArr2, j11, (byte) ((i10 >> 16) & 255));
            byte[] bArr3 = this.f22555i;
            long j12 = this.f22560n;
            this.f22560n = j12 - 1;
            z3.d0(bArr3, j12, (byte) ((i10 >> 8) & 255));
            byte[] bArr4 = this.f22555i;
            long j13 = this.f22560n;
            this.f22560n = j13 - 1;
            z3.d0(bArr4, j13, (byte) (i10 & 255));
        }
    }

    private n(r rVar, int i10) {
        this.f22537c = new ArrayDeque<>(4);
        if (i10 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.f22535a = (r) i1.e(rVar, "alloc");
        this.f22536b = i10;
    }

    /* synthetic */ n(r rVar, int i10, a aVar) {
        this(rVar, i10);
    }

    private final void B0(int i10, r1 r1Var, boolean z10) throws IOException {
        if (!z10) {
            for (int size = r1Var.size() - 1; size >= 0; size--) {
                q(i10, r1Var.getLong(size));
            }
            return;
        }
        r0((r1Var.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = r1Var.size() - 1; size2 >= 0; size2--) {
            A0(r1Var.getLong(size2));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void C0(int i10, List<Long> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                q(i10, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(list.get(size2).longValue());
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void D0(int i10, z0 z0Var, boolean z10) throws IOException {
        if (!z10) {
            for (int size = z0Var.size() - 1; size >= 0; size--) {
                P(i10, z0Var.getFloat(size));
            }
            return;
        }
        r0((z0Var.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = z0Var.size() - 1; size2 >= 0; size2--) {
            x0(Float.floatToRawIntBits(z0Var.getFloat(size2)));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void E0(int i10, List<Float> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                P(i10, list.get(size).floatValue());
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void G0(int i10, h1 h1Var, boolean z10) throws IOException {
        if (!z10) {
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                h(i10, h1Var.getInt(size));
            }
            return;
        }
        r0((h1Var.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = h1Var.size() - 1; size2 >= 0; size2--) {
            F0(h1Var.getInt(size2));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void H0(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                h(i10, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            F0(list.get(size2).intValue());
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private void I0(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            e(i10, (String) obj);
        } else {
            i(i10, (ByteString) obj);
        }
    }

    static final void J0(Writer writer, int i10, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f22539a[fieldType.ordinal()]) {
            case 1:
                writer.s(i10, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.c(i10, ((Integer) obj).intValue());
                return;
            case 3:
                writer.q(i10, ((Long) obj).longValue());
                return;
            case 4:
                writer.h(i10, ((Integer) obj).intValue());
                return;
            case 5:
                writer.L(i10, ((Long) obj).longValue());
                return;
            case 6:
                writer.t(i10, ((Integer) obj).intValue());
                return;
            case 7:
                writer.C(i10, ((Long) obj).longValue());
                return;
            case 8:
                writer.S(i10, ((Integer) obj).intValue());
                return;
            case 9:
                writer.m(i10, ((Long) obj).longValue());
                return;
            case 10:
                writer.e(i10, (String) obj);
                return;
            case 11:
                writer.o(i10, ((Integer) obj).intValue());
                return;
            case 12:
                writer.f(i10, ((Long) obj).longValue());
                return;
            case 13:
                writer.P(i10, ((Float) obj).floatValue());
                return;
            case 14:
                writer.G(i10, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.K(i10, obj);
                return;
            case 16:
                writer.i(i10, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof i1.c) {
                    writer.Q(i10, ((i1.c) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.Q(i10, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private final void L0(int i10, h1 h1Var, boolean z10) throws IOException {
        if (!z10) {
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                S(i10, h1Var.getInt(size));
            }
            return;
        }
        r0((h1Var.size() * 5) + 10);
        int iC0 = c0();
        for (int size2 = h1Var.size() - 1; size2 >= 0; size2--) {
            K0(h1Var.getInt(size2));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void M0(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                S(i10, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 5) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            K0(list.get(size2).intValue());
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void O0(int i10, r1 r1Var, boolean z10) throws IOException {
        if (!z10) {
            for (int size = r1Var.size() - 1; size >= 0; size--) {
                m(i10, r1Var.getLong(size));
            }
            return;
        }
        r0((r1Var.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = r1Var.size() - 1; size2 >= 0; size2--) {
            N0(r1Var.getLong(size2));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void P0(int i10, List<Long> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                m(i10, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            N0(list.get(size2).longValue());
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void S0(int i10, h1 h1Var, boolean z10) throws IOException {
        if (!z10) {
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                o(i10, h1Var.getInt(size));
            }
            return;
        }
        r0((h1Var.size() * 5) + 10);
        int iC0 = c0();
        for (int size2 = h1Var.size() - 1; size2 >= 0; size2--) {
            W0(h1Var.getInt(size2));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void T0(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                o(i10, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 5) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            W0(list.get(size2).intValue());
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void U0(int i10, r1 r1Var, boolean z10) throws IOException {
        if (!z10) {
            for (int size = r1Var.size() - 1; size >= 0; size--) {
                f(i10, r1Var.getLong(size));
            }
            return;
        }
        r0((r1Var.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = r1Var.size() - 1; size2 >= 0; size2--) {
            X0(r1Var.getLong(size2));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void V0(int i10, List<Long> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                f(i10, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            X0(list.get(size2).longValue());
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte a0(long j10) {
        byte b10;
        if (((-128) & j10) == 0) {
            return (byte) 1;
        }
        if (j10 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j10) != 0) {
            b10 = (byte) 6;
            j10 >>>= 28;
        } else {
            b10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            b10 = (byte) (b10 + 2);
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? (byte) (b10 + 1) : b10;
    }

    static boolean d0() {
        return d.b1();
    }

    static boolean e0() {
        return e.a1();
    }

    public static n h0(r rVar) {
        return i0(rVar, 4096);
    }

    public static n i0(r rVar, int i10) {
        return d0() ? p0(rVar, i10) : n0(rVar, i10);
    }

    public static n l0(r rVar) {
        return m0(rVar, 4096);
    }

    public static n m0(r rVar, int i10) {
        return e0() ? q0(rVar, i10) : o0(rVar, i10);
    }

    static n n0(r rVar, int i10) {
        return new b(rVar, i10);
    }

    static n o0(r rVar, int i10) {
        return new c(rVar, i10);
    }

    static n p0(r rVar, int i10) {
        if (d0()) {
            return new d(rVar, i10);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static n q0(r rVar, int i10) {
        if (e0()) {
            return new e(rVar, i10);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private final void t0(int i10, q qVar, boolean z10) throws IOException {
        if (!z10) {
            for (int size = qVar.size() - 1; size >= 0; size--) {
                s(i10, qVar.getBoolean(size));
            }
            return;
        }
        r0(qVar.size() + 10);
        int iC0 = c0();
        for (int size2 = qVar.size() - 1; size2 >= 0; size2--) {
            s0(qVar.getBoolean(size2));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void u0(int i10, List<Boolean> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                s(i10, list.get(size).booleanValue());
            }
            return;
        }
        r0(list.size() + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            s0(list.get(size2).booleanValue());
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void v0(int i10, z zVar, boolean z10) throws IOException {
        if (!z10) {
            for (int size = zVar.size() - 1; size >= 0; size--) {
                G(i10, zVar.getDouble(size));
            }
            return;
        }
        r0((zVar.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = zVar.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(zVar.getDouble(size2)));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void w0(int i10, List<Double> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                G(i10, list.get(size).doubleValue());
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void y0(int i10, h1 h1Var, boolean z10) throws IOException {
        if (!z10) {
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                c(i10, h1Var.getInt(size));
            }
            return;
        }
        r0((h1Var.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = h1Var.size() - 1; size2 >= 0; size2--) {
            x0(h1Var.getInt(size2));
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    private final void z0(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!z10) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c(i10, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(list.get(size2).intValue());
        }
        W0(c0() - iC0);
        R0(i10, 2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void A(int i10, List<String> list) throws IOException {
        if (!(list instanceof n1)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                e(i10, list.get(size));
            }
            return;
        }
        n1 n1Var = (n1) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            I0(i10, n1Var.T1(size2));
        }
    }

    abstract void A0(long j10);

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void B(int i10, List<?> list, x2 x2Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            F(i10, list.get(size), x2Var);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void C(int i10, long j10) throws IOException {
        q(i10, j10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void D(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof r1) {
            O0(i10, (r1) list, z10);
        } else {
            P0(i10, list, z10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void E(int i10, List<Integer> list, boolean z10) throws IOException {
        g(i10, list, z10);
    }

    abstract void F0(int i10);

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void G(int i10, double d10) throws IOException {
        q(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void H(int i10, List<Long> list, boolean z10) throws IOException {
        v(i10, list, z10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder I() {
        return Writer.FieldOrder.DESCENDING;
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void J(int i10, List<?> list, x2 x2Var) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            k(i10, list.get(size), x2Var);
        }
    }

    abstract void K0(int i10);

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void L(int i10, long j10) throws IOException {
        f(i10, j10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void M(int i10, List<Integer> list, boolean z10) throws IOException {
        j(i10, list, z10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void N(int i10, List<Boolean> list, boolean z10) throws IOException {
        if (list instanceof q) {
            t0(i10, (q) list, z10);
        } else {
            u0(i10, list, z10);
        }
    }

    abstract void N0(long j10);

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void P(int i10, float f10) throws IOException {
        c(i10, Float.floatToRawIntBits(f10));
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void Q(int i10, int i11) throws IOException {
        h(i10, i11);
    }

    abstract void Q0(String str);

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void R(int i10, List<Long> list, boolean z10) throws IOException {
        p(i10, list, z10);
    }

    abstract void R0(int i10, int i11);

    abstract void W0(int i10);

    abstract void X0(long j10);

    public final Queue<androidx.p001datastore.preferences.protobuf.d> Z() {
        b0();
        return this.f22537c;
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void a(int i10, List<Float> list, boolean z10) throws IOException {
        if (list instanceof z0) {
            D0(i10, (z0) list, z10);
        } else {
            E0(i10, list, z10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void b(int i10, Object obj) throws IOException {
        R0(1, 4);
        if (obj instanceof ByteString) {
            i(3, (ByteString) obj);
        } else {
            K(3, obj);
        }
        o(2, i10);
        R0(1, 3);
    }

    abstract void b0();

    public abstract int c0();

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void d(int i10, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            O(i10, list.get(size));
        }
    }

    final androidx.p001datastore.preferences.protobuf.d f0() {
        return this.f22535a.a(this.f22536b);
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void g(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof h1) {
            G0(i10, (h1) list, z10);
        } else {
            H0(i10, list, z10);
        }
    }

    final androidx.p001datastore.preferences.protobuf.d g0(int i10) {
        return this.f22535a.a(Math.max(i10, this.f22536b));
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void j(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof h1) {
            y0(i10, (h1) list, z10);
        } else {
            z0(i10, list, z10);
        }
    }

    final androidx.p001datastore.preferences.protobuf.d j0() {
        return this.f22535a.b(this.f22536b);
    }

    final androidx.p001datastore.preferences.protobuf.d k0(int i10) {
        return this.f22535a.b(Math.max(i10, this.f22536b));
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void l(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof h1) {
            S0(i10, (h1) list, z10);
        } else {
            T0(i10, list, z10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public <K, V> void n(int i10, t1.b<K, V> bVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int iC0 = c0();
            J0(this, 2, bVar.f22639c, entry.getValue());
            J0(this, 1, bVar.f22637a, entry.getKey());
            W0(c0() - iC0);
            R0(i10, 2);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void p(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof r1) {
            U0(i10, (r1) list, z10);
        } else {
            V0(i10, list, z10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void r(int i10, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            K(i10, list.get(size));
        }
    }

    abstract void r0(int i10);

    abstract void s0(boolean z10);

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void t(int i10, int i11) throws IOException {
        c(i10, i11);
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void v(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof r1) {
            B0(i10, (r1) list, z10);
        } else {
            C0(i10, list, z10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void x(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof h1) {
            L0(i10, (h1) list, z10);
        } else {
            M0(i10, list, z10);
        }
    }

    abstract void x0(int i10);

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void y(int i10, List<Double> list, boolean z10) throws IOException {
        if (list instanceof z) {
            v0(i10, (z) list, z10);
        } else {
            w0(i10, list, z10);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.Writer
    public final void z(int i10, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            i(i10, list.get(size));
        }
    }
}
