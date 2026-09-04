package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Empty.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends GeneratedMessageLite<f0, b> implements g0 {
    private static final f0 DEFAULT_INSTANCE;
    private static volatile p2<f0> PARSER;

    /* JADX INFO: compiled from: Empty.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22446a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22446a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22446a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22446a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22446a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22446a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22446a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22446a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Empty.java */
    public static final class b extends GeneratedMessageLite.b<f0, b> implements g0 {
        private b() {
            super(f0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        GeneratedMessageLite.F2(f0.class, f0Var);
    }

    private f0() {
    }

    public static f0 I2() {
        return DEFAULT_INSTANCE;
    }

    public static b J2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b K2(f0 f0Var) {
        return DEFAULT_INSTANCE.G1(f0Var);
    }

    public static f0 L2(InputStream inputStream) throws IOException {
        return (f0) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 M2(InputStream inputStream, p0 p0Var) throws IOException {
        return (f0) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static f0 N2(ByteString byteString) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static f0 O2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static f0 P2(w wVar) throws IOException {
        return (f0) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static f0 Q2(w wVar, p0 p0Var) throws IOException {
        return (f0) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static f0 R2(InputStream inputStream) throws IOException {
        return (f0) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 S2(InputStream inputStream, p0 p0Var) throws IOException {
        return (f0) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static f0 T2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f0 U2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static f0 V2(byte[] bArr) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static f0 W2(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<f0> X2() {
        return DEFAULT_INSTANCE.w();
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22446a[methodToInvoke.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<f0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (f0.class) {
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
}
