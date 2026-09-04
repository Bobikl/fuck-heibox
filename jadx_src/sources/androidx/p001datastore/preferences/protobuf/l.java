package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: ArrayDecoders.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22501a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22501a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22501a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22501a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22501a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22501a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22501a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22501a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22501a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22501a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22501a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22501a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22501a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22501a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22501a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22501a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22501a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22501a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22501a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f22503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p0 f22505d;

        b() {
            this.f22505d = p0.d();
        }

        b(p0 p0Var) {
            p0Var.getClass();
            this.f22505d = p0Var;
        }
    }

    l() {
    }

    static int A(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        h1 h1Var = (h1) kVar;
        int I = I(bArr, i11, bVar);
        h1Var.t1(w.b(bVar.f22502a));
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            I = I(bArr, I2, bVar);
            h1Var.t1(w.b(bVar.f22502a));
        }
        return I;
    }

    static int B(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        r1 r1Var = (r1) kVar;
        int iL = L(bArr, i11, bVar);
        r1Var.j0(w.c(bVar.f22503b));
        while (iL < i12) {
            int I = I(bArr, iL, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            iL = L(bArr, I, bVar);
            r1Var.j0(w.c(bVar.f22503b));
        }
        return iL;
    }

    static int C(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i11 == 0) {
            bVar.f22504c = "";
            return I;
        }
        bVar.f22504c = new String(bArr, I, i11, i1.f22456a);
        return I + i11;
    }

    static int D(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f22502a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i13 == 0) {
            kVar.add("");
        } else {
            kVar.add(new String(bArr, I, i13, i1.f22456a));
            I += i13;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i14 = bVar.f22502a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i14 == 0) {
                kVar.add("");
            } else {
                kVar.add(new String(bArr, I, i14, i1.f22456a));
                I += i14;
            }
        }
        return I;
    }

    static int E(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f22502a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i13 == 0) {
            kVar.add("");
        } else {
            int i14 = I + i13;
            if (!Utf8.u(bArr, I, i14)) {
                throw InvalidProtocolBufferException.d();
            }
            kVar.add(new String(bArr, I, i13, i1.f22456a));
            I = i14;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i15 = bVar.f22502a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i15 == 0) {
                kVar.add("");
            } else {
                int i16 = I + i15;
                if (!Utf8.u(bArr, I, i16)) {
                    throw InvalidProtocolBufferException.d();
                }
                kVar.add(new String(bArr, I, i15, i1.f22456a));
                I = i16;
            }
        }
        return I;
    }

    static int F(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i11 == 0) {
            bVar.f22504c = "";
            return I;
        }
        bVar.f22504c = Utf8.h(bArr, I, i11);
        return I + i11;
    }

    static int G(int i10, byte[] bArr, int i11, int i12, w3 w3Var, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.a(i10) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int iB = WireFormat.b(i10);
        if (iB == 0) {
            int iL = L(bArr, i11, bVar);
            w3Var.r(i10, Long.valueOf(bVar.f22503b));
            return iL;
        }
        if (iB == 1) {
            w3Var.r(i10, Long.valueOf(j(bArr, i11)));
            return i11 + 8;
        }
        if (iB == 2) {
            int I = I(bArr, i11, bVar);
            int i13 = bVar.f22502a;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i13 > bArr.length - I) {
                throw InvalidProtocolBufferException.l();
            }
            if (i13 == 0) {
                w3Var.r(i10, ByteString.f22239f);
            } else {
                w3Var.r(i10, ByteString.v(bArr, I, i13));
            }
            return I + i13;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw InvalidProtocolBufferException.c();
            }
            w3Var.r(i10, Integer.valueOf(h(bArr, i11)));
            return i11 + 4;
        }
        w3 w3VarP = w3.p();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            int I2 = I(bArr, i11, bVar);
            int i16 = bVar.f22502a;
            if (i16 == i14) {
                i15 = i16;
                i11 = I2;
                break;
            }
            i15 = i16;
            i11 = G(i16, bArr, I2, i12, w3VarP, bVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw InvalidProtocolBufferException.h();
        }
        w3Var.r(i10, w3VarP);
        return i11;
    }

    static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f22502a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f22502a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f22502a = i16 | (b12 << com.google.common.base.a.f56672y);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f22502a = i18 | (b13 << com.google.common.base.a.F);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f22502a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return H(b10, bArr, i11, bVar);
        }
        bVar.f22502a = b10;
        return i11;
    }

    static int J(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        h1 h1Var = (h1) kVar;
        int I = I(bArr, i11, bVar);
        h1Var.t1(bVar.f22502a);
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            I = I(bArr, I2, bVar);
            h1Var.t1(bVar.f22502a);
        }
        return I;
    }

    static int K(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & 127)) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f22503b = j11;
        return i11;
    }

    static int L(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return K(j10, bArr, i11, bVar);
        }
        bVar.f22503b = j10;
        return i11;
    }

    static int M(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        r1 r1Var = (r1) kVar;
        int iL = L(bArr, i11, bVar);
        r1Var.j0(bVar.f22503b);
        while (iL < i12) {
            int I = I(bArr, iL, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            iL = L(bArr, I, bVar);
            r1Var.j0(bVar.f22503b);
        }
        return iL;
    }

    static int N(int i10, byte[] bArr, int i11, int i12, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.a(i10) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int iB = WireFormat.b(i10);
        if (iB == 0) {
            return L(bArr, i11, bVar);
        }
        if (iB == 1) {
            return i11 + 8;
        }
        if (iB == 2) {
            return I(bArr, i11, bVar) + bVar.f22502a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i11 + 4;
            }
            throw InvalidProtocolBufferException.c();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = I(bArr, i11, bVar);
            i14 = bVar.f22502a;
            if (i14 == i13) {
                break;
            }
            i11 = N(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw InvalidProtocolBufferException.h();
        }
        return i11;
    }

    static int a(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        q qVar = (q) kVar;
        int iL = L(bArr, i11, bVar);
        qVar.M(bVar.f22503b != 0);
        while (iL < i12) {
            int I = I(bArr, iL, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            iL = L(bArr, I, bVar);
            qVar.M(bVar.f22503b != 0);
        }
        return iL;
    }

    static int b(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i11 > bArr.length - I) {
            throw InvalidProtocolBufferException.l();
        }
        if (i11 == 0) {
            bVar.f22504c = ByteString.f22239f;
            return I;
        }
        bVar.f22504c = ByteString.v(bArr, I, i11);
        return I + i11;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f22502a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i13 > bArr.length - I) {
            throw InvalidProtocolBufferException.l();
        }
        if (i13 == 0) {
            kVar.add(ByteString.f22239f);
        } else {
            kVar.add(ByteString.v(bArr, I, i13));
            I += i13;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i14 = bVar.f22502a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i14 > bArr.length - I) {
                throw InvalidProtocolBufferException.l();
            }
            if (i14 == 0) {
                kVar.add(ByteString.f22239f);
            } else {
                kVar.add(ByteString.v(bArr, I, i14));
                I += i14;
            }
        }
        return I;
    }

    static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(j(bArr, i10));
    }

    static int e(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        z zVar = (z) kVar;
        zVar.p0(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            zVar.p0(d(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int f(int i10, byte[] bArr, int i11, int i12, GeneratedMessageLite.e<?, ?> eVar, GeneratedMessageLite.h<?, ?> hVar, v3<w3, w3> v3Var, b bVar) throws IOException {
        Object objU;
        y0<GeneratedMessageLite.g> y0Var = eVar.extensions;
        int i13 = i10 >>> 3;
        Object objValueOf = null;
        if (hVar.f22313d.H() && hVar.f22313d.isPacked()) {
            switch (a.f22501a[hVar.b().ordinal()]) {
                case 1:
                    z zVar = new z();
                    int iS = s(bArr, i11, zVar, bVar);
                    y0Var.O(hVar.f22313d, zVar);
                    return iS;
                case 2:
                    z0 z0Var = new z0();
                    int iV = v(bArr, i11, z0Var, bVar);
                    y0Var.O(hVar.f22313d, z0Var);
                    return iV;
                case 3:
                case 4:
                    r1 r1Var = new r1();
                    int iZ = z(bArr, i11, r1Var, bVar);
                    y0Var.O(hVar.f22313d, r1Var);
                    return iZ;
                case 5:
                case 6:
                    h1 h1Var = new h1();
                    int iY = y(bArr, i11, h1Var, bVar);
                    y0Var.O(hVar.f22313d, h1Var);
                    return iY;
                case 7:
                case 8:
                    r1 r1Var2 = new r1();
                    int iU = u(bArr, i11, r1Var2, bVar);
                    y0Var.O(hVar.f22313d, r1Var2);
                    return iU;
                case 9:
                case 10:
                    h1 h1Var2 = new h1();
                    int iT = t(bArr, i11, h1Var2, bVar);
                    y0Var.O(hVar.f22313d, h1Var2);
                    return iT;
                case 11:
                    q qVar = new q();
                    int iR = r(bArr, i11, qVar, bVar);
                    y0Var.O(hVar.f22313d, qVar);
                    return iR;
                case 12:
                    h1 h1Var3 = new h1();
                    int iW = w(bArr, i11, h1Var3, bVar);
                    y0Var.O(hVar.f22313d, h1Var3);
                    return iW;
                case 13:
                    r1 r1Var3 = new r1();
                    int iX = x(bArr, i11, r1Var3, bVar);
                    y0Var.O(hVar.f22313d, r1Var3);
                    return iX;
                case 14:
                    h1 h1Var4 = new h1();
                    int iY2 = y(bArr, i11, h1Var4, bVar);
                    w3 w3Var = eVar.unknownFields;
                    w3 w3Var2 = (w3) z2.B(i13, h1Var4, hVar.f22313d.F0(), w3Var != w3.e() ? w3Var : null, v3Var);
                    if (w3Var2 != null) {
                        eVar.unknownFields = w3Var2;
                    }
                    y0Var.O(hVar.f22313d, h1Var4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.f22313d.E());
            }
        }
        if (hVar.b() != WireFormat.FieldType.ENUM) {
            switch (a.f22501a[hVar.b().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(d(bArr, i11));
                    i11 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(l(bArr, i11));
                    i11 += 4;
                    break;
                case 3:
                case 4:
                    i11 = L(bArr, i11, bVar);
                    objValueOf = Long.valueOf(bVar.f22503b);
                    break;
                case 5:
                case 6:
                    i11 = I(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(bVar.f22502a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(j(bArr, i11));
                    i11 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(h(bArr, i11));
                    i11 += 4;
                    break;
                case 11:
                    i11 = L(bArr, i11, bVar);
                    objValueOf = Boolean.valueOf(bVar.f22503b != 0);
                    break;
                case 12:
                    i11 = I(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(w.b(bVar.f22502a));
                    break;
                case 13:
                    i11 = L(bArr, i11, bVar);
                    objValueOf = Long.valueOf(w.c(bVar.f22503b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = b(bArr, i11, bVar);
                    objValueOf = bVar.f22504c;
                    break;
                case 16:
                    i11 = C(bArr, i11, bVar);
                    objValueOf = bVar.f22504c;
                    break;
                case 17:
                    i11 = n(r2.a().i(hVar.c().getClass()), bArr, i11, i12, (i13 << 3) | 4, bVar);
                    objValueOf = bVar.f22504c;
                    break;
                case 18:
                    i11 = p(r2.a().i(hVar.c().getClass()), bArr, i11, i12, bVar);
                    objValueOf = bVar.f22504c;
                    break;
            }
        } else {
            i11 = I(bArr, i11, bVar);
            if (hVar.f22313d.F0().a(bVar.f22502a) == null) {
                w3 w3VarP = eVar.unknownFields;
                if (w3VarP == w3.e()) {
                    w3VarP = w3.p();
                    eVar.unknownFields = w3VarP;
                }
                z2.Q(i13, bVar.f22502a, w3VarP, v3Var);
                return i11;
            }
            objValueOf = Integer.valueOf(bVar.f22502a);
        }
        if (hVar.f()) {
            y0Var.h(hVar.f22313d, objValueOf);
        } else {
            int i14 = a.f22501a[hVar.b().ordinal()];
            if ((i14 == 17 || i14 == 18) && (objU = y0Var.u(hVar.f22313d)) != null) {
                objValueOf = i1.v(objU, objValueOf);
            }
            y0Var.O(hVar.f22313d, objValueOf);
        }
        return i11;
    }

    static int g(int i10, byte[] bArr, int i11, int i12, Object obj, z1 z1Var, v3<w3, w3> v3Var, b bVar) throws IOException {
        GeneratedMessageLite.h hVarC = bVar.f22505d.c(z1Var, i10 >>> 3);
        if (hVarC == null) {
            return G(i10, bArr, i11, i12, c2.w(obj), bVar);
        }
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        eVar.I2();
        return f(i10, bArr, i11, i12, eVar, hVarC, v3Var, bVar);
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int i(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        h1 h1Var = (h1) kVar;
        h1Var.t1(h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            h1Var.t1(h(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    static long j(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static int k(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        r1 r1Var = (r1) kVar;
        r1Var.j0(j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            r1Var.j0(j(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    static int m(int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) {
        z0 z0Var = (z0) kVar;
        z0Var.x0(l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            z0Var.x0(l(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    static int n(x2 x2Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        c2 c2Var = (c2) x2Var;
        Object objH = c2Var.h();
        int iE0 = c2Var.e0(objH, bArr, i10, i11, i12, bVar);
        c2Var.f(objH);
        bVar.f22504c = objH;
        return iE0;
    }

    static int o(x2 x2Var, int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int iN = n(x2Var, bArr, i11, i12, i13, bVar);
        kVar.add(bVar.f22504c);
        while (iN < i12) {
            int I = I(bArr, iN, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            iN = n(x2Var, bArr, I, i12, i13, bVar);
            kVar.add(bVar.f22504c);
        }
        return iN;
    }

    static int p(x2 x2Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        int iH = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iH = H(i12, bArr, iH, bVar);
            i12 = bVar.f22502a;
        }
        int i13 = iH;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.l();
        }
        Object objH = x2Var.h();
        int i14 = i12 + i13;
        x2Var.j(objH, bArr, i13, i14, bVar);
        x2Var.f(objH);
        bVar.f22504c = objH;
        return i14;
    }

    static int q(x2<?> x2Var, int i10, byte[] bArr, int i11, int i12, i1.k<?> kVar, b bVar) throws IOException {
        int iP = p(x2Var, bArr, i11, i12, bVar);
        kVar.add(bVar.f22504c);
        while (iP < i12) {
            int I = I(bArr, iP, bVar);
            if (i10 != bVar.f22502a) {
                break;
            }
            iP = p(x2Var, bArr, I, i12, bVar);
            kVar.add(bVar.f22504c);
        }
        return iP;
    }

    static int r(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        q qVar = (q) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            qVar.M(bVar.f22503b != 0);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int s(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        z zVar = (z) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            zVar.p0(d(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int t(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        h1 h1Var = (h1) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            h1Var.t1(h(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int u(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        r1 r1Var = (r1) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            r1Var.j0(j(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int v(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        z0 z0Var = (z0) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            z0Var.x0(l(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int w(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        h1 h1Var = (h1) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            h1Var.t1(w.b(bVar.f22502a));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int x(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        r1 r1Var = (r1) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            r1Var.j0(w.c(bVar.f22503b));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int y(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        h1 h1Var = (h1) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            h1Var.t1(bVar.f22502a);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int z(byte[] bArr, int i10, i1.k<?> kVar, b bVar) throws IOException {
        r1 r1Var = (r1) kVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f22502a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            r1Var.j0(bVar.f22503b);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }
}
