package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: StringValue.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e3 extends GeneratedMessageLite<e3, b> implements f3 {
    private static final e3 DEFAULT_INSTANCE;
    private static volatile p2<e3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* JADX INFO: compiled from: StringValue.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22444a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22444a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22444a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22444a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22444a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22444a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22444a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22444a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: StringValue.java */
    public static final class b extends GeneratedMessageLite.b<e3, b> implements f3 {
        private b() {
            super(e3.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((e3) this.f22298c).L2();
            return this;
        }

        public b c2(String str) {
            T1();
            ((e3) this.f22298c).d3(str);
            return this;
        }

        public b d2(ByteString byteString) {
            T1();
            ((e3) this.f22298c).e3(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.f3
        public String getValue() {
            return ((e3) this.f22298c).getValue();
        }

        @Override // androidx.p001datastore.preferences.protobuf.f3
        public ByteString r1() {
            return ((e3) this.f22298c).r1();
        }
    }

    static {
        e3 e3Var = new e3();
        DEFAULT_INSTANCE = e3Var;
        GeneratedMessageLite.F2(e3.class, e3Var);
    }

    private e3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2() {
        this.value_ = M2().getValue();
    }

    public static e3 M2() {
        return DEFAULT_INSTANCE;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(e3 e3Var) {
        return DEFAULT_INSTANCE.G1(e3Var);
    }

    public static e3 P2(String str) {
        return N2().c2(str).build();
    }

    public static e3 Q2(InputStream inputStream) throws IOException {
        return (e3) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static e3 R2(InputStream inputStream, p0 p0Var) throws IOException {
        return (e3) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static e3 S2(ByteString byteString) throws InvalidProtocolBufferException {
        return (e3) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static e3 T2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (e3) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static e3 U2(w wVar) throws IOException {
        return (e3) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static e3 V2(w wVar, p0 p0Var) throws IOException {
        return (e3) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static e3 W2(InputStream inputStream) throws IOException {
        return (e3) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static e3 X2(InputStream inputStream, p0 p0Var) throws IOException {
        return (e3) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static e3 Y2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (e3) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e3 Z2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (e3) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static e3 a3(byte[] bArr) throws InvalidProtocolBufferException {
        return (e3) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static e3 b3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (e3) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<e3> c3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.value_ = byteString.n0();
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22444a[methodToInvoke.ordinal()]) {
            case 1:
                return new e3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<e3> cVar = PARSER;
                if (cVar == null) {
                    synchronized (e3.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.f3
    public String getValue() {
        return this.value_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.f3
    public ByteString r1() {
        return ByteString.w(this.value_);
    }
}
