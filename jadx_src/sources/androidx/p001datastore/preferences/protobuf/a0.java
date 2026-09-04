package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: DoubleValue.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends GeneratedMessageLite<a0, b> implements b0 {
    private static final a0 DEFAULT_INSTANCE;
    private static volatile p2<a0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* JADX INFO: compiled from: DoubleValue.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22371a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22371a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22371a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22371a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22371a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22371a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22371a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22371a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: DoubleValue.java */
    public static final class b extends GeneratedMessageLite.b<a0, b> implements b0 {
        private b() {
            super(a0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((a0) this.f22298c).K2();
            return this;
        }

        public b c2(double d10) {
            T1();
            ((a0) this.f22298c).c3(d10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.b0
        public double getValue() {
            return ((a0) this.f22298c).getValue();
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        GeneratedMessageLite.F2(a0.class, a0Var);
    }

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        this.value_ = 0.0d;
    }

    public static a0 L2() {
        return DEFAULT_INSTANCE;
    }

    public static b M2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b N2(a0 a0Var) {
        return DEFAULT_INSTANCE.G1(a0Var);
    }

    public static a0 O2(double d10) {
        return M2().c2(d10).build();
    }

    public static a0 P2(InputStream inputStream) throws IOException {
        return (a0) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static a0 Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (a0) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static a0 R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (a0) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static a0 S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (a0) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static a0 T2(w wVar) throws IOException {
        return (a0) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static a0 U2(w wVar, p0 p0Var) throws IOException {
        return (a0) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static a0 V2(InputStream inputStream) throws IOException {
        return (a0) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static a0 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (a0) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static a0 X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (a0) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a0 Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (a0) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static a0 Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (a0) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static a0 a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (a0) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<a0> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(double d10) {
        this.value_ = d10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22371a[methodToInvoke.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<a0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (a0.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.b0
    public double getValue() {
        return this.value_;
    }
}
