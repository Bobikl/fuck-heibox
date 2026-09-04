package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Enum.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 extends GeneratedMessageLite<i0, b> implements j0 {
    private static final i0 DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile p2<i0> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private b3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private i1.k<k0> enumvalue_ = GeneratedMessageLite.R1();
    private i1.k<n2> options_ = GeneratedMessageLite.R1();

    /* JADX INFO: compiled from: Enum.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22455a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22455a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22455a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22455a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22455a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22455a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22455a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22455a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Enum.java */
    public static final class b extends GeneratedMessageLite.b<i0, b> implements j0 {
        private b() {
            super(i0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(b3 b3Var) {
            T1();
            ((i0) this.f22298c).f4(b3Var);
            return this;
        }

        public b B2(Syntax syntax) {
            T1();
            ((i0) this.f22298c).g4(syntax);
            return this;
        }

        public b C2(int i10) {
            T1();
            ((i0) this.f22298c).h4(i10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public k0 E0(int i10) {
            return ((i0) this.f22298c).E0(i10);
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public List<k0> G() {
            return Collections.unmodifiableList(((i0) this.f22298c).G());
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public ByteString a() {
            return ((i0) this.f22298c).a();
        }

        public b b2(Iterable<? extends k0> iterable) {
            T1();
            ((i0) this.f22298c).k3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public List<n2> c() {
            return Collections.unmodifiableList(((i0) this.f22298c).c());
        }

        public b c2(Iterable<? extends n2> iterable) {
            T1();
            ((i0) this.f22298c).l3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public n2 d(int i10) {
            return ((i0) this.f22298c).d(i10);
        }

        public b d2(int i10, k0.b bVar) {
            T1();
            ((i0) this.f22298c).m3(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public int e() {
            return ((i0) this.f22298c).e();
        }

        public b e2(int i10, k0 k0Var) {
            T1();
            ((i0) this.f22298c).n3(i10, k0Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public Syntax f() {
            return ((i0) this.f22298c).f();
        }

        public b f2(k0.b bVar) {
            T1();
            ((i0) this.f22298c).o3(bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public int g() {
            return ((i0) this.f22298c).g();
        }

        public b g2(k0 k0Var) {
            T1();
            ((i0) this.f22298c).p3(k0Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public String getName() {
            return ((i0) this.f22298c).getName();
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public boolean h() {
            return ((i0) this.f22298c).h();
        }

        public b h2(int i10, n2.b bVar) {
            T1();
            ((i0) this.f22298c).q3(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public b3 i() {
            return ((i0) this.f22298c).i();
        }

        public b i2(int i10, n2 n2Var) {
            T1();
            ((i0) this.f22298c).r3(i10, n2Var);
            return this;
        }

        public b j2(n2.b bVar) {
            T1();
            ((i0) this.f22298c).s3(bVar);
            return this;
        }

        public b k2(n2 n2Var) {
            T1();
            ((i0) this.f22298c).t3(n2Var);
            return this;
        }

        public b l2() {
            T1();
            ((i0) this.f22298c).u3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j0
        public int m0() {
            return ((i0) this.f22298c).m0();
        }

        public b m2() {
            T1();
            ((i0) this.f22298c).v3();
            return this;
        }

        public b n2() {
            T1();
            ((i0) this.f22298c).w3();
            return this;
        }

        public b o2() {
            T1();
            ((i0) this.f22298c).x3();
            return this;
        }

        public b p2() {
            T1();
            ((i0) this.f22298c).y3();
            return this;
        }

        public b q2(b3 b3Var) {
            T1();
            ((i0) this.f22298c).G3(b3Var);
            return this;
        }

        public b r2(int i10) {
            T1();
            ((i0) this.f22298c).W3(i10);
            return this;
        }

        public b s2(int i10) {
            T1();
            ((i0) this.f22298c).X3(i10);
            return this;
        }

        public b t2(int i10, k0.b bVar) {
            T1();
            ((i0) this.f22298c).Y3(i10, bVar);
            return this;
        }

        public b u2(int i10, k0 k0Var) {
            T1();
            ((i0) this.f22298c).Z3(i10, k0Var);
            return this;
        }

        public b v2(String str) {
            T1();
            ((i0) this.f22298c).a4(str);
            return this;
        }

        public b w2(ByteString byteString) {
            T1();
            ((i0) this.f22298c).b4(byteString);
            return this;
        }

        public b x2(int i10, n2.b bVar) {
            T1();
            ((i0) this.f22298c).c4(i10, bVar);
            return this;
        }

        public b y2(int i10, n2 n2Var) {
            T1();
            ((i0) this.f22298c).d4(i10, n2Var);
            return this;
        }

        public b z2(b3.b bVar) {
            T1();
            ((i0) this.f22298c).e4(bVar);
            return this;
        }
    }

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        GeneratedMessageLite.F2(i0.class, i0Var);
    }

    private i0() {
    }

    private void A3() {
        if (this.options_.l1()) {
            return;
        }
        this.options_ = GeneratedMessageLite.h2(this.options_);
    }

    public static i0 B3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(b3 b3Var) {
        b3Var.getClass();
        b3 b3Var2 = this.sourceContext_;
        if (b3Var2 == null || b3Var2 == b3.M2()) {
            this.sourceContext_ = b3Var;
        } else {
            this.sourceContext_ = b3.O2(this.sourceContext_).X1(b3Var).a1();
        }
    }

    public static b H3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b I3(i0 i0Var) {
        return DEFAULT_INSTANCE.G1(i0Var);
    }

    public static i0 J3(InputStream inputStream) throws IOException {
        return (i0) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 K3(InputStream inputStream, p0 p0Var) throws IOException {
        return (i0) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static i0 L3(ByteString byteString) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static i0 M3(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static i0 N3(w wVar) throws IOException {
        return (i0) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static i0 O3(w wVar, p0 p0Var) throws IOException {
        return (i0) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static i0 P3(InputStream inputStream) throws IOException {
        return (i0) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 Q3(InputStream inputStream, p0 p0Var) throws IOException {
        return (i0) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static i0 R3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i0 S3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static i0 T3(byte[] bArr) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static i0 U3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<i0> V3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(int i10) {
        z3();
        this.enumvalue_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(int i10) {
        A3();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(int i10, k0.b bVar) {
        z3();
        this.enumvalue_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(int i10, k0 k0Var) {
        k0Var.getClass();
        z3();
        this.enumvalue_.set(i10, k0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.name_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(int i10, n2.b bVar) {
        A3();
        this.options_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(int i10, n2 n2Var) {
        n2Var.getClass();
        A3();
        this.options_.set(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(b3.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(b3 b3Var) {
        b3Var.getClass();
        this.sourceContext_ = b3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(int i10) {
        this.syntax_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(Iterable<? extends k0> iterable) {
        z3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(Iterable<? extends n2> iterable) {
        A3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(int i10, k0.b bVar) {
        z3();
        this.enumvalue_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3(int i10, k0 k0Var) {
        k0Var.getClass();
        z3();
        this.enumvalue_.add(i10, k0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3(k0.b bVar) {
        z3();
        this.enumvalue_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(k0 k0Var) {
        k0Var.getClass();
        z3();
        this.enumvalue_.add(k0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(int i10, n2.b bVar) {
        A3();
        this.options_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(int i10, n2 n2Var) {
        n2Var.getClass();
        A3();
        this.options_.add(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(n2.b bVar) {
        A3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(n2 n2Var) {
        n2Var.getClass();
        A3();
        this.options_.add(n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3() {
        this.enumvalue_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3() {
        this.name_ = B3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3() {
        this.options_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3() {
        this.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        this.syntax_ = 0;
    }

    private void z3() {
        if (this.enumvalue_.l1()) {
            return;
        }
        this.enumvalue_ = GeneratedMessageLite.h2(this.enumvalue_);
    }

    public l0 C3(int i10) {
        return this.enumvalue_.get(i10);
    }

    public List<? extends l0> D3() {
        return this.enumvalue_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public k0 E0(int i10) {
        return this.enumvalue_.get(i10);
    }

    public o2 E3(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends o2> F3() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public List<k0> G() {
        return this.enumvalue_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22455a[methodToInvoke.ordinal()]) {
            case 1:
                return new i0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", k0.class, "options_", n2.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<i0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (i0.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public ByteString a() {
        return ByteString.w(this.name_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public List<n2> c() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public n2 d(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public Syntax f() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public int g() {
        return this.syntax_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public boolean h() {
        return this.sourceContext_ != null;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public b3 i() {
        b3 b3Var = this.sourceContext_;
        return b3Var == null ? b3.M2() : b3Var;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j0
    public int m0() {
        return this.enumvalue_.size();
    }
}
