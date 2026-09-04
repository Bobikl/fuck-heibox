package androidx.p001datastore.preferences.protobuf;

import bb.c;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLite.java */
/* JADX INFO: loaded from: classes6.dex */
public final class w3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22706f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final w3 f22707g = new w3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f22709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f22710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22712e;

    private w3() {
        this(0, new int[8], new Object[8], true);
    }

    private w3(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f22711d = -1;
        this.f22708a = i10;
        this.f22709b = iArr;
        this.f22710c = objArr;
        this.f22712e = z10;
    }

    private void b() {
        int i10 = this.f22708a;
        int[] iArr = this.f22709b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f22709b = Arrays.copyOf(iArr, i11);
            this.f22710c = Arrays.copyOf(this.f22710c, i11);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static w3 e() {
        return f22707g;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    private w3 l(w wVar) throws IOException {
        int iY;
        do {
            iY = wVar.Y();
            if (iY == 0) {
                break;
            }
        } while (k(iY, wVar));
        return this;
    }

    static w3 o(w3 w3Var, w3 w3Var2) {
        int i10 = w3Var.f22708a + w3Var2.f22708a;
        int[] iArrCopyOf = Arrays.copyOf(w3Var.f22709b, i10);
        System.arraycopy(w3Var2.f22709b, 0, iArrCopyOf, w3Var.f22708a, w3Var2.f22708a);
        Object[] objArrCopyOf = Arrays.copyOf(w3Var.f22710c, i10);
        System.arraycopy(w3Var2.f22710c, 0, objArrCopyOf, w3Var.f22708a, w3Var2.f22708a);
        return new w3(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static w3 p() {
        return new w3();
    }

    private static void u(int i10, Object obj, Writer writer) throws IOException {
        int iA = WireFormat.a(i10);
        int iB = WireFormat.b(i10);
        if (iB == 0) {
            writer.L(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            writer.q(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            writer.i(iA, (ByteString) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.e());
            }
            writer.c(iA, ((Integer) obj).intValue());
        } else if (writer.I() == Writer.FieldOrder.ASCENDING) {
            writer.u(iA);
            ((w3) obj).w(writer);
            writer.w(iA);
        } else {
            writer.w(iA);
            ((w3) obj).w(writer);
            writer.u(iA);
        }
    }

    void a() {
        if (!this.f22712e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        int i10 = this.f22708a;
        return i10 == w3Var.f22708a && c(this.f22709b, w3Var.f22709b, i10) && d(this.f22710c, w3Var.f22710c, this.f22708a);
    }

    public int f() {
        int iA1;
        int i10 = this.f22711d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f22708a; i12++) {
            int i13 = this.f22709b[i12];
            int iA = WireFormat.a(i13);
            int iB = WireFormat.b(i13);
            if (iB == 0) {
                iA1 = CodedOutputStream.a1(iA, ((Long) this.f22710c[i12]).longValue());
            } else if (iB == 1) {
                iA1 = CodedOutputStream.o0(iA, ((Long) this.f22710c[i12]).longValue());
            } else if (iB == 2) {
                iA1 = CodedOutputStream.g0(iA, (ByteString) this.f22710c[i12]);
            } else if (iB == 3) {
                iA1 = (CodedOutputStream.X0(iA) * 2) + ((w3) this.f22710c[i12]).f();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                iA1 = CodedOutputStream.m0(iA, ((Integer) this.f22710c[i12]).intValue());
            }
            i11 += iA1;
        }
        this.f22711d = i11;
        return i11;
    }

    public int g() {
        int i10 = this.f22711d;
        if (i10 != -1) {
            return i10;
        }
        int iK0 = 0;
        for (int i11 = 0; i11 < this.f22708a; i11++) {
            iK0 += CodedOutputStream.K0(WireFormat.a(this.f22709b[i11]), (ByteString) this.f22710c[i11]);
        }
        this.f22711d = iK0;
        return iK0;
    }

    public int hashCode() {
        int i10 = this.f22708a;
        return ((((c.b.f30674h7 + i10) * 31) + h(this.f22709b, i10)) * 31) + i(this.f22710c, this.f22708a);
    }

    public void j() {
        this.f22712e = false;
    }

    boolean k(int i10, w wVar) throws IOException {
        a();
        int iA = WireFormat.a(i10);
        int iB = WireFormat.b(i10);
        if (iB == 0) {
            r(i10, Long.valueOf(wVar.G()));
            return true;
        }
        if (iB == 1) {
            r(i10, Long.valueOf(wVar.B()));
            return true;
        }
        if (iB == 2) {
            r(i10, wVar.x());
            return true;
        }
        if (iB == 3) {
            w3 w3Var = new w3();
            w3Var.l(wVar);
            wVar.a(WireFormat.c(iA, 4));
            r(i10, w3Var);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw InvalidProtocolBufferException.e();
        }
        r(i10, Integer.valueOf(wVar.A()));
        return true;
    }

    w3 m(int i10, ByteString byteString) {
        a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(WireFormat.c(i10, 2), byteString);
        return this;
    }

    w3 n(int i10, int i11) {
        a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(WireFormat.c(i10, 0), Long.valueOf(i11));
        return this;
    }

    final void q(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f22708a; i11++) {
            b2.c(sb2, i10, String.valueOf(WireFormat.a(this.f22709b[i11])), this.f22710c[i11]);
        }
    }

    void r(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f22709b;
        int i11 = this.f22708a;
        iArr[i11] = i10;
        this.f22710c[i11] = obj;
        this.f22708a = i11 + 1;
    }

    public void s(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f22708a; i10++) {
            codedOutputStream.Y1(WireFormat.a(this.f22709b[i10]), (ByteString) this.f22710c[i10]);
        }
    }

    void t(Writer writer) throws IOException {
        if (writer.I() == Writer.FieldOrder.DESCENDING) {
            for (int i10 = this.f22708a - 1; i10 >= 0; i10--) {
                writer.b(WireFormat.a(this.f22709b[i10]), this.f22710c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f22708a; i11++) {
            writer.b(WireFormat.a(this.f22709b[i11]), this.f22710c[i11]);
        }
    }

    public void v(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f22708a; i10++) {
            int i11 = this.f22709b[i10];
            int iA = WireFormat.a(i11);
            int iB = WireFormat.b(i11);
            if (iB == 0) {
                codedOutputStream.f(iA, ((Long) this.f22710c[i10]).longValue());
            } else if (iB == 1) {
                codedOutputStream.q(iA, ((Long) this.f22710c[i10]).longValue());
            } else if (iB == 2) {
                codedOutputStream.i(iA, (ByteString) this.f22710c[i10]);
            } else if (iB == 3) {
                codedOutputStream.g2(iA, 3);
                ((w3) this.f22710c[i10]).v(codedOutputStream);
                codedOutputStream.g2(iA, 4);
            } else {
                if (iB != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                codedOutputStream.c(iA, ((Integer) this.f22710c[i10]).intValue());
            }
        }
    }

    public void w(Writer writer) throws IOException {
        if (this.f22708a == 0) {
            return;
        }
        if (writer.I() == Writer.FieldOrder.ASCENDING) {
            for (int i10 = 0; i10 < this.f22708a; i10++) {
                u(this.f22709b[i10], this.f22710c[i10], writer);
            }
            return;
        }
        for (int i11 = this.f22708a - 1; i11 >= 0; i11--) {
            u(this.f22709b[i11], this.f22710c[i11], writer);
        }
    }
}
