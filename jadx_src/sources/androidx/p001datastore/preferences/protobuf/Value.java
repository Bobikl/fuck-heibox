package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class Value extends GeneratedMessageLite<Value, b> implements a4 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile p2<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    public enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i10) {
            this.value = i10;
        }

        public static KindCase forNumber(int i10) {
            switch (i10) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Deprecated
        public static KindCase valueOf(int i10) {
            return forNumber(i10);
        }

        public int getNumber() {
            return this.value;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22348a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22348a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22348a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22348a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22348a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22348a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22348a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22348a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Value, b> implements a4 {
        private b() {
            super(Value.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public ByteString O0() {
            return ((Value) this.f22298c).O0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public g3 P0() {
            return ((Value) this.f22298c).P0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public KindCase Q0() {
            return ((Value) this.f22298c).Q0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public boolean S() {
            return ((Value) this.f22298c).S();
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public p1 U() {
            return ((Value) this.f22298c).U();
        }

        public b b2() {
            T1();
            ((Value) this.f22298c).b3();
            return this;
        }

        public b c2() {
            T1();
            ((Value) this.f22298c).c3();
            return this;
        }

        public b d2() {
            T1();
            ((Value) this.f22298c).d3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public double e1() {
            return ((Value) this.f22298c).e1();
        }

        public b e2() {
            T1();
            ((Value) this.f22298c).e3();
            return this;
        }

        public b f2() {
            T1();
            ((Value) this.f22298c).f3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public boolean g0() {
            return ((Value) this.f22298c).g0();
        }

        public b g2() {
            T1();
            ((Value) this.f22298c).g3();
            return this;
        }

        public b h2() {
            T1();
            ((Value) this.f22298c).h3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public String i1() {
            return ((Value) this.f22298c).i1();
        }

        public b i2(p1 p1Var) {
            T1();
            ((Value) this.f22298c).j3(p1Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public int j0() {
            return ((Value) this.f22298c).j0();
        }

        public b j2(g3 g3Var) {
            T1();
            ((Value) this.f22298c).k3(g3Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public NullValue k0() {
            return ((Value) this.f22298c).k0();
        }

        public b k2(boolean z10) {
            T1();
            ((Value) this.f22298c).A3(z10);
            return this;
        }

        public b l2(p1.b bVar) {
            T1();
            ((Value) this.f22298c).B3(bVar);
            return this;
        }

        public b m2(p1 p1Var) {
            T1();
            ((Value) this.f22298c).C3(p1Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.a4
        public boolean n1() {
            return ((Value) this.f22298c).n1();
        }

        public b n2(NullValue nullValue) {
            T1();
            ((Value) this.f22298c).D3(nullValue);
            return this;
        }

        public b o2(int i10) {
            T1();
            ((Value) this.f22298c).E3(i10);
            return this;
        }

        public b p2(double d10) {
            T1();
            ((Value) this.f22298c).F3(d10);
            return this;
        }

        public b q2(String str) {
            T1();
            ((Value) this.f22298c).G3(str);
            return this;
        }

        public b r2(ByteString byteString) {
            T1();
            ((Value) this.f22298c).H3(byteString);
            return this;
        }

        public b s2(g3.b bVar) {
            T1();
            ((Value) this.f22298c).I3(bVar);
            return this;
        }

        public b t2(g3 g3Var) {
            T1();
            ((Value) this.f22298c).J3(g3Var);
            return this;
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.F2(Value.class, value);
    }

    private Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(boolean z10) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(p1.b bVar) {
        this.kind_ = bVar.build();
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(p1 p1Var) {
        p1Var.getClass();
        this.kind_ = p1Var;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(NullValue nullValue) {
        nullValue.getClass();
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(nullValue.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(int i10) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(double d10) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.kindCase_ = 3;
        this.kind_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(g3.b bVar) {
        this.kind_ = bVar.build();
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(g3 g3Var) {
        g3Var.getClass();
        this.kind_ = g3Var;
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value i3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(p1 p1Var) {
        p1Var.getClass();
        if (this.kindCase_ != 6 || this.kind_ == p1.Y2()) {
            this.kind_ = p1Var;
        } else {
            this.kind_ = p1.c3((p1) this.kind_).X1(p1Var).a1();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(g3 g3Var) {
        g3Var.getClass();
        if (this.kindCase_ != 5 || this.kind_ == g3.J2()) {
            this.kind_ = g3Var;
        } else {
            this.kind_ = g3.O2((g3) this.kind_).X1(g3Var).a1();
        }
        this.kindCase_ = 5;
    }

    public static b l3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b m3(Value value) {
        return DEFAULT_INSTANCE.G1(value);
    }

    public static Value n3(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static Value o3(InputStream inputStream, p0 p0Var) throws IOException {
        return (Value) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static Value p3(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static Value q3(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static Value r3(w wVar) throws IOException {
        return (Value) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static Value s3(w wVar, p0 p0Var) throws IOException {
        return (Value) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static Value t3(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static Value u3(InputStream inputStream, p0 p0Var) throws IOException {
        return (Value) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static Value v3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Value w3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static Value x3(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static Value y3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<Value> z3() {
        return DEFAULT_INSTANCE.w();
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22348a[methodToInvoke.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", g3.class, p1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<Value> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Value.class) {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new GeneratedMessageLite.c<>(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                        break;
                    }
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public ByteString O0() {
        return ByteString.w(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public g3 P0() {
        return this.kindCase_ == 5 ? (g3) this.kind_ : g3.J2();
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public KindCase Q0() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public boolean S() {
        return this.kindCase_ == 5;
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public p1 U() {
        return this.kindCase_ == 6 ? (p1) this.kind_ : p1.Y2();
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public double e1() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public boolean g0() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public String i1() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public int j0() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public NullValue k0() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
        return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
    }

    @Override // androidx.p001datastore.preferences.protobuf.a4
    public boolean n1() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }
}
