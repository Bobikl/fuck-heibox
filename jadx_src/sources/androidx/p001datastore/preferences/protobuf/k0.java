package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: EnumValue.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k0 extends GeneratedMessageLite<k0, b> implements l0 {
    private static final k0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile p2<k0> PARSER;
    private int number_;
    private String name_ = "";
    private i1.k<n2> options_ = GeneratedMessageLite.R1();

    /* JADX INFO: compiled from: EnumValue.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22495a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22495a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22495a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22495a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22495a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22495a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22495a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22495a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: EnumValue.java */
    public static final class b extends GeneratedMessageLite.b<k0, b> implements l0 {
        private b() {
            super(k0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.p001datastore.preferences.protobuf.l0
        public ByteString a() {
            return ((k0) this.f22298c).a();
        }

        public b b2(Iterable<? extends n2> iterable) {
            T1();
            ((k0) this.f22298c).W2(iterable);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.l0
        public List<n2> c() {
            return Collections.unmodifiableList(((k0) this.f22298c).c());
        }

        public b c2(int i10, n2.b bVar) {
            T1();
            ((k0) this.f22298c).X2(i10, bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.l0
        public n2 d(int i10) {
            return ((k0) this.f22298c).d(i10);
        }

        public b d2(int i10, n2 n2Var) {
            T1();
            ((k0) this.f22298c).Y2(i10, n2Var);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.l0
        public int e() {
            return ((k0) this.f22298c).e();
        }

        public b e2(n2.b bVar) {
            T1();
            ((k0) this.f22298c).Z2(bVar);
            return this;
        }

        public b f2(n2 n2Var) {
            T1();
            ((k0) this.f22298c).a3(n2Var);
            return this;
        }

        public b g2() {
            T1();
            ((k0) this.f22298c).b3();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.l0
        public String getName() {
            return ((k0) this.f22298c).getName();
        }

        @Override // androidx.p001datastore.preferences.protobuf.l0
        public int getNumber() {
            return ((k0) this.f22298c).getNumber();
        }

        public b h2() {
            T1();
            ((k0) this.f22298c).c3();
            return this;
        }

        public b i2() {
            T1();
            ((k0) this.f22298c).d3();
            return this;
        }

        public b j2(int i10) {
            T1();
            ((k0) this.f22298c).x3(i10);
            return this;
        }

        public b k2(String str) {
            T1();
            ((k0) this.f22298c).y3(str);
            return this;
        }

        public b l2(ByteString byteString) {
            T1();
            ((k0) this.f22298c).z3(byteString);
            return this;
        }

        public b m2(int i10) {
            T1();
            ((k0) this.f22298c).A3(i10);
            return this;
        }

        public b n2(int i10, n2.b bVar) {
            T1();
            ((k0) this.f22298c).B3(i10, bVar);
            return this;
        }

        public b o2(int i10, n2 n2Var) {
            T1();
            ((k0) this.f22298c).C3(i10, n2Var);
            return this;
        }
    }

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        GeneratedMessageLite.F2(k0.class, k0Var);
    }

    private k0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(int i10) {
        this.number_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(int i10, n2.b bVar) {
        e3();
        this.options_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i10, n2 n2Var) {
        n2Var.getClass();
        e3();
        this.options_.set(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W2(Iterable<? extends n2> iterable) {
        e3();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X2(int i10, n2.b bVar) {
        e3();
        this.options_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2(int i10, n2 n2Var) {
        n2Var.getClass();
        e3();
        this.options_.add(i10, n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2(n2.b bVar) {
        e3();
        this.options_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(n2 n2Var) {
        n2Var.getClass();
        e3();
        this.options_.add(n2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3() {
        this.name_ = f3().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        this.options_ = GeneratedMessageLite.R1();
    }

    private void e3() {
        if (this.options_.l1()) {
            return;
        }
        this.options_ = GeneratedMessageLite.h2(this.options_);
    }

    public static k0 f3() {
        return DEFAULT_INSTANCE;
    }

    public static b i3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b j3(k0 k0Var) {
        return DEFAULT_INSTANCE.G1(k0Var);
    }

    public static k0 k3(InputStream inputStream) throws IOException {
        return (k0) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static k0 l3(InputStream inputStream, p0 p0Var) throws IOException {
        return (k0) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static k0 m3(ByteString byteString) throws InvalidProtocolBufferException {
        return (k0) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static k0 n3(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (k0) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static k0 o3(w wVar) throws IOException {
        return (k0) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static k0 p3(w wVar, p0 p0Var) throws IOException {
        return (k0) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static k0 q3(InputStream inputStream) throws IOException {
        return (k0) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static k0 r3(InputStream inputStream, p0 p0Var) throws IOException {
        return (k0) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static k0 s3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (k0) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k0 t3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (k0) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static k0 u3(byte[] bArr) throws InvalidProtocolBufferException {
        return (k0) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static k0 v3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (k0) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<k0> w3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(int i10) {
        e3();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.name_ = byteString.n0();
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22495a[methodToInvoke.ordinal()]) {
            case 1:
                return new k0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", n2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<k0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (k0.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.l0
    public ByteString a() {
        return ByteString.w(this.name_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.l0
    public List<n2> c() {
        return this.options_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.l0
    public n2 d(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.l0
    public int e() {
        return this.options_.size();
    }

    public o2 g3(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.l0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.l0
    public int getNumber() {
        return this.number_;
    }

    public List<? extends o2> h3() {
        return this.options_;
    }
}
