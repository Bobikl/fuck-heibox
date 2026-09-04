package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Field extends GeneratedMessageLite<Field, b> implements x0 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile p2<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private i1.k<n2> options_ = GeneratedMessageLite.R1();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    public enum Cardinality implements i1.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final i1.d<Cardinality> internalValueMap = new a();
        private final int value;

        public static final class a implements i1.d<Cardinality> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.i1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Cardinality a(int i10) {
                return Cardinality.forNumber(i10);
            }
        }

        public static final class b implements i1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final i1.e f22287a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.i1.e
            public boolean a(int i10) {
                return Cardinality.forNumber(i10) != null;
            }
        }

        Cardinality(int i10) {
            this.value = i10;
        }

        public static Cardinality forNumber(int i10) {
            if (i10 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i10 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i10 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i10 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static i1.d<Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public static i1.e internalGetVerifier() {
            return b.f22287a;
        }

        @Deprecated
        public static Cardinality valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum Kind implements i1.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final i1.d<Kind> internalValueMap = new a();
        private final int value;

        public static final class a implements i1.d<Kind> {
            a() {
            }

            @Override // androidx.datastore.preferences.protobuf.i1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Kind a(int i10) {
                return Kind.forNumber(i10);
            }
        }

        public static final class b implements i1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final i1.e f22288a = new b();

            private b() {
            }

            @Override // androidx.datastore.preferences.protobuf.i1.e
            public boolean a(int i10) {
                return Kind.forNumber(i10) != null;
            }
        }

        Kind(int i10) {
            this.value = i10;
        }

        public static Kind forNumber(int i10) {
            switch (i10) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static i1.d<Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public static i1.e internalGetVerifier() {
            return b.f22288a;
        }

        @Deprecated
        public static Kind valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.i1.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22289a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22289a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22289a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22289a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22289a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22289a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22289a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22289a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Field, b> implements x0 {
        private b() {
            super(Field.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(ByteString byteString) {
            T1();
            ((Field) this.f22298c).h4(byteString);
            return this;
        }

        public b B2(int i10) {
            T1();
            ((Field) this.f22298c).i4(i10);
            return this;
        }

        public b C2(int i10) {
            T1();
            ((Field) this.f22298c).j4(i10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public ByteString D() {
            return ((Field) this.f22298c).D();
        }

        public b D2(int i10, n2.b bVar) {
            T1();
            ((Field) this.f22298c).k4(i10, bVar);
            return this;
        }

        public b E2(int i10, n2 n2Var) {
            T1();
            ((Field) this.f22298c).l4(i10, n2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public int F() {
            return ((Field) this.f22298c).F();
        }

        public b F2(boolean z10) {
            T1();
            ((Field) this.f22298c).m4(z10);
            return this;
        }

        public b G2(String str) {
            T1();
            ((Field) this.f22298c).n4(str);
            return this;
        }

        public b H2(ByteString byteString) {
            T1();
            ((Field) this.f22298c).o4(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public int M() {
            return ((Field) this.f22298c).M();
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public ByteString a() {
            return ((Field) this.f22298c).a();
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public Kind b() {
            return ((Field) this.f22298c).b();
        }

        public b b2(Iterable<? extends n2> iterable) {
            T1();
            ((Field) this.f22298c).p3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public List<n2> c() {
            return Collections.unmodifiableList(((Field) this.f22298c).c());
        }

        public b c2(int i10, n2.b bVar) {
            T1();
            ((Field) this.f22298c).q3(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public n2 d(int i10) {
            return ((Field) this.f22298c).d(i10);
        }

        public b d2(int i10, n2 n2Var) {
            T1();
            ((Field) this.f22298c).r3(i10, n2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public int e() {
            return ((Field) this.f22298c).e();
        }

        public b e2(n2.b bVar) {
            T1();
            ((Field) this.f22298c).s3(bVar);
            return this;
        }

        public b f2(n2 n2Var) {
            T1();
            ((Field) this.f22298c).t3(n2Var);
            return this;
        }

        public b g2() {
            T1();
            ((Field) this.f22298c).u3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public String getName() {
            return ((Field) this.f22298c).getName();
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public int getNumber() {
            return ((Field) this.f22298c).getNumber();
        }

        public b h2() {
            T1();
            ((Field) this.f22298c).v3();
            return this;
        }

        public b i2() {
            T1();
            ((Field) this.f22298c).w3();
            return this;
        }

        public b j2() {
            T1();
            ((Field) this.f22298c).x3();
            return this;
        }

        public b k2() {
            T1();
            ((Field) this.f22298c).y3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public String l1() {
            return ((Field) this.f22298c).l1();
        }

        public b l2() {
            T1();
            ((Field) this.f22298c).z3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public int m1() {
            return ((Field) this.f22298c).m1();
        }

        public b m2() {
            T1();
            ((Field) this.f22298c).A3();
            return this;
        }

        public b n2() {
            T1();
            ((Field) this.f22298c).B3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public ByteString o() {
            return ((Field) this.f22298c).o();
        }

        public b o2() {
            T1();
            ((Field) this.f22298c).C3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public String p() {
            return ((Field) this.f22298c).p();
        }

        public b p2() {
            T1();
            ((Field) this.f22298c).D3();
            return this;
        }

        public b q2(int i10) {
            T1();
            ((Field) this.f22298c).X3(i10);
            return this;
        }

        public b r2(Cardinality cardinality) {
            T1();
            ((Field) this.f22298c).Y3(cardinality);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public String s() {
            return ((Field) this.f22298c).s();
        }

        public b s2(int i10) {
            T1();
            ((Field) this.f22298c).Z3(i10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public ByteString t1() {
            return ((Field) this.f22298c).t1();
        }

        public b t2(String str) {
            T1();
            ((Field) this.f22298c).a4(str);
            return this;
        }

        public b u2(ByteString byteString) {
            T1();
            ((Field) this.f22298c).b4(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public Cardinality v0() {
            return ((Field) this.f22298c).v0();
        }

        public b v2(String str) {
            T1();
            ((Field) this.f22298c).c4(str);
            return this;
        }

        public b w2(ByteString byteString) {
            T1();
            ((Field) this.f22298c).d4(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.x0
        public boolean x0() {
            return ((Field) this.f22298c).x0();
        }

        public b x2(Kind kind) {
            T1();
            ((Field) this.f22298c).e4(kind);
            return this;
        }

        public b y2(int i10) {
            T1();
            ((Field) this.f22298c).f4(i10);
            return this;
        }

        public b z2(String str) {
            T1();
            ((Field) this.f22298c).g4(str);
            return this;
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.F2(Field.class, field);
    }

    private Field() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3() {
        this.options_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3() {
        this.typeUrl_ = F3().p();
    }

    private void E3() {
        if (this.options_.l1()) {
            return;
        }
        this.options_ = GeneratedMessageLite.h2(this.options_);
    }

    public static Field F3() {
        return DEFAULT_INSTANCE;
    }

    public static b I3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b J3(Field field) {
        return DEFAULT_INSTANCE.G1(field);
    }

    public static Field K3(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static Field L3(InputStream inputStream, p0 p0Var) throws IOException {
        return (Field) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static Field M3(ByteString byteString) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static Field N3(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static Field O3(w wVar) throws IOException {
        return (Field) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static Field P3(w wVar, p0 p0Var) throws IOException {
        return (Field) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static Field Q3(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static Field R3(InputStream inputStream, p0 p0Var) throws IOException {
        return (Field) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static Field S3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Field T3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static Field U3(byte[] bArr) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static Field V3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<Field> W3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(int i10) {
        E3();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(Cardinality cardinality) {
        cardinality.getClass();
        this.cardinality_ = cardinality.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(int i10) {
        this.cardinality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.defaultValue_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.jsonName_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(Kind kind) {
        kind.getClass();
        this.kind_ = kind.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.name_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(int i10) {
        this.number_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(int i10) {
        this.oneofIndex_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k4(int i10, n2.b bVar) {
        E3();
        this.options_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l4(int i10, n2 n2Var) {
        n2Var.getClass();
        E3();
        this.options_.set(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(boolean z10) {
        this.packed_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n4(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.typeUrl_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(Iterable<? extends n2> iterable) {
        E3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(int i10, n2.b bVar) {
        E3();
        this.options_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(int i10, n2 n2Var) {
        n2Var.getClass();
        E3();
        this.options_.add(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(n2.b bVar) {
        E3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(n2 n2Var) {
        n2Var.getClass();
        E3();
        this.options_.add(n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3() {
        this.defaultValue_ = F3().s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3() {
        this.jsonName_ = F3().l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        this.name_ = F3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3() {
        this.number_ = 0;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public ByteString D() {
        return ByteString.w(this.defaultValue_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public int F() {
        return this.oneofIndex_;
    }

    public o2 G3(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends o2> H3() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22289a[methodToInvoke.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", n2.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<Field> cVar = PARSER;
                if (cVar == null) {
                    synchronized (Field.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public int M() {
        return this.cardinality_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public ByteString a() {
        return ByteString.w(this.name_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public Kind b() {
        Kind kindForNumber = Kind.forNumber(this.kind_);
        return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public List<n2> c() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public n2 d(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public int getNumber() {
        return this.number_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public String l1() {
        return this.jsonName_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public int m1() {
        return this.kind_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public ByteString o() {
        return ByteString.w(this.typeUrl_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public String p() {
        return this.typeUrl_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public String s() {
        return this.defaultValue_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public ByteString t1() {
        return ByteString.w(this.jsonName_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public Cardinality v0() {
        Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x0
    public boolean x0() {
        return this.packed_;
    }
}
