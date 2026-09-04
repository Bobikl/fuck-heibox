package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: UInt32Value.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r3 extends GeneratedMessageLite<r3, b> implements s3 {
    private static final r3 DEFAULT_INSTANCE;
    private static volatile p2<r3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: compiled from: UInt32Value.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22590a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22590a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22590a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22590a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22590a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22590a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22590a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22590a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: UInt32Value.java */
    public static final class b extends GeneratedMessageLite.b<r3, b> implements s3 {
        private b() {
            super(r3.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((r3) this.f22298c).K2();
            return this;
        }

        public b c2(int i10) {
            T1();
            ((r3) this.f22298c).c3(i10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.s3
        public int getValue() {
            return ((r3) this.f22298c).getValue();
        }
    }

    static {
        r3 r3Var = new r3();
        DEFAULT_INSTANCE = r3Var;
        GeneratedMessageLite.F2(r3.class, r3Var);
    }

    private r3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        this.value_ = 0;
    }

    public static r3 L2() {
        return DEFAULT_INSTANCE;
    }

    public static b M2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b N2(r3 r3Var) {
        return DEFAULT_INSTANCE.G1(r3Var);
    }

    public static r3 O2(int i10) {
        return M2().c2(i10).build();
    }

    public static r3 P2(InputStream inputStream) throws IOException {
        return (r3) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static r3 Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (r3) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static r3 R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (r3) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static r3 S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (r3) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static r3 T2(w wVar) throws IOException {
        return (r3) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static r3 U2(w wVar, p0 p0Var) throws IOException {
        return (r3) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static r3 V2(InputStream inputStream) throws IOException {
        return (r3) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static r3 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (r3) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static r3 X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (r3) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r3 Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (r3) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static r3 Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (r3) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static r3 a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (r3) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<r3> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(int i10) {
        this.value_ = i10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22590a[methodToInvoke.ordinal()]) {
            case 1:
                return new r3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<r3> cVar = PARSER;
                if (cVar == null) {
                    synchronized (r3.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.s3
    public int getValue() {
        return this.value_;
    }
}
