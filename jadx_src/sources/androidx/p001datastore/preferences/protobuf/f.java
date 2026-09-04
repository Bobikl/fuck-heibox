package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Any.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends GeneratedMessageLite<f, b> implements g {
    private static final f DEFAULT_INSTANCE;
    private static volatile p2<f> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f22239f;

    /* JADX INFO: compiled from: Any.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22445a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22445a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22445a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22445a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22445a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22445a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22445a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22445a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Any.java */
    public static final class b extends GeneratedMessageLite.b<f, b> implements g {
        private b() {
            super(f.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((f) this.f22298c).N2();
            return this;
        }

        public b c2() {
            T1();
            ((f) this.f22298c).O2();
            return this;
        }

        public b d2(String str) {
            T1();
            ((f) this.f22298c).f3(str);
            return this;
        }

        public b e2(ByteString byteString) {
            T1();
            ((f) this.f22298c).g3(byteString);
            return this;
        }

        public b f2(ByteString byteString) {
            T1();
            ((f) this.f22298c).h3(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.g
        public ByteString getValue() {
            return ((f) this.f22298c).getValue();
        }

        @Override // androidx.p001datastore.preferences.protobuf.g
        public ByteString o() {
            return ((f) this.f22298c).o();
        }

        @Override // androidx.p001datastore.preferences.protobuf.g
        public String p() {
            return ((f) this.f22298c).p();
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.F2(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.typeUrl_ = P2().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2() {
        this.value_ = P2().getValue();
    }

    public static f P2() {
        return DEFAULT_INSTANCE;
    }

    public static b Q2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b R2(f fVar) {
        return DEFAULT_INSTANCE.G1(fVar);
    }

    public static f S2(InputStream inputStream) throws IOException {
        return (f) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static f T2(InputStream inputStream, p0 p0Var) throws IOException {
        return (f) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static f U2(ByteString byteString) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static f V2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static f W2(w wVar) throws IOException {
        return (f) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static f X2(w wVar, p0 p0Var) throws IOException {
        return (f) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static f Y2(InputStream inputStream) throws IOException {
        return (f) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static f Z2(InputStream inputStream, p0 p0Var) throws IOException {
        return (f) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static f a3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f b3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static f c3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static f d3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<f> e3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.typeUrl_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22445a[methodToInvoke.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<f> cVar = PARSER;
                if (cVar == null) {
                    synchronized (f.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.g
    public ByteString getValue() {
        return this.value_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.g
    public ByteString o() {
        return ByteString.w(this.typeUrl_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.g
    public String p() {
        return this.typeUrl_;
    }
}
