package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes6.dex */
public final class n2 extends GeneratedMessageLite<n2, b> implements o2 {
    private static final n2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile p2<n2> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private f value_;

    /* JADX INFO: compiled from: Option.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22561a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22561a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22561a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22561a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22561a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22561a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22561a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22561a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Option.java */
    public static final class b extends GeneratedMessageLite.b<n2, b> implements o2 {
        private b() {
            super(n2.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.p001datastore.preferences.protobuf.o2
        public ByteString a() {
            return ((n2) this.f22298c).a();
        }

        public b b2() {
            T1();
            ((n2) this.f22298c).P2();
            return this;
        }

        public b c2() {
            T1();
            ((n2) this.f22298c).Q2();
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.o2
        public boolean d1() {
            return ((n2) this.f22298c).d1();
        }

        public b d2(f fVar) {
            T1();
            ((n2) this.f22298c).S2(fVar);
            return this;
        }

        public b e2(String str) {
            T1();
            ((n2) this.f22298c).i3(str);
            return this;
        }

        public b f2(ByteString byteString) {
            T1();
            ((n2) this.f22298c).j3(byteString);
            return this;
        }

        public b g2(f.b bVar) {
            T1();
            ((n2) this.f22298c).k3(bVar);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.o2
        public String getName() {
            return ((n2) this.f22298c).getName();
        }

        @Override // androidx.p001datastore.preferences.protobuf.o2
        public f getValue() {
            return ((n2) this.f22298c).getValue();
        }

        public b h2(f fVar) {
            T1();
            ((n2) this.f22298c).l3(fVar);
            return this;
        }
    }

    static {
        n2 n2Var = new n2();
        DEFAULT_INSTANCE = n2Var;
        GeneratedMessageLite.F2(n2.class, n2Var);
    }

    private n2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2() {
        this.name_ = R2().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        this.value_ = null;
    }

    public static n2 R2() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2(f fVar) {
        fVar.getClass();
        f fVar2 = this.value_;
        if (fVar2 == null || fVar2 == f.P2()) {
            this.value_ = fVar;
        } else {
            this.value_ = f.R2(this.value_).X1(fVar).a1();
        }
    }

    public static b T2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b U2(n2 n2Var) {
        return DEFAULT_INSTANCE.G1(n2Var);
    }

    public static n2 V2(InputStream inputStream) throws IOException {
        return (n2) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static n2 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (n2) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static n2 X2(ByteString byteString) throws InvalidProtocolBufferException {
        return (n2) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static n2 Y2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (n2) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static n2 Z2(w wVar) throws IOException {
        return (n2) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static n2 a3(w wVar, p0 p0Var) throws IOException {
        return (n2) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static n2 b3(InputStream inputStream) throws IOException {
        return (n2) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static n2 c3(InputStream inputStream, p0 p0Var) throws IOException {
        return (n2) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static n2 d3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (n2) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n2 e3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (n2) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static n2 f3(byte[] bArr) throws InvalidProtocolBufferException {
        return (n2) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static n2 g3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (n2) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<n2> h3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.name_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(f.b bVar) {
        this.value_ = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(f fVar) {
        fVar.getClass();
        this.value_ = fVar;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22561a[methodToInvoke.ordinal()]) {
            case 1:
                return new n2();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<n2> cVar = PARSER;
                if (cVar == null) {
                    synchronized (n2.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.o2
    public ByteString a() {
        return ByteString.w(this.name_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.o2
    public boolean d1() {
        return this.value_ != null;
    }

    @Override // androidx.p001datastore.preferences.protobuf.o2
    public String getName() {
        return this.name_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.o2
    public f getValue() {
        f fVar = this.value_;
        return fVar == null ? f.P2() : fVar;
    }
}
