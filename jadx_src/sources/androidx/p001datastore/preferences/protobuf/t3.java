package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: UInt64Value.java */
/* JADX INFO: loaded from: classes6.dex */
public final class t3 extends GeneratedMessageLite<t3, b> implements u3 {
    private static final t3 DEFAULT_INSTANCE;
    private static volatile p2<t3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* JADX INFO: compiled from: UInt64Value.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22641a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22641a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22641a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22641a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22641a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22641a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22641a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22641a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: UInt64Value.java */
    public static final class b extends GeneratedMessageLite.b<t3, b> implements u3 {
        private b() {
            super(t3.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((t3) this.f22298c).K2();
            return this;
        }

        public b c2(long j10) {
            T1();
            ((t3) this.f22298c).c3(j10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.u3
        public long getValue() {
            return ((t3) this.f22298c).getValue();
        }
    }

    static {
        t3 t3Var = new t3();
        DEFAULT_INSTANCE = t3Var;
        GeneratedMessageLite.F2(t3.class, t3Var);
    }

    private t3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        this.value_ = 0L;
    }

    public static t3 L2() {
        return DEFAULT_INSTANCE;
    }

    public static b M2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b N2(t3 t3Var) {
        return DEFAULT_INSTANCE.G1(t3Var);
    }

    public static t3 O2(long j10) {
        return M2().c2(j10).build();
    }

    public static t3 P2(InputStream inputStream) throws IOException {
        return (t3) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static t3 Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (t3) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static t3 R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (t3) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static t3 S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (t3) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static t3 T2(w wVar) throws IOException {
        return (t3) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static t3 U2(w wVar, p0 p0Var) throws IOException {
        return (t3) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static t3 V2(InputStream inputStream) throws IOException {
        return (t3) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static t3 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (t3) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static t3 X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (t3) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t3 Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (t3) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static t3 Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (t3) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static t3 a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (t3) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<t3> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(long j10) {
        this.value_ = j10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22641a[methodToInvoke.ordinal()]) {
            case 1:
                return new t3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<t3> cVar = PARSER;
                if (cVar == null) {
                    synchronized (t3.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.u3
    public long getValue() {
        return this.value_;
    }
}
