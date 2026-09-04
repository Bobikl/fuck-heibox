package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Int32Value.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d1 extends GeneratedMessageLite<d1, b> implements e1 {
    private static final d1 DEFAULT_INSTANCE;
    private static volatile p2<d1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: compiled from: Int32Value.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22436a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22436a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22436a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22436a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22436a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22436a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22436a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22436a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Int32Value.java */
    public static final class b extends GeneratedMessageLite.b<d1, b> implements e1 {
        private b() {
            super(d1.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((d1) this.f22298c).K2();
            return this;
        }

        public b c2(int i10) {
            T1();
            ((d1) this.f22298c).c3(i10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.e1
        public int getValue() {
            return ((d1) this.f22298c).getValue();
        }
    }

    static {
        d1 d1Var = new d1();
        DEFAULT_INSTANCE = d1Var;
        GeneratedMessageLite.F2(d1.class, d1Var);
    }

    private d1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        this.value_ = 0;
    }

    public static d1 L2() {
        return DEFAULT_INSTANCE;
    }

    public static b M2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b N2(d1 d1Var) {
        return DEFAULT_INSTANCE.G1(d1Var);
    }

    public static d1 O2(int i10) {
        return M2().c2(i10).build();
    }

    public static d1 P2(InputStream inputStream) throws IOException {
        return (d1) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static d1 Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (d1) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static d1 R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static d1 S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static d1 T2(w wVar) throws IOException {
        return (d1) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static d1 U2(w wVar, p0 p0Var) throws IOException {
        return (d1) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static d1 V2(InputStream inputStream) throws IOException {
        return (d1) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static d1 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (d1) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static d1 X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d1 Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static d1 Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static d1 a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<d1> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(int i10) {
        this.value_ = i10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22436a[methodToInvoke.ordinal()]) {
            case 1:
                return new d1();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<d1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (d1.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.e1
    public int getValue() {
        return this.value_;
    }
}
