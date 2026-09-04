package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CodedOutputStream extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f22258c = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f22259d = z3.S();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f22260e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22261f = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    y f22262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22263b;

    public static class OutOfSpaceException extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f22264b = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(f22264b);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }

        OutOfSpaceException(Throwable th2) {
            super(f22264b, th2);
        }
    }

    public static abstract class b extends CodedOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final byte[] f22265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f22266h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f22267i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f22268j;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f22265g = bArr;
            this.f22266h = bArr.length;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final int f1() {
            return this.f22268j;
        }

        final void j2(byte b10) {
            byte[] bArr = this.f22265g;
            int i10 = this.f22267i;
            this.f22267i = i10 + 1;
            bArr[i10] = b10;
            this.f22268j++;
        }

        final void k2(int i10) {
            byte[] bArr = this.f22265g;
            int i11 = this.f22267i;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f22267i = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f22268j += 4;
        }

        final void l2(long j10) {
            byte[] bArr = this.f22265g;
            int i10 = this.f22267i;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f22267i = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f22268j += 8;
        }

        final void m2(int i10) {
            if (i10 >= 0) {
                o2(i10);
            } else {
                p2(i10);
            }
        }

        final void n2(int i10, int i11) {
            o2(WireFormat.c(i10, i11));
        }

        final void o2(int i10) {
            if (!CodedOutputStream.f22259d) {
                while ((i10 & n5.a.f132012g) != 0) {
                    byte[] bArr = this.f22265g;
                    int i11 = this.f22267i;
                    this.f22267i = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f22268j++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f22265g;
                int i12 = this.f22267i;
                this.f22267i = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f22268j++;
                return;
            }
            long j10 = this.f22267i;
            while ((i10 & n5.a.f132012g) != 0) {
                byte[] bArr3 = this.f22265g;
                int i13 = this.f22267i;
                this.f22267i = i13 + 1;
                z3.d0(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f22265g;
            int i14 = this.f22267i;
            this.f22267i = i14 + 1;
            z3.d0(bArr4, i14, (byte) i10);
            this.f22268j += (int) (((long) this.f22267i) - j10);
        }

        final void p2(long j10) {
            if (!CodedOutputStream.f22259d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f22265g;
                    int i10 = this.f22267i;
                    this.f22267i = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f22268j++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f22265g;
                int i11 = this.f22267i;
                this.f22267i = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f22268j++;
                return;
            }
            long j11 = this.f22267i;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f22265g;
                int i12 = this.f22267i;
                this.f22267i = i12 + 1;
                z3.d0(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f22265g;
            int i13 = this.f22267i;
            this.f22267i = i13 + 1;
            z3.d0(bArr4, i13, (byte) j10);
            this.f22268j += (int) (((long) this.f22267i) - j11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final int r1() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class c extends CodedOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f22269g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f22270h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f22271i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f22272j;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f22269g = bArr;
            this.f22270h = i10;
            this.f22272j = i10;
            this.f22271i = i12;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void C1(int i10) throws IOException {
            try {
                byte[] bArr = this.f22269g;
                int i11 = this.f22272j;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f22272j = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22272j), Integer.valueOf(this.f22271i), 1), e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void D1(long j10) throws IOException {
            try {
                byte[] bArr = this.f22269g;
                int i10 = this.f22272j;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f22272j = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22272j), Integer.valueOf(this.f22271i), 1), e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void L1(int i10, z1 z1Var) throws IOException {
            g2(i10, 2);
            N1(z1Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        final void M1(int i10, z1 z1Var, x2 x2Var) throws IOException {
            g2(i10, 2);
            h2(((androidx.p001datastore.preferences.protobuf.a) z1Var).x1(x2Var));
            x2Var.c(z1Var, this.f22262a);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void N1(z1 z1Var) throws IOException {
            h2(z1Var.u());
            z1Var.l0(this);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        final void O1(z1 z1Var, x2 x2Var) throws IOException {
            h2(((androidx.p001datastore.preferences.protobuf.a) z1Var).x1(x2Var));
            x2Var.c(z1Var, this.f22262a);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void P1(int i10, z1 z1Var) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, z1Var);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public final void T(byte b10) throws IOException {
            try {
                byte[] bArr = this.f22269g;
                int i10 = this.f22272j;
                this.f22272j = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22272j), Integer.valueOf(this.f22271i), 1), e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public final void U(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f22269g, this.f22272j, iRemaining);
                this.f22272j += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22272j), Integer.valueOf(this.f22271i), Integer.valueOf(iRemaining)), e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public final void V(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f22269g, this.f22272j, i11);
                this.f22272j += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22272j), Integer.valueOf(this.f22271i), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public final void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public final void X(byte[] bArr, int i10, int i11) throws IOException {
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i10, int i11) throws IOException {
            g2(i10, 5);
            C1(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e1() {
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void f(int i10, long j10) throws IOException {
            g2(i10, 0);
            i2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final int f1() {
            return this.f22272j - this.f22270h;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void f2(String str) throws IOException {
            int i10 = this.f22272j;
            try {
                int iZ0 = CodedOutputStream.Z0(str.length() * 3);
                int iZ1 = CodedOutputStream.Z0(str.length());
                if (iZ1 == iZ0) {
                    int i11 = i10 + iZ1;
                    this.f22272j = i11;
                    int i12 = Utf8.i(str, this.f22269g, i11, r1());
                    this.f22272j = i10;
                    h2((i12 - i10) - iZ1);
                    this.f22272j = i12;
                } else {
                    h2(Utf8.k(str));
                    this.f22272j = Utf8.i(str, this.f22269g, this.f22272j, r1());
                }
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f22272j = i10;
                g1(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void g2(int i10, int i11) throws IOException {
            h2(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void h(int i10, int i11) throws IOException {
            g2(i10, 0);
            J1(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void h2(int i10) throws IOException {
            if (!CodedOutputStream.f22259d || androidx.p001datastore.preferences.protobuf.e.c() || r1() < 5) {
                while ((i10 & n5.a.f132012g) != 0) {
                    try {
                        byte[] bArr = this.f22269g;
                        int i11 = this.f22272j;
                        this.f22272j = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22272j), Integer.valueOf(this.f22271i), 1), e10);
                    }
                }
                byte[] bArr2 = this.f22269g;
                int i12 = this.f22272j;
                this.f22272j = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & n5.a.f132012g) == 0) {
                byte[] bArr3 = this.f22269g;
                int i13 = this.f22272j;
                this.f22272j = i13 + 1;
                z3.d0(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f22269g;
            int i14 = this.f22272j;
            this.f22272j = i14 + 1;
            z3.d0(bArr4, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & n5.a.f132012g) == 0) {
                byte[] bArr5 = this.f22269g;
                int i16 = this.f22272j;
                this.f22272j = i16 + 1;
                z3.d0(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f22269g;
            int i17 = this.f22272j;
            this.f22272j = i17 + 1;
            z3.d0(bArr6, i17, (byte) (i15 | 128));
            int i18 = i15 >>> 7;
            if ((i18 & n5.a.f132012g) == 0) {
                byte[] bArr7 = this.f22269g;
                int i19 = this.f22272j;
                this.f22272j = i19 + 1;
                z3.d0(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f22269g;
            int i20 = this.f22272j;
            this.f22272j = i20 + 1;
            z3.d0(bArr8, i20, (byte) (i18 | 128));
            int i21 = i18 >>> 7;
            if ((i21 & n5.a.f132012g) == 0) {
                byte[] bArr9 = this.f22269g;
                int i22 = this.f22272j;
                this.f22272j = i22 + 1;
                z3.d0(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f22269g;
            int i23 = this.f22272j;
            this.f22272j = i23 + 1;
            z3.d0(bArr10, i23, (byte) (i21 | 128));
            byte[] bArr11 = this.f22269g;
            int i24 = this.f22272j;
            this.f22272j = i24 + 1;
            z3.d0(bArr11, i24, (byte) (i21 >>> 7));
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void i2(long j10) throws IOException {
            if (CodedOutputStream.f22259d && r1() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f22269g;
                    int i10 = this.f22272j;
                    this.f22272j = i10 + 1;
                    z3.d0(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f22269g;
                int i11 = this.f22272j;
                this.f22272j = i11 + 1;
                z3.d0(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f22269g;
                    int i12 = this.f22272j;
                    this.f22272j = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22272j), Integer.valueOf(this.f22271i), 1), e10);
                }
            }
            byte[] bArr4 = this.f22269g;
            int i13 = this.f22272j;
            this.f22272j = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void o(int i10, int i11) throws IOException {
            g2(i10, 0);
            h2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void q(int i10, long j10) throws IOException {
            g2(i10, 1);
            D1(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final int r1() {
            return this.f22271i - this.f22272j;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void s(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public final void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.u0(this);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final t f22273k;

        d(t tVar, int i10) {
            super(i10);
            if (tVar == null) {
                throw new NullPointerException("out");
            }
            this.f22273k = tVar;
        }

        private void q2() throws IOException {
            this.f22273k.V(this.f22265g, 0, this.f22267i);
            this.f22267i = 0;
        }

        private void r2(int i10) throws IOException {
            if (this.f22266h - this.f22267i < i10) {
                q2();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void C1(int i10) throws IOException {
            r2(4);
            k2(i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void D1(long j10) throws IOException {
            r2(8);
            l2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void L1(int i10, z1 z1Var) throws IOException {
            g2(i10, 2);
            N1(z1Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        void M1(int i10, z1 z1Var, x2 x2Var) throws IOException {
            g2(i10, 2);
            O1(z1Var, x2Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void N1(z1 z1Var) throws IOException {
            h2(z1Var.u());
            z1Var.l0(this);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        void O1(z1 z1Var, x2 x2Var) throws IOException {
            h2(((androidx.p001datastore.preferences.protobuf.a) z1Var).x1(x2Var));
            x2Var.c(z1Var, this.f22262a);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void P1(int i10, z1 z1Var) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, z1Var);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void T(byte b10) throws IOException {
            if (this.f22267i == this.f22266h) {
                q2();
            }
            j2(b10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void U(ByteBuffer byteBuffer) throws IOException {
            e1();
            int iRemaining = byteBuffer.remaining();
            this.f22273k.U(byteBuffer);
            this.f22268j += iRemaining;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void V(byte[] bArr, int i10, int i11) throws IOException {
            e1();
            this.f22273k.V(bArr, i10, i11);
            this.f22268j += i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void W(ByteBuffer byteBuffer) throws IOException {
            e1();
            int iRemaining = byteBuffer.remaining();
            this.f22273k.W(byteBuffer);
            this.f22268j += iRemaining;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void X(byte[] bArr, int i10, int i11) throws IOException {
            e1();
            this.f22273k.X(bArr, i10, i11);
            this.f22268j += i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void c(int i10, int i11) throws IOException {
            r2(14);
            n2(i10, 5);
            k2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e1() throws IOException {
            if (this.f22267i > 0) {
                q2();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void f(int i10, long j10) throws IOException {
            r2(20);
            n2(i10, 0);
            p2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int length = str.length() * 3;
            int iZ0 = CodedOutputStream.Z0(length);
            int i10 = iZ0 + length;
            int i11 = this.f22266h;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int i12 = Utf8.i(str, bArr, 0, length);
                h2(i12);
                X(bArr, 0, i12);
                return;
            }
            if (i10 > i11 - this.f22267i) {
                q2();
            }
            int i13 = this.f22267i;
            try {
                int iZ1 = CodedOutputStream.Z0(str.length());
                if (iZ1 == iZ0) {
                    int i14 = i13 + iZ1;
                    this.f22267i = i14;
                    int i15 = Utf8.i(str, this.f22265g, i14, this.f22266h - i14);
                    this.f22267i = i13;
                    int i16 = (i15 - i13) - iZ1;
                    o2(i16);
                    this.f22267i = i15;
                    this.f22268j += i16;
                } else {
                    int iK = Utf8.k(str);
                    o2(iK);
                    this.f22267i = Utf8.i(str, this.f22265g, this.f22267i, iK);
                    this.f22268j += iK;
                }
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f22268j -= this.f22267i - i13;
                this.f22267i = i13;
                g1(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void g2(int i10, int i11) throws IOException {
            h2(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void h(int i10, int i11) throws IOException {
            r2(20);
            n2(i10, 0);
            m2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void h2(int i10) throws IOException {
            r2(5);
            o2(i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void i2(long j10) throws IOException {
            r2(10);
            p2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void o(int i10, int i11) throws IOException {
            r2(20);
            n2(i10, 0);
            o2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void q(int i10, long j10) throws IOException {
            r2(18);
            n2(i10, 1);
            l2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void s(int i10, boolean z10) throws IOException {
            r2(11);
            n2(i10, 0);
            j2(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.u0(this);
        }
    }

    public static final class e extends c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final ByteBuffer f22274k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f22275l;

        e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f22274k = byteBuffer;
            this.f22275l = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.c, androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f22274k.position(this.f22275l + f1());
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final OutputStream f22276k;

        f(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f22276k = outputStream;
        }

        private void q2() throws IOException {
            this.f22276k.write(this.f22265g, 0, this.f22267i);
            this.f22267i = 0;
        }

        private void r2(int i10) throws IOException {
            if (this.f22266h - this.f22267i < i10) {
                q2();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void C1(int i10) throws IOException {
            r2(4);
            k2(i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void D1(long j10) throws IOException {
            r2(8);
            l2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void L1(int i10, z1 z1Var) throws IOException {
            g2(i10, 2);
            N1(z1Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        void M1(int i10, z1 z1Var, x2 x2Var) throws IOException {
            g2(i10, 2);
            O1(z1Var, x2Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void N1(z1 z1Var) throws IOException {
            h2(z1Var.u());
            z1Var.l0(this);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        void O1(z1 z1Var, x2 x2Var) throws IOException {
            h2(((androidx.p001datastore.preferences.protobuf.a) z1Var).x1(x2Var));
            x2Var.c(z1Var, this.f22262a);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void P1(int i10, z1 z1Var) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, z1Var);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void T(byte b10) throws IOException {
            if (this.f22267i == this.f22266h) {
                q2();
            }
            j2(b10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void U(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f22266h;
            int i11 = this.f22267i;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.f22265g, i11, iRemaining);
                this.f22267i += iRemaining;
                this.f22268j += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f22265g, i11, i12);
            int i13 = iRemaining - i12;
            this.f22267i = this.f22266h;
            this.f22268j += i12;
            q2();
            while (true) {
                int i14 = this.f22266h;
                if (i13 <= i14) {
                    byteBuffer.get(this.f22265g, 0, i13);
                    this.f22267i = i13;
                    this.f22268j += i13;
                    return;
                } else {
                    byteBuffer.get(this.f22265g, 0, i14);
                    this.f22276k.write(this.f22265g, 0, this.f22266h);
                    int i15 = this.f22266h;
                    i13 -= i15;
                    this.f22268j += i15;
                }
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void V(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f22266h;
            int i13 = this.f22267i;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f22265g, i13, i11);
                this.f22267i += i11;
                this.f22268j += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f22265g, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f22267i = this.f22266h;
            this.f22268j += i14;
            q2();
            if (i16 <= this.f22266h) {
                System.arraycopy(bArr, i15, this.f22265g, 0, i16);
                this.f22267i = i16;
            } else {
                this.f22276k.write(bArr, i15, i16);
            }
            this.f22268j += i16;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void X(byte[] bArr, int i10, int i11) throws IOException {
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void c(int i10, int i11) throws IOException {
            r2(14);
            n2(i10, 5);
            k2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e1() throws IOException {
            if (this.f22267i > 0) {
                q2();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void f(int i10, long j10) throws IOException {
            r2(20);
            n2(i10, 0);
            p2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int iK;
            try {
                int length = str.length() * 3;
                int iZ0 = CodedOutputStream.Z0(length);
                int i10 = iZ0 + length;
                int i11 = this.f22266h;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = Utf8.i(str, bArr, 0, length);
                    h2(i12);
                    X(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f22267i) {
                    q2();
                }
                int iZ1 = CodedOutputStream.Z0(str.length());
                int i13 = this.f22267i;
                try {
                    if (iZ1 == iZ0) {
                        int i14 = i13 + iZ1;
                        this.f22267i = i14;
                        int i15 = Utf8.i(str, this.f22265g, i14, this.f22266h - i14);
                        this.f22267i = i13;
                        iK = (i15 - i13) - iZ1;
                        o2(iK);
                        this.f22267i = i15;
                    } else {
                        iK = Utf8.k(str);
                        o2(iK);
                        this.f22267i = Utf8.i(str, this.f22265g, this.f22267i, iK);
                    }
                    this.f22268j += iK;
                } catch (Utf8.UnpairedSurrogateException e10) {
                    this.f22268j -= this.f22267i - i13;
                    this.f22267i = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                g1(str, e12);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void g2(int i10, int i11) throws IOException {
            h2(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void h(int i10, int i11) throws IOException {
            r2(20);
            n2(i10, 0);
            m2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void h2(int i10) throws IOException {
            r2(5);
            o2(i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void i2(long j10) throws IOException {
            r2(10);
            p2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void o(int i10, int i11) throws IOException {
            r2(20);
            n2(i10, 0);
            o2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void q(int i10, long j10) throws IOException {
            r2(18);
            n2(i10, 1);
            l2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void s(int i10, boolean z10) throws IOException {
            r2(11);
            n2(i10, 0);
            j2(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.u0(this);
        }
    }

    public static final class g extends CodedOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ByteBuffer f22277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ByteBuffer f22278h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f22279i;

        g(ByteBuffer byteBuffer) {
            super();
            this.f22277g = byteBuffer;
            this.f22278h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f22279i = byteBuffer.position();
        }

        private void j2(String str) throws IOException {
            try {
                Utf8.j(str, this.f22278h);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void C1(int i10) throws IOException {
            try {
                this.f22278h.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void D1(long j10) throws IOException {
            try {
                this.f22278h.putLong(j10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void L1(int i10, z1 z1Var) throws IOException {
            g2(i10, 2);
            N1(z1Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        void M1(int i10, z1 z1Var, x2 x2Var) throws IOException {
            g2(i10, 2);
            O1(z1Var, x2Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void N1(z1 z1Var) throws IOException {
            h2(z1Var.u());
            z1Var.l0(this);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        void O1(z1 z1Var, x2 x2Var) throws IOException {
            h2(((androidx.p001datastore.preferences.protobuf.a) z1Var).x1(x2Var));
            x2Var.c(z1Var, this.f22262a);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void P1(int i10, z1 z1Var) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, z1Var);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void T(byte b10) throws IOException {
            try {
                this.f22278h.put(b10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f22278h.put(byteBuffer);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void V(byte[] bArr, int i10, int i11) throws IOException {
            try {
                this.f22278h.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void X(byte[] bArr, int i10, int i11) throws IOException {
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void c(int i10, int i11) throws IOException {
            g2(i10, 5);
            C1(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f22277g.position(this.f22278h.position());
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void f(int i10, long j10) throws IOException {
            g2(i10, 0);
            i2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public int f1() {
            return this.f22278h.position() - this.f22279i;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            int iPosition = this.f22278h.position();
            try {
                int iZ0 = CodedOutputStream.Z0(str.length() * 3);
                int iZ1 = CodedOutputStream.Z0(str.length());
                if (iZ1 == iZ0) {
                    int iPosition2 = this.f22278h.position() + iZ1;
                    this.f22278h.position(iPosition2);
                    j2(str);
                    int iPosition3 = this.f22278h.position();
                    this.f22278h.position(iPosition);
                    h2(iPosition3 - iPosition2);
                    this.f22278h.position(iPosition3);
                } else {
                    h2(Utf8.k(str));
                    j2(str);
                }
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f22278h.position(iPosition);
                g1(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void g2(int i10, int i11) throws IOException {
            h2(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void h(int i10, int i11) throws IOException {
            g2(i10, 0);
            J1(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void h2(int i10) throws IOException {
            while ((i10 & n5.a.f132012g) != 0) {
                try {
                    this.f22278h.put((byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.f22278h.put((byte) i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void i2(long j10) throws IOException {
            while (((-128) & j10) != 0) {
                try {
                    this.f22278h.put((byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.f22278h.put((byte) j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void o(int i10, int i11) throws IOException {
            g2(i10, 0);
            h2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void q(int i10, long j10) throws IOException {
            g2(i10, 1);
            D1(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public int r1() {
            return this.f22278h.remaining();
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void s(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.u0(this);
        }
    }

    public static final class h extends CodedOutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ByteBuffer f22280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ByteBuffer f22281h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f22282i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f22283j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f22284k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final long f22285l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f22286m;

        h(ByteBuffer byteBuffer) {
            super();
            this.f22280g = byteBuffer;
            this.f22281h = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jI = z3.i(byteBuffer);
            this.f22282i = jI;
            long jPosition = ((long) byteBuffer.position()) + jI;
            this.f22283j = jPosition;
            long jLimit = jI + ((long) byteBuffer.limit());
            this.f22284k = jLimit;
            this.f22285l = jLimit - 10;
            this.f22286m = jPosition;
        }

        private int j2(long j10) {
            return (int) (j10 - this.f22282i);
        }

        static boolean k2() {
            return z3.T();
        }

        private void l2(long j10) {
            this.f22281h.position(j2(j10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void C1(int i10) throws IOException {
            this.f22281h.putInt(j2(this.f22286m), i10);
            this.f22286m += 4;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void D1(long j10) throws IOException {
            this.f22281h.putLong(j2(this.f22286m), j10);
            this.f22286m += 8;
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void J1(int i10) throws IOException {
            if (i10 >= 0) {
                h2(i10);
            } else {
                i2(i10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void L1(int i10, z1 z1Var) throws IOException {
            g2(i10, 2);
            N1(z1Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        void M1(int i10, z1 z1Var, x2 x2Var) throws IOException {
            g2(i10, 2);
            O1(z1Var, x2Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void N1(z1 z1Var) throws IOException {
            h2(z1Var.u());
            z1Var.l0(this);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        void O1(z1 z1Var, x2 x2Var) throws IOException {
            h2(((androidx.p001datastore.preferences.protobuf.a) z1Var).x1(x2Var));
            x2Var.c(z1Var, this.f22262a);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void P1(int i10, z1 z1Var) throws IOException {
            g2(1, 3);
            o(2, i10);
            L1(3, z1Var);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void T(byte b10) throws IOException {
            long j10 = this.f22286m;
            if (j10 >= this.f22284k) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f22286m), Long.valueOf(this.f22284k), 1));
            }
            this.f22286m = 1 + j10;
            z3.b0(j10, b10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void T1(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                V(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            U(byteBufferDuplicate);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void U(ByteBuffer byteBuffer) throws IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                l2(this.f22286m);
                this.f22281h.put(byteBuffer);
                this.f22286m += (long) iRemaining;
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void V(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = i11;
                long j11 = this.f22284k - j10;
                long j12 = this.f22286m;
                if (j11 >= j12) {
                    z3.o(bArr, i10, j12, j10);
                    this.f22286m += j10;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f22286m), Long.valueOf(this.f22284k), Integer.valueOf(i11)));
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void W(ByteBuffer byteBuffer) throws IOException {
            U(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream, androidx.p001datastore.preferences.protobuf.t
        public void X(byte[] bArr, int i10, int i11) throws IOException {
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void Y1(int i10, ByteString byteString) throws IOException {
            g2(1, 3);
            o(2, i10);
            i(3, byteString);
            g2(1, 4);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void c(int i10, int i11) throws IOException {
            g2(i10, 5);
            C1(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e(int i10, String str) throws IOException {
            g2(i10, 2);
            f2(str);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void e1() {
            this.f22280g.position(j2(this.f22286m));
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void f(int i10, long j10) throws IOException {
            g2(i10, 0);
            i2(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public int f1() {
            return (int) (this.f22286m - this.f22283j);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void f2(String str) throws IOException {
            long j10 = this.f22286m;
            try {
                int iZ0 = CodedOutputStream.Z0(str.length() * 3);
                int iZ1 = CodedOutputStream.Z0(str.length());
                if (iZ1 == iZ0) {
                    int iJ2 = j2(this.f22286m) + iZ1;
                    this.f22281h.position(iJ2);
                    Utf8.j(str, this.f22281h);
                    int iPosition = this.f22281h.position() - iJ2;
                    h2(iPosition);
                    this.f22286m += (long) iPosition;
                } else {
                    int iK = Utf8.k(str);
                    h2(iK);
                    l2(this.f22286m);
                    Utf8.j(str, this.f22281h);
                    this.f22286m += (long) iK;
                }
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f22286m = j10;
                l2(j10);
                g1(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void g2(int i10, int i11) throws IOException {
            h2(WireFormat.c(i10, i11));
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void h(int i10, int i11) throws IOException {
            g2(i10, 0);
            J1(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void h2(int i10) throws IOException {
            if (this.f22286m <= this.f22285l) {
                while ((i10 & n5.a.f132012g) != 0) {
                    long j10 = this.f22286m;
                    this.f22286m = j10 + 1;
                    z3.b0(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                long j11 = this.f22286m;
                this.f22286m = 1 + j11;
                z3.b0(j11, (byte) i10);
                return;
            }
            while (true) {
                long j12 = this.f22286m;
                if (j12 >= this.f22284k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f22286m), Long.valueOf(this.f22284k), 1));
                }
                if ((i10 & n5.a.f132012g) == 0) {
                    this.f22286m = 1 + j12;
                    z3.b0(j12, (byte) i10);
                    return;
                } else {
                    this.f22286m = j12 + 1;
                    z3.b0(j12, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void i(int i10, ByteString byteString) throws IOException {
            g2(i10, 2);
            z1(byteString);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void i2(long j10) throws IOException {
            if (this.f22286m <= this.f22285l) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.f22286m;
                    this.f22286m = j11 + 1;
                    z3.b0(j11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.f22286m;
                this.f22286m = 1 + j12;
                z3.b0(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.f22286m;
                if (j13 >= this.f22284k) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f22286m), Long.valueOf(this.f22284k), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.f22286m = 1 + j13;
                    z3.b0(j13, (byte) j10);
                    return;
                } else {
                    this.f22286m = j13 + 1;
                    z3.b0(j13, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void o(int i10, int i11) throws IOException {
            g2(i10, 0);
            h2(i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void q(int i10, long j10) throws IOException {
            g2(i10, 1);
            D1(j10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public int r1() {
            return (int) (this.f22284k - this.f22286m);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void s(int i10, boolean z10) throws IOException {
            g2(i10, 0);
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void u1(int i10, byte[] bArr) throws IOException {
            v1(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void v1(int i10, byte[] bArr, int i11, int i12) throws IOException {
            g2(i10, 2);
            x1(bArr, i11, i12);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void x1(byte[] bArr, int i10, int i11) throws IOException {
            h2(i11);
            V(bArr, i10, i11);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void y1(int i10, ByteBuffer byteBuffer) throws IOException {
            g2(i10, 2);
            h2(byteBuffer.capacity());
            T1(byteBuffer);
        }

        @Override // androidx.p001datastore.preferences.protobuf.CodedOutputStream
        public void z1(ByteString byteString) throws IOException {
            h2(byteString.size());
            byteString.u0(this);
        }
    }

    private CodedOutputStream() {
    }

    public static int A0(int i10, l1 l1Var) {
        return (X0(1) * 2) + Y0(2, i10) + B0(3, l1Var);
    }

    public static int B0(int i10, l1 l1Var) {
        return X0(i10) + C0(l1Var);
    }

    public static int C0(l1 l1Var) {
        return D0(l1Var.f());
    }

    static int D0(int i10) {
        return Z0(i10) + i10;
    }

    public static int E0(int i10, z1 z1Var) {
        return (X0(1) * 2) + Y0(2, i10) + F0(3, z1Var);
    }

    public static int F0(int i10, z1 z1Var) {
        return X0(i10) + H0(z1Var);
    }

    static int G0(int i10, z1 z1Var, x2 x2Var) {
        return X0(i10) + I0(z1Var, x2Var);
    }

    public static int H0(z1 z1Var) {
        return D0(z1Var.u());
    }

    static int I0(z1 z1Var, x2 x2Var) {
        return D0(((androidx.p001datastore.preferences.protobuf.a) z1Var).x1(x2Var));
    }

    static int J0(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int K0(int i10, ByteString byteString) {
        return (X0(1) * 2) + Y0(2, i10) + g0(3, byteString);
    }

    @Deprecated
    public static int L0(int i10) {
        return Z0(i10);
    }

    @Deprecated
    public static int M0(long j10) {
        return b1(j10);
    }

    public static int N0(int i10, int i11) {
        return X0(i10) + O0(i11);
    }

    public static int O0(int i10) {
        return 4;
    }

    public static int P0(int i10, long j10) {
        return X0(i10) + Q0(j10);
    }

    public static int Q0(long j10) {
        return 8;
    }

    public static int R0(int i10, int i11) {
        return X0(i10) + S0(i11);
    }

    public static int S0(int i10) {
        return Z0(c1(i10));
    }

    public static int T0(int i10, long j10) {
        return X0(i10) + U0(j10);
    }

    public static int U0(long j10) {
        return b1(d1(j10));
    }

    public static int V0(int i10, String str) {
        return X0(i10) + W0(str);
    }

    public static int W0(String str) {
        int length;
        try {
            length = Utf8.k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(i1.f22456a).length;
        }
        return D0(length);
    }

    public static int X0(int i10) {
        return Z0(WireFormat.c(i10, 0));
    }

    public static int Y0(int i10, int i11) {
        return X0(i10) + Z0(i11);
    }

    public static int Z0(int i10) {
        if ((i10 & n5.a.f132012g) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int a0(int i10, boolean z10) {
        return X0(i10) + b0(z10);
    }

    public static int a1(int i10, long j10) {
        return X0(i10) + b1(j10);
    }

    public static int b0(boolean z10) {
        return 1;
    }

    public static int b1(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int c0(int i10, byte[] bArr) {
        return X0(i10) + d0(bArr);
    }

    public static int c1(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int d0(byte[] bArr) {
        return D0(bArr.length);
    }

    public static long d1(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e0(int i10, ByteBuffer byteBuffer) {
        return X0(i10) + f0(byteBuffer);
    }

    public static int f0(ByteBuffer byteBuffer) {
        return D0(byteBuffer.capacity());
    }

    public static int g0(int i10, ByteString byteString) {
        return X0(i10) + h0(byteString);
    }

    public static int h0(ByteString byteString) {
        return D0(byteString.size());
    }

    public static int i0(int i10, double d10) {
        return X0(i10) + j0(d10);
    }

    static CodedOutputStream i1(t tVar, int i10) {
        if (i10 >= 0) {
            return new d(tVar, i10);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    public static int j0(double d10) {
        return 8;
    }

    public static CodedOutputStream j1(OutputStream outputStream) {
        return k1(outputStream, 4096);
    }

    public static int k0(int i10, int i11) {
        return X0(i10) + l0(i11);
    }

    public static CodedOutputStream k1(OutputStream outputStream, int i10) {
        return new f(outputStream, i10);
    }

    public static int l0(int i10) {
        return x0(i10);
    }

    public static CodedOutputStream l1(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return h.k2() ? q1(byteBuffer) : p1(byteBuffer);
    }

    public static int m0(int i10, int i11) {
        return X0(i10) + n0(i11);
    }

    @Deprecated
    public static CodedOutputStream m1(ByteBuffer byteBuffer, int i10) {
        return l1(byteBuffer);
    }

    public static int n0(int i10) {
        return 4;
    }

    public static CodedOutputStream n1(byte[] bArr) {
        return o1(bArr, 0, bArr.length);
    }

    public static int o0(int i10, long j10) {
        return X0(i10) + p0(j10);
    }

    public static CodedOutputStream o1(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int p0(long j10) {
        return 8;
    }

    static CodedOutputStream p1(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    public static int q0(int i10, float f10) {
        return X0(i10) + r0(f10);
    }

    static CodedOutputStream q1(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public static int r0(float f10) {
        return 4;
    }

    @Deprecated
    public static int s0(int i10, z1 z1Var) {
        return (X0(i10) * 2) + u0(z1Var);
    }

    @Deprecated
    static int t0(int i10, z1 z1Var, x2 x2Var) {
        return (X0(i10) * 2) + v0(z1Var, x2Var);
    }

    @Deprecated
    public static int u0(z1 z1Var) {
        return z1Var.u();
    }

    @Deprecated
    static int v0(z1 z1Var, x2 x2Var) {
        return ((androidx.p001datastore.preferences.protobuf.a) z1Var).x1(x2Var);
    }

    public static int w0(int i10, int i11) {
        return X0(i10) + x0(i11);
    }

    public static int x0(int i10) {
        if (i10 >= 0) {
            return Z0(i10);
        }
        return 10;
    }

    public static int y0(int i10, long j10) {
        return X0(i10) + z0(j10);
    }

    public static int z0(long j10) {
        return b1(j10);
    }

    public final void A1(double d10) throws IOException {
        D1(Double.doubleToRawLongBits(d10));
    }

    public final void B1(int i10) throws IOException {
        J1(i10);
    }

    public final void C(int i10, long j10) throws IOException {
        q(i10, j10);
    }

    public abstract void C1(int i10) throws IOException;

    public abstract void D1(long j10) throws IOException;

    public final void E1(float f10) throws IOException {
        C1(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void F1(int i10, z1 z1Var) throws IOException {
        g2(i10, 3);
        H1(z1Var);
        g2(i10, 4);
    }

    public final void G(int i10, double d10) throws IOException {
        q(i10, Double.doubleToRawLongBits(d10));
    }

    @Deprecated
    final void G1(int i10, z1 z1Var, x2 x2Var) throws IOException {
        g2(i10, 3);
        I1(z1Var, x2Var);
        g2(i10, 4);
    }

    @Deprecated
    public final void H1(z1 z1Var) throws IOException {
        z1Var.l0(this);
    }

    @Deprecated
    final void I1(z1 z1Var, x2 x2Var) throws IOException {
        x2Var.c(z1Var, this.f22262a);
    }

    public abstract void J1(int i10) throws IOException;

    public final void K1(long j10) throws IOException {
        i2(j10);
    }

    public final void L(int i10, long j10) throws IOException {
        f(i10, j10);
    }

    public abstract void L1(int i10, z1 z1Var) throws IOException;

    abstract void M1(int i10, z1 z1Var, x2 x2Var) throws IOException;

    public abstract void N1(z1 z1Var) throws IOException;

    abstract void O1(z1 z1Var, x2 x2Var) throws IOException;

    public final void P(int i10, float f10) throws IOException {
        c(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void P1(int i10, z1 z1Var) throws IOException;

    public final void Q(int i10, int i11) throws IOException {
        h(i10, i11);
    }

    public final void Q1(byte b10) throws IOException {
        T(b10);
    }

    public final void R1(int i10) throws IOException {
        T((byte) i10);
    }

    public final void S(int i10, int i11) throws IOException {
        o(i10, c1(i11));
    }

    public final void S1(ByteString byteString) throws IOException {
        byteString.u0(this);
    }

    @Override // androidx.p001datastore.preferences.protobuf.t
    public abstract void T(byte b10) throws IOException;

    public abstract void T1(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.p001datastore.preferences.protobuf.t
    public abstract void U(ByteBuffer byteBuffer) throws IOException;

    public final void U1(byte[] bArr) throws IOException {
        V(bArr, 0, bArr.length);
    }

    @Override // androidx.p001datastore.preferences.protobuf.t
    public abstract void V(byte[] bArr, int i10, int i11) throws IOException;

    public final void V1(byte[] bArr, int i10, int i11) throws IOException {
        V(bArr, i10, i11);
    }

    @Override // androidx.p001datastore.preferences.protobuf.t
    public abstract void W(ByteBuffer byteBuffer) throws IOException;

    @Deprecated
    public final void W1(int i10) throws IOException {
        C1(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.t
    public abstract void X(byte[] bArr, int i10, int i11) throws IOException;

    @Deprecated
    public final void X1(long j10) throws IOException {
        D1(j10);
    }

    public abstract void Y1(int i10, ByteString byteString) throws IOException;

    public final void Z() {
        if (r1() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public final void Z1(int i10) throws IOException {
        h2(i10);
    }

    @Deprecated
    public final void a2(long j10) throws IOException {
        i2(j10);
    }

    public final void b2(int i10) throws IOException {
        C1(i10);
    }

    public abstract void c(int i10, int i11) throws IOException;

    public final void c2(long j10) throws IOException {
        D1(j10);
    }

    public final void d2(int i10) throws IOException {
        h2(c1(i10));
    }

    public abstract void e(int i10, String str) throws IOException;

    public abstract void e1() throws IOException;

    public final void e2(long j10) throws IOException {
        i2(d1(j10));
    }

    public abstract void f(int i10, long j10) throws IOException;

    public abstract int f1();

    public abstract void f2(String str) throws IOException;

    final void g1(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f22258c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(i1.f22456a);
        try {
            h2(bytes.length);
            X(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    public abstract void g2(int i10, int i11) throws IOException;

    public abstract void h(int i10, int i11) throws IOException;

    boolean h1() {
        return this.f22263b;
    }

    public abstract void h2(int i10) throws IOException;

    public abstract void i(int i10, ByteString byteString) throws IOException;

    public abstract void i2(long j10) throws IOException;

    public final void m(int i10, long j10) throws IOException {
        f(i10, d1(j10));
    }

    public abstract void o(int i10, int i11) throws IOException;

    public abstract void q(int i10, long j10) throws IOException;

    public abstract int r1();

    public abstract void s(int i10, boolean z10) throws IOException;

    public void s1() {
        this.f22263b = true;
    }

    public final void t(int i10, int i11) throws IOException {
        c(i10, i11);
    }

    public final void t1(boolean z10) throws IOException {
        T(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void u1(int i10, byte[] bArr) throws IOException;

    public abstract void v1(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void w1(byte[] bArr) throws IOException {
        x1(bArr, 0, bArr.length);
    }

    abstract void x1(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void y1(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void z1(ByteString byteString) throws IOException;
}
