package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class x implements w2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f22713g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f22714h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f22715i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f22716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22719f = 0;

    /* JADX INFO: compiled from: CodedInputStreamReader.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22720a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22720a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22720a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22720a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22720a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22720a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22720a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22720a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22720a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22720a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22720a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22720a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22720a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22720a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22720a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22720a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22720a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22720a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private x(w wVar) {
        w wVar2 = (w) i1.e(wVar, "input");
        this.f22716c = wVar2;
        wVar2.f22654d = this;
    }

    public static x S(w wVar) {
        x xVar = wVar.f22654d;
        return xVar != null ? xVar : new x(wVar);
    }

    private Object T(WireFormat.FieldType fieldType, Class<?> cls, p0 p0Var) throws IOException {
        switch (a.f22720a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(A());
            case 2:
                return g();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(d());
            case 5:
                return Integer.valueOf(J());
            case 6:
                return Long.valueOf(y());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(F());
            case 9:
                return Long.valueOf(w());
            case 10:
                return k(cls, p0Var);
            case 11:
                return Integer.valueOf(Q());
            case 12:
                return Long.valueOf(b());
            case 13:
                return Integer.valueOf(e());
            case 14:
                return Long.valueOf(N());
            case 15:
                return R();
            case 16:
                return Integer.valueOf(c());
            case 17:
                return Long.valueOf(j());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T U(x2<T> x2Var, p0 p0Var) throws IOException {
        int i10 = this.f22718e;
        this.f22718e = WireFormat.c(WireFormat.a(this.f22717d), 4);
        try {
            T tH = x2Var.h();
            x2Var.e(tH, this, p0Var);
            x2Var.f(tH);
            if (this.f22717d != this.f22718e) {
                throw InvalidProtocolBufferException.h();
            }
            this.f22718e = i10;
            return tH;
        } catch (Throwable th2) {
            this.f22718e = i10;
            throw th2;
        }
    }

    private <T> T V(x2<T> x2Var, p0 p0Var) throws IOException {
        int iZ = this.f22716c.Z();
        w wVar = this.f22716c;
        if (wVar.f22651a >= wVar.f22652b) {
            throw InvalidProtocolBufferException.i();
        }
        int iT = wVar.t(iZ);
        T tH = x2Var.h();
        this.f22716c.f22651a++;
        x2Var.e(tH, this, p0Var);
        x2Var.f(tH);
        this.f22716c.a(0);
        w wVar2 = this.f22716c;
        wVar2.f22651a--;
        wVar2.s(iT);
        return tH;
    }

    private void X(int i10) throws IOException {
        if (this.f22716c.h() != i10) {
            throw InvalidProtocolBufferException.l();
        }
    }

    private void Y(int i10) throws IOException {
        if (WireFormat.b(this.f22717d) != i10) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void Z(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void a0(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public boolean A() throws IOException {
        Y(0);
        return this.f22716c.u();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void B(List<Long> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof r1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f22716c.a0()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iH = this.f22716c.h() + this.f22716c.Z();
            do {
                list.add(Long.valueOf(this.f22716c.a0()));
            } while (this.f22716c.h() < iH);
            X(iH);
            return;
        }
        r1 r1Var = (r1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 0) {
            do {
                r1Var.j0(this.f22716c.a0());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iH2 = this.f22716c.h() + this.f22716c.Z();
        do {
            r1Var.j0(this.f22716c.a0());
        } while (this.f22716c.h() < iH2);
        X(iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void C(List<Long> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof r1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f22716c.G()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iH = this.f22716c.h() + this.f22716c.Z();
            do {
                list.add(Long.valueOf(this.f22716c.G()));
            } while (this.f22716c.h() < iH);
            X(iH);
            return;
        }
        r1 r1Var = (r1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 0) {
            do {
                r1Var.j0(this.f22716c.G());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iH2 = this.f22716c.h() + this.f22716c.Z();
        do {
            r1Var.j0(this.f22716c.G());
        } while (this.f22716c.h() < iH2);
        X(iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void D(List<Integer> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof h1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f22716c.z()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iH = this.f22716c.h() + this.f22716c.Z();
            do {
                list.add(Integer.valueOf(this.f22716c.z()));
            } while (this.f22716c.h() < iH);
            X(iH);
            return;
        }
        h1 h1Var = (h1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 0) {
            do {
                h1Var.t1(this.f22716c.z());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iH2 = this.f22716c.h() + this.f22716c.Z();
        do {
            h1Var.t1(this.f22716c.z());
        } while (this.f22716c.h() < iH2);
        X(iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void E(List<String> list) throws IOException {
        W(list, true);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public int F() throws IOException {
        Y(0);
        return this.f22716c.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <T> void G(List<T> list, x2<T> x2Var, p0 p0Var) throws IOException {
        int iY;
        if (WireFormat.b(this.f22717d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f22717d;
        do {
            list.add(V(x2Var, p0Var));
            if (this.f22716c.i() || this.f22719f != 0) {
                return;
            } else {
                iY = this.f22716c.Y();
            }
        } while (iY == i10);
        this.f22719f = iY;
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void H(List<Long> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof r1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f22716c.B()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iZ = this.f22716c.Z();
            a0(iZ);
            int iH = this.f22716c.h() + iZ;
            do {
                list.add(Long.valueOf(this.f22716c.B()));
            } while (this.f22716c.h() < iH);
            return;
        }
        r1 r1Var = (r1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 1) {
            do {
                r1Var.j0(this.f22716c.B());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iZ2 = this.f22716c.Z();
        a0(iZ2);
        int iH2 = this.f22716c.h() + iZ2;
        do {
            r1Var.j0(this.f22716c.B());
        } while (this.f22716c.h() < iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void I(List<Integer> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof h1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f22716c.Z()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iH = this.f22716c.h() + this.f22716c.Z();
            do {
                list.add(Integer.valueOf(this.f22716c.Z()));
            } while (this.f22716c.h() < iH);
            X(iH);
            return;
        }
        h1 h1Var = (h1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 0) {
            do {
                h1Var.t1(this.f22716c.Z());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iH2 = this.f22716c.h() + this.f22716c.Z();
        do {
            h1Var.t1(this.f22716c.Z());
        } while (this.f22716c.h() < iH2);
        X(iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public int J() throws IOException {
        Y(5);
        return this.f22716c.A();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <T> T K(Class<T> cls, p0 p0Var) throws IOException {
        Y(3);
        return (T) U(r2.a().i(cls), p0Var);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <T> void L(List<T> list, Class<T> cls, p0 p0Var) throws IOException {
        G(list, r2.a().i(cls), p0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <K, V> void M(Map<K, V> map, t1.b<K, V> bVar, p0 p0Var) throws IOException {
        Y(2);
        int iT = this.f22716c.t(this.f22716c.Z());
        Object objT = bVar.f22638b;
        Object objT2 = bVar.f22640d;
        while (true) {
            try {
                int iP = p();
                if (iP == Integer.MAX_VALUE || this.f22716c.i()) {
                    break;
                }
                if (iP == 1) {
                    objT = T(bVar.f22637a, null, null);
                } else if (iP != 2) {
                    try {
                        if (!t()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!t()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objT2 = T(bVar.f22639c, bVar.f22640d.getClass(), p0Var);
                }
            } catch (Throwable th2) {
                this.f22716c.s(iT);
                throw th2;
            }
        }
        map.put(objT, objT2);
        this.f22716c.s(iT);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public long N() throws IOException {
        Y(0);
        return this.f22716c.V();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public String O() throws IOException {
        Y(2);
        return this.f22716c.W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <T> void P(List<T> list, x2<T> x2Var, p0 p0Var) throws IOException {
        int iY;
        if (WireFormat.b(this.f22717d) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f22717d;
        do {
            list.add(U(x2Var, p0Var));
            if (this.f22716c.i() || this.f22719f != 0) {
                return;
            } else {
                iY = this.f22716c.Y();
            }
        } while (iY == i10);
        this.f22719f = iY;
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public int Q() throws IOException {
        Y(5);
        return this.f22716c.S();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public String R() throws IOException {
        Y(2);
        return this.f22716c.X();
    }

    public void W(List<String> list, boolean z10) throws IOException {
        int iY;
        int iY2;
        if (WireFormat.b(this.f22717d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof n1) || z10) {
            do {
                list.add(z10 ? R() : O());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY = this.f22716c.Y();
                }
            } while (iY == this.f22717d);
            this.f22719f = iY;
            return;
        }
        n1 n1Var = (n1) list;
        do {
            n1Var.f0(g());
            if (this.f22716c.i()) {
                return;
            } else {
                iY2 = this.f22716c.Y();
            }
        } while (iY2 == this.f22717d);
        this.f22719f = iY2;
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void a(List<Long> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof r1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f22716c.V()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iH = this.f22716c.h() + this.f22716c.Z();
            do {
                list.add(Long.valueOf(this.f22716c.V()));
            } while (this.f22716c.h() < iH);
            X(iH);
            return;
        }
        r1 r1Var = (r1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 0) {
            do {
                r1Var.j0(this.f22716c.V());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iH2 = this.f22716c.h() + this.f22716c.Z();
        do {
            r1Var.j0(this.f22716c.V());
        } while (this.f22716c.h() < iH2);
        X(iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public long b() throws IOException {
        Y(1);
        return this.f22716c.T();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public int c() throws IOException {
        Y(0);
        return this.f22716c.Z();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public int d() throws IOException {
        Y(0);
        return this.f22716c.z();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public int e() throws IOException {
        Y(0);
        return this.f22716c.U();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void f(List<Boolean> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof q)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f22716c.u()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iH = this.f22716c.h() + this.f22716c.Z();
            do {
                list.add(Boolean.valueOf(this.f22716c.u()));
            } while (this.f22716c.h() < iH);
            X(iH);
            return;
        }
        q qVar = (q) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 0) {
            do {
                qVar.M(this.f22716c.u());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iH2 = this.f22716c.h() + this.f22716c.Z();
        do {
            qVar.M(this.f22716c.u());
        } while (this.f22716c.h() < iH2);
        X(iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public ByteString g() throws IOException {
        Y(2);
        return this.f22716c.x();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public int getTag() {
        return this.f22717d;
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <T> T h(x2<T> x2Var, p0 p0Var) throws IOException {
        Y(3);
        return (T) U(x2Var, p0Var);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void i(List<Integer> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof h1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f22716c.U()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iH = this.f22716c.h() + this.f22716c.Z();
            do {
                list.add(Integer.valueOf(this.f22716c.U()));
            } while (this.f22716c.h() < iH);
            X(iH);
            return;
        }
        h1 h1Var = (h1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 0) {
            do {
                h1Var.t1(this.f22716c.U());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iH2 = this.f22716c.h() + this.f22716c.Z();
        do {
            h1Var.t1(this.f22716c.U());
        } while (this.f22716c.h() < iH2);
        X(iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public long j() throws IOException {
        Y(0);
        return this.f22716c.a0();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <T> T k(Class<T> cls, p0 p0Var) throws IOException {
        Y(2);
        return (T) V(r2.a().i(cls), p0Var);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <T> void l(List<T> list, Class<T> cls, p0 p0Var) throws IOException {
        P(list, r2.a().i(cls), p0Var);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void m(List<Long> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof r1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f22716c.T()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iZ = this.f22716c.Z();
            a0(iZ);
            int iH = this.f22716c.h() + iZ;
            do {
                list.add(Long.valueOf(this.f22716c.T()));
            } while (this.f22716c.h() < iH);
            return;
        }
        r1 r1Var = (r1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 1) {
            do {
                r1Var.j0(this.f22716c.T());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iZ2 = this.f22716c.Z();
        a0(iZ2);
        int iH2 = this.f22716c.h() + iZ2;
        do {
            r1Var.j0(this.f22716c.T());
        } while (this.f22716c.h() < iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void n(List<Integer> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof h1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f22716c.F()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iH = this.f22716c.h() + this.f22716c.Z();
            do {
                list.add(Integer.valueOf(this.f22716c.F()));
            } while (this.f22716c.h() < iH);
            X(iH);
            return;
        }
        h1 h1Var = (h1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 0) {
            do {
                h1Var.t1(this.f22716c.F());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iH2 = this.f22716c.h() + this.f22716c.Z();
        do {
            h1Var.t1(this.f22716c.F());
        } while (this.f22716c.h() < iH2);
        X(iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void o(List<Integer> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof h1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 2) {
                int iZ = this.f22716c.Z();
                Z(iZ);
                int iH = this.f22716c.h() + iZ;
                do {
                    list.add(Integer.valueOf(this.f22716c.A()));
                } while (this.f22716c.h() < iH);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f22716c.A()));
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY = this.f22716c.Y();
                }
            } while (iY == this.f22717d);
            this.f22719f = iY;
            return;
        }
        h1 h1Var = (h1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 2) {
            int iZ2 = this.f22716c.Z();
            Z(iZ2);
            int iH2 = this.f22716c.h() + iZ2;
            do {
                h1Var.t1(this.f22716c.A());
            } while (this.f22716c.h() < iH2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            h1Var.t1(this.f22716c.A());
            if (this.f22716c.i()) {
                return;
            } else {
                iY2 = this.f22716c.Y();
            }
        } while (iY2 == this.f22717d);
        this.f22719f = iY2;
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public int p() throws IOException {
        int i10 = this.f22719f;
        if (i10 != 0) {
            this.f22717d = i10;
            this.f22719f = 0;
        } else {
            this.f22717d = this.f22716c.Y();
        }
        int i11 = this.f22717d;
        if (i11 == 0 || i11 == this.f22718e) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i11);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void q(List<String> list) throws IOException {
        W(list, false);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void r(List<Float> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof z0)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 2) {
                int iZ = this.f22716c.Z();
                Z(iZ);
                int iH = this.f22716c.h() + iZ;
                do {
                    list.add(Float.valueOf(this.f22716c.C()));
                } while (this.f22716c.h() < iH);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f22716c.C()));
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY = this.f22716c.Y();
                }
            } while (iY == this.f22717d);
            this.f22719f = iY;
            return;
        }
        z0 z0Var = (z0) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 2) {
            int iZ2 = this.f22716c.Z();
            Z(iZ2);
            int iH2 = this.f22716c.h() + iZ2;
            do {
                z0Var.x0(this.f22716c.C());
            } while (this.f22716c.h() < iH2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            z0Var.x0(this.f22716c.C());
            if (this.f22716c.i()) {
                return;
            } else {
                iY2 = this.f22716c.Y();
            }
        } while (iY2 == this.f22717d);
        this.f22719f = iY2;
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public double readDouble() throws IOException {
        Y(1);
        return this.f22716c.y();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public float readFloat() throws IOException {
        Y(5);
        return this.f22716c.C();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public boolean s() {
        return this.f22716c.f0();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public boolean t() throws IOException {
        int i10;
        if (this.f22716c.i() || (i10 = this.f22717d) == this.f22718e) {
            return false;
        }
        return this.f22716c.g0(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void u(List<ByteString> list) throws IOException {
        int iY;
        if (WireFormat.b(this.f22717d) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(g());
            if (this.f22716c.i()) {
                return;
            } else {
                iY = this.f22716c.Y();
            }
        } while (iY == this.f22717d);
        this.f22719f = iY;
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void v(List<Double> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof z)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f22716c.y()));
                    if (this.f22716c.i()) {
                        return;
                    } else {
                        iY = this.f22716c.Y();
                    }
                } while (iY == this.f22717d);
                this.f22719f = iY;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iZ = this.f22716c.Z();
            a0(iZ);
            int iH = this.f22716c.h() + iZ;
            do {
                list.add(Double.valueOf(this.f22716c.y()));
            } while (this.f22716c.h() < iH);
            return;
        }
        z zVar = (z) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 1) {
            do {
                zVar.p0(this.f22716c.y());
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY2 = this.f22716c.Y();
                }
            } while (iY2 == this.f22717d);
            this.f22719f = iY2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iZ2 = this.f22716c.Z();
        a0(iZ2);
        int iH2 = this.f22716c.h() + iZ2;
        do {
            zVar.p0(this.f22716c.y());
        } while (this.f22716c.h() < iH2);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public long w() throws IOException {
        Y(0);
        return this.f22716c.G();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public <T> T x(x2<T> x2Var, p0 p0Var) throws IOException {
        Y(2);
        return (T) V(x2Var, p0Var);
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public long y() throws IOException {
        Y(1);
        return this.f22716c.B();
    }

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public void z(List<Integer> list) throws IOException {
        int iY;
        int iY2;
        if (!(list instanceof h1)) {
            int iB = WireFormat.b(this.f22717d);
            if (iB == 2) {
                int iZ = this.f22716c.Z();
                Z(iZ);
                int iH = this.f22716c.h() + iZ;
                do {
                    list.add(Integer.valueOf(this.f22716c.S()));
                } while (this.f22716c.h() < iH);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f22716c.S()));
                if (this.f22716c.i()) {
                    return;
                } else {
                    iY = this.f22716c.Y();
                }
            } while (iY == this.f22717d);
            this.f22719f = iY;
            return;
        }
        h1 h1Var = (h1) list;
        int iB2 = WireFormat.b(this.f22717d);
        if (iB2 == 2) {
            int iZ2 = this.f22716c.Z();
            Z(iZ2);
            int iH2 = this.f22716c.h() + iZ2;
            do {
                h1Var.t1(this.f22716c.S());
            } while (this.f22716c.h() < iH2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            h1Var.t1(this.f22716c.S());
            if (this.f22716c.i()) {
                return;
            } else {
                iY2 = this.f22716c.Y();
            }
        } while (iY2 == this.f22717d);
        this.f22719f = iY2;
    }
}
