package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Mixin.java */
/* JADX INFO: loaded from: classes6.dex */
public final class g2 extends GeneratedMessageLite<g2, b> implements h2 {
    private static final g2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile p2<g2> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* JADX INFO: compiled from: Mixin.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22448a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22448a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22448a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22448a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22448a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22448a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22448a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22448a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Mixin.java */
    public static final class b extends GeneratedMessageLite.b<g2, b> implements h2 {
        private b() {
            super(g2.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.p001datastore.preferences.protobuf.h2
        public ByteString a() {
            return ((g2) this.f22298c).a();
        }

        public b b2() {
            T1();
            ((g2) this.f22298c).O2();
            return this;
        }

        public b c2() {
            T1();
            ((g2) this.f22298c).P2();
            return this;
        }

        public b d2(String str) {
            T1();
            ((g2) this.f22298c).g3(str);
            return this;
        }

        public b e2(ByteString byteString) {
            T1();
            ((g2) this.f22298c).h3(byteString);
            return this;
        }

        public b f2(String str) {
            T1();
            ((g2) this.f22298c).i3(str);
            return this;
        }

        public b g2(ByteString byteString) {
            T1();
            ((g2) this.f22298c).j3(byteString);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.h2
        public String getName() {
            return ((g2) this.f22298c).getName();
        }

        @Override // androidx.p001datastore.preferences.protobuf.h2
        public String getRoot() {
            return ((g2) this.f22298c).getRoot();
        }

        @Override // androidx.p001datastore.preferences.protobuf.h2
        public ByteString x() {
            return ((g2) this.f22298c).x();
        }
    }

    static {
        g2 g2Var = new g2();
        DEFAULT_INSTANCE = g2Var;
        GeneratedMessageLite.F2(g2.class, g2Var);
    }

    private g2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2() {
        this.name_ = Q2().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2() {
        this.root_ = Q2().getRoot();
    }

    public static g2 Q2() {
        return DEFAULT_INSTANCE;
    }

    public static b R2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b S2(g2 g2Var) {
        return DEFAULT_INSTANCE.G1(g2Var);
    }

    public static g2 T2(InputStream inputStream) throws IOException {
        return (g2) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static g2 U2(InputStream inputStream, p0 p0Var) throws IOException {
        return (g2) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static g2 V2(ByteString byteString) throws InvalidProtocolBufferException {
        return (g2) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static g2 W2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (g2) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static g2 X2(w wVar) throws IOException {
        return (g2) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static g2 Y2(w wVar, p0 p0Var) throws IOException {
        return (g2) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static g2 Z2(InputStream inputStream) throws IOException {
        return (g2) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static g2 a3(InputStream inputStream, p0 p0Var) throws IOException {
        return (g2) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static g2 b3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (g2) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g2 c3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (g2) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static g2 d3(byte[] bArr) throws InvalidProtocolBufferException {
        return (g2) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static g2 e3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (g2) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<g2> f3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.name_ = byteString.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(String str) {
        str.getClass();
        this.root_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        this.root_ = byteString.n0();
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22448a[methodToInvoke.ordinal()]) {
            case 1:
                return new g2();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<g2> cVar = PARSER;
                if (cVar == null) {
                    synchronized (g2.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.h2
    public ByteString a() {
        return ByteString.w(this.name_);
    }

    @Override // androidx.p001datastore.preferences.protobuf.h2
    public String getName() {
        return this.name_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.h2
    public String getRoot() {
        return this.root_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.h2
    public ByteString x() {
        return ByteString.w(this.root_);
    }
}
