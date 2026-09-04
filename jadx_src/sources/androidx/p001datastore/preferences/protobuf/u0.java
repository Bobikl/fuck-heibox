package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FieldMask.java */
/* JADX INFO: loaded from: classes6.dex */
public final class u0 extends GeneratedMessageLite<u0, b> implements v0 {
    private static final u0 DEFAULT_INSTANCE;
    private static volatile p2<u0> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private i1.k<String> paths_ = GeneratedMessageLite.R1();

    /* JADX INFO: compiled from: FieldMask.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22643a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22643a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22643a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22643a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22643a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22643a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22643a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22643a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldMask.java */
    public static final class b extends GeneratedMessageLite.b<u0, b> implements v0 {
        private b() {
            super(u0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.p001datastore.preferences.protobuf.v0
        public List<String> A0() {
            return Collections.unmodifiableList(((u0) this.f22298c).A0());
        }

        @Override // androidx.p001datastore.preferences.protobuf.v0
        public int H0() {
            return ((u0) this.f22298c).H0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.v0
        public ByteString K(int i10) {
            return ((u0) this.f22298c).K(i10);
        }

        public b b2(Iterable<String> iterable) {
            T1();
            ((u0) this.f22298c).N2(iterable);
            return this;
        }

        public b c2(String str) {
            T1();
            ((u0) this.f22298c).O2(str);
            return this;
        }

        public b d2(ByteString byteString) {
            T1();
            ((u0) this.f22298c).P2(byteString);
            return this;
        }

        public b e2() {
            T1();
            ((u0) this.f22298c).Q2();
            return this;
        }

        public b f2(int i10, String str) {
            T1();
            ((u0) this.f22298c).i3(i10, str);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.v0
        public String q0(int i10) {
            return ((u0) this.f22298c).q0(i10);
        }
    }

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        GeneratedMessageLite.F2(u0.class, u0Var);
    }

    private u0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2(Iterable<String> iterable) {
        R2();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2(String str) {
        str.getClass();
        R2();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2(ByteString byteString) {
        byteString.getClass();
        androidx.p001datastore.preferences.protobuf.a.u1(byteString);
        R2();
        this.paths_.add(byteString.n0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        this.paths_ = GeneratedMessageLite.R1();
    }

    private void R2() {
        if (this.paths_.l1()) {
            return;
        }
        this.paths_ = GeneratedMessageLite.h2(this.paths_);
    }

    public static u0 S2() {
        return DEFAULT_INSTANCE;
    }

    public static b T2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b U2(u0 u0Var) {
        return DEFAULT_INSTANCE.G1(u0Var);
    }

    public static u0 V2(InputStream inputStream) throws IOException {
        return (u0) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static u0 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (u0) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static u0 X2(ByteString byteString) throws InvalidProtocolBufferException {
        return (u0) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static u0 Y2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (u0) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static u0 Z2(w wVar) throws IOException {
        return (u0) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static u0 a3(w wVar, p0 p0Var) throws IOException {
        return (u0) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static u0 b3(InputStream inputStream) throws IOException {
        return (u0) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static u0 c3(InputStream inputStream, p0 p0Var) throws IOException {
        return (u0) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static u0 d3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (u0) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u0 e3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (u0) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static u0 f3(byte[] bArr) throws InvalidProtocolBufferException {
        return (u0) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static u0 g3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (u0) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<u0> h3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(int i10, String str) {
        str.getClass();
        R2();
        this.paths_.set(i10, str);
    }

    @Override // androidx.p001datastore.preferences.protobuf.v0
    public List<String> A0() {
        return this.paths_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.v0
    public int H0() {
        return this.paths_.size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22643a[methodToInvoke.ordinal()]) {
            case 1:
                return new u0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<u0> cVar = PARSER;
                if (cVar == null) {
                    synchronized (u0.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.v0
    public ByteString K(int i10) {
        return ByteString.w(this.paths_.get(i10));
    }

    @Override // androidx.p001datastore.preferences.protobuf.v0
    public String q0(int i10) {
        return this.paths_.get(i10);
    }
}
