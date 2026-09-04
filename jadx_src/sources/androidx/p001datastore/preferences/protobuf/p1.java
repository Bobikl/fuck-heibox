package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ListValue.java */
/* JADX INFO: loaded from: classes6.dex */
public final class p1 extends GeneratedMessageLite<p1, b> implements q1 {
    private static final p1 DEFAULT_INSTANCE;
    private static volatile p2<p1> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private i1.k<Value> values_ = GeneratedMessageLite.R1();

    /* JADX INFO: compiled from: ListValue.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22578a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22578a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22578a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22578a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22578a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22578a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22578a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22578a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: ListValue.java */
    public static final class b extends GeneratedMessageLite.b<p1, b> implements q1 {
        private b() {
            super(p1.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.p001datastore.preferences.protobuf.q1
        public int V() {
            return ((p1) this.f22298c).V();
        }

        public b b2(Iterable<? extends Value> iterable) {
            T1();
            ((p1) this.f22298c).R2(iterable);
            return this;
        }

        public b c2(int i10, Value.b bVar) {
            T1();
            ((p1) this.f22298c).S2(i10, bVar);
            return this;
        }

        public b d2(int i10, Value value) {
            T1();
            ((p1) this.f22298c).T2(i10, value);
            return this;
        }

        public b e2(Value.b bVar) {
            T1();
            ((p1) this.f22298c).U2(bVar);
            return this;
        }

        public b f2(Value value) {
            T1();
            ((p1) this.f22298c).V2(value);
            return this;
        }

        public b g2() {
            T1();
            ((p1) this.f22298c).W2();
            return this;
        }

        public b h2(int i10) {
            T1();
            ((p1) this.f22298c).q3(i10);
            return this;
        }

        public b i2(int i10, Value.b bVar) {
            T1();
            ((p1) this.f22298c).r3(i10, bVar);
            return this;
        }

        public b j2(int i10, Value value) {
            T1();
            ((p1) this.f22298c).s3(i10, value);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.q1
        public List<Value> k1() {
            return Collections.unmodifiableList(((p1) this.f22298c).k1());
        }

        @Override // androidx.p001datastore.preferences.protobuf.q1
        public Value p1(int i10) {
            return ((p1) this.f22298c).p1(i10);
        }
    }

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        GeneratedMessageLite.F2(p1.class, p1Var);
    }

    private p1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2(Iterable<? extends Value> iterable) {
        X2();
        androidx.p001datastore.preferences.protobuf.a.N(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2(int i10, Value.b bVar) {
        X2();
        this.values_.add(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2(int i10, Value value) {
        value.getClass();
        X2();
        this.values_.add(i10, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2(Value.b bVar) {
        X2();
        this.values_.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V2(Value value) {
        value.getClass();
        X2();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W2() {
        this.values_ = GeneratedMessageLite.R1();
    }

    private void X2() {
        if (this.values_.l1()) {
            return;
        }
        this.values_ = GeneratedMessageLite.h2(this.values_);
    }

    public static p1 Y2() {
        return DEFAULT_INSTANCE;
    }

    public static b b3() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b c3(p1 p1Var) {
        return DEFAULT_INSTANCE.G1(p1Var);
    }

    public static p1 d3(InputStream inputStream) throws IOException {
        return (p1) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static p1 e3(InputStream inputStream, p0 p0Var) throws IOException {
        return (p1) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static p1 f3(ByteString byteString) throws InvalidProtocolBufferException {
        return (p1) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static p1 g3(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (p1) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static p1 h3(w wVar) throws IOException {
        return (p1) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static p1 i3(w wVar, p0 p0Var) throws IOException {
        return (p1) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static p1 j3(InputStream inputStream) throws IOException {
        return (p1) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static p1 k3(InputStream inputStream, p0 p0Var) throws IOException {
        return (p1) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static p1 l3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (p1) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p1 m3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (p1) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static p1 n3(byte[] bArr) throws InvalidProtocolBufferException {
        return (p1) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static p1 o3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (p1) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<p1> p3() {
        return DEFAULT_INSTANCE.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(int i10) {
        X2();
        this.values_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(int i10, Value.b bVar) {
        X2();
        this.values_.set(i10, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i10, Value value) {
        value.getClass();
        X2();
        this.values_.set(i10, value);
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22578a[methodToInvoke.ordinal()]) {
            case 1:
                return new p1();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<p1> cVar = PARSER;
                if (cVar == null) {
                    synchronized (p1.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.q1
    public int V() {
        return this.values_.size();
    }

    public a4 Z2(int i10) {
        return this.values_.get(i10);
    }

    public List<? extends a4> a3() {
        return this.values_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.q1
    public List<Value> k1() {
        return this.values_;
    }

    @Override // androidx.p001datastore.preferences.protobuf.q1
    public Value p1(int i10) {
        return this.values_.get(i10);
    }
}
