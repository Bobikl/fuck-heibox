package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: Struct.java */
/* JADX INFO: loaded from: classes6.dex */
public final class g3 extends GeneratedMessageLite<g3, b> implements h3 {
    private static final g3 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile p2<g3> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.f();

    /* JADX INFO: compiled from: Struct.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22449a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22449a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22449a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22449a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22449a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22449a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22449a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22449a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Struct.java */
    public static final class b extends GeneratedMessageLite.b<g3, b> implements h3 {
        private b() {
            super(g3.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.p001datastore.preferences.protobuf.h3
        public Value J0(String str, Value value) {
            str.getClass();
            Map<String, Value> mapF0 = ((g3) this.f22298c).f0();
            return mapF0.containsKey(str) ? mapF0.get(str) : value;
        }

        @Override // androidx.p001datastore.preferences.protobuf.h3
        public boolean Z0(String str) {
            str.getClass();
            return ((g3) this.f22298c).f0().containsKey(str);
        }

        public b b2() {
            T1();
            ((g3) this.f22298c).K2().clear();
            return this;
        }

        public b c2(Map<String, Value> map) {
            T1();
            ((g3) this.f22298c).K2().putAll(map);
            return this;
        }

        public b d2(String str, Value value) {
            str.getClass();
            value.getClass();
            T1();
            ((g3) this.f22298c).K2().put(str, value);
            return this;
        }

        public b e2(String str) {
            str.getClass();
            T1();
            ((g3) this.f22298c).K2().remove(str);
            return this;
        }

        @Override // androidx.p001datastore.preferences.protobuf.h3
        public Map<String, Value> f0() {
            return Collections.unmodifiableMap(((g3) this.f22298c).f0());
        }

        @Override // androidx.p001datastore.preferences.protobuf.h3
        @Deprecated
        public Map<String, Value> j() {
            return f0();
        }

        @Override // androidx.p001datastore.preferences.protobuf.h3
        public int n() {
            return ((g3) this.f22298c).f0().size();
        }

        @Override // androidx.p001datastore.preferences.protobuf.h3
        public Value s0(String str) {
            str.getClass();
            Map<String, Value> mapF0 = ((g3) this.f22298c).f0();
            if (mapF0.containsKey(str)) {
                return mapF0.get(str);
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: Struct.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t1<String, Value> f22450a = t1.f(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.i3());

        private c() {
        }
    }

    static {
        g3 g3Var = new g3();
        DEFAULT_INSTANCE = g3Var;
        GeneratedMessageLite.F2(g3.class, g3Var);
    }

    private g3() {
    }

    public static g3 J2() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> K2() {
        return M2();
    }

    private MapFieldLite<String, Value> L2() {
        return this.fields_;
    }

    private MapFieldLite<String, Value> M2() {
        if (!this.fields_.j()) {
            this.fields_ = this.fields_.n();
        }
        return this.fields_;
    }

    public static b N2() {
        return DEFAULT_INSTANCE.F1();
    }

    public static b O2(g3 g3Var) {
        return DEFAULT_INSTANCE.G1(g3Var);
    }

    public static g3 P2(InputStream inputStream) throws IOException {
        return (g3) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
    }

    public static g3 Q2(InputStream inputStream, p0 p0Var) throws IOException {
        return (g3) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static g3 R2(ByteString byteString) throws InvalidProtocolBufferException {
        return (g3) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
    }

    public static g3 S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
        return (g3) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
    }

    public static g3 T2(w wVar) throws IOException {
        return (g3) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
    }

    public static g3 U2(w wVar, p0 p0Var) throws IOException {
        return (g3) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
    }

    public static g3 V2(InputStream inputStream) throws IOException {
        return (g3) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
    }

    public static g3 W2(InputStream inputStream, p0 p0Var) throws IOException {
        return (g3) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    public static g3 X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (g3) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g3 Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
        return (g3) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    public static g3 Z2(byte[] bArr) throws InvalidProtocolBufferException {
        return (g3) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
    }

    public static g3 a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
        return (g3) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
    }

    public static p2<g3> b3() {
        return DEFAULT_INSTANCE.w();
    }

    @Override // androidx.p001datastore.preferences.protobuf.h3
    public Value J0(String str, Value value) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLiteL2 = L2();
        return mapFieldLiteL2.containsKey(str) ? mapFieldLiteL2.get(str) : value;
    }

    @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22449a[methodToInvoke.ordinal()]) {
            case 1:
                return new g3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f22450a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p2<g3> cVar = PARSER;
                if (cVar == null) {
                    synchronized (g3.class) {
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

    @Override // androidx.p001datastore.preferences.protobuf.h3
    public boolean Z0(String str) {
        str.getClass();
        return L2().containsKey(str);
    }

    @Override // androidx.p001datastore.preferences.protobuf.h3
    public Map<String, Value> f0() {
        return Collections.unmodifiableMap(L2());
    }

    @Override // androidx.p001datastore.preferences.protobuf.h3
    @Deprecated
    public Map<String, Value> j() {
        return f0();
    }

    @Override // androidx.p001datastore.preferences.protobuf.h3
    public int n() {
        return L2().size();
    }

    @Override // androidx.p001datastore.preferences.protobuf.h3
    public Value s0(String str) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLiteL2 = L2();
        if (mapFieldLiteL2.containsKey(str)) {
            return mapFieldLiteL2.get(str);
        }
        throw new IllegalArgumentException();
    }
}
