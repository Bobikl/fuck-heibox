package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BinaryReader.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m implements w2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22514c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22515d = 7;

    /* JADX INFO: compiled from: BinaryReader.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22516a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22516a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22516a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22516a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22516a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22516a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22516a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22516a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22516a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22516a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22516a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22516a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22516a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22516a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22516a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22516a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22516a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22516a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: compiled from: BinaryReader.java */
    public static final class b extends m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f22517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f22518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f22519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f22520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f22521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f22522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f22523k;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f22517e = z10;
            this.f22518f = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f22519g = iArrayOffset;
            this.f22520h = iArrayOffset;
            this.f22521i = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean U() {
            return this.f22519g == this.f22521i;
        }

        private byte V() throws IOException {
            int i10 = this.f22519g;
            if (i10 == this.f22521i) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f22518f;
            this.f22519g = i10 + 1;
            return bArr[i10];
        }

        private Object W(WireFormat.FieldType fieldType, Class<?> cls, p0 p0Var) throws IOException {
            switch (a.f22516a[fieldType.ordinal()]) {
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

        private <T> T X(x2<T> x2Var, p0 p0Var) throws IOException {
            int i10 = this.f22523k;
            this.f22523k = WireFormat.c(WireFormat.a(this.f22522j), 4);
            try {
                T tH = x2Var.h();
                x2Var.e(tH, this, p0Var);
                x2Var.f(tH);
                if (this.f22522j != this.f22523k) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f22523k = i10;
                return tH;
            } catch (Throwable th2) {
                this.f22523k = i10;
                throw th2;
            }
        }

        private int Y() throws IOException {
            i0(4);
            return Z();
        }

        private int Z() {
            int i10 = this.f22519g;
            byte[] bArr = this.f22518f;
            this.f22519g = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long a0() throws IOException {
            i0(8);
            return b0();
        }

        private long b0() {
            int i10 = this.f22519g;
            byte[] bArr = this.f22518f;
            this.f22519g = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        private <T> T c0(x2<T> x2Var, p0 p0Var) throws IOException {
            int iF0 = f0();
            i0(iF0);
            int i10 = this.f22521i;
            int i11 = this.f22519g + iF0;
            this.f22521i = i11;
            try {
                T tH = x2Var.h();
                x2Var.e(tH, this, p0Var);
                x2Var.f(tH);
                if (this.f22519g != i11) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f22521i = i10;
                return tH;
            } catch (Throwable th2) {
                this.f22521i = i10;
                throw th2;
            }
        }

        private int f0() throws IOException {
            int i10;
            int i11 = this.f22519g;
            int i12 = this.f22521i;
            if (i12 == i11) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f22518f;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f22519g = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) h0();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 < 0) {
                i10 = i15 ^ n5.a.f132012g;
            } else {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << com.google.common.base.a.f56672y);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        i16 = i14 + 1;
                        byte b11 = bArr[i14];
                        i10 = (i18 ^ (b11 << com.google.common.base.a.F)) ^ 266354560;
                        if (b11 < 0) {
                            i14 = i16 + 1;
                            if (bArr[i16] < 0) {
                                i16 = i14 + 1;
                                if (bArr[i14] < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                throw InvalidProtocolBufferException.f();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i14 = i16;
            }
            this.f22519g = i14;
            return i10;
        }

        private long h0() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bV = V();
                j10 |= ((long) (bV & 127)) << i10;
                if ((bV & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void i0(int i10) throws IOException {
            if (i10 < 0 || i10 > this.f22521i - this.f22519g) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void j0(int i10) throws IOException {
            if (this.f22519g != i10) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void k0(int i10) throws IOException {
            if (WireFormat.b(this.f22522j) != i10) {
                throw InvalidProtocolBufferException.e();
            }
        }

        private void l0(int i10) throws IOException {
            i0(i10);
            this.f22519g += i10;
        }

        private void m0() throws IOException {
            int i10 = this.f22523k;
            this.f22523k = WireFormat.c(WireFormat.a(this.f22522j), 4);
            while (p() != Integer.MAX_VALUE && t()) {
            }
            if (this.f22522j != this.f22523k) {
                throw InvalidProtocolBufferException.h();
            }
            this.f22523k = i10;
        }

        private void n0() throws IOException {
            int i10 = this.f22521i;
            int i11 = this.f22519g;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f22518f;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f22519g = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            o0();
        }

        private void o0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (V() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void p0(int i10) throws IOException {
            i0(i10);
            if ((i10 & 3) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        private void q0(int i10) throws IOException {
            i0(i10);
            if ((i10 & 7) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public boolean A() throws IOException {
            k0(0);
            return f0() != 0;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void B(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof r1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(j()));
                        if (U()) {
                            return;
                        } else {
                            i10 = this.f22519g;
                        }
                    } while (f0() == this.f22522j);
                    this.f22519g = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF0 = this.f22519g + f0();
                while (this.f22519g < iF0) {
                    list.add(Long.valueOf(g0()));
                }
                j0(iF0);
                return;
            }
            r1 r1Var = (r1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 0) {
                do {
                    r1Var.j0(j());
                    if (U()) {
                        return;
                    } else {
                        i11 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF1 = this.f22519g + f0();
            while (this.f22519g < iF1) {
                r1Var.j0(g0());
            }
            j0(iF1);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void C(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof r1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(w()));
                        if (U()) {
                            return;
                        } else {
                            i10 = this.f22519g;
                        }
                    } while (f0() == this.f22522j);
                    this.f22519g = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF0 = this.f22519g + f0();
                while (this.f22519g < iF0) {
                    list.add(Long.valueOf(g0()));
                }
                j0(iF0);
                return;
            }
            r1 r1Var = (r1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 0) {
                do {
                    r1Var.j0(w());
                    if (U()) {
                        return;
                    } else {
                        i11 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF1 = this.f22519g + f0();
            while (this.f22519g < iF1) {
                r1Var.j0(g0());
            }
            j0(iF1);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void D(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof h1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int iF0 = this.f22519g + f0();
                    while (this.f22519g < iF0) {
                        list.add(Integer.valueOf(f0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(d()));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            h1 h1Var = (h1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF1 = this.f22519g + f0();
                while (this.f22519g < iF1) {
                    h1Var.t1(f0());
                }
                return;
            }
            do {
                h1Var.t1(d());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void E(List<String> list) throws IOException {
            e0(list, true);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public int F() throws IOException {
            k0(0);
            return f0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <T> void G(List<T> list, x2<T> x2Var, p0 p0Var) throws IOException {
            int i10;
            if (WireFormat.b(this.f22522j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int i11 = this.f22522j;
            do {
                list.add(c0(x2Var, p0Var));
                if (U()) {
                    return;
                } else {
                    i10 = this.f22519g;
                }
            } while (f0() == i11);
            this.f22519g = i10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void H(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof r1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(y()));
                        if (U()) {
                            return;
                        } else {
                            i10 = this.f22519g;
                        }
                    } while (f0() == this.f22522j);
                    this.f22519g = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF0 = f0();
                q0(iF0);
                int i12 = this.f22519g + iF0;
                while (this.f22519g < i12) {
                    list.add(Long.valueOf(b0()));
                }
                return;
            }
            r1 r1Var = (r1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 1) {
                do {
                    r1Var.j0(y());
                    if (U()) {
                        return;
                    } else {
                        i11 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF1 = f0();
            q0(iF1);
            int i13 = this.f22519g + iF1;
            while (this.f22519g < i13) {
                r1Var.j0(b0());
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void I(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof h1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int iF0 = this.f22519g + f0();
                    while (this.f22519g < iF0) {
                        list.add(Integer.valueOf(f0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(c()));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            h1 h1Var = (h1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF1 = this.f22519g + f0();
                while (this.f22519g < iF1) {
                    h1Var.t1(f0());
                }
                return;
            }
            do {
                h1Var.t1(c());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public int J() throws IOException {
            k0(5);
            return Y();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <T> T K(Class<T> cls, p0 p0Var) throws IOException {
            k0(3);
            return (T) X(r2.a().i(cls), p0Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <T> void L(List<T> list, Class<T> cls, p0 p0Var) throws IOException {
            G(list, r2.a().i(cls), p0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <K, V> void M(Map<K, V> map, t1.b<K, V> bVar, p0 p0Var) throws IOException {
            k0(2);
            int iF0 = f0();
            i0(iF0);
            int i10 = this.f22521i;
            this.f22521i = this.f22519g + iF0;
            try {
                Object objW = bVar.f22638b;
                Object objW2 = bVar.f22640d;
                while (true) {
                    int iP = p();
                    if (iP == Integer.MAX_VALUE) {
                        map.put(objW, objW2);
                        this.f22521i = i10;
                        return;
                    } else if (iP == 1) {
                        objW = W(bVar.f22637a, null, null);
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
                        objW2 = W(bVar.f22639c, bVar.f22640d.getClass(), p0Var);
                    }
                }
            } catch (Throwable th2) {
                this.f22521i = i10;
                throw th2;
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public long N() throws IOException {
            k0(0);
            return w.c(g0());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public String O() throws IOException {
            return d0(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <T> void P(List<T> list, x2<T> x2Var, p0 p0Var) throws IOException {
            int i10;
            if (WireFormat.b(this.f22522j) != 3) {
                throw InvalidProtocolBufferException.e();
            }
            int i11 = this.f22522j;
            do {
                list.add(X(x2Var, p0Var));
                if (U()) {
                    return;
                } else {
                    i10 = this.f22519g;
                }
            } while (f0() == i11);
            this.f22519g = i10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public int Q() throws IOException {
            k0(5);
            return Y();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public String R() throws IOException {
            return d0(true);
        }

        @Override // androidx.p001datastore.preferences.protobuf.m
        public int S() {
            return this.f22519g - this.f22520h;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void a(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof r1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int iF0 = this.f22519g + f0();
                    while (this.f22519g < iF0) {
                        list.add(Long.valueOf(w.c(g0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(N()));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            r1 r1Var = (r1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF1 = this.f22519g + f0();
                while (this.f22519g < iF1) {
                    r1Var.j0(w.c(g0()));
                }
                return;
            }
            do {
                r1Var.j0(N());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public long b() throws IOException {
            k0(1);
            return a0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public int c() throws IOException {
            k0(0);
            return f0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public int d() throws IOException {
            k0(0);
            return f0();
        }

        public String d0(boolean z10) throws IOException {
            k0(2);
            int iF0 = f0();
            if (iF0 == 0) {
                return "";
            }
            i0(iF0);
            if (z10) {
                byte[] bArr = this.f22518f;
                int i10 = this.f22519g;
                if (!Utf8.u(bArr, i10, i10 + iF0)) {
                    throw InvalidProtocolBufferException.d();
                }
            }
            String str = new String(this.f22518f, this.f22519g, iF0, i1.f22456a);
            this.f22519g += iF0;
            return str;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public int e() throws IOException {
            k0(0);
            return w.b(f0());
        }

        public void e0(List<String> list, boolean z10) throws IOException {
            int i10;
            int i11;
            if (WireFormat.b(this.f22522j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            if (!(list instanceof n1) || z10) {
                do {
                    list.add(d0(z10));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            n1 n1Var = (n1) list;
            do {
                n1Var.f0(g());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void f(List<Boolean> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof q)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int iF0 = this.f22519g + f0();
                    while (this.f22519g < iF0) {
                        list.add(Boolean.valueOf(f0() != 0));
                    }
                    j0(iF0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(A()));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            q qVar = (q) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF1 = this.f22519g + f0();
                while (this.f22519g < iF1) {
                    qVar.M(f0() != 0);
                }
                j0(iF1);
                return;
            }
            do {
                qVar.M(A());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public ByteString g() throws IOException {
            k0(2);
            int iF0 = f0();
            if (iF0 == 0) {
                return ByteString.f22239f;
            }
            i0(iF0);
            ByteString byteStringT0 = this.f22517e ? ByteString.t0(this.f22518f, this.f22519g, iF0) : ByteString.v(this.f22518f, this.f22519g, iF0);
            this.f22519g += iF0;
            return byteStringT0;
        }

        public long g0() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f22519g;
            int i12 = this.f22521i;
            if (i12 == i11) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] bArr = this.f22518f;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f22519g = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return h0();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 >= 0) {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i14 = i16;
                    j10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << com.google.common.base.a.f56672y);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        long j13 = i18;
                        int i19 = i14 + 1;
                        long j14 = j13 ^ (((long) bArr[i14]) << 28);
                        if (j14 >= 0) {
                            j12 = 266354560;
                        } else {
                            i14 = i19 + 1;
                            long j15 = j14 ^ (((long) bArr[i19]) << 35);
                            if (j15 < 0) {
                                j11 = -34093383808L;
                            } else {
                                i19 = i14 + 1;
                                j14 = j15 ^ (((long) bArr[i14]) << 42);
                                if (j14 >= 0) {
                                    j12 = 4363953127296L;
                                } else {
                                    i14 = i19 + 1;
                                    j15 = j14 ^ (((long) bArr[i19]) << 49);
                                    if (j15 < 0) {
                                        j11 = -558586000294016L;
                                    } else {
                                        int i20 = i14 + 1;
                                        long j16 = (j15 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                        if (j16 < 0) {
                                            i14 = i20 + 1;
                                            if (bArr[i20] < 0) {
                                                throw InvalidProtocolBufferException.f();
                                            }
                                        } else {
                                            i14 = i20;
                                        }
                                        j10 = j16;
                                    }
                                }
                            }
                            j10 = j15 ^ j11;
                        }
                        j10 = j14 ^ j12;
                        i14 = i19;
                    }
                }
                this.f22519g = i14;
                return j10;
            }
            i10 = i15 ^ n5.a.f132012g;
            j10 = i10;
            this.f22519g = i14;
            return j10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public int getTag() {
            return this.f22522j;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <T> T h(x2<T> x2Var, p0 p0Var) throws IOException {
            k0(3);
            return (T) X(x2Var, p0Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void i(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof h1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.e();
                    }
                    int iF0 = this.f22519g + f0();
                    while (this.f22519g < iF0) {
                        list.add(Integer.valueOf(w.b(f0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(e()));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            h1 h1Var = (h1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF1 = this.f22519g + f0();
                while (this.f22519g < iF1) {
                    h1Var.t1(w.b(f0()));
                }
                return;
            }
            do {
                h1Var.t1(e());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public long j() throws IOException {
            k0(0);
            return g0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <T> T k(Class<T> cls, p0 p0Var) throws IOException {
            k0(2);
            return (T) c0(r2.a().i(cls), p0Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <T> void l(List<T> list, Class<T> cls, p0 p0Var) throws IOException {
            P(list, r2.a().i(cls), p0Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void m(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof r1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(b()));
                        if (U()) {
                            return;
                        } else {
                            i10 = this.f22519g;
                        }
                    } while (f0() == this.f22522j);
                    this.f22519g = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF0 = f0();
                q0(iF0);
                int i12 = this.f22519g + iF0;
                while (this.f22519g < i12) {
                    list.add(Long.valueOf(b0()));
                }
                return;
            }
            r1 r1Var = (r1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 1) {
                do {
                    r1Var.j0(b());
                    if (U()) {
                        return;
                    } else {
                        i11 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF1 = f0();
            q0(iF1);
            int i13 = this.f22519g + iF1;
            while (this.f22519g < i13) {
                r1Var.j0(b0());
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void n(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof h1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 0) {
                    do {
                        list.add(Integer.valueOf(F()));
                        if (U()) {
                            return;
                        } else {
                            i10 = this.f22519g;
                        }
                    } while (f0() == this.f22522j);
                    this.f22519g = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF0 = this.f22519g + f0();
                while (this.f22519g < iF0) {
                    list.add(Integer.valueOf(f0()));
                }
                j0(iF0);
                return;
            }
            h1 h1Var = (h1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 0) {
                do {
                    h1Var.t1(F());
                    if (U()) {
                        return;
                    } else {
                        i11 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF1 = this.f22519g + f0();
            while (this.f22519g < iF1) {
                h1Var.t1(f0());
            }
            j0(iF1);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void o(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof h1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 2) {
                    int iF0 = f0();
                    p0(iF0);
                    int i12 = this.f22519g + iF0;
                    while (this.f22519g < i12) {
                        list.add(Integer.valueOf(Z()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Integer.valueOf(J()));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            h1 h1Var = (h1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 2) {
                int iF1 = f0();
                p0(iF1);
                int i13 = this.f22519g + iF1;
                while (this.f22519g < i13) {
                    h1Var.t1(Z());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                h1Var.t1(J());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public int p() throws IOException {
            if (U()) {
                return Integer.MAX_VALUE;
            }
            int iF0 = f0();
            this.f22522j = iF0;
            if (iF0 == this.f22523k) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.a(iF0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void q(List<String> list) throws IOException {
            e0(list, false);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void r(List<Float> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof z0)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 2) {
                    int iF0 = f0();
                    p0(iF0);
                    int i12 = this.f22519g + iF0;
                    while (this.f22519g < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(Z())));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            z0 z0Var = (z0) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 2) {
                int iF1 = f0();
                p0(iF1);
                int i13 = this.f22519g + iF1;
                while (this.f22519g < i13) {
                    z0Var.x0(Float.intBitsToFloat(Z()));
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                z0Var.x0(readFloat());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public double readDouble() throws IOException {
            k0(1);
            return Double.longBitsToDouble(a0());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public float readFloat() throws IOException {
            k0(5);
            return Float.intBitsToFloat(Y());
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public boolean t() throws IOException {
            int i10;
            if (U() || (i10 = this.f22522j) == this.f22523k) {
                return false;
            }
            int iB = WireFormat.b(i10);
            if (iB == 0) {
                n0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(f0());
                return true;
            }
            if (iB == 3) {
                m0();
                return true;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            l0(4);
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void u(List<ByteString> list) throws IOException {
            int i10;
            if (WireFormat.b(this.f22522j) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(g());
                if (U()) {
                    return;
                } else {
                    i10 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i10;
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void v(List<Double> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (U()) {
                            return;
                        } else {
                            i10 = this.f22519g;
                        }
                    } while (f0() == this.f22522j);
                    this.f22519g = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.e();
                }
                int iF0 = f0();
                q0(iF0);
                int i12 = this.f22519g + iF0;
                while (this.f22519g < i12) {
                    list.add(Double.valueOf(Double.longBitsToDouble(b0())));
                }
                return;
            }
            z zVar = (z) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 1) {
                do {
                    zVar.p0(readDouble());
                    if (U()) {
                        return;
                    } else {
                        i11 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF1 = f0();
            q0(iF1);
            int i13 = this.f22519g + iF1;
            while (this.f22519g < i13) {
                zVar.p0(Double.longBitsToDouble(b0()));
            }
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public long w() throws IOException {
            k0(0);
            return g0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public <T> T x(x2<T> x2Var, p0 p0Var) throws IOException {
            k0(2);
            return (T) c0(x2Var, p0Var);
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public long y() throws IOException {
            k0(1);
            return a0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.w2
        public void z(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof h1)) {
                int iB = WireFormat.b(this.f22522j);
                if (iB == 2) {
                    int iF0 = f0();
                    p0(iF0);
                    int i12 = this.f22519g + iF0;
                    while (this.f22519g < i12) {
                        list.add(Integer.valueOf(Z()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    list.add(Integer.valueOf(Q()));
                    if (U()) {
                        return;
                    } else {
                        i10 = this.f22519g;
                    }
                } while (f0() == this.f22522j);
                this.f22519g = i10;
                return;
            }
            h1 h1Var = (h1) list;
            int iB2 = WireFormat.b(this.f22522j);
            if (iB2 == 2) {
                int iF1 = f0();
                p0(iF1);
                int i13 = this.f22519g + iF1;
                while (this.f22519g < i13) {
                    h1Var.t1(Z());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                h1Var.t1(Q());
                if (U()) {
                    return;
                } else {
                    i11 = this.f22519g;
                }
            } while (f0() == this.f22522j);
            this.f22519g = i11;
        }
    }

    private m() {
    }

    /* synthetic */ m(a aVar) {
        this();
    }

    public static m T(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public abstract int S();

    @Override // androidx.p001datastore.preferences.protobuf.w2
    public boolean s() {
        return false;
    }
}
