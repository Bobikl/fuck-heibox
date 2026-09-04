package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Type.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o3 extends GeneratedMessageLite<o3, b> implements p3 {
    private static final o3 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile p2<o3> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private b3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private i1.k<Field> fields_ = GeneratedMessageLite.R1();
    private i1.k<String> oneofs_ = GeneratedMessageLite.R1();
    private i1.k<n2> options_ = GeneratedMessageLite.R1();

    /* JADX INFO: compiled from: Type.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22568a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22568a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22568a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22568a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22568a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22568a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22568a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22568a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Type.java */
    public static final class b extends GeneratedMessageLite.b<o3, b> implements p3 {
        private b() {
            super(o3.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(ByteString byteString) {
            T1();
            ((o3) this.f22298c).l4(byteString);
            return this;
        }

        public b B2(int i10, String str) {
            T1();
            ((o3) this.f22298c).m4(i10, str);
            return this;
        }

        public b C2(int i10, n2.b bVar) {
            T1();
            ((o3) this.f22298c).n4(i10, bVar);
            return this;
        }

        public b D2(int i10, n2 n2Var) {
            T1();
            ((o3) this.f22298c).o4(i10, n2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public List<Field> E() {
            return Collections.unmodifiableList(((o3) this.f22298c).E());
        }

        public b E2(b3.b bVar) {
            T1();
            ((o3) this.f22298c).p4(bVar);
            return this;
        }

        public b F2(b3 b3Var) {
            T1();
            ((o3) this.f22298c).q4(b3Var);
            return this;
        }

        public b G2(Syntax syntax) {
            T1();
            ((o3) this.f22298c).r4(syntax);
            return this;
        }

        public b H2(int i10) {
            T1();
            ((o3) this.f22298c).s4(i10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public ByteString K0(int i10) {
            return ((o3) this.f22298c).K0(i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public int P() {
            return ((o3) this.f22298c).P();
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public Field W0(int i10) {
            return ((o3) this.f22298c).W0(i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public ByteString a() {
            return ((o3) this.f22298c).a();
        }

        public b b2(Iterable<? extends Field> iterable) {
            T1();
            ((o3) this.f22298c).p3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public List<n2> c() {
            return Collections.unmodifiableList(((o3) this.f22298c).c());
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public String c1(int i10) {
            return ((o3) this.f22298c).c1(i10);
        }

        public b c2(Iterable<String> iterable) {
            T1();
            ((o3) this.f22298c).q3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public n2 d(int i10) {
            return ((o3) this.f22298c).d(i10);
        }

        public b d2(Iterable<? extends n2> iterable) {
            T1();
            ((o3) this.f22298c).r3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public int e() {
            return ((o3) this.f22298c).e();
        }

        public b e2(int i10, Field.b bVar) {
            T1();
            ((o3) this.f22298c).s3(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public Syntax f() {
            return ((o3) this.f22298c).f();
        }

        public b f2(int i10, Field field) {
            T1();
            ((o3) this.f22298c).t3(i10, field);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public int g() {
            return ((o3) this.f22298c).g();
        }

        public b g2(Field.b bVar) {
            T1();
            ((o3) this.f22298c).u3(bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public String getName() {
            return ((o3) this.f22298c).getName();
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public boolean h() {
            return ((o3) this.f22298c).h();
        }

        public b h2(Field field) {
            T1();
            ((o3) this.f22298c).v3(field);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public b3 i() {
            return ((o3) this.f22298c).i();
        }

        public b i2(String str) {
            T1();
            ((o3) this.f22298c).w3(str);
            return this;
        }

        public b j2(ByteString byteString) {
            T1();
            ((o3) this.f22298c).x3(byteString);
            return this;
        }

        public b k2(int i10, n2.b bVar) {
            T1();
            ((o3) this.f22298c).y3(i10, bVar);
            return this;
        }

        public b l2(int i10, n2 n2Var) {
            T1();
            ((o3) this.f22298c).z3(i10, n2Var);
            return this;
        }

        public b m2(n2.b bVar) {
            T1();
            ((o3) this.f22298c).A3(bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public int n() {
            return ((o3) this.f22298c).n();
        }

        public b n2(n2 n2Var) {
            T1();
            ((o3) this.f22298c).B3(n2Var);
            return this;
        }

        public b o2() {
            T1();
            ((o3) this.f22298c).C3();
            return this;
        }

        public b p2() {
            T1();
            ((o3) this.f22298c).D3();
            return this;
        }

        public b q2() {
            T1();
            ((o3) this.f22298c).E3();
            return this;
        }

        public b r2() {
            T1();
            ((o3) this.f22298c).F3();
            return this;
        }

        public b s2() {
            T1();
            ((o3) this.f22298c).G3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p3
        public List<String> t0() {
            return Collections.unmodifiableList(((o3) this.f22298c).t0());
        }

        public b t2() {
            T1();
            ((o3) this.f22298c).H3();
            return this;
        }

        public b u2(b3 b3Var) {
            T1();
            ((o3) this.f22298c).Q3(b3Var);
            return this;
        }

        public b v2(int i10) {
            T1();
            ((o3) this.f22298c).g4(i10);
            return this;
        }

        public b w2(int i10) {
            T1();
            ((o3) this.f22298c).h4(i10);
            return this;
        }

        public b x2(int i10, Field.b bVar) {
            T1();
            ((o3) this.f22298c).i4(i10, bVar);
            return this;
        }

        public b y2(int i10, Field field) {
            T1();
            ((o3) this.f22298c).j4(i10, field);
            return this;
        }

        public b z2(String str) {
            T1();
            ((o3) this.f22298c).k4(str);
            return this;
        }
    }

    static {
        o3 o3Var = new o3();
        DEFAULT_INSTANCE = o3Var;
        GeneratedMessageLite.F2(o3.class, o3Var);
    }

    private o3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(n2.b bVar) {
        K3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(n2 n2Var) {
        n2Var.getClass();
        K3();
        this.options_.add(n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3() {
        this.fields_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3() {
        this.name_ = L3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3() {
        this.oneofs_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3() {
        this.options_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3() {
        this.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3() {
        this.syntax_ = 0;
    }

    private void I3() {
        if (this.fields_.l1()) {
            return;
        }
        this.fields_ = GeneratedMessageLite.h2(this.fields_);
    }

    private void J3() {
        if (this.oneofs_.l1()) {
            return;
        }
        this.oneofs_ = GeneratedMessageLite.h2(this.oneofs_);
    }

    private void K3() {
        if (this.options_.l1()) {
            return;
        }
        this.options_ = GeneratedMessageLite.h2(this.options_);
    }

    public static o3 L3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3(b3 b3Var) {
        b3Var.getClass();
        b3 b3Var2 = this.sourceContext_;
        if (b3Var2 == null || b3Var2 == b3.M2()) {
            this.sourceContext_ = b3Var;
        } else {
            this.sourceContext_ = b3.O2(this.sourceContext_).X1(b3Var).a1();
        }
    }

    public static b R3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b S3(o3 o3Var) {
        return DEFAULT_INSTANCE.G1(o3Var);
    }

    public static o3 T3(InputStream inputStream) throws IOException {
        return (o3) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static o3 U3(InputStream inputStream, p0 p0Var) throws IOException {
        return (o3) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static o3 V3(ByteString byteString) throws InvalidProtocolBufferException {
        return (o3) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static o3 W3(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (o3) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static o3 X3(w wVar) throws IOException {
        return (o3) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static o3 Y3(w wVar, p0 p0Var) throws IOException {
        return (o3) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static o3 Z3(InputStream inputStream) throws IOException {
        return (o3) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static o3 a4(InputStream inputStream, p0 p0Var) throws IOException {
        return (o3) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static o3 b4(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (o3) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o3 c4(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (o3) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static o3 d4(byte[] bArr) throws InvalidProtocolBufferException {
        return (o3) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static o3 e4(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (o3) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<o3> f4() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(int i10) {
        I3();
        this.fields_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(int i10) {
        K3();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4(int i10, Field.b bVar) {
        I3();
        this.fields_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4(int i10, Field field) {
        field.getClass();
        I3();
        this.fields_.set(i10, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l4(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.name_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(int i10, String str) {
        str.getClass();
        J3();
        this.oneofs_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n4(int i10, n2.b bVar) {
        K3();
        this.options_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4(int i10, n2 n2Var) {
        n2Var.getClass();
        K3();
        this.options_.set(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(Iterable<? extends Field> iterable) {
        I3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(b3.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(Iterable<String> iterable) {
        J3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q4(b3 b3Var) {
        b3Var.getClass();
        this.sourceContext_ = b3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(Iterable<? extends n2> iterable) {
        K3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r4(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i10, Field.b bVar) {
        I3();
        this.fields_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s4(int i10) {
        this.syntax_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(int i10, Field field) {
        field.getClass();
        I3();
        this.fields_.add(i10, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(Field.b bVar) {
        I3();
        this.fields_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(Field field) {
        field.getClass();
        I3();
        this.fields_.add(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(String str) {
        str.getClass();
        J3();
        this.oneofs_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        J3();
        this.oneofs_.add(byteString.n0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(int i10, n2.b bVar) {
        K3();
        this.options_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(int i10, n2 n2Var) {
        n2Var.getClass();
        K3();
        this.options_.add(i10, n2Var);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public List<Field> E() {
        return this.fields_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22568a[methodToInvoke.ordinal()]) {
            case 1:
                return new o3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", n2.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<o3> cVar = PARSER;
                if (cVar == null) {
                    synchronized (o3.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public ByteString K0(int i10) {
        return ByteString.w(this.oneofs_.get(i10));
    }

    public x0 M3(int i10) {
        return this.fields_.get(i10);
    }

    public List<? extends x0> N3() {
        return this.fields_;
    }

    public o2 O3(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public int P() {
        return this.oneofs_.size();
    }

    public List<? extends o2> P3() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public Field W0(int i10) {
        return this.fields_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public ByteString a() {
        return ByteString.w(this.name_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public List<n2> c() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public String c1(int i10) {
        return this.oneofs_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public n2 d(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public Syntax f() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public int g() {
        return this.syntax_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public String getName() {
        return this.name_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public boolean h() {
        return this.sourceContext_ != null;
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public b3 i() {
        b3 b3Var = this.sourceContext_;
        return b3Var == null ? b3.M2() : b3Var;
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public int n() {
        return this.fields_.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.p3
    public List<String> t0() {
        return this.oneofs_;
    }
}
