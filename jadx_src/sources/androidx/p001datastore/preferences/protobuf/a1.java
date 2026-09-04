package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: FloatValue.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a1 extends GeneratedMessageLite<a1, b> implements b1 {
    private static final a1 DEFAULT_INSTANCE;
    private static volatile p2<a1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    /* JADX INFO: compiled from: FloatValue.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22372a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22372a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22372a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22372a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22372a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22372a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22372a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22372a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: FloatValue.java */
    public static final class b extends GeneratedMessageLite.b<a1, b> implements b1 {
        private b() {
            super(a1.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((a1) this.f22298c).K2();
            return this;
        }

        public b c2(float f10) {
            T1();
            ((a1) this.f22298c).c3(f10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.b1
        public float getValue() {
            return ((a1) this.f22298c).getValue();
        }
    }

    static {
        a1 a1Var = new a1();
        DEFAULT_INSTANCE = a1Var;
        GeneratedMessageLite.F2(a1.class, a1Var);
    }

    private a1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        this.value_ = 0.0f;
    }

    public static a1 L2() {
        return DEFAULT_INSTANCE;
    }

    public static b M2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b N2(a1 a1Var) {
        return DEFAULT_INSTANCE.G1(a1Var);
    }

    public static a1 O2(float f10) {
        return M2().c2(f10).build();
    }

    public static a1 P2(InputStream inputStream) throws IOException {
        return (a1) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static a1 Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (a1) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static a1 R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static a1 S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static a1 T2(w wVar) throws IOException {
        return (a1) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static a1 U2(w wVar, p0 p0Var) throws IOException {
        return (a1) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static a1 V2(InputStream inputStream) throws IOException {
        return (a1) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static a1 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (a1) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static a1 X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a1 Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static a1 Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static a1 a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<a1> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(float f10) {
        this.value_ = f10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22372a[methodToInvoke.ordinal()]) {
            case 1:
                return new a1();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<a1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (a1.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.b1
    public float getValue() {
        return this.value_;
    }
}
