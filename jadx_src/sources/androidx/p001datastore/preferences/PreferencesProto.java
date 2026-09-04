package androidx.p001datastore.preferences;

import androidx.p001datastore.preferences.protobuf.ByteString;
import androidx.p001datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.p001datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.p001datastore.preferences.protobuf.MapFieldLite;
import androidx.p001datastore.preferences.protobuf.WireFormat;
import androidx.p001datastore.preferences.protobuf.a2;
import androidx.p001datastore.preferences.protobuf.i1;
import androidx.p001datastore.preferences.protobuf.p0;
import androidx.p001datastore.preferences.protobuf.p2;
import androidx.p001datastore.preferences.protobuf.t1;
import androidx.p001datastore.preferences.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto {

    public static final class Value extends GeneratedMessageLite<Value, a> implements f {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile p2<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i10) {
                this.value = i10;
            }

            public static ValueCase forNumber(int i10) {
                switch (i10) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }

            @Deprecated
            public static ValueCase valueOf(int i10) {
                return forNumber(i10);
            }

            public int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<Value, a> implements f {
            private a() {
                super(Value.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public ValueCase F0() {
                return ((Value) this.f22298c).F0();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public float L0() {
                return ((Value) this.f22298c).L0();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public boolean M0() {
                return ((Value) this.f22298c).M0();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public boolean O() {
                return ((Value) this.f22298c).O();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public boolean R() {
                return ((Value) this.f22298c).R();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public double S0() {
                return ((Value) this.f22298c).S0();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public boolean V0() {
                return ((Value) this.f22298c).V0();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public int X() {
                return ((Value) this.f22298c).X();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public d Y() {
                return ((Value) this.f22298c).Y();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public boolean Y0() {
                return ((Value) this.f22298c).Y0();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public long b0() {
                return ((Value) this.f22298c).b0();
            }

            public a b2() {
                T1();
                ((Value) this.f22298c).a3();
                return this;
            }

            public a c2() {
                T1();
                ((Value) this.f22298c).b3();
                return this;
            }

            public a d2() {
                T1();
                ((Value) this.f22298c).c3();
                return this;
            }

            public a e2() {
                T1();
                ((Value) this.f22298c).d3();
                return this;
            }

            public a f2() {
                T1();
                ((Value) this.f22298c).e3();
                return this;
            }

            public a g2() {
                T1();
                ((Value) this.f22298c).f3();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public String getString() {
                return ((Value) this.f22298c).getString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public boolean h0() {
                return ((Value) this.f22298c).h0();
            }

            public a h2() {
                T1();
                ((Value) this.f22298c).g3();
                return this;
            }

            public a i2() {
                T1();
                ((Value) this.f22298c).h3();
                return this;
            }

            public a j2(d dVar) {
                T1();
                ((Value) this.f22298c).j3(dVar);
                return this;
            }

            public a k2(boolean z10) {
                T1();
                ((Value) this.f22298c).z3(z10);
                return this;
            }

            public a l2(double d10) {
                T1();
                ((Value) this.f22298c).A3(d10);
                return this;
            }

            public a m2(float f10) {
                T1();
                ((Value) this.f22298c).B3(f10);
                return this;
            }

            public a n2(int i10) {
                T1();
                ((Value) this.f22298c).C3(i10);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public boolean o1() {
                return ((Value) this.f22298c).o1();
            }

            public a o2(long j10) {
                T1();
                ((Value) this.f22298c).D3(j10);
                return this;
            }

            public a p2(String str) {
                T1();
                ((Value) this.f22298c).E3(str);
                return this;
            }

            public a q2(ByteString byteString) {
                T1();
                ((Value) this.f22298c).F3(byteString);
                return this;
            }

            public a r2(d.a aVar) {
                T1();
                ((Value) this.f22298c).G3(aVar);
                return this;
            }

            public a s2(d dVar) {
                T1();
                ((Value) this.f22298c).H3(dVar);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public boolean u0() {
                return ((Value) this.f22298c).u0();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.f
            public ByteString z() {
                return ((Value) this.f22298c).z();
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.F2(Value.class, value);
        }

        private Value() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A3(double d10) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B3(float f10) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C3(int i10) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D3(long j10) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E3(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F3(ByteString byteString) {
            byteString.getClass();
            this.valueCase_ = 5;
            this.value_ = byteString.n0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G3(d.a aVar) {
            this.value_ = aVar.build();
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H3(d dVar) {
            dVar.getClass();
            this.value_ = dVar;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a3() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b3() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c3() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d3() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e3() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f3() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g3() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h3() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static Value i3() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j3(d dVar) {
            dVar.getClass();
            if (this.valueCase_ != 6 || this.value_ == d.S2()) {
                this.value_ = dVar;
            } else {
                this.value_ = d.U2((d) this.value_).X1(dVar).a1();
            }
            this.valueCase_ = 6;
        }

        public static a k3() {
            return DEFAULT_INSTANCE.F1();
        }

        public static a l3(Value value) {
            return DEFAULT_INSTANCE.G1(value);
        }

        public static Value m3(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
        }

        public static Value n3(InputStream inputStream, p0 p0Var) throws IOException {
            return (Value) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        public static Value o3(ByteString byteString) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
        }

        public static Value p3(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
        }

        public static Value q3(w wVar) throws IOException {
            return (Value) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
        }

        public static Value r3(w wVar, p0 p0Var) throws IOException {
            return (Value) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
        }

        public static Value s3(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
        }

        public static Value t3(InputStream inputStream, p0 p0Var) throws IOException {
            return (Value) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        public static Value u3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Value v3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
        }

        public static Value w3(byte[] bArr) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
        }

        public static Value x3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
        }

        public static p2<Value> y3() {
            return DEFAULT_INSTANCE.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z3(boolean z10) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z10);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public ValueCase F0() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f22208a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Value();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", d.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    p2<Value> cVar = PARSER;
                    if (cVar == null) {
                        synchronized (Value.class) {
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

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public float L0() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public boolean M0() {
            return this.valueCase_ == 3;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public boolean O() {
            return this.valueCase_ == 5;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public boolean R() {
            return this.valueCase_ == 2;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public double S0() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public boolean V0() {
            return this.valueCase_ == 4;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public int X() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public d Y() {
            return this.valueCase_ == 6 ? (d) this.value_ : d.S2();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public boolean Y0() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public long b0() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public String getString() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public boolean h0() {
            return this.valueCase_ == 7;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public boolean o1() {
            return this.valueCase_ == 6;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public boolean u0() {
            return this.valueCase_ == 1;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.f
        public ByteString z() {
            return ByteString.w(this.valueCase_ == 5 ? (String) this.value_ : "");
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22208a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22208a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22208a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22208a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22208a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22208a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22208a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22208a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        private static volatile p2<b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.f();

        public static final class a extends GeneratedMessageLite.b<b, a> implements c {
            private a() {
                super(b.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public int B() {
                return ((b) this.f22298c).s1().size();
            }

            public a b2() {
                T1();
                ((b) this.f22298c).K2().clear();
                return this;
            }

            public a c2(Map<String, Value> map) {
                T1();
                ((b) this.f22298c).K2().putAll(map);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public Value d0(String str, Value value) {
                str.getClass();
                Map<String, Value> mapS1 = ((b) this.f22298c).s1();
                return mapS1.containsKey(str) ? mapS1.get(str) : value;
            }

            public a d2(String str, Value value) {
                str.getClass();
                value.getClass();
                T1();
                ((b) this.f22298c).K2().put(str, value);
                return this;
            }

            public a e2(String str) {
                str.getClass();
                T1();
                ((b) this.f22298c).K2().remove(str);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            @Deprecated
            public Map<String, Value> g1() {
                return s1();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public Value o0(String str) {
                str.getClass();
                Map<String, Value> mapS1 = ((b) this.f22298c).s1();
                if (mapS1.containsKey(str)) {
                    return mapS1.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public Map<String, Value> s1() {
                return Collections.unmodifiableMap(((b) this.f22298c).s1());
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public boolean y0(String str) {
                str.getClass();
                return ((b) this.f22298c).s1().containsKey(str);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.PreferencesProto$b$b, reason: collision with other inner class name */
        public static final class C0157b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final t1<String, Value> f22209a = t1.f(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.i3());

            private C0157b() {
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.F2(b.class, bVar);
        }

        private b() {
        }

        public static b J2() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Value> K2() {
            return L2();
        }

        private MapFieldLite<String, Value> L2() {
            if (!this.preferences_.j()) {
                this.preferences_ = this.preferences_.n();
            }
            return this.preferences_;
        }

        private MapFieldLite<String, Value> M2() {
            return this.preferences_;
        }

        public static a N2() {
            return DEFAULT_INSTANCE.F1();
        }

        public static a O2(b bVar) {
            return DEFAULT_INSTANCE.G1(bVar);
        }

        public static b P2(InputStream inputStream) throws IOException {
            return (b) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
        }

        public static b Q2(InputStream inputStream, p0 p0Var) throws IOException {
            return (b) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        public static b R2(ByteString byteString) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
        }

        public static b S2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
        }

        public static b T2(w wVar) throws IOException {
            return (b) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
        }

        public static b U2(w wVar, p0 p0Var) throws IOException {
            return (b) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
        }

        public static b V2(InputStream inputStream) throws IOException {
            return (b) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
        }

        public static b W2(InputStream inputStream, p0 p0Var) throws IOException {
            return (b) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        public static b X2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b Y2(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
        }

        public static b Z2(byte[] bArr) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
        }

        public static b a3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
        }

        public static p2<b> b3() {
            return DEFAULT_INSTANCE.w();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public int B() {
            return M2().size();
        }

        @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f22208a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0157b.f22209a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    p2<b> cVar = PARSER;
                    if (cVar == null) {
                        synchronized (b.class) {
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

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public Value d0(String str, Value value) {
            str.getClass();
            MapFieldLite<String, Value> mapFieldLiteM2 = M2();
            return mapFieldLiteM2.containsKey(str) ? mapFieldLiteM2.get(str) : value;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        @Deprecated
        public Map<String, Value> g1() {
            return s1();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public Value o0(String str) {
            str.getClass();
            MapFieldLite<String, Value> mapFieldLiteM2 = M2();
            if (mapFieldLiteM2.containsKey(str)) {
                return mapFieldLiteM2.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public Map<String, Value> s1() {
            return Collections.unmodifiableMap(M2());
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public boolean y0(String str) {
            str.getClass();
            return M2().containsKey(str);
        }
    }

    public interface c extends a2 {
        int B();

        Value d0(String str, Value value);

        @Deprecated
        Map<String, Value> g1();

        Value o0(String str);

        Map<String, Value> s1();

        boolean y0(String str);
    }

    public static final class d extends GeneratedMessageLite<d, a> implements e {
        private static final d DEFAULT_INSTANCE;
        private static volatile p2<d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private i1.k<String> strings_ = GeneratedMessageLite.R1();

        public static final class a extends GeneratedMessageLite.b<d, a> implements e {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.e
            public ByteString U0(int i10) {
                return ((d) this.f22298c).U0(i10);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.e
            public int Z() {
                return ((d) this.f22298c).Z();
            }

            public a b2(Iterable<String> iterable) {
                T1();
                ((d) this.f22298c).N2(iterable);
                return this;
            }

            public a c2(String str) {
                T1();
                ((d) this.f22298c).O2(str);
                return this;
            }

            public a d2(ByteString byteString) {
                T1();
                ((d) this.f22298c).P2(byteString);
                return this;
            }

            public a e2() {
                T1();
                ((d) this.f22298c).Q2();
                return this;
            }

            public a f2(int i10, String str) {
                T1();
                ((d) this.f22298c).i3(i10, str);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.e
            public String j1(int i10) {
                return ((d) this.f22298c).j1(i10);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.e
            public List<String> n0() {
                return Collections.unmodifiableList(((d) this.f22298c).n0());
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            GeneratedMessageLite.F2(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N2(Iterable<String> iterable) {
            R2();
            androidx.p001datastore.preferences.protobuf.a.N(iterable, this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O2(String str) {
            str.getClass();
            R2();
            this.strings_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P2(ByteString byteString) {
            byteString.getClass();
            R2();
            this.strings_.add(byteString.n0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Q2() {
            this.strings_ = GeneratedMessageLite.R1();
        }

        private void R2() {
            if (this.strings_.l1()) {
                return;
            }
            this.strings_ = GeneratedMessageLite.h2(this.strings_);
        }

        public static d S2() {
            return DEFAULT_INSTANCE;
        }

        public static a T2() {
            return DEFAULT_INSTANCE.F1();
        }

        public static a U2(d dVar) {
            return DEFAULT_INSTANCE.G1(dVar);
        }

        public static d V2(InputStream inputStream) throws IOException {
            return (d) GeneratedMessageLite.m2(DEFAULT_INSTANCE, inputStream);
        }

        public static d W2(InputStream inputStream, p0 p0Var) throws IOException {
            return (d) GeneratedMessageLite.n2(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        public static d X2(ByteString byteString) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.o2(DEFAULT_INSTANCE, byteString);
        }

        public static d Y2(ByteString byteString, p0 p0Var) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.p2(DEFAULT_INSTANCE, byteString, p0Var);
        }

        public static d Z2(w wVar) throws IOException {
            return (d) GeneratedMessageLite.q2(DEFAULT_INSTANCE, wVar);
        }

        public static d a3(w wVar, p0 p0Var) throws IOException {
            return (d) GeneratedMessageLite.r2(DEFAULT_INSTANCE, wVar, p0Var);
        }

        public static d b3(InputStream inputStream) throws IOException {
            return (d) GeneratedMessageLite.s2(DEFAULT_INSTANCE, inputStream);
        }

        public static d c3(InputStream inputStream, p0 p0Var) throws IOException {
            return (d) GeneratedMessageLite.t2(DEFAULT_INSTANCE, inputStream, p0Var);
        }

        public static d d3(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.u2(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d e3(ByteBuffer byteBuffer, p0 p0Var) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.v2(DEFAULT_INSTANCE, byteBuffer, p0Var);
        }

        public static d f3(byte[] bArr) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.w2(DEFAULT_INSTANCE, bArr);
        }

        public static d g3(byte[] bArr, p0 p0Var) throws InvalidProtocolBufferException {
            return (d) GeneratedMessageLite.x2(DEFAULT_INSTANCE, bArr, p0Var);
        }

        public static p2<d> h3() {
            return DEFAULT_INSTANCE.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i3(int i10, String str) {
            str.getClass();
            R2();
            this.strings_.set(i10, str);
        }

        @Override // androidx.p001datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object J1(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f22208a[methodToInvoke.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.j2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    p2<d> cVar = PARSER;
                    if (cVar == null) {
                        synchronized (d.class) {
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

        @Override // androidx.datastore.preferences.PreferencesProto.e
        public ByteString U0(int i10) {
            return ByteString.w(this.strings_.get(i10));
        }

        @Override // androidx.datastore.preferences.PreferencesProto.e
        public int Z() {
            return this.strings_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.e
        public String j1(int i10) {
            return this.strings_.get(i10);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.e
        public List<String> n0() {
            return this.strings_;
        }
    }

    public interface e extends a2 {
        ByteString U0(int i10);

        int Z();

        String j1(int i10);

        List<String> n0();
    }

    public interface f extends a2 {
        Value.ValueCase F0();

        float L0();

        boolean M0();

        boolean O();

        boolean R();

        double S0();

        boolean V0();

        int X();

        d Y();

        boolean Y0();

        long b0();

        String getString();

        boolean h0();

        boolean o1();

        boolean u0();

        ByteString z();
    }

    private PreferencesProto() {
    }

    public static void a(p0 p0Var) {
    }
}
