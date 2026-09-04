package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BytesValue.java */
/* JADX INFO: loaded from: classes6.dex */
public final class u extends GeneratedMessageLite<u, b> implements v {
    private static final u DEFAULT_INSTANCE;
    private static volatile p2<u> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_ = ByteString.f22239f;

    /* JADX INFO: compiled from: BytesValue.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22642a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22642a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22642a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22642a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22642a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22642a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22642a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22642a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: BytesValue.java */
    public static final class b extends GeneratedMessageLite.b<u, b> implements v {
        private b() {
            super(u.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((u) this.f22298c).K2();
            return this;
        }

        public b c2(ByteString byteString) {
            T1();
            ((u) this.f22298c).c3(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.v
        public ByteString getValue() {
            return ((u) this.f22298c).getValue();
        }
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        GeneratedMessageLite.F2(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        this.value_ = L2().getValue();
    }

    public static u L2() {
        return DEFAULT_INSTANCE;
    }

    public static b M2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b N2(u uVar) {
        return DEFAULT_INSTANCE.G1(uVar);
    }

    public static u O2(ByteString byteString) {
        return M2().c2(byteString).build();
    }

    public static u P2(InputStream inputStream) throws IOException {
        return (u) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static u Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (u) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static u R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (u) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static u S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (u) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static u T2(w wVar) throws IOException {
        return (u) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static u U2(w wVar, p0 p0Var) throws IOException {
        return (u) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static u V2(InputStream inputStream) throws IOException {
        return (u) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static u W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (u) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static u X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (u) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (u) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static u Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (u) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static u a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (u) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<u> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22642a[methodToInvoke.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<u> cVar = PARSER;
                if (cVar == null) {
                    synchronized (u.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.v
    public ByteString getValue() {
        return this.value_;
    }
}
