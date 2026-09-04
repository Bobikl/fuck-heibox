package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Int64Value.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f1 extends GeneratedMessageLite<f1, b> implements g1 {
    private static final f1 DEFAULT_INSTANCE;
    private static volatile p2<f1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* JADX INFO: compiled from: Int64Value.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22447a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22447a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22447a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22447a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22447a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22447a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22447a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22447a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Int64Value.java */
    public static final class b extends GeneratedMessageLite.b<f1, b> implements g1 {
        private b() {
            super(f1.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((f1) this.f22298c).K2();
            return this;
        }

        public b c2(long j10) {
            T1();
            ((f1) this.f22298c).c3(j10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.g1
        public long getValue() {
            return ((f1) this.f22298c).getValue();
        }
    }

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        GeneratedMessageLite.F2(f1.class, f1Var);
    }

    private f1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        this.value_ = 0L;
    }

    public static f1 L2() {
        return DEFAULT_INSTANCE;
    }

    public static b M2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b N2(f1 f1Var) {
        return DEFAULT_INSTANCE.G1(f1Var);
    }

    public static f1 O2(long j10) {
        return M2().c2(j10).build();
    }

    public static f1 P2(InputStream inputStream) throws IOException {
        return (f1) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static f1 Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (f1) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static f1 R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static f1 S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static f1 T2(w wVar) throws IOException {
        return (f1) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static f1 U2(w wVar, p0 p0Var) throws IOException {
        return (f1) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static f1 V2(InputStream inputStream) throws IOException {
        return (f1) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static f1 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (f1) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static f1 X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f1 Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static f1 Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static f1 a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<f1> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(long j10) {
        this.value_ = j10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22447a[methodToInvoke.ordinal()]) {
            case 1:
                return new f1();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<f1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (f1.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.g1
    public long getValue() {
        return this.value_;
    }
}
