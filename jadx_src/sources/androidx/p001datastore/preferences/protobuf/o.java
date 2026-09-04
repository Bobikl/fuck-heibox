package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BoolValue.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends GeneratedMessageLite<o, b> implements p {
    private static final o DEFAULT_INSTANCE;
    private static volatile p2<o> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* JADX INFO: compiled from: BoolValue.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22562a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22562a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22562a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22562a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22562a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22562a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22562a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22562a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: BoolValue.java */
    public static final class b extends GeneratedMessageLite.b<o, b> implements p {
        private b() {
            super(o.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b b2() {
            T1();
            ((o) this.f22298c).K2();
            return this;
        }

        public b c2(boolean z10) {
            T1();
            ((o) this.f22298c).c3(z10);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.p
        public boolean getValue() {
            return ((o) this.f22298c).getValue();
        }
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        GeneratedMessageLite.F2(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        this.value_ = false;
    }

    public static o L2() {
        return DEFAULT_INSTANCE;
    }

    public static b M2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b N2(o oVar) {
        return DEFAULT_INSTANCE.G1(oVar);
    }

    public static o O2(boolean z10) {
        return M2().c2(z10).build();
    }

    public static o P2(InputStream inputStream) throws IOException {
        return (o) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static o Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (o) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static o R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (o) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static o S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (o) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static o T2(w wVar) throws IOException {
        return (o) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static o U2(w wVar, p0 p0Var) throws IOException {
        return (o) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static o V2(InputStream inputStream) throws IOException {
        return (o) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static o W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (o) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static o X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (o) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (o) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static o Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (o) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static o a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (o) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<o> b3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(boolean z10) {
        this.value_ = z10;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22562a[methodToInvoke.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<o> cVar = PARSER;
                if (cVar == null) {
                    synchronized (o.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.p
    public boolean getValue() {
        return this.value_;
    }
}
