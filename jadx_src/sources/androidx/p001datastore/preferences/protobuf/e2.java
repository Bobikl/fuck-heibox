package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Method.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e2 extends GeneratedMessageLite<e2, b> implements f2 {
    private static final e2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile p2<e2> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private i1.k<n2> options_ = GeneratedMessageLite.R1();

    /* JADX INFO: compiled from: Method.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22443a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22443a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22443a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22443a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22443a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22443a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22443a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22443a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Method.java */
    public static final class b extends GeneratedMessageLite.b<e2, b> implements f2 {
        private b() {
            super(e2.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public boolean J() {
            return ((e2) this.f22298c).J();
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public String N0() {
            return ((e2) this.f22298c).N0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public String R0() {
            return ((e2) this.f22298c).R0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public ByteString a() {
            return ((e2) this.f22298c).a();
        }

        public b b2(Iterable<? extends n2> iterable) {
            T1();
            ((e2) this.f22298c).h3(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public List<n2> c() {
            return Collections.unmodifiableList(((e2) this.f22298c).c());
        }

        public b c2(int i10, n2.b bVar) {
            T1();
            ((e2) this.f22298c).i3(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public n2 d(int i10) {
            return ((e2) this.f22298c).d(i10);
        }

        public b d2(int i10, n2 n2Var) {
            T1();
            ((e2) this.f22298c).j3(i10, n2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public int e() {
            return ((e2) this.f22298c).e();
        }

        public b e2(n2.b bVar) {
            T1();
            ((e2) this.f22298c).k3(bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public Syntax f() {
            return ((e2) this.f22298c).f();
        }

        public b f2(n2 n2Var) {
            T1();
            ((e2) this.f22298c).l3(n2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public int g() {
            return ((e2) this.f22298c).g();
        }

        public b g2() {
            T1();
            ((e2) this.f22298c).m3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public String getName() {
            return ((e2) this.f22298c).getName();
        }

        public b h2() {
            T1();
            ((e2) this.f22298c).n3();
            return this;
        }

        public b i2() {
            T1();
            ((e2) this.f22298c).o3();
            return this;
        }

        public b j2() {
            T1();
            ((e2) this.f22298c).p3();
            return this;
        }

        public b k2() {
            T1();
            ((e2) this.f22298c).q3();
            return this;
        }

        public b l2() {
            T1();
            ((e2) this.f22298c).r3();
            return this;
        }

        public b m2() {
            T1();
            ((e2) this.f22298c).s3();
            return this;
        }

        public b n2(int i10) {
            T1();
            ((e2) this.f22298c).M3(i10);
            return this;
        }

        public b o2(String str) {
            T1();
            ((e2) this.f22298c).N3(str);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public boolean p0() {
            return ((e2) this.f22298c).p0();
        }

        public b p2(ByteString byteString) {
            T1();
            ((e2) this.f22298c).O3(byteString);
            return this;
        }

        public b q2(int i10, n2.b bVar) {
            T1();
            ((e2) this.f22298c).P3(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public ByteString r0() {
            return ((e2) this.f22298c).r0();
        }

        public b r2(int i10, n2 n2Var) {
            T1();
            ((e2) this.f22298c).Q3(i10, n2Var);
            return this;
        }

        public b s2(boolean z10) {
            T1();
            ((e2) this.f22298c).R3(z10);
            return this;
        }

        public b t2(String str) {
            T1();
            ((e2) this.f22298c).S3(str);
            return this;
        }

        public b u2(ByteString byteString) {
            T1();
            ((e2) this.f22298c).T3(byteString);
            return this;
        }

        public b v2(boolean z10) {
            T1();
            ((e2) this.f22298c).U3(z10);
            return this;
        }

        public b w2(String str) {
            T1();
            ((e2) this.f22298c).V3(str);
            return this;
        }

        public b x2(ByteString byteString) {
            T1();
            ((e2) this.f22298c).W3(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f2
        public ByteString y() {
            return ((e2) this.f22298c).y();
        }

        public b y2(Syntax syntax) {
            T1();
            ((e2) this.f22298c).X3(syntax);
            return this;
        }

        public b z2(int i10) {
            T1();
            ((e2) this.f22298c).Y3(i10);
            return this;
        }
    }

    static {
        e2 e2Var = new e2();
        DEFAULT_INSTANCE = e2Var;
        GeneratedMessageLite.F2(e2.class, e2Var);
    }

    private e2() {
    }

    public static e2 A3(InputStream inputStream, p0 p0Var) throws IOException {
        return (e2) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static e2 B3(ByteString byteString) throws InvalidProtocolBufferException {
        return (e2) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static e2 C3(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (e2) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static e2 D3(w wVar) throws IOException {
        return (e2) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static e2 E3(w wVar, p0 p0Var) throws IOException {
        return (e2) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static e2 F3(InputStream inputStream) throws IOException {
        return (e2) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static e2 G3(InputStream inputStream, p0 p0Var) throws IOException {
        return (e2) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static e2 H3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (e2) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e2 I3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (e2) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static e2 J3(byte[] bArr) throws InvalidProtocolBufferException {
        return (e2) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static e2 K3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (e2) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<e2> L3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(int i10) {
        t3();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.name_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(int i10, n2.b bVar) {
        t3();
        this.options_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3(int i10, n2 n2Var) {
        n2Var.getClass();
        t3();
        this.options_.set(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(boolean z10) {
        this.requestStreaming_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.requestTypeUrl_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3(boolean z10) {
        this.responseStreaming_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.responseTypeUrl_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(int i10) {
        this.syntax_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(Iterable<? extends n2> iterable) {
        t3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(int i10, n2.b bVar) {
        t3();
        this.options_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(int i10, n2 n2Var) {
        n2Var.getClass();
        t3();
        this.options_.add(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(n2.b bVar) {
        t3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(n2 n2Var) {
        n2Var.getClass();
        t3();
        this.options_.add(n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        this.name_ = u3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        this.options_ = GeneratedMessageLite.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3() {
        this.requestTypeUrl_ = u3().N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.responseTypeUrl_ = u3().R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        this.syntax_ = 0;
    }

    private void t3() {
        if (this.options_.l1()) {
            return;
        }
        this.options_ = GeneratedMessageLite.h2(this.options_);
    }

    public static e2 u3() {
        return DEFAULT_INSTANCE;
    }

    public static b x3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b y3(e2 e2Var) {
        return DEFAULT_INSTANCE.G1(e2Var);
    }

    public static e2 z3(InputStream inputStream) throws IOException {
        return (e2) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public boolean J() {
        return this.requestStreaming_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22443a[methodToInvoke.ordinal()]) {
            case 1:
                return new e2();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", n2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<e2> cVar = PARSER;
                if (cVar == null) {
                    synchronized (e2.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public String N0() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public String R0() {
        return this.responseTypeUrl_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public ByteString a() {
        return ByteString.w(this.name_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public List<n2> c() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public n2 d(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public int e() {
        return this.options_.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public Syntax f() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public int g() {
        return this.syntax_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public String getName() {
        return this.name_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public boolean p0() {
        return this.responseStreaming_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public ByteString r0() {
        return ByteString.w(this.responseTypeUrl_);
    }

    public o2 v3(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends o2> w3() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f2
    public ByteString y() {
        return ByteString.w(this.requestTypeUrl_);
    }
}
