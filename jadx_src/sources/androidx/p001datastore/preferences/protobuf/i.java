package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Api.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends GeneratedMessageLite<i, b> implements j {
    private static final i DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile p2<i> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private b3 sourceContext_;
    private int syntax_;
    private String name_ = "";
    private i1.k<e2> methods_ = GeneratedMessageLite.R1();
    private i1.k<n2> options_ = GeneratedMessageLite.R1();
    private String version_ = "";
    private i1.k<g2> mixins_ = GeneratedMessageLite.R1();

    /* JADX INFO: compiled from: Api.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22454a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22454a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22454a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22454a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22454a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22454a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22454a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22454a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Api.java */
    public static final class b extends GeneratedMessageLite.b<i, b> implements j {
        private b() {
            super(i.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A2(int i10) {
            T1();
            ((i) this.f22298c).u4(i10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public List<g2> B0() {
            return Collections.unmodifiableList(((i) this.f22298c).B0());
        }

        public b B2(int i10, e2.b bVar) {
            T1();
            ((i) this.f22298c).v4(i10, bVar);
            return this;
        }

        public b C2(int i10, e2 e2Var) {
            T1();
            ((i) this.f22298c).w4(i10, e2Var);
            return this;
        }

        public b D2(int i10, g2.b bVar) {
            T1();
            ((i) this.f22298c).x4(i10, bVar);
            return this;
        }

        public b E2(int i10, g2 g2Var) {
            T1();
            ((i) this.f22298c).y4(i10, g2Var);
            return this;
        }

        public b F2(String str) {
            T1();
            ((i) this.f22298c).z4(str);
            return this;
        }

        public b G2(ByteString byteString) {
            T1();
            ((i) this.f22298c).A4(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public e2 H(int i10) {
            return ((i) this.f22298c).H(i10);
        }

        public b H2(int i10, n2.b bVar) {
            T1();
            ((i) this.f22298c).B4(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public List<e2> I0() {
            return Collections.unmodifiableList(((i) this.f22298c).I0());
        }

        public b I2(int i10, n2 n2Var) {
            T1();
            ((i) this.f22298c).C4(i10, n2Var);
            return this;
        }

        public b J2(b3.b bVar) {
            T1();
            ((i) this.f22298c).D4(bVar);
            return this;
        }

        public b K2(b3 b3Var) {
            T1();
            ((i) this.f22298c).E4(b3Var);
            return this;
        }

        public b L2(Syntax syntax) {
            T1();
            ((i) this.f22298c).F4(syntax);
            return this;
        }

        public b M2(int i10) {
            T1();
            ((i) this.f22298c).G4(i10);
            return this;
        }

        public b N2(String str) {
            T1();
            ((i) this.f22298c).H4(str);
            return this;
        }

        public b O2(ByteString byteString) {
            T1();
            ((i) this.f22298c).I4(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public int Q() {
            return ((i) this.f22298c).Q();
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public ByteString a() {
            return ((i) this.f22298c).a();
        }

        public b b2(Iterable<? extends e2> iterable) {
            T1();
            ((i) this.f22298c).w3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public List<n2> c() {
            return Collections.unmodifiableList(((i) this.f22298c).c());
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public ByteString c0() {
            return ((i) this.f22298c).c0();
        }

        public b c2(Iterable<? extends g2> iterable) {
            T1();
            ((i) this.f22298c).x3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public n2 d(int i10) {
            return ((i) this.f22298c).d(i10);
        }

        public b d2(Iterable<? extends n2> iterable) {
            T1();
            ((i) this.f22298c).y3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public int e() {
            return ((i) this.f22298c).e();
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public int e0() {
            return ((i) this.f22298c).e0();
        }

        public b e2(int i10, e2.b bVar) {
            T1();
            ((i) this.f22298c).z3(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public Syntax f() {
            return ((i) this.f22298c).f();
        }

        public b f2(int i10, e2 e2Var) {
            T1();
            ((i) this.f22298c).A3(i10, e2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public int g() {
            return ((i) this.f22298c).g();
        }

        public b g2(e2.b bVar) {
            T1();
            ((i) this.f22298c).B3(bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public String getName() {
            return ((i) this.f22298c).getName();
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public String getVersion() {
            return ((i) this.f22298c).getVersion();
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public boolean h() {
            return ((i) this.f22298c).h();
        }

        public b h2(e2 e2Var) {
            T1();
            ((i) this.f22298c).C3(e2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public b3 i() {
            return ((i) this.f22298c).i();
        }

        public b i2(int i10, g2.b bVar) {
            T1();
            ((i) this.f22298c).D3(i10, bVar);
            return this;
        }

        public b j2(int i10, g2 g2Var) {
            T1();
            ((i) this.f22298c).E3(i10, g2Var);
            return this;
        }

        public b k2(g2.b bVar) {
            T1();
            ((i) this.f22298c).F3(bVar);
            return this;
        }

        public b l2(g2 g2Var) {
            T1();
            ((i) this.f22298c).G3(g2Var);
            return this;
        }

        public b m2(int i10, n2.b bVar) {
            T1();
            ((i) this.f22298c).H3(i10, bVar);
            return this;
        }

        public b n2(int i10, n2 n2Var) {
            T1();
            ((i) this.f22298c).I3(i10, n2Var);
            return this;
        }

        public b o2(n2.b bVar) {
            T1();
            ((i) this.f22298c).J3(bVar);
            return this;
        }

        public b p2(n2 n2Var) {
            T1();
            ((i) this.f22298c).K3(n2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.j
        public g2 q1(int i10) {
            return ((i) this.f22298c).q1(i10);
        }

        public b q2() {
            T1();
            ((i) this.f22298c).L3();
            return this;
        }

        public b r2() {
            T1();
            ((i) this.f22298c).M3();
            return this;
        }

        public b s2() {
            T1();
            ((i) this.f22298c).N3();
            return this;
        }

        public b t2() {
            T1();
            ((i) this.f22298c).O3();
            return this;
        }

        public b u2() {
            T1();
            ((i) this.f22298c).P3();
            return this;
        }

        public b v2() {
            T1();
            ((i) this.f22298c).Q3();
            return this;
        }

        public b w2() {
            T1();
            ((i) this.f22298c).R3();
            return this;
        }

        public b x2(b3 b3Var) {
            T1();
            ((i) this.f22298c).c4(b3Var);
            return this;
        }

        public b y2(int i10) {
            T1();
            ((i) this.f22298c).s4(i10);
            return this;
        }

        public b z2(int i10) {
            T1();
            ((i) this.f22298c).t4(i10);
            return this;
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.F2(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(int i10, e2 e2Var) {
        e2Var.getClass();
        S3();
        this.methods_.add(i10, e2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A4(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.name_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(e2.b bVar) {
        S3();
        this.methods_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4(int i10, n2.b bVar) {
        U3();
        this.options_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(e2 e2Var) {
        e2Var.getClass();
        S3();
        this.methods_.add(e2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C4(int i10, n2 n2Var) {
        n2Var.getClass();
        U3();
        this.options_.set(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(int i10, g2.b bVar) {
        T3();
        this.mixins_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D4(b3.b bVar) {
        this.sourceContext_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(int i10, g2 g2Var) {
        g2Var.getClass();
        T3();
        this.mixins_.add(i10, g2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E4(b3 b3Var) {
        b3Var.getClass();
        this.sourceContext_ = b3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(g2.b bVar) {
        T3();
        this.mixins_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F4(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(g2 g2Var) {
        g2Var.getClass();
        T3();
        this.mixins_.add(g2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G4(int i10) {
        this.syntax_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(int i10, n2.b bVar) {
        U3();
        this.options_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H4(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(int i10, n2 n2Var) {
        n2Var.getClass();
        U3();
        this.options_.add(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I4(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.version_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(n2.b bVar) {
        U3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(n2 n2Var) {
        n2Var.getClass();
        U3();
        this.options_.add(n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3() {
        this.methods_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3() {
        this.mixins_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3() {
        this.name_ = V3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3() {
        this.options_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3() {
        this.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3() {
        this.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3() {
        this.version_ = V3().getVersion();
    }

    private void S3() {
        if (this.methods_.l1()) {
            return;
        }
        this.methods_ = GeneratedMessageLite.h2(this.methods_);
    }

    private void T3() {
        if (this.mixins_.l1()) {
            return;
        }
        this.mixins_ = GeneratedMessageLite.h2(this.mixins_);
    }

    private void U3() {
        if (this.options_.l1()) {
            return;
        }
        this.options_ = GeneratedMessageLite.h2(this.options_);
    }

    public static i V3() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(b3 b3Var) {
        b3Var.getClass();
        b3 b3Var2 = this.sourceContext_;
        if (b3Var2 == null || b3Var2 == b3.M2()) {
            this.sourceContext_ = b3Var;
        } else {
            this.sourceContext_ = b3.O2(this.sourceContext_).X1(b3Var).a1();
        }
    }

    public static b d4() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b e4(i iVar) {
        return DEFAULT_INSTANCE.G1(iVar);
    }

    public static i f4(InputStream inputStream) throws IOException {
        return (i) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static i g4(InputStream inputStream, p0 p0Var) throws IOException {
        return (i) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static i h4(ByteString byteString) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static i i4(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static i j4(w wVar) throws IOException {
        return (i) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static i k4(w wVar, p0 p0Var) throws IOException {
        return (i) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static i l4(InputStream inputStream) throws IOException {
        return (i) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static i m4(InputStream inputStream, p0 p0Var) throws IOException {
        return (i) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static i n4(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i o4(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static i p4(byte[] bArr) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static i q4(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<i> r4() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s4(int i10) {
        S3();
        this.methods_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t4(int i10) {
        T3();
        this.mixins_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u4(int i10) {
        U3();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v4(int i10, e2.b bVar) {
        S3();
        this.methods_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(Iterable<? extends e2> iterable) {
        S3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w4(int i10, e2 e2Var) {
        e2Var.getClass();
        S3();
        this.methods_.set(i10, e2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(Iterable<? extends g2> iterable) {
        T3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x4(int i10, g2.b bVar) {
        T3();
        this.mixins_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(Iterable<? extends n2> iterable) {
        U3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y4(int i10, g2 g2Var) {
        g2Var.getClass();
        T3();
        this.mixins_.set(i10, g2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(int i10, e2.b bVar) {
        S3();
        this.methods_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4(String str) {
        str.getClass();
        this.name_ = str;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public List<g2> B0() {
        return this.mixins_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public e2 H(int i10) {
        return this.methods_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public List<e2> I0() {
        return this.methods_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22454a[methodToInvoke.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", e2.class, "options_", n2.class, "version_", "sourceContext_", "mixins_", g2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<i> cVar = PARSER;
                if (cVar == null) {
                    synchronized (i.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.j
    public int Q() {
        return this.mixins_.size();
    }

    public f2 W3(int i10) {
        return this.methods_.get(i10);
    }

    public List<? extends f2> X3() {
        return this.methods_;
    }

    public h2 Y3(int i10) {
        return this.mixins_.get(i10);
    }

    public List<? extends h2> Z3() {
        return this.mixins_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public ByteString a() {
        return ByteString.w(this.name_);
    }

    public o2 a4(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends o2> b4() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public List<n2> c() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public ByteString c0() {
        return ByteString.w(this.version_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public n2 d(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public int e0() {
        return this.methods_.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public Syntax f() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public int g() {
        return this.syntax_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public String getName() {
        return this.name_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public String getVersion() {
        return this.version_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public boolean h() {
        return this.sourceContext_ != null;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public b3 i() {
        b3 b3Var = this.sourceContext_;
        return b3Var == null ? b3.M2() : b3Var;
    }

    @Override // androidx.p001datastore.preferences.protobuf.j
    public g2 q1(int i10) {
        return this.mixins_.get(i10);
    }
}
