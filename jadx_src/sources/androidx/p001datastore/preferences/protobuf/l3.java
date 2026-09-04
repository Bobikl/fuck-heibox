package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Timestamp.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l3 extends GeneratedMessageLite<l3, b> implements m3 {
    private static final l3 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile p2<l3> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* JADX INFO: compiled from: Timestamp.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22513a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22513a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22513a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22513a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22513a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22513a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22513a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22513a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Timestamp.java */
    public static final class b extends GeneratedMessageLite.b<l3, b> implements m3 {
        private b() {
            super(l3.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((l3) this.f22298c).M2();
            return this;
        }

        public b c2() {
            T1();
            ((l3) this.f22298c).N2();
            return this;
        }

        public b d2(int i10) {
            T1();
            ((l3) this.f22298c).e3(i10);
            return this;
        }

        public b e2(long j10) {
            T1();
            ((l3) this.f22298c).f3(j10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.m3
        public int m() {
            return ((l3) this.f22298c).m();
        }

        @Override // androidx.p001datastore.preferences.protobuf.m3
        public long q() {
            return ((l3) this.f22298c).q();
        }
    }

    static {
        l3 l3Var = new l3();
        DEFAULT_INSTANCE = l3Var;
        GeneratedMessageLite.F2(l3.class, l3Var);
    }

    private l3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.seconds_ = 0L;
    }

    public static l3 O2() {
        return DEFAULT_INSTANCE;
    }

    public static b P2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b Q2(l3 l3Var) {
        return DEFAULT_INSTANCE.G1(l3Var);
    }

    public static l3 R2(InputStream inputStream) throws IOException {
        return (l3) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static l3 S2(InputStream inputStream, p0 p0Var) throws IOException {
        return (l3) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static l3 T2(ByteString byteString) throws InvalidProtocolBufferException {
        return (l3) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static l3 U2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (l3) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static l3 V2(w wVar) throws IOException {
        return (l3) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static l3 W2(w wVar, p0 p0Var) throws IOException {
        return (l3) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static l3 X2(InputStream inputStream) throws IOException {
        return (l3) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static l3 Y2(InputStream inputStream, p0 p0Var) throws IOException {
        return (l3) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static l3 Z2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (l3) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l3 a3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (l3) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static l3 b3(byte[] bArr) throws InvalidProtocolBufferException {
        return (l3) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static l3 c3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (l3) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<l3> d3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3(int i10) {
        this.nanos_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(long j10) {
        this.seconds_ = j10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22513a[methodToInvoke.ordinal()]) {
            case 1:
                return new l3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<l3> cVar = PARSER;
                if (cVar == null) {
                    synchronized (l3.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.m3
    public int m() {
        return this.nanos_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.m3
    public long q() {
        return this.seconds_;
    }
}
