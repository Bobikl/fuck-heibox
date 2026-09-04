package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SourceContext.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b3 extends GeneratedMessageLite<b3, b> implements c3 {
    private static final b3 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile p2<b3> PARSER;
    private String fileName_ = "";

    /* JADX INFO: compiled from: SourceContext.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22399a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22399a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22399a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22399a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22399a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22399a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22399a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22399a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: SourceContext.java */
    public static final class b extends GeneratedMessageLite.b<b3, b> implements c3 {
        private b() {
            super(b3.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((b3) this.f22298c).L2();
            return this;
        }

        public b c2(String str) {
            T1();
            ((b3) this.f22298c).c3(str);
            return this;
        }

        public b d2(ByteString byteString) {
            T1();
            ((b3) this.f22298c).d3(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.c3
        public String getFileName() {
            return ((b3) this.f22298c).getFileName();
        }

        @Override // androidx.p001datastore.preferences.protobuf.c3
        public ByteString i0() {
            return ((b3) this.f22298c).i0();
        }
    }

    static {
        b3 b3Var = new b3();
        DEFAULT_INSTANCE = b3Var;
        GeneratedMessageLite.F2(b3.class, b3Var);
    }

    private b3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2() {
        this.fileName_ = M2().getFileName();
    }

    public static b3 M2() {
        return DEFAULT_INSTANCE;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(b3 b3Var) {
        return DEFAULT_INSTANCE.G1(b3Var);
    }

    public static b3 P2(InputStream inputStream) throws IOException {
        return (b3) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static b3 Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (b3) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static b3 R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (b3) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static b3 S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (b3) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static b3 T2(w wVar) throws IOException {
        return (b3) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static b3 U2(w wVar, p0 p0Var) throws IOException {
        return (b3) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static b3 V2(InputStream inputStream) throws IOException {
        return (b3) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static b3 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (b3) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static b3 X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (b3) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b3 Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (b3) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static b3 Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (b3) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static b3 a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (b3) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<b3> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.fileName_ = byteString.n0();
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22399a[methodToInvoke.ordinal()]) {
            case 1:
                return new b3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<b3> cVar = PARSER;
                if (cVar == null) {
                    synchronized (b3.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.c3
    public String getFileName() {
        return this.fileName_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c3
    public ByteString i0() {
        return ByteString.w(this.fileName_);
    }
}
